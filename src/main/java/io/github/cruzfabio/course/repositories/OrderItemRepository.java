package io.github.cruzfabio.course.repositories;

import io.github.cruzfabio.course.entities.OrderItem;
import io.github.cruzfabio.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
