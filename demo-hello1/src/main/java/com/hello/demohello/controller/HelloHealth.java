package com.hello.demohello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @PACKAGE_NAME：com.hello.demohello.controller
 * @DATE: 2018/7/24
 * @AURH: shilei
 * @DESC:
 */
@RestController
public class HelloHealth {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/health/{name}")
    public String health(@PathVariable("name") String name){

        return "health: "+name;
    }

    @GetMapping("/a/{id}")
    public String findById(@PathVariable Long id) {
        return this.restTemplate.getForObject("http://demo-hello:8080/health/关联项目+" + id, String.class);
    }
}
