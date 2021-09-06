package com.dio.productcatalog.controller;


import com.dio.productcatalog.model.Product;
import com.dio.productcatalog.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/product")
public class ProductController<method> {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    Product creat(@RequestBody Product product) {
        return productRepository.save(product);
    }
    @RequestMapping](value="/{id}", method = RequestMethod.GET)
    Optional <Product> findById(@PathVariable Integer id) {
        return productRepository.findById(id);
    }
}
