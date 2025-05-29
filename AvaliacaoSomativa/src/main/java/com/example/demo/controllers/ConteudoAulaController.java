package com.example.demo.controllers;

import com.example.demo.entities.ConteudoAula;
import com.example.demo.services.ConteudoAulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conteudos")
public class ConteudoAulaController {

    @Autowired
    private ConteudoAulaService conteudoAulaService;

    @PostMapping("/criar")
    public ResponseEntity<ConteudoAula> createConteudoAula(@RequestBody ConteudoAula conteudoAula) {
        ConteudoAula savedConteudo = conteudoAulaService.createConteudoAula(conteudoAula);
        return ResponseEntity.ok(savedConteudo);
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<ConteudoAula>> getAllConteudoAulas() {
        List<ConteudoAula> conteudos = conteudoAulaService.getAllConteudoAulas();
        return ResponseEntity.ok(conteudos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ConteudoAula> getConteudoAulaById(@PathVariable Long id) {
        return conteudoAulaService.getConteudoAulaById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @GetMapping("/modulo/{moduloCursoId}")
    public ResponseEntity<List<ConteudoAula>> getConteudoAulasByModuloCursoId(@PathVariable Long moduloCursoId) {
        List<ConteudoAula> conteudos = conteudoAulaService.getConteudoAulasByModuloCursoId(moduloCursoId);
        return ResponseEntity.ok(conteudos);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteConteudoAula(@PathVariable Long id) {
        conteudoAulaService.deleteConteudoAula(id);
        return ResponseEntity.noContent().build();
    }
}