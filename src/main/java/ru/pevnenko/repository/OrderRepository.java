package ru.pevnenko.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.pevnenko.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}