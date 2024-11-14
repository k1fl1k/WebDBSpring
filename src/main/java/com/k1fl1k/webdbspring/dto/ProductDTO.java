package com.k1fl1k.webdbspring.dto;

import com.k1fl1k.webdbspring.model.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
    private Long id;
    private String name;
    private Double price;
    private String imageUrl;
    private Category category;
}
