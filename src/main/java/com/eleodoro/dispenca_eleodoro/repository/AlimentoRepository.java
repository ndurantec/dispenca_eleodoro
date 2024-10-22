package com.eleodoro.dispenca_eleodoro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eleodoro.dispenca_eleodoro.modelo.Alimento;

<<<<<<< HEAD
public interface AlimentoRepository extends JpaRepository{

    void remove(Alimento alimento);
=======
public interface AlimentoRepository extends JpaRepository<Alimento, Long>{
>>>>>>> 6f53d43a0edfb9c6a6e19b05b4c947dc1c12d372
    
}
