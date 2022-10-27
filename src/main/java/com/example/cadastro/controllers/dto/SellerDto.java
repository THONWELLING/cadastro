package com.example.cadastro.controllers.dto;

import java.io.Serializable;
import java.util.List;

public class SellerDto implements Serializable {
  private Long sellerId;
  private String sellerName;
  private List<ClientDto> clients;

  public SellerDto(Long id, String sellerName, List<ClientDto> clients) {
    this.sellerId = id;
    this.sellerName = sellerName;
    this.clients = clients;
  }

  public SellerDto() {

  }

  public Long getSellerId() {
    return sellerId;
  }

  public void setSellerId(Long id) {
    this.sellerId = id;
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
