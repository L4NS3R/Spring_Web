package com.example.main.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

abstract class BaseRestController<T, ID> {

    protected final JpaRepository<T, ID> repository;

    public BaseRestController(JpaRepository<T, ID> repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<T> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<T> buscar(@PathVariable ID id) {
        return repository.findById(id);
    }

    @PostMapping
    public T salvar(@RequestBody T entidade) {
        return repository.save(entidade);
    }

    @PutMapping("/{id}")
    public T atualizar(@PathVariable ID id, @RequestBody T entidade) {
        return repository.save(entidade);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable ID id) {
        repository.deleteById(id);
    }
}
