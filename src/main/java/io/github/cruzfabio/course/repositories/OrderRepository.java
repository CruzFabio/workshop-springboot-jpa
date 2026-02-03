package io.github.cruzfabio.course.repositories;

import io.github.cruzfabio.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
