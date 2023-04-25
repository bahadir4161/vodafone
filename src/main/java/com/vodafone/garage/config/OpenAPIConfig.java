package com.vodafone.garage.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(title = "Garage API", version = "0.0.1", description = "Garage Application"))
public class OpenAPIConfig {
    public OpenAPIConfig() {
    }
}