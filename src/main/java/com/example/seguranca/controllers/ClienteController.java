package com.example.seguranca.controllers;

import com.example.seguranca.DTOs.ClienteDTO;
import com.example.seguranca.services.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/cliente")
public class ClienteController {

    private final ClienteService service;
    public ClienteController(ClienteService service){
        this.service = service;
    }
    @GetMapping
    public ResponseEntity<?>ola(){
        return ResponseEntity.ok("Olá");
    }
    @PostMapping
    public ResponseEntity<?>criarCliente(@RequestBody ClienteDTO dto){
        return ResponseEntity.ok(service.criarCliente(dto));
    }

}