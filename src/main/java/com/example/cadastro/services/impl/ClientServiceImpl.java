package com.example.cadastro.services.impl;

import com.example.cadastro.controllers.dto.ClientDto;
import com.example.cadastro.models.ClientEntity;
import com.example.cadastro.repositories.ClientRepository;
import com.example.cadastro.services.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class ClientServiceImpl implements ClientService {

  private final ClientRepository clientRepository;

  public ClientServiceImpl(ClientRepository clientRepository) {
    this.clientRepository = clientRepository;
  }

  private ClientDto convertToDto(ClientEntity createdClient) {
    ClientDto clientDto = new ClientDto();
    clientDto.setId(createdClient.getClientId());
    clientDto.setClientName(createdClient.getClientName());

    return clientDto;
  }

  private ClientEntity convertToEntity(ClientDto clientDto) {
    ClientEntity clientEntity = new ClientEntity();
    clientEntity.setClientName(clientDto.getClientName());

    return clientEntity;
  }


  public ClientDto creatClient(ClientDto clienteDto) {
    final var clienteCriado = this.clientRepository.save(convertToEntity(clienteDto));
    return convertToDto(clienteCriado);
  }

  @Override
  public ClientDto createClient(ClientDto client) {
    return convertToDto(this.clientRepository.save(convertToEntity(client)));
  }

  @Override
  public List<ClientDto> getAll() {
    return this.clientRepository.findAll()
      .stream()
      .map(this::convertToDto)
      .collect(Collectors.toList());
  }

  @Override
  public ClientDto findById(Long id) {
    final var clienteEntity = this.clientRepository.findById(id);
    if (clienteEntity.isPresent()) {
      return convertToDto(clienteEntity.get());
    } else {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
  }

  @Override
  public void deleteClientById(Long id) {
    if(this.clientRepository.existsById(id)){
      this.clientRepository.deleteById(id);
    }
  }
}
