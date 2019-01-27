package pro.patrykkrawczyk.lab8.word;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab8WordApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab8WordApplication.class, args);
    }

}

