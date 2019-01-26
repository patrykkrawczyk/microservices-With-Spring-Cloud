package pro.patrykkrawczyk.lab7.word;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab7WordApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab7WordApplication.class, args);
    }

}

