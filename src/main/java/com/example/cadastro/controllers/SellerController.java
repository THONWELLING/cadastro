package com.example.cadastro.controllers;


import com.example.cadastro.controllers.dto.SellerDto;
import com.example.cadastro.services.SellerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sellers")
public class SellerController {

  private final SellerService sellerService;

  public SellerController(SellerService sellerService) {
    this.sellerService = sellerService;
  }

  @PostMapping()
  public ResponseEntity<SellerDto> create(@RequestBody SellerDto seller) {
    return new ResponseEntity<>(this.sellerService.createSeller(seller), HttpStatus.CREATED);
  }
  @GetMapping()
  public List<SellerDto> getsellerList() {
    return this.sellerService.getAll();
  }

  @DeleteMapping("/{id}")
  public void deleteSellerById(@RequestParam Long sellerId) {
    this.sellerService.deleteSellerById(sellerId);
  }
}
