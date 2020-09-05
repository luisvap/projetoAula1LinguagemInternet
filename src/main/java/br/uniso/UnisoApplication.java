package br.uniso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// tudo que tem @ em Java significa annotation ou anotação
@SpringBootApplication
public class UnisoApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnisoApplication.class, args);
    }

}
