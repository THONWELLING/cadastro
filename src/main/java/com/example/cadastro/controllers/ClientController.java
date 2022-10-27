package com.example.cadastro.controllers;

import com.example.cadastro.controllers.dto.ClientDto;
import com.example.cadastro.models.ClientEntity;
import com.example.cadastro.repositories.ClientRepository;
import com.example.cadastro.services.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

  private final ClientService clientService;

  public ClientController(ClientService clientService) {
    this.clientService = clientService;
  }

  @PostMapping()
  public ResponseEntity<ClientDto> create(@RequestBody ClientDto client) {
    return new ResponseEntity<>(this.clientService.createClient(client), HttpStatus.CREATED);
  }
  @GetMapping()
  public List<ClientDto> getClientList() {
    return this.clientService.getAll();
  }



}
