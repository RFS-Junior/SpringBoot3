package com.products.products.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.products.products.models.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID>{}