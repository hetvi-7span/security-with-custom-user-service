package com.security.securitywithcustomuserservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableMethodSecurity
public class SecurityConfig {


    //create inMemory user which can be used to Log in the application
    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
       return null;
    }

  /*  @Bean
    public static NoOpPasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }*/
}

