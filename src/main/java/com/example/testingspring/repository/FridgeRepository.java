package com.example.testingspring.repository;

import com.example.testingspring.entity.Fridge;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface FridgeRepository extends CrudRepository<Fridge, Long> {
//    Set<Fridge> findFridgesByUser_id(int id);
}
