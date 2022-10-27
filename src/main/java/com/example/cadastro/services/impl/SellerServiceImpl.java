package com.example.cadastro.services.impl;


import com.example.cadastro.controllers.dto.SellerDto;
import com.example.cadastro.models.SellerEntity;
import com.example.cadastro.repositories.SellerRepository;
import com.example.cadastro.services.SellerService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class SellerServiceImpl implements SellerService {
  private final SellerRepository sellerRepository;

  public SellerServiceImpl(SellerRepository sellerRepository) {
    this.sellerRepository = sellerRepository;
  }

  private SellerDto convertToDto(SellerEntity sellerCreated) {
    SellerDto sellerDto = new SellerDto();
    sellerDto.setSellerId(sellerCreated.getSellerId());
    sellerDto.setSellerName(sellerCreated.getSellerName());

    return sellerDto;
  }

  private SellerEntity convertToEntity(SellerDto sellerDto) {
    SellerEntity sellerEntity = new SellerEntity();
    sellerEntity.setSellerName(sellerDto.getSellerName());

    return sellerEntity;
  }


  public SellerDto creatSeller(SellerDto sellerDto) {
    final var sellerCreated = this.sellerRepository.save(convertToEntity(sellerDto));
    return convertToDto(sellerCreated);
  }

  @Override
  public SellerDto createSeller(SellerDto seller) {
    return convertToDto(this.sellerRepository.save(convertToEntity(seller)));
  }

  @Override
  public List<SellerDto> getAll() {
    return this.sellerRepository.findAll()
        .stream()
        .map(this::convertToDto)
        .collect(Collectors.toList());
  }

 @Override
  public SellerDto findById(Long id) {
    final var sellerEntity = this.sellerRepository.findById(id);
    if (sellerEntity.isPresent()) {
      return convertToDto(sellerEntity.get());
    } else {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
  }

  @Override
  public void deleteSellerById(Long sellerId) {
    if(this.sellerRepository.existsById(sellerId)) {
      this.sellerRepository.deleteById(sellerId);
    }
  }
}
