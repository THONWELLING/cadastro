package com.example.cadastro.models;


import javax.persistence.*;

@Entity
@Table(name = "sellers")
public class SellerEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "seller_id")
  private Long id;

  @Column(name = "seller_name")
  private String sellerName;

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
}
