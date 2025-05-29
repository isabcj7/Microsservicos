package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
public class ConteudoAula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String tipoConteudo;

    private String url;

    @ManyToOne
    @JoinColumn(name = "modulo_curso_id")
    private ModuloCurso moduloCurso;

    public ConteudoAula() {}

    public ConteudoAula(String titulo, String tipoConteudo, String url, ModuloCurso moduloCurso) {
        this.titulo = titulo;
        this.tipoConteudo = tipoConteudo;
        this.url = url;
        this.moduloCurso = moduloCurso;
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

    public String getTipoConteudo() {
        return tipoConteudo;
    }

    public void setTipoConteudo(String tipoConteudo) {
        this.tipoConteudo = tipoConteudo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ModuloCurso getModuloCurso() {
        return moduloCurso;
    }

    public void setModuloCurso(ModuloCurso moduloCurso) {
        this.moduloCurso = moduloCurso;
    }
}
