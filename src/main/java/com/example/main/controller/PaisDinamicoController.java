package com.example.main.controller;

import com.example.main.service.PaisService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//Lidar con requisições HTTP
@Controller

// Mapear requisição HTTP
@RequestMapping ("/paises2")
public class PaisDinamicoController {

    private PaisService service;
    public PaisDinamicoController(PaisService service){
        this.service = service;

    }

    // Mapeei a requisição
    //GET '/'
    // Para o metodo


    @GetMapping
    public ModelAndView index(){
        var mv = new ModelAndView("pais/lista_dinamica.html");
        var lista = service.obterTodos();

        //chave / valor / Hashmap
        mv.addObject("lista",lista);
        return mv;
    }


    @GetMapping("/deletar")
    public ModelAndView deletarPaises(){
        service.deletarTudo();
        return new ModelAndView("redirect:/paises2");
    }
    @GetMapping("/criar")
    public ModelAndView criarPaises(){
        service.criarPaises();
        return new ModelAndView("redirect:/paises2");
    }

}
