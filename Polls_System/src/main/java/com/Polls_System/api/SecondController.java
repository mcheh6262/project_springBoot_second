package com.Polls_System.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {
    @GetMapping
    String getApi(){
        return "This is a String from second micro service";
    }

}
