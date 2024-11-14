package com.k1fl1k.webdbspring.repository;

import com.k1fl1k.webdbspring.model.Product;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategoryId(Long categoryId);

    List<Product> findByCategoryIdAndPriceBetween(Long categoryId, Double minPrice, Double maxPrice);
}
