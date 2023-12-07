package fr.sncf.d2d.colibri;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MaConfiguration {

    @Bean
    public MonDeuxiemeBean monDeuxiemeBean(){
        return new MonDeuxiemeBean(this.monTroisiemeBean());
    }

    @Bean
    public MonTroisiemeBean monTroisiemeBean() {
        return new MonTroisiemeBean();
    }

}
