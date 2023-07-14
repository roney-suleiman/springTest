package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "food")
@NoArgsConstructor
@Getter
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long foodId;
    private String foodName;

    public Food(String foodName) {
        this.foodName = foodName;
    }
}
