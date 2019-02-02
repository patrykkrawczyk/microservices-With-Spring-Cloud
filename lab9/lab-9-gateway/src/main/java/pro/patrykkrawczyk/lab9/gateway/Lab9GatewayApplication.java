package pro.patrykkrawczyk.lab9.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Lab9GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab9GatewayApplication.class, args);
    }
}

