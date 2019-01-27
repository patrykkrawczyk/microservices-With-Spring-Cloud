package pro.patrykkrawczyk.lab8.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Lab8EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab8EurekaServerApplication.class, args);
    }
}

