package com.nutrition_assitant.nutrition_assitant.Model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Document(collection = "NutritionalGoal")
public class NutritionalGoal {
    @Id
    private String id;

    private Long userId;

    private int targetCalories;

    private int targetProteins;

    private int targetCarbohydrates;

    private int targetFats;
    private double targetWeight;
    private double currentWeight;
}
