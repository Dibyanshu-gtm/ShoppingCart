package com.dibyanshugtm.ShoppingCart.models;

import com.dibyanshugtm.ShoppingCart.models.data.Admin;
import com.dibyanshugtm.ShoppingCart.models.data.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Integer> {
    Admin findByUsername(String username);

}
