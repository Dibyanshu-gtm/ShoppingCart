package com.dibyanshugtm.ShoppingCart.models.data;


import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Arrays;
import java.util.Collection;

@Entity
@Table(name="users")
@Data
public class User implements UserDetails {

    private static final long serialVersionUID =1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(min=2,message = "Username must be atleast 2")
    private String username;

    @Size(min = 4,message = "Password should be atleast 4")
    private String password;

    @Transient
    private String confirmPassword;

    @Size(min = 4,message = "Please enter a valid email")
    private String email;

    @Column(name = "phone_number")
    @Size(min = 6,message = "Please enter a valid Number of more than 6 digits")
    private String phoneNumber;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
    }


    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
