package com.myspringprojects.springcore.config;

import com.myspringprojects.springcore.common.Coach;
import com.myspringprojects.springcore.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Component is not used but external dependency is configured using @Configuration annotation.
//SwimCoach is java class needs to be configured.
//Created SportConfig class with @Configuration annotation.
//It has swimCoach method which returns instance of swimCoach class of Couch type.
//So the dependency is injected without @Component.
@Configuration
public class SportConfig {
    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
