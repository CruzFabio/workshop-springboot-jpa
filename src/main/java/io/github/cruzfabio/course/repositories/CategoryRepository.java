package io.github.cruzfabio.course.repositories;

import io.github.cruzfabio.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
