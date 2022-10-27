package com.example.cadastro.services;

import com.example.cadastro.controllers.dto.ClientDto;
import com.example.cadastro.controllers.dto.SellerDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SellerService {
  SellerDto createSeller(SellerDto seller);
  List<SellerDto> getAll();

  SellerDto findById(Long id);

  void deleteSellerById(Long sellerId);
}
