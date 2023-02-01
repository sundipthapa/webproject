package com.example.butchershop.Repository;

import com.example.butchershop.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findById(long id);
    Product findByName(String name);
    List<Product> findAllByOrderByIdAsc();
    List<Product> findAllByCategoryId(long categoryId);

    //Custom query
    @Query(value = "select * from product p where p.name like %:keyword% or p.description like %:keyword%", nativeQuery = true)
    List<Product> search(@Param("keyword") String keyword);
}
