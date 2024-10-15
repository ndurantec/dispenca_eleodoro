package com.eleodoro.dispenca_eleodoro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eleodoro.dispenca_eleodoro.modelo.Alimento;

public interface AlimentoRepository extends JpaRepository<Alimento, Long>{
    
}
