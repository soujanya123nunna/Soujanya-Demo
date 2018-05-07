package com.UserProduct.services;

import java.util.Optional;

import com.UserProduct.domain.Product;

public interface ProductService {
    Iterable<Product> listAllProducts();

    Optional<Product> getProductById(Integer id);

    Product saveProduct(Product product);

    Product deleteProduct(Integer id);
}
