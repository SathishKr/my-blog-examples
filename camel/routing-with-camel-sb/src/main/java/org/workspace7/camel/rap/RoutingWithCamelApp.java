package org.workspace7.camel.rap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author kameshs
 */
@SpringBootApplication
@EnableAutoConfiguration
public class RoutingWithCamelApp {

    public static void main(String[] args) {
        SpringApplication.run(RoutingWithCamelApp.class);
    }
}
