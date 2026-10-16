package com.example.seguranca.services;

import com.example.seguranca.DTOs.ClienteDTO;
import com.example.seguranca.entity.Cliente;
import com.example.seguranca.entities.Role;
import com.example.seguranca.repositories.ClienteRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    private final PasswordEncoder passwordEncoder;
    private final ClienteRepository clienteRepository;
    public ClienteService(PasswordEncoder passwordEncoder, PasswordEncoder passwordEncoder1, ClienteRepository clienteRepository){
        this.passwordEncoder = passwordEncoder;
        this.clienteRepository = clienteRepository;
    }
    public Cliente criarCliente(ClienteDTO dto){
        Cliente cliente = new Cliente();
        cliente.setNome(dto.getNome());
        cliente.setSenha(passwordEncoder.encode(dto.getSenha()));
        cliente.setEmail(dto.getEmail());
        if (dto.getRole() == null){
            cliente.setRole(Role.ROLE_USER);
        }else{
            cliente.setRole(dto.getRole());
        }

        return cliente;
    }
}
