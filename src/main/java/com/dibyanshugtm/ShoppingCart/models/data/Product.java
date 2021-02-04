package com.dibyanshugtm.ShoppingCart.models.data;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Table(name = "products")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(min = 2,message = "Name should be atleast 2 chars long")
    private String name;

    private String slug;

    @Size(min = 5,message = "Description should be atleast 5 chars long")
    private String description;

    private String image;

    @Pattern(regexp = "^[0-9]+([.][0-9]{1,2})?", message = "Expected Format: 5 , 5.99, 15, 15.99")
    private String price;

    @Pattern(regexp = "^[1-9][0-9]*", message = "Please Choose a category")
    @Column(name = "category_id")
    private String categoryId;

    @Column(name = "created_at" , updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updatedAt;


}
