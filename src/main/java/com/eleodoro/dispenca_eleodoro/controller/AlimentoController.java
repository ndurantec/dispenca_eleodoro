package com.eleodoro.dispenca_eleodoro.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.eleodoro.dispenca_eleodoro.dto.AlimentoDTO;
import com.eleodoro.dispenca_eleodoro.modelo.Alimento;
import com.eleodoro.dispenca_eleodoro.repository.AlimentoRepository;

@RestController
@RequestMapping(value = "/alimento")
public class AlimentoController {

    @GetMapping (value = "/imprimir")
    public String imprimir(){
        return "chamou o AlimentoController";
    }
    
    private AlimentoRepository alimentoRepository;

    @PostMapping(value = "/insert")
    public ResponseEntity<Alimento> insert(@RequestBody AlimentoDTO alimentoDTO){

        Alimento novoAlimento = alimentoDTO.novoAlimento();
        alimentoRepository.save(novoAlimento);

        System.out.println("chegou no Metodo insert");
        System.out.println(alimentoDTO.toString());

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
        .path("{/id}")
        .buildAndExpand(novoAlimento.getId())
        .toUri();

        return ResponseEntity.created(uri).body(novoAlimento);
    }

    
    @GetMapping(value = "/{id}")
     ResponseEntity<Alimento> buscarPorId(@PathVariable Long id) {
      return (ResponseEntity<Alimento>) alimentoRepository.findById(id)
           .map(registro -> ResponseEntity.ok().body(registro))
           .orElse(ResponseEntity.notFound().build());
   }
           


}
