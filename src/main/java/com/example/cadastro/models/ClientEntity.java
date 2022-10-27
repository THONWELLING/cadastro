package com.example.cadastro.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "clients")
public class ClientEntity implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "client_id")
  private Long clientId;

  @Column(name = "client_name")
  private String clientName;

  @ManyToMany()
  @JoinTable( name = "clients_sellers",
    joinColumns = @JoinColumn(name = "client_id"),
    inverseJoinColumns = @JoinColumn(name = "seller_id")
  )

  private List<SellerEntity> sellers;
  public Long getClientId() {
    return clientId;
  }

  public void setClientId(Long id) {
    this.clientId = id;
  }

  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }
}
