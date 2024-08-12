package com.eleodoro.dispenca_eleodoro.modelo;

public class DetalhePedido {
    private int quantidadeSolicitada;
    private double valor;
    private boolean statusEntrega;

    public DetalhePedido() {
    }

    public DetalhePedido(int quantidadeSolicitada, double valor, boolean statusEntrega) {
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

    public void inserirAlimento() {
    }

    public void calcularValor() {
    }

    @Override
    public String toString() {
        return "DetalhePedido [quantidadeSolicitada=" + quantidadeSolicitada + ", valor=" + valor + ", statusEntrega="
                + statusEntrega + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + quantidadeSolicitada;
        long temp;
        temp = Double.doubleToLongBits(valor);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + (statusEntrega ? 1231 : 1237);
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
        DetalhePedido other = (DetalhePedido) obj;
        if (quantidadeSolicitada != other.quantidadeSolicitada)
            return false;
        if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
            return false;
        if (statusEntrega != other.statusEntrega)
            return false;
        return true;
    }

 
    

    

    
}
