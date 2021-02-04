package com.dibyanshugtm.ShoppingCart.models;

import com.dibyanshugtm.ShoppingCart.models.data.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category,Integer> {

        Category findByName(String name);

        List<Category> findAllByOrderBySortingAsc();

    Category findBySlug(String slug);
}
