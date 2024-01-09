package fr.sncf.d2d.colibri;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import fr.sncf.d2d.colibri.colis.rest.CreateColisBody;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class ColibriApplication {

	public static void main(String[] args) throws JsonProcessingException {
		final var context = SpringApplication.run(ColibriApplication.class, args);
		final var objectMapper = context.getBean(ObjectMapper.class);

		final var json = "{}";
		final var createColisBody = objectMapper.readValue(
				json,
				CreateColisBody.class);
		System.out.println(createColisBody);
	}
}
