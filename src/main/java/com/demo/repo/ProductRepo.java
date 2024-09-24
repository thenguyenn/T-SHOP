package com.demo.repo;

import com.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Integer> {
    @Query(value = "select * from Products where Categoryid like ?1 and price > ?2 and price < ?3 and name like ?4", nativeQuery = true)
    List<Product> getAll(String categoryId, Integer min, Integer max, String key);

}
