package com.example.main.service;

import com.example.main.Repository.PaisRepository;
import com.example.main.entity.Pais;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 Camada Service/Serviço
 Classes responsáveis pelas regras de negócios
 Única que pode acessar os Repository
/*

 */
@Service
public class PaisService {

    private PaisRepository repository;

    public PaisService(PaisRepository repository){
        this.repository = repository;
    }

    public List<Pais> obterTodos(){
        return repository.findAll();
    }

    public void deletarTudo(){
        repository.deleteAll();
    }

    public void criarPaises(){
        var p = new Pais();
        p.setNome("Brasil");
        p.setCapital("Brasilia");
        p.setContinente("América do Sul");
        p.setBandeiraUrl("https://upload.wikimedia.org/wikipedia/commons/0/05/Flag_of_Brazil.svg");
        repository.save(p);
    }

}
