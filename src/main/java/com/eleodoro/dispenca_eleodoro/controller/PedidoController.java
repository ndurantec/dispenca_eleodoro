package com.eleodoro.dispenca_eleodoro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Pedido")
public class PedidoController {
    
    @GetMapping(value = "impremir")
    public void impremir(){
        System.out.println("Deu certo o controller Pedido");
    }
}
