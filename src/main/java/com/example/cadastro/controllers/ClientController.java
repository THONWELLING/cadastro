package com.example.cadastro.controllers;

import com.example.cadastro.models.ClientEntity;
import com.example.cadastro.repositories.ClientRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

  ClientRepository clientRepository;
  @GetMapping("/clients")
  public ResponseEntity<List> clientList() {
    return clientService.getAll();
  };


  @PostMapping("/clients")
  public ResponseEntity<>
}
