package com.example.bean_configurations.controller;

import com.example.bean_configurations.annotations.GetMongodbConfig;
import com.example.bean_configurations.dtos.ConfigDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HomeController {

    // Set D.I with a Qualifier
    @Autowired
    @Qualifier("mysql")
    private ConfigDatabase configMySQL;

    // Set D.I with other annotation (@GetMongodbConfig)
    @Autowired
    @GetMongodbConfig
    private ConfigDatabase configMongodb;

    @GetMapping
    public String getDataBase() {
        return this.configMySQL.toString() + "<br/>" + this.configMongodb.toString();
    }

}
