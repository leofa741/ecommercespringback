package com.lfa.ecomerceapp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyAppConfigController implements WebMvcConfigurer {


    @Value("${allowed.origins}")
    private String[] theAllowedOrigins;

    @Value("${spring.data.rest.base-path}")
    private String baseApiPath ;



    @Override
    public void addCorsMappings(CorsRegistry cors) {
        cors.addMapping( baseApiPath + "/**").allowedOrigins(theAllowedOrigins);
    }
}
