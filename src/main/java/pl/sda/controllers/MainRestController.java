package pl.sda.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
class MainRestController {
    @GetMapping("/getText")
    public String getText() {
        return "To jest mój tekst" + new Random().nextInt(100);
    }
}