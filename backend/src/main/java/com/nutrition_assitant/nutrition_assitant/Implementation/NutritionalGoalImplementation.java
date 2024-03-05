package com.nutrition_assitant.nutrition_assitant.Implementation;

import com.nutrition_assitant.nutrition_assitant.Model.NutritionalGoal;
import com.nutrition_assitant.nutrition_assitant.Repository.NutritionalGoalRepository;
import com.nutrition_assitant.nutrition_assitant.Service.NutritionalGoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NutritionalGoalImplementation implements NutritionalGoalService {
    private NutritionalGoalRepository nutritionalGoalRepository;
@Autowired
    public NutritionalGoalImplementation(NutritionalGoalRepository nutritionalGoalRepository) {
        this.nutritionalGoalRepository = nutritionalGoalRepository;
    }

    public void save(NutritionalGoal nutritionalGoal) {
    nutritionalGoalRepository.save(nutritionalGoal);
}

    @Override
    public NutritionalGoal findById(String id) {
        return nutritionalGoalRepository.findById(id).orElse(null);
    }

    @Override
    public List<NutritionalGoal> findAll() {
        return nutritionalGoalRepository.findAll();
    }
}
