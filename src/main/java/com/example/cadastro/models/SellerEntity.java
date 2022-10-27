package com.example.cadastro.models;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "sellers")
public class SellerEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "seller_id")
  private Long sellerId;

  @Column(name = "seller_name")
  private String sellerName;

  @ManyToMany(mappedBy = "sellers")
  private List<ClientEntity> clients;

  public SellerEntity(Long sellerId, String sellerName, List<ClientEntity> clients) {
    this.sellerId = sellerId;
    this.sellerName = sellerName;
    this.clients = clients;
  }

  public SellerEntity() {

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
}
