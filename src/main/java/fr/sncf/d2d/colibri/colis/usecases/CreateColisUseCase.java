package fr.sncf.d2d.colibri.colis.usecases;

import org.springframework.stereotype.Service;

import fr.sncf.d2d.colibri.colis.models.Colis;
import fr.sncf.d2d.colibri.colis.models.Colis.ColisBuilder;
import fr.sncf.d2d.colibri.colis.persistence.ColisRepository;

@Service
public class CreateColisUseCase {

    private final ColisRepository colisRepository;

    public CreateColisUseCase(ColisRepository colisRepository){
        this.colisRepository = colisRepository;
    }
    
    public Colis create(CreateColisParams params){

        final var colis = Colis.builder()
            .address(params.getAddress())
            .email(params.getEmail())
            .details(params.getDetails())
            .deliveryPersonId(params.getDeliveryPersonId())
            .build();

        this.colisRepository.persist(colis);
        
        return colis;
    }
}
