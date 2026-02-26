package com.eion.products.products;

import java.util.List;

public interface ProductService {
  List<ProductEntity> getAllProducts();

  ProductEntity getProductById(Long id);

  List<ProductEntity> getProductsByCategory(String category);
}
