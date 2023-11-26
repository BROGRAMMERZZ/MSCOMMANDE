package tn.esprit.mscommande;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import tn.esprit.mscommande.DAO.repositories.CommandeRepository;

@SpringBootApplication
@EnableEurekaClient
public class MsCommandeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsCommandeApplication.class, args);
    }
    @Autowired
    private CommandeRepository repository ;
    @Bean
    ApplicationRunner init(){
        return (args -> {

            repository.findAll().forEach(System.out::println);
        }) ;
    }
}
