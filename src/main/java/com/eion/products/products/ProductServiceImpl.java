package com.eion.products.products;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

  private final ProductRepository repository;

  public ProductServiceImpl(ProductRepository repository) {
    this.repository = repository;
  }

  public List<ProductEntity> getAllProducts() {
    return repository.findAll();
  }

  public ProductEntity getProductById(Long id) {
    return repository.findById(id)
        .orElseThrow(() -> new RuntimeException("Product not found"));
  }

  public List<ProductEntity> getProductsByCategory(String category) {
    return repository.findByCategory(category);
  }

}
