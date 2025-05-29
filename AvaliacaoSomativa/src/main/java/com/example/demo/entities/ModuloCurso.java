package com.example.demo.entities;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ModuloCurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;

    @OneToMany(mappedBy = "moduloCurso", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ConteudoAula> conteudos = new ArrayList<>();

    public ModuloCurso() {}

    public ModuloCurso(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<ConteudoAula> getConteudos() {
        return conteudos;
    }

    public void setConteudos(List<ConteudoAula> conteudos) {
        this.conteudos = conteudos;
    }
}