package fr.sncf.d2d.colibri;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColisController {
    
    public ColisController(@Value("${spring.datasource.password}") String password){
        System.out.println(password);
    }   
}
