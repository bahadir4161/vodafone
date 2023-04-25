package com.vodafone.garage.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
@ComponentScan("com.vodafone.garage.resources")
public class ClientWebConfig implements WebMvcConfigurer {
  @Bean
  public MethodValidationPostProcessor methodValidationPostProcessor() {
    return new MethodValidationPostProcessor();
  }
}