package com.eleodoro.dispenca_eleodoro.modelo;

public class Alimento {
    
    private String nome;

    public Alimento() {
    }

    
    public Alimento(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void cadastrarAlimento(){

        
    }

    @Override
    public String toString() {
        return "Alimento [nome=" + nome + "]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alimento other = (Alimento) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    







}
