package co.develhope.cors.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/custom")
public class CustomController {

    @GetMapping("/hello")
    public String getCustomMessage() {
        return "Welcome!";
    }

}