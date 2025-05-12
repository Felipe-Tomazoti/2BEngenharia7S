package com.example.projeto2B.repositories;

import com.example.projeto2B.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
