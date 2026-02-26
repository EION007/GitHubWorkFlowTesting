package com.eion.products.products;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

  private final ProductService service;

  public ProductController(ProductService service) {
    this.service = service;
  }

  @GetMapping
  public List<ProductEntity> getAllProducts() {
    return service.getAllProducts();
  }

  @GetMapping("/{id}")
  public ProductEntity getProductById(@PathVariable Long id) {
    return service.getProductById(id);
  }

  @GetMapping("/category/{category}")
  public List<ProductEntity> getProductsByCategory(@PathVariable String category) {
    return service.getProductsByCategory(category);
  }
}