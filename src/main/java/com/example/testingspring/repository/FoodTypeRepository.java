package com.example.testingspring.repository;

import com.example.testingspring.entity.FoodType;
import org.springframework.data.repository.CrudRepository;

public interface FoodTypeRepository extends CrudRepository<FoodType, Long> {

}
