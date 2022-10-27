package com.example.cadastro.repositories;

import com.example.cadastro.models.SellerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<SellerEntity, Long> {
}
