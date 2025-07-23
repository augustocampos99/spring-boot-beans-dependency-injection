package com.example.bean_configurations.configuration;

import com.example.bean_configurations.dtos.ConfigDatabase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DatabaseConfiguration {

    // If i not set a Qualifier, this will be the instancy (because of Primary)
    @Bean(name = "mysql")
    @Primary
    public ConfigDatabase mySQL() {
        return new ConfigDatabase("products_mysql", "127.0.0.1", "root", "123456");
    }

    @Bean(name = "mongodb")
    public ConfigDatabase mongodb() {
        return new ConfigDatabase("products_mongodb", "mongodb://", "root", "654321");
    }

}
