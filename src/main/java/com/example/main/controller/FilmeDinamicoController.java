package com.example.main.controller;

import com.example.main.entity.Filme;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.example.main.service.FilmeService;

@Controller
public class FilmeDinamicoController {

    private final FilmeService service;

    public FilmeDinamicoController(FilmeService service) {
        this.service = service;
    }

    @GetMapping("/filmes")
    public ModelAndView index() {
        var mv = new ModelAndView("pais/lista_dinamica.html"); // pode mudar depois
        var lista = service.listarTodos();
        mv.addObject("filmes", lista);
        return mv;
    }

    @GetMapping("/filmes/deletar/{id}")
    public ModelAndView deletarFilme(@PathVariable Long id) {
        service.deletar(id);
        return new ModelAndView("redirect:/filmes");
    }
    @GetMapping("/filmes/adicionar")
    @ResponseBody
    public Filme adicionarFilmeAjax() {
        Filme filme = new Filme();
        filme.setTitulo("Vingadores");
        filme.setGenero("Ação");
        filme.setDiretor("Anthony e Joe Russo");
        filme.setAno(2019);
        filme.setDuracao("120 min");
        filme.setImagemUrl("https://via.placeholder.com/100x150?text=Filme");

        service.salvar(filme);
        return filme;
    }

}
