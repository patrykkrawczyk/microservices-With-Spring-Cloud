package pro.patrykkrawczyk.lab9.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Lab9EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab9EurekaServerApplication.class, args);
    }
}

