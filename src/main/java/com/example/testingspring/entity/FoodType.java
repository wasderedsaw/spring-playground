package com.example.testingspring.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "food_type")
public class FoodType {

    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String name;
    private int expirationTime;
    @Column(nullable = false)
    private String measurementUnits;
}
