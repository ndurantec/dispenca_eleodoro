package com.eleodoro.dispenca_eleodoro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Lote")



public class LoteController {
     
    @GetMapping(value = "/imprimir")
    public String imprimir(){

        return("chegou ate aqui o LoteController");




    }





}
