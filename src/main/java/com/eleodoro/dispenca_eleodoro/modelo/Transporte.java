package com.eleodoro.dispenca_eleodoro.modelo;

public class Transporte {
    private String nome;
    private int quantidade;
    private int numeracao;
    public Transporte() {
    }

    public Transporte(String nome, int quantidade, int numeracao) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.numeracao = numeracao;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public int getNumeracao() {
        return numeracao;
    }
    public void setNumeracao(int numeracao) {
        this.numeracao = numeracao;
    }

    @Override
    public String toString() {
        return "Transporte [nome=" + nome + ", quantidade=" + quantidade + ", numeracao=" + numeracao + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + quantidade;
        result = prime * result + numeracao;
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
        Transporte other = (Transporte) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (quantidade != other.quantidade)
            return false;
        if (numeracao != other.numeracao)
            return false;
        return true;
    }

    
}
