package com.sda.java_final.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")

public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String address;

    private String email;

    private String password;

    private String phone;

    @Enumerated(value = EnumType.STRING)
    private UserRole userRole;
}
