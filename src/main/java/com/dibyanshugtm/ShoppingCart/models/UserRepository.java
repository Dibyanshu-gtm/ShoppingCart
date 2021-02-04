package com.dibyanshugtm.ShoppingCart.models;

import com.dibyanshugtm.ShoppingCart.models.data.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Integer>{

    User findByUsername(String username);
}
