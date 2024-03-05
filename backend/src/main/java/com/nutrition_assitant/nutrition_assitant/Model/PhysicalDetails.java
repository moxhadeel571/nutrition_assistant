package com.nutrition_assitant.nutrition_assitant.Model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Document(collection = "PhysicalDetails")
public class PhysicalDetails {
    @Id
    private String id;
    private String username;
    private String gender;
    private String bodyType;
    private String age;
    private double height;
    private double weight;
    private String bloodType;
    private String activityLevel;
    private String medicalConditions;
}
