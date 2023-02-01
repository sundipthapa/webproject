package com.example.butchershop.Service;


import com.example.butchershop.Entity.Product;

import java.util.List;

public interface ProductService {
    void save(Product product);
    void edit(long id, Product newProduct);
    void delete(long id);
    Product findById(long id);
    List<Product> findAllByOrderByIdAsc();
    List<Product> findAllByCategoryId(long categoryId);
    long count();

    public List<Product> findAllProducts(String keyword);

}
