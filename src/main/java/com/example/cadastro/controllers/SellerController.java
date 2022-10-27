package com.example.cadastro.controllers;

import com.example.cadastro.controllers.dto.ClientDto;
import com.example.cadastro.controllers.dto.SellerDto;
import com.example.cadastro.services.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sellers")
public class SellerController {

//  private final ClientService clientService;

//  public ClientController(ClientService clientService) {
//    this.clientService = clientService;
//  }

//  @PostMapping()
//  public ResponseEntity<SellerDto> create(@RequestBody SellerDto seller) {
//    return new ResponseEntity<>(this.sellerService.createSeller(seller), HttpStatus.CREATED);
//  }
//  @GetMapping()
//  public List<SellerDto> getClientList() {
//    return this.sellerService.getAll();
//  }

}
