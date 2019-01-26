package pro.patrykkrawczyk.lab7.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Lab7EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab7EurekaServerApplication.class, args);
    }
}

