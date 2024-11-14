package com.k1fl1k.webdbspring.repository;

import com.k1fl1k.webdbspring.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
