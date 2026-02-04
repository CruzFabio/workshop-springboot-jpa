package io.github.cruzfabio.course.repositories;

import io.github.cruzfabio.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
