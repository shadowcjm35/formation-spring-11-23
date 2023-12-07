package fr.sncf.d2d.colibri;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MonPremierBean {

    private final MonDeuxiemeBean monDeuxiemeBean;

    public MonPremierBean(MonDeuxiemeBean monDeuxiemeBean) {
        this.monDeuxiemeBean = monDeuxiemeBean;
        System.out.println("Instanciation");
    }

    @RequestMapping
    @ResponseBody
    public String helloWorld(@RequestParam(name = "name", defaultValue = "John Doe") String name){
        /*return "Hello World !!!";*/
        return "Bonjour " + this.monDeuxiemeBean.sayHello(name);
    }
}
