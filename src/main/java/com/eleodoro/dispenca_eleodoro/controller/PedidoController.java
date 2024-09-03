package com.eleodoro.dispenca_eleodoro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eleodoro.dispenca_eleodoro.dto.PedidoDTO;

@RestController
@RequestMapping(value = "/pedido")
public class PedidoController {
    
    @GetMapping(value = "/imprimir")
    public String imprimir(){
        return "chegou ate aqui Pedido";
    }


    @PostMapping(value = "/insert")
    public void insert(@RequestBody PedidoDTO pedidoDTO){

        System.out.println("chegou no Metodo insert");
        System.out.println(pedidoDTO.toString());
    }
}
