package com.eleodoro.dispenca_eleodoro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eleodoro.dispenca_eleodoro.modelo.Lote;

public interface LoteRepository extends JpaRepository<Lote, Long> {
    
}
