package com.example.demo.services;

import com.example.demo.entities.ConteudoAula;
import com.example.demo.repositories.ConteudoAulaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConteudoAulaService {

    @Autowired
    private ConteudoAulaRepository conteudoAulaRepository;

    public ConteudoAula createConteudoAula(ConteudoAula conteudoAula) {
        return conteudoAulaRepository.save(conteudoAula);
    }

    public List<ConteudoAula> getAllConteudoAulas() {
        return conteudoAulaRepository.findAll();
    }

    public Optional<ConteudoAula> getConteudoAulaById(Long id) {
        return conteudoAulaRepository.findById(id);
    }

    public List<ConteudoAula> getConteudoAulasByModuloCursoId(Long moduloCursoId) {
        return conteudoAulaRepository.findByModuloCursoId(moduloCursoId);
    }

    public void deleteConteudoAula(Long id) {
        conteudoAulaRepository.deleteById(id);
    }
}
