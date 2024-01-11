package fr.sncf.d2d.colibri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.ObjectMapper;

import fr.sncf.d2d.colibri.colis.rest.CreateColisBody;

@SpringBootApplication
public class ColibriApplication {

	public static void main(String[] args) {
		SpringApplication.run(ColibriApplication.class, args);
	}
}
