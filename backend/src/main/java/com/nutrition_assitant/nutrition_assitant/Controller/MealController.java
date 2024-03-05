package com.nutrition_assitant.nutrition_assitant.Controller;

import com.nutrition_assitant.nutrition_assitant.Implementation.MealImplementation;
import com.nutrition_assitant.nutrition_assitant.Model.Meal;
import com.nutrition_assitant.nutrition_assitant.Service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")

public class MealController {
    private MealService mealService;
@Autowired
    public MealController(MealService mealService) {
        this.mealService = mealService;
    }
    @PostMapping("/PostMeal")
    public void PostMeal(@RequestBody Meal meal){
    mealService.save(meal);
    }
}
