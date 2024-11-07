package ru.pevnenko.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.pevnenko.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}