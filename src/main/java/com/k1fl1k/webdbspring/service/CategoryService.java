package com.k1fl1k.webdbspring.service;

import com.k1fl1k.webdbspring.model.Category;
import com.k1fl1k.webdbspring.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    // Отримати всі категорії
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    // Отримати категорію за ID
    public Category getCategoryById(Long id) {
        Optional<Category> category = categoryRepository.findById(id);
        return category.orElse(null);
    }

    // Зберегти категорію
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    // Оновити категорію
    public Category updateCategory(Long id, Category category) {
        if (categoryRepository.existsById(id)) {
            category.setId(id);
            return categoryRepository.save(category);
        }
        return null;
    }

    // Видалити категорію
    public boolean deleteCategory(Long id) {
        if (categoryRepository.existsById(id)) {
            categoryRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
