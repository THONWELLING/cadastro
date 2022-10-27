package com.example.cadastro.controllers.dto;

import java.io.Serializable;
import java.util.List;

public class SellerDto implements Serializable {
  private Long id;
  private String sellerName;
  private List<ClientDto> clients;

  public SellerDto(Long id, String sellerName, List<ClientDto> clients) {
    this.id = id;
    this.sellerName = sellerName;
    this.clients = clients;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getSellerName() {
    return sellerName;
  }

  public void setSellerName(String sellerName) {
    this.sellerName = sellerName;
  }

  public List<ClientDto> getClients() {
    return clients;
  }

  public void setClients(List<ClientDto> clients) {
    this.clients = clients;
  }
}
