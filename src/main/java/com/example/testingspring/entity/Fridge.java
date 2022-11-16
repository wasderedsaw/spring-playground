package com.example.testingspring.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "fridge")
public class Fridge {

    @Id
    @GeneratedValue
    private int fridge_id;
    @Column(nullable = false)
    private String name;
    @ManyToMany(mappedBy = "fridges")
    private Set<User> user;
}
