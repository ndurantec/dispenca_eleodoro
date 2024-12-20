
    
package com.eleodoro.dispenca_eleodoro.modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Lote implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Alimento alimento;
    private int quantidade;
    private String codigo;
    private LocalDate dateVencimento;

    @Deprecated
    public Lote() {
    }
    
    public Lote(int quantidade, String codigo, LocalDate dateVencimento) {
        this.quantidade = quantidade;
        this.codigo = codigo;
        this.dateVencimento = dateVencimento;
    }

    public void cadastrarLote(String codigo){
    }

    private void consultarLote(String codigo){
    }

    @Override
    public String toString() {
        return "Lote [quantidade=" + quantidade + ", codigo=" + codigo + ", dateVencimento=" + dateVencimento + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + quantidade;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        result = prime * result + ((dateVencimento == null) ? 0 : dateVencimento.hashCode());
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
        Lote other = (Lote) obj;
        if (quantidade != other.quantidade)
            return false;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        if (dateVencimento == null) {
            if (other.dateVencimento != null)
                return false;
        } else if (!dateVencimento.equals(other.dateVencimento))
            return false;
        return true;
    }

    public void setNome(LocalDate dateVencimento2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNome'");
    }

    public static Long getSerialversionuid() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Alimento getAlimento() {
        return alimento;
    }

    public void setAlimento(Alimento alimento) {
        this.alimento = alimento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getDateVencimento() {
        return dateVencimento;
    }

    public void setDateVencimento(LocalDate dateVencimento) {
        this.dateVencimento = dateVencimento;
    }

}
    
    
