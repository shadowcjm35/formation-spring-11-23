package fr.sncf.d2d.colibri.colis.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.sncf.d2d.colibri.colis.usecases.CreateColisParams;
import fr.sncf.d2d.colibri.colis.usecases.CreateColisUseCase;

@RestController
@RequestMapping(path = "/colis")
public class ColisRestController {

    private final CreateColisUseCase createColisUseCase;

    public ColisRestController(CreateColisUseCase createColisUseCase){
        this.createColisUseCase = createColisUseCase;
    }
    
    @PostMapping
    public void createColis(@RequestBody CreateColisBody body){

        final var params = new CreateColisParams();
        params.setAddress(body.getAddress());
        params.setDetails(body.getDetails());
        params.setDeliveryPersonId(body.getDeliveryPersonId());
        params.setEmail(body.getEmail());

        this.createColisUseCase.create(params);

        
    }
}
