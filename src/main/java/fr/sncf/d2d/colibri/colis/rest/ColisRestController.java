package fr.sncf.d2d.colibri.colis.rest;

import fr.sncf.d2d.colibri.colis.usecases.CreateColisParam;
import fr.sncf.d2d.colibri.colis.usecases.CreateColisUseCase;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/colis")
@RestController
public class ColisRestController {

    private final CreateColisUseCase createColisUseCase;

    public ColisRestController(CreateColisUseCase createColisUseCase){
        this.createColisUseCase = createColisUseCase;
    }
    @PostMapping
    public void createColis(@RequestBody CreateColisBody body){
        final var params = new CreateColisParam.CreateColisParamBuilder()
                .address(body.getAddress())
                .email(body.getEmail())
                .details(body.getDetails())
                .deliveryPersonId(body.getDeliveryPersonId())
                .build();
        this.createColisUseCase.create(params);
    }
}
