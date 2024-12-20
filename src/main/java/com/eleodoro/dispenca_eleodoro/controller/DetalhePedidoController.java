package com.eleodoro.dispenca_eleodoro.controller;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.eleodoro.dispenca_eleodoro.dto.DetalhePedidoDTO;
import com.eleodoro.dispenca_eleodoro.modelo.DetalhePedido;
import com.eleodoro.dispenca_eleodoro.repository.DetalhePedidoRepository;

@RestController
@RequestMapping(value = "/detalhepedido")
public class DetalhePedidoController {

    @GetMapping(value = "/imprimir")
    public String imprimir(){
        return "chegou ate aqui DetalhePedido";
    }
    
    @Autowired
    private DetalhePedidoRepository detalhepedidoRepository;

    @PostMapping(value = "/insert")
    public ResponseEntity<DetalhePedido> insert(@RequestBody DetalhePedidoDTO detalhepedidoDTO){

        DetalhePedido novDetalhePedido = detalhepedidoDTO.novoDetalhePedido();
        detalhepedidoRepository.save(novDetalhePedido);

        System.out.println("chegou no Metodo insert");
        System.out.println(detalhepedidoDTO.toString());

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
        .path("{/id}")
        .buildAndExpand(novDetalhePedido.getId())
        .toUri();

        return ResponseEntity.created(uri).body(novDetalhePedido);

    }


    @GetMapping(value = "{id}")
    public ResponseEntity<DetalhePedido> buscarPorId(@PathVariable Long id) {
        return (ResponseEntity<DetalhePedido>) detalhepedidoRepository.findById(id)
            .map(registro -> ResponseEntity.ok().body(registro))
            .orElse(ResponseEntity.notFound().build());

    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<DetalhePedido> update(@PathVariable Long id, @RequestBody DetalhePedidoDTO detalhepedidoDto) {
        
        Optional<DetalhePedido> detalhepedidoBanco = detalhepedidoRepository.findById(id);

        DetalhePedido detalhepedidoModificado = detalhepedidoBanco.get();

        detalhepedidoModificado.setQuantidadeSolicitada(detalhepedidoDto.getQuantidadeSolicitada());
        detalhepedidoModificado.setStatusEntrega(detalhepedidoDto.getStatusEntrega());
        detalhepedidoModificado.setValor(detalhepedidoDto.getValor());

        detalhepedidoRepository.save(detalhepedidoModificado);

        return ResponseEntity.ok().body(detalhepedidoModificado);
    }
    
     @DeleteMapping("/{id}")
     public ResponseEntity<String> deleteDetalhePedido(@PathVariable Long id) {
     Optional<DetalhePedido> detalhepedidoBanco = detalhepedidoRepository.findById(id);

     if (detalhepedidoBanco.isPresent()) {
         detalhepedidoRepository.delete(detalhepedidoBanco.get());
         return ResponseEntity.ok("DetalhePedido with ID " + id + " deleted.");
     }
    
     return ResponseEntity.notFound().build();
     }
}


