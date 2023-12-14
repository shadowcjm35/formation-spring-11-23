package fr.sncf.d2d.colibri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import fr.sncf.d2d.colibri.colis.rest.CreateColisBody;

@SpringBootApplication
public class ColibriApplication {

	public static void main(String[] args) {
		final var context = SpringApplication.run(ColibriApplication.class, args);
		final var objectMapper = context.getBean(ObjectMapper.class);

		try {
			System.out.println(objectMapper.readValue("{ \"toto\": \"bablablab\" }", CreateColisBody.class));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
