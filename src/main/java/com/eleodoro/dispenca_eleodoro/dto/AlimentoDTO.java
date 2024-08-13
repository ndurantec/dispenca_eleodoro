package com.eleodoro.dispenca_eleodoro.dto;

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

    @Override
    public String toString() {
        return "AlimentoDTO [nome=" + nome + "]";
    }

    
    
}
