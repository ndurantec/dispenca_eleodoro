package com.eleodoro.dispenca_eleodoro.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.eleodoro.dispenca_eleodoro.modelo.Pedido;

public class PedidoDTO {
    private String origem;
    private LocalDate dataPedido;
    private LocalDate dataDeEntrega;

    public PedidoDTO() {
    }

    public PedidoDTO(String origem, LocalDate dataPedido, LocalDate dataDeEntrega) {
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

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public LocalDate getDataDeEntrega() {
        return dataDeEntrega;
    }
    
    public void setDataDeEntrega(LocalDate dataDeEntrega) {
        this.dataDeEntrega = dataDeEntrega;
    }

    public Pedido novoPedido() {
        return null;
    }

    
}
