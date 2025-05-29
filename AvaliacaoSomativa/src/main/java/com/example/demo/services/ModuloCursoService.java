package com.example.demo.services;

import com.example.demo.entities.ModuloCurso;
import com.example.demo.repositories.ModuloCursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModuloCursoService {

    @Autowired
    private ModuloCursoRepository moduloCursoRepository;

    // Create a module
    public ModuloCurso createModuloCurso(ModuloCurso moduloCurso) {
        return moduloCursoRepository.save(moduloCurso);
    }

    // Get all modules
    public List<ModuloCurso> getAllModuloCursos() {
        return moduloCursoRepository.findAll();
    }

    // Get module by ID
    public Optional<ModuloCurso> getModuloCursoById(Long id) {
        return moduloCursoRepository.findById(id);
    }

    // Delete module by ID
    public void deleteModuloCurso(Long id) {
        moduloCursoRepository.deleteById(id);
    }
}


