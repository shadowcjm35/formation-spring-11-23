package fr.sncf.d2d.colibri;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonPremierBean {

    private final MonDeuxiemeBean monDeuxiemeBean;

    public MonPremierBean(MonDeuxiemeBean bean){
        this.monDeuxiemeBean = bean;
    }
    
    @GetMapping
    public String helloWorld(@RequestParam(
        name = "name",
        required = false, 
        defaultValue = "anonymous"
    ) String name){
        return this.monDeuxiemeBean.sayHello(name);
    }
}
