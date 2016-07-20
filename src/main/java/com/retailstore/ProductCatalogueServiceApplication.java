package com.retailstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
public class ProductCatalogueServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductCatalogueServiceApplication.class, args);
    }
}
