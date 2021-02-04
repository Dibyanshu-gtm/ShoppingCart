package com.dibyanshugtm.ShoppingCart.models;

import com.dibyanshugtm.ShoppingCart.models.data.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findBySlug(String slug);

    Product findBySlugAndIdNot(String slug,int id);

    Page<Product> findAll(Pageable pageable);

    List<Product> findAllByCategoryId(String categoryId, Pageable pageable);

    long countByCategoryId(String categoryId);
}
