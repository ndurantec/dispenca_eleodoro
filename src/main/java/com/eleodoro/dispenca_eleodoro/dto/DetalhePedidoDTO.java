package com.eleodoro.dispenca_eleodoro.dto;

import com.eleodoro.dispenca_eleodoro.modelo.DetalhePedido;

public class DetalhePedidoDTO {
    private int quantidadeSolicitada;
    private double valor;
    private boolean statusEntrega;

    public DetalhePedidoDTO() {
    }

    public DetalhePedidoDTO(int quantidadeSolicitada, double valor, boolean statusEntrega) {
        this.quantidadeSolicitada = quantidadeSolicitada;
        this.valor = valor;
        this.statusEntrega = statusEntrega;
    }

    public int getQuantidadeSolicitada() {
        return quantidadeSolicitada;
    }

    public void setQuantidadeSolicitada(int quantidadeSolicitada) {
        this.quantidadeSolicitada = quantidadeSolicitada;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isStatusEntrega() {
        return statusEntrega;
    }
    
    public void setStatusEntrega(boolean statusEntrega) {
        this.statusEntrega = statusEntrega;
    }

    public DetalhePedido novoDetalhePedido() {
        return null;
    }
    
    
}
