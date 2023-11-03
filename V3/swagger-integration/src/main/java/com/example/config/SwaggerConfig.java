package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;

import java.util.List;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI myOpenAPI() {
        Server devServer = new Server();
        devServer.setUrl("http://localhost:8081");
        devServer.setDescription("Server URL in Development environment");

        Contact contact = new Contact();
        contact.setEmail("test@gmail.com");
        contact.setName("Test");
        contact.setUrl("https://www.google.com");

//        License license = new License().name("").url("");

        Info info = new Info()
                .title("Swagger v3 Integration with Spring Boot v3.*")
                .version("1.0")
                .contact(contact)
                .description("Swagger with Spring Boot");
//                .termsOfService("")
//                .license(license);

        return new OpenAPI().info(info).servers(List.of(devServer));
    }
}
