package de.caceres.loginspringsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import de.caceres.loginspringsecurity.models.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUserName(String userName);
}
