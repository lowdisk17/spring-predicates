package com.predicates.predicates.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.predicates.predicates.model.Person;

@Configuration
public class MainConfiguration {

    @Bean("person")
    public Person getPerson () {
        return new Person();
    }
    
}
