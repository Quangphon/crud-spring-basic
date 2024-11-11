package com.example.spring_crud.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)  // Define sequence generator
public class User {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")  // Use the custom sequence
    private Integer id;
    private String name;
    private Integer age;
    private String address;
}
