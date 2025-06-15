package com.example.demo.infraestructure.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.model.Product;
import com.example.demo.domain.repository.ProductRepository;

@Repository
public interface ProductRepositoryImpl extends JpaRepository<Product, Long>, ProductRepository {
    @Override
    List<Product> findAll();

    @Override
    Optional<Product> findById(Long id);
}