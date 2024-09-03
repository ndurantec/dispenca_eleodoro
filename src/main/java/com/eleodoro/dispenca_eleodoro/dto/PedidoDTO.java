package com.eleodoro.dispenca_eleodoro.dto;

import java.time.LocalDateTime;

import com.eleodoro.dispenca_eleodoro.modelo.Pedido;

public class PedidoDTO {
    private String origem;
    private LocalDateTime dataPedido;
    private LocalDateTime dataDeEntrega;

    public PedidoDTO() {
    }

    public PedidoDTO(String origem, LocalDateTime dataPedido, LocalDateTime dataDeEntrega) {
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

    public Pedido novoPedido() {
        return null;
    }

    
}
