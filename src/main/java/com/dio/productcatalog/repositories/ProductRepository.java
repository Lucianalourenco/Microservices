package com.dio.productcatalog.repositories;

import com.dio.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository
public interface ProductRepository extends CrudRepository <Product, Integer{
    Product save(Product product);

     findById(Integer id);
}
