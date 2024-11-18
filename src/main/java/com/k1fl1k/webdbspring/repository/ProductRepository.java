package com.k1fl1k.webdbspring.repository;

import com.k1fl1k.webdbspring.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    // Фільтрація товарів за категорією
    List<Product> findByCategoryId(Long categoryId);


}
