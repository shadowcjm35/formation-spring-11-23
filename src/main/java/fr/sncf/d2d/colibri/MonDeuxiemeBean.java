package fr.sncf.d2d.colibri;

import org.springframework.stereotype.Service;

@Service
public class MonDeuxiemeBean {

    private final MonTroisiemeBean monTroisiemeBean;

    public MonDeuxiemeBean(MonTroisiemeBean monTroisiemeBean) {
        this.monTroisiemeBean = monTroisiemeBean;
    }


    public String sayHello(String name){
        return String.format("%s", name);
    }
}
