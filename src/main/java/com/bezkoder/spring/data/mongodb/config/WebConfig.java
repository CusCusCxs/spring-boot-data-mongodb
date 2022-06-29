package com.bezkoder.spring.data.mongodb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("//localhost:8081/").allowedMethods("GET", "POST", "PUT");;// <- assim permite de qualquer origem, troque "/**" pelo seu dominio por exemplo "http://meudominio.com"

    }
}