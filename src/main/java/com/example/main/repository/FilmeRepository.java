package com.example.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.main.entity.Filme;

// Interface responsável por acessar o banco de dados
public interface FilmeRepository extends JpaRepository<Filme, Long> {
}
