package com.meuprimeirosite.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Controller {

    @GetMapping("/")
    public String index() {
        return "Hello, World!";
    }

}
