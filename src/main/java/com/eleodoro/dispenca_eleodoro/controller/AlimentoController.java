package com.eleodoro.dispenca_eleodoro.controller;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.DeleteMapping;
=======
import org.springframework.web.bind.annotation.CrossOrigin;
>>>>>>> 6f53d43a0edfb9c6a6e19b05b4c947dc1c12d372
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.eleodoro.dispenca_eleodoro.dto.AlimentoDTO;
import com.eleodoro.dispenca_eleodoro.modelo.Alimento;
import com.eleodoro.dispenca_eleodoro.modelo.DetalhePedido;
import com.eleodoro.dispenca_eleodoro.repository.AlimentoRepository;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/alimento")
public class AlimentoController {


    // prestar atenção todo inicio tem que ter isso caso vc tenha colocado repository
    @Autowired
    private AlimentoRepository alimentoRepository;


    @GetMapping (value = "/imprimir")
    public String imprimir(){
        return "chamou o AlimentoController";
    }
    

    @PostMapping(value = "/insert")
    public ResponseEntity<Alimento> insert(@RequestBody AlimentoDTO alimentoDTO){

        System.out.println("chegou no Metodo insert");
        System.out.println(alimentoDTO.toString());

        Alimento novoAlimento = alimentoDTO.novoAlimento();
        alimentoRepository.save(novoAlimento);
        

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
           


   @PutMapping (value = "/{id}")
   public ResponseEntity<Alimento> update (@PathVariable Long id, @RequestBody Alimento alimento){

     
    Optional<Alimento> alimentoBanco = alimentoRepository.findById(id);

       Alimento alimentoModificado = alimentoBanco.get();

       alimentoModificado.setNome (alimento.getNome());

       alimentoRepository.save (alimentoModificado.save);

      
       return ResponseEntity.ok().body(alimentoModificado);

   }

@DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAlimento(@PathVariable Long id) {
    Optional<Alimento> alimentoBanco = alimentoRepository.findById(id);

    if (alimentoBanco.isPresent()) {
        alimentoRepository.remove(alimentoBanco.get());
        return ResponseEntity.ok("Alimento with ID " + id + " deleted.");
    }
    
    return ResponseEntity.notFound().build();
    }



}
 