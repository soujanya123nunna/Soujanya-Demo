package com.UserProdcut.repositories;


import org.springframework.data.repository.CrudRepository;

import com.UserProduct.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
}
