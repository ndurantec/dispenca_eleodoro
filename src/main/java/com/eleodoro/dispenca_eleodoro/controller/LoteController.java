package com.eleodoro.dispenca_eleodoro.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.eleodoro.dispenca_eleodoro.dto.LoteDTO;
import com.eleodoro.dispenca_eleodoro.modelo.Lote;
import com.eleodoro.dispenca_eleodoro.repository.LoteRepository;


@RestController
@RequestMapping(value = "/lote")
public class LoteController {
    
    @GetMapping(value = "/imprimir")
    public String imprimir(){
        return "chegou ate aqui Lote";
    }

    private LoteRepository loteRepository;

    @PostMapping(value = "/insert")
    public ResponseEntity<Lote> insert(@RequestBody LoteDTO loteDTO){

        Lote novoLote = loteDTO.novoLote();
        loteRepository.save(novoLote);

        System.out.println("chegou no Metodo insert");
        System.out.println(loteDTO.toString());

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
        .path("{/id}")
        .buildAndExpand(novoLote.getId())
        .toUri();

        return ResponseEntity.created(uri).body(novoLote);
    }
}