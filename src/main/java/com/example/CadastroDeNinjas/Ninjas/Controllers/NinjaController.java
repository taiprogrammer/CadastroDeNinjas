package com.example.CadastroDeNinjas.Ninjas.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/")
    public String boasVindas() {
        return "Boas Vindas à API de cadastro de ninjas!";
    }
}
