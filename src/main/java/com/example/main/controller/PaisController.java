package com.example.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//Lidar con requisições HTTP
@Controller
// Mapear requisição HTTP
@RequestMapping ("/paises")
public class PaisController {

    // Mapeei a requisiçã
    //GET '/'
    // Para o metodo
    @GetMapping
    public String index(){
        return "pais/lista_fixa.html";
    }
}
