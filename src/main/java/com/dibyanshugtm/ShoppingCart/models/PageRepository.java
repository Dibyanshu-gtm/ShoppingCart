package com.dibyanshugtm.ShoppingCart.models;

import com.dibyanshugtm.ShoppingCart.models.data.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface PageRepository extends JpaRepository<Page,Integer> {

    Page findBySlug(String slug);

    //@Query("SELECT p from Page p WHERE p.id != :id and p.slug = :slug")
   //Page findBySlug(int id,String slug);
    Page findBySlugAndIdNot(String slug,int id);

    List<Page>findAllByOrderBySortingAsc();
}
