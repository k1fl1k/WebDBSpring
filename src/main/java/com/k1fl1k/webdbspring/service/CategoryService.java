package com.k1fl1k.webdbspring.service;

import com.k1fl1k.webdbspring.model.Category;
import com.k1fl1k.webdbspring.repository.CategoryRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
