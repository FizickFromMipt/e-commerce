package ru.pevnenko.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String address;

    private String phone;

    // Связь с заказами
    @OneToMany(mappedBy = "customer")
    private List<Order> orders;

    // Геттеры и сеттеры
}