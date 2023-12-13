package com.example.aggregator.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AggregatorConfig {

    @Bean //some object that spring is going to manage for us
    public RestTemplate getTemplate() {
        RestTemplate template = new RestTemplate();
        return template;
    }

}
