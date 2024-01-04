package fr.sncf.d2d.colibri.colis.persistence;

import java.util.Map;
import java.util.UUID;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import fr.sncf.d2d.colibri.colis.models.Colis;

@Repository
public class ColisRepository {
    
    private final NamedParameterJdbcTemplate jdbcTemplate;

    public ColisRepository(NamedParameterJdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public void persist(Colis colis){

        colis.setId(UUID.randomUUID());

        final var sql = "INSERT INTO colis (id, address, details, delivery_person_id, email)" + 
            "VALUES (:id, :address, :details, :deliveryPersonId, :email)";

        this.jdbcTemplate.update(
            sql, 
            Map.of(
                "id", colis.getId(),
                "address", colis.getAddress(),
                "details", colis.getDetails(),
                "deliveryPersonId", colis.getDeliveryPersonId(),
                "email", colis.getEmail()
            )
        );
    } 
}
