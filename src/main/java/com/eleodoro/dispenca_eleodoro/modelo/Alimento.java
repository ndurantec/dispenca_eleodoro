package com.eleodoro.dispenca_eleodoro.modelo;

public class Alimento {
<<<<<<< HEAD
    
    private String nome;
=======

 private String Alimento;
>>>>>>> 2534b5132fa27850bf24cb06b4f0dce1ce9bd59a

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

    public Alimento(String alimento) {
        Alimento = alimento;
    }

    public String getAlimento() {
        return Alimento;
    }

    public void setAlimento(String alimento) {
        Alimento = alimento;
    }

    public void cadastrarAlimento(){
        
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "Alimento [nome=" + nome + "]";
    }


=======
        return "Alimento [Alimento=" + Alimento + "]";
    }

>>>>>>> 2534b5132fa27850bf24cb06b4f0dce1ce9bd59a
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
<<<<<<< HEAD
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }


=======
        result = prime * result + ((Alimento == null) ? 0 : Alimento.hashCode());
        return result;
    }

>>>>>>> 2534b5132fa27850bf24cb06b4f0dce1ce9bd59a
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alimento other = (Alimento) obj;
<<<<<<< HEAD
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
=======
        if (Alimento == null) {
            if (other.Alimento != null)
                return false;
        } else if (!Alimento.equals(other.Alimento))
>>>>>>> 2534b5132fa27850bf24cb06b4f0dce1ce9bd59a
            return false;
        return true;
    }

<<<<<<< HEAD
    







=======
>>>>>>> 2534b5132fa27850bf24cb06b4f0dce1ce9bd59a
}
