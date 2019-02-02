package pro.patrykkrawczyk.lab9.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Lab9ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab9ConfigServerApplication.class, args);
    }

}

