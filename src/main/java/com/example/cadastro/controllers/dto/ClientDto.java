package com.example.cadastro.controllers.dto;

import java.io.Serializable;
import java.util.List;

public class ClientDto implements Serializable {
  private Long id;
  private String clientName;
  private List<SellerDto> sellers;

  public ClientDto(Long id, String clientName, List<SellerDto> sellers) {
    this.id = id;
    this.clientName = clientName;
    this.sellers = sellers;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public List<SellerDto> getSellers() {
    return sellers;
  }

  public void setSellers(List<SellerDto> sellers) {
    this.sellers = sellers;
  }
}
