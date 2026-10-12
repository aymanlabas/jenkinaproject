package org.example.jenkinaproject.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class jenkins {
    @GetMapping("/hello")
    public String index() {
        return "Hello World";
    }

}
