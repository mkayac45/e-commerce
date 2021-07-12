package com.mkayacdev.ecommerce.user.repository;

import com.mkayacdev.ecommerce.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
