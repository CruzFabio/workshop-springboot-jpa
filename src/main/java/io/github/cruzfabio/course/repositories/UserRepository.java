package io.github.cruzfabio.course.repositories;

import io.github.cruzfabio.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
