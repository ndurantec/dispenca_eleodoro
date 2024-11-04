package com.eleodoro.dispenca_eleodoro.dto;

import com.eleodoro.dispenca_eleodoro.modelo.Alimento;

public class AlimentoDTO {
    private String nome;

    public AlimentoDTO() {
    }

    public AlimentoDTO(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public Alimento novoAlimento() {
        return new Alimento(nome);   
    }
    
    @Override
    public String toString() {
        return "AlimentoDTO [nome=" + nome + "]";
    }
    
}
