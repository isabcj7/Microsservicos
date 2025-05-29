package com.example.demo.repositories;

import com.example.demo.entities.ConteudoAula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ConteudoAulaRepository extends JpaRepository<ConteudoAula, Long> {
    List<ConteudoAula> findByModuloCursoId(Long moduloCursoId);
    
}