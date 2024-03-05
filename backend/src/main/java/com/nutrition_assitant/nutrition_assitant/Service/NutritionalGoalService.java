package com.nutrition_assitant.nutrition_assitant.Service;

import com.nutrition_assitant.nutrition_assitant.Model.NutritionalGoal;

import java.util.List;

public interface NutritionalGoalService {
    NutritionalGoal findById(String id);

    List<NutritionalGoal> findAll();
}
