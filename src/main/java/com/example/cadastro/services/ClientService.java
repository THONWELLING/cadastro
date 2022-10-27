package com.example.cadastro.services;

import com.example.cadastro.controllers.dto.ClientDto;

import java.util.List;

public interface ClientService {
  ClientDto createClient(ClientDto client);
  List<ClientDto> getAll();

  ClientDto findById(Long id);

void deleteClientById(Long id);
}
