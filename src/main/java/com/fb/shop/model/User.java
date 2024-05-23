package com.fb.shop.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="users")
@Data @NoArgsConstructor @AllArgsConstructor @ToString @EqualsAndHashCode
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Size(min = 4, max = 50)
    private String firstName;

    @Size(min = 4, max = 50)
    private String lastName;

    @Column(unique = true)
    @Size(min = 4, max = 50)
    private String username;

    private String password;

    @Column(unique = true)
    private String email;
 
}
