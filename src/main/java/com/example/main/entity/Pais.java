package com.example.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private String capital;
    private String continente;
    private String bandeiraUrl;

    public Pais() {
    }

    public Pais(Long id, String nome, String capital, String continente, String bandeiraUrl) {
        this.id = id;
        this.nome = nome;
        this.capital = capital;
        this.conttinente = continente;
        this.bandeiraUrl = bandeiraUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String conttinente) {
        this.continente = conttinente;
    }

    public String getBandeiraUrl() {
        return bandeiraUrl;
    }

    public void setBandeiraUrl(String bandeiraUrl) {
        this.bandeiraUrl = bandeiraUrl;
    }
}
