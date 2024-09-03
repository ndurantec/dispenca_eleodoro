package com.eleodoro.dispenca_eleodoro.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.eleodoro.dispenca_eleodoro.dto.PedidoDTO;
import com.eleodoro.dispenca_eleodoro.modelo.Pedido;
import com.eleodoro.dispenca_eleodoro.repository.PedidoRepository;

@RestController
@RequestMapping(value = "/pedido")
public class PedidoController {
    
    @GetMapping(value = "/imprimir")
    public String imprimir(){
        return "chegou ate aqui Pedido";
    }

    private PedidoRepository pedidoRepository;

    @PostMapping(value = "/insert")
    public ResponseEntity<Pedido> insert(@RequestBody PedidoDTO pedidoDTO){

        Pedido novoPedido = pedidoDTO.novoPedido();
        pedidoRepository.save(novoPedido);

        System.out.println("chegou no Metodo insert");
        System.out.println(pedidoDTO.toString());

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
        .path("{/id}")
        .buildAndExpand(novoPedido.getId())
        .toUri();

        return ResponseEntity.created(uri).body(novoPedido);
    }
}
