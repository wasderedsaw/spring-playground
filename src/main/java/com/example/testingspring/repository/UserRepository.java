package com.example.testingspring.repository;

import com.example.testingspring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface UserRepository extends JpaRepository<User, Long> {
//    Set<User> findUsersByFridges_id(int id);
}
