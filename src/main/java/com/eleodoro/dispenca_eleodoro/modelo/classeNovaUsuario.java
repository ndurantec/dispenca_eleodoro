package com.eleodoro.dispenca_eleodoro.modelo;    

public class classeNovaUsuario {

    public String nome;
    public String email;
    public  int senha;    
    
    public classeNovaUsuario() {
    }

    public classeNovaUsuario(String nome, String email, int senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEmail() {
        return email;
    }

      public void setEmail(String email) {
        this.email = email;
    }

    public int getSenha() {
        return senha;
    }
    @Override
    public String toString() {
        return "classeNovaUsuario [nome=" + nome + ", email=" + email + ", senha=" + senha + "]";
    }
   public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "classeNovaUsuario [nome=" + nome + ", email=" + email + ", senha=" + senha + "]";
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + senha;
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
        classeNovaUsuario other = (classeNovaUsuario) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (senha != other.senha)
            return false;
        return true;
    }

  
    


}

