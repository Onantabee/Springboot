package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {

    @Value("${coach.name}")
    String coachName;

    @Value("${player.name}")
    String playerName;

    @GetMapping
    public String greetings(){
        return "Welcome  " + coachName;
    }
}
