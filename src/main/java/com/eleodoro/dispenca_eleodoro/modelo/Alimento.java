package com.eleodoro.dispenca_eleodoro.modelo;

public class Alimento {

 private String Alimento;

    public Alimento() {
    }

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
        return "Alimento [Alimento=" + Alimento + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Alimento == null) ? 0 : Alimento.hashCode());
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
        if (Alimento == null) {
            if (other.Alimento != null)
                return false;
        } else if (!Alimento.equals(other.Alimento))
            return false;
        return true;
    }

}
