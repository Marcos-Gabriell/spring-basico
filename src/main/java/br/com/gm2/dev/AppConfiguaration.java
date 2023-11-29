package br.com.gm2.dev;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguaration {

    public String getMessage() {
        return "Texto de config";
    }

    @Bean
    public void init() {
        System.out.println("Inicializado");
    }
}
