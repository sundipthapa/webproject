package com.example.butchershop.Service;


import com.example.butchershop.Entity.Category;

import java.util.List;


public interface CategoryService {

    void save(Category category);
    List<Category> findAll();
}
