package ru.pevnenko.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Cache;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private BigDecimal price;

    private String size;

    private String color;

    private int stockQuantity;

    // Геттеры и сеттеры
}