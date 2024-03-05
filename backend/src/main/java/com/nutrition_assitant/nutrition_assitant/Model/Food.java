package com.nutrition_assitant.nutrition_assitant.Model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Document(collection = "food")
public class Food {
    @Id
    private String id;

    private String name;

    private String category;


    private double servingSize;

    private int calorieCount;

    private double carbohydrates;

    private double proteins;

    private double fats;

    private String micronutrientContent;

    // Constructors, getters, and setters
}
