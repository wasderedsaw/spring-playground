package com.example.testingspring.repository;

import com.example.testingspring.entity.FoodProduct;
import com.example.testingspring.entity.FoodType;
import com.example.testingspring.entity.Fridge;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FoodProductRepository extends CrudRepository<FoodProduct, Long> {
    List<FoodProduct> getFoodProductsByFridge(Fridge fridge);
    List<FoodProduct> getFoodProductsByFoodTypeAndFridge(FoodType foodType, Fridge fridge);
    void removeByNameAndFridge(String name, Fridge fridge);
}
