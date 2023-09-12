package com.example.graduate.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name="employee")
@Entity
public class Employee {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int age;
    private String email;
    private int phone_number;
    private String image;
}
