package com.projeto.condominio.controller;


import com.projeto.condominio.model.Proprietario;
import com.projeto.condominio.repository.ProprietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/proprietarios")
public class ProprietarioController {

    @Autowired
    private ProprietarioRepository proprietarioRepository;

    @GetMapping
    public ResponseEntity<List<Proprietario>> getAll(){
        List<Proprietario> proprietarios = proprietarioRepository.findAll();

        return ResponseEntity.ok(proprietarios);
    }

}
