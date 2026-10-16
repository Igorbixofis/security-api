package com.example.seguranca.repositories;

import com.example.seguranca.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteRepository  extends JpaRepository<Cliente, UUID> {

    com.example.seguranca.entity.Cliente findByEmail(String email);
}