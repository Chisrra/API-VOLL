package com.med.voll.chisrra.apivoll.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hola")
public class Hola {
    @GetMapping
    public String holaAmigo() {
        return "Hola mi amigo";
    }
}
