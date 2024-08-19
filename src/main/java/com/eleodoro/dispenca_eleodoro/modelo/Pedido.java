package com.eleodoro.dispenca_eleodoro.modelo;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pedido {
    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String origem;
    private LocalDateTime dataPedido;
    private LocalDateTime dataDeEntrega;

    @Deprecated
    public Pedido() {
    }

    public Pedido(String origem, LocalDateTime dataPedido, LocalDateTime dataDeEntrega) {
        this.origem = origem;
        this.dataPedido = dataPedido;
        this.dataDeEntrega = dataDeEntrega;
    }

    public String getOrigem() {
        return origem;
    }
    public void setOrigem(String origem) {
        this.origem = origem;
    }
    public LocalDateTime getDataPedido() {
        return dataPedido;
    }
    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }
    public LocalDateTime getDataDeEntrega() {
        return dataDeEntrega;
    }
    public void setDataDeEntrega(LocalDateTime dataDeEntrega) {
        this.dataDeEntrega = dataDeEntrega;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    private void realizarPedido() {
    }

    @Override
    public String toString() {
        return "Pedido [origem=" + origem + ", dataPedido=" + dataPedido + ", dataDeEntrega=" + dataDeEntrega + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((origem == null) ? 0 : origem.hashCode());
        result = prime * result + ((dataPedido == null) ? 0 : dataPedido.hashCode());
        result = prime * result + ((dataDeEntrega == null) ? 0 : dataDeEntrega.hashCode());
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
        Pedido other = (Pedido) obj;
        if (origem == null) {
            if (other.origem != null)
                return false;
        } else if (!origem.equals(other.origem))
            return false;
        if (dataPedido == null) {
            if (other.dataPedido != null)
                return false;
        } else if (!dataPedido.equals(other.dataPedido))
            return false;
        if (dataDeEntrega == null) {
            if (other.dataDeEntrega != null)
                return false;
        } else if (!dataDeEntrega.equals(other.dataDeEntrega))
            return false;
        return true;
    }

  
    

    
}