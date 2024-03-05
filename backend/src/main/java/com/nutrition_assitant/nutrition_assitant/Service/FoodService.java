package com.nutrition_assitant.nutrition_assitant.Service;

import com.nutrition_assitant.nutrition_assitant.Model.Food;

import java.util.List;
import java.util.Optional;

public interface FoodService {
    void save(Food food);

    List<Food> findAll();

    void DeleteById(String id);
}
