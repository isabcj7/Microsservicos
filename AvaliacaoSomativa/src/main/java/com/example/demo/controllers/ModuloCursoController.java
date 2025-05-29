package com.example.demo.controllers;

import com.example.demo.entities.ModuloCurso;
import com.example.demo.services.ModuloCursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/modulos")
public class ModuloCursoController {

    @Autowired
    private ModuloCursoService moduloCursoService;

    @PostMapping("/criar")
    public ResponseEntity<ModuloCurso> createModuloCurso(@RequestBody ModuloCurso moduloCurso) {
        ModuloCurso savedModulo = moduloCursoService.createModuloCurso(moduloCurso);
        return ResponseEntity.ok(savedModulo);
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<ModuloCurso>> getAllModuloCursos() {
        List<ModuloCurso> modulos = moduloCursoService.getAllModuloCursos();
        return ResponseEntity.ok(modulos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ModuloCurso> getModuloCursoById(@PathVariable Long id) {
        return moduloCursoService.getModuloCursoById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteModuloCurso(@PathVariable Long id) {
        moduloCursoService.deleteModuloCurso(id);
        return ResponseEntity.noContent().build();
    }
}
