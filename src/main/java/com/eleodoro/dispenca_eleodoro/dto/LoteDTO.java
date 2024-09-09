package com.eleodoro.dispenca_eleodoro.dto;

import java.time.LocalDateTime;

import com.eleodoro.dispenca_eleodoro.modelo.Lote;

public class LoteDTO {
    
    private int quantidade;
    private String codigo;
    private LocalDateTime dateVencimento;
    public LoteDTO() {
    }
    public LoteDTO(int quantidade, String codigo, LocalDateTime dateVencimento) {
        this.quantidade = quantidade;
        this.codigo = codigo;
        this.dateVencimento = dateVencimento;
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
    public LocalDateTime getDateVencimento() {
        return dateVencimento;
    }
    public void setDateVencimento(LocalDateTime dateVencimento) {
        this.dateVencimento = dateVencimento;
    }
    public Lote novoLote() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'novoLote'");
    }
    
    


}
