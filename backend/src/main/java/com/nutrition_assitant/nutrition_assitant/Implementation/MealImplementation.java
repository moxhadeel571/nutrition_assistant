package com.nutrition_assitant.nutrition_assitant.Implementation;

import com.nutrition_assitant.nutrition_assitant.Model.Food;
import com.nutrition_assitant.nutrition_assitant.Model.Meal;
import com.nutrition_assitant.nutrition_assitant.Repository.FoodRepository;
import com.nutrition_assitant.nutrition_assitant.Repository.MealRepository;
import com.nutrition_assitant.nutrition_assitant.Service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MealImplementation implements MealService {
    private MealRepository mealRepository;
    private FoodRepository foodRepository;
@Autowired
    public MealImplementation(MealRepository mealRepository, FoodRepository foodRepository) {
        this.mealRepository = mealRepository;
    this.foodRepository = foodRepository;
}

    @Override
    public void save(Meal meal) {


//        for (Food food : meal.getFoods()) {
//            foodRepository.save(food);
//        }
        mealRepository.save(meal);
    }
}
