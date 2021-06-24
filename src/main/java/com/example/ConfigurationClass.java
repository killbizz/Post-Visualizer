package com.example;

import com.example.database.DatabaseConnection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.example"})
public class ConfigurationClass {
    @Bean
    public DatabaseConnection databaseConnection(){
        return new DatabaseConnection();
    }
}
