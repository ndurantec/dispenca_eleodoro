package com.eleodoro.dispenca_eleodoro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/DetalhePedido")
public class DetalhePedidoController {

    @GetMapping(value = "impremir")
    public void impremir(){
        System.out.println("Deu certo o controller DetalhePedido");
    }
    
}
