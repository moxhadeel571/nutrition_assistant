package com.nutrition_assitant.nutrition_assitant.Implementation;

import com.nutrition_assitant.nutrition_assitant.Model.Food;
import com.nutrition_assitant.nutrition_assitant.Repository.FoodRepository;
import com.nutrition_assitant.nutrition_assitant.Service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class FoodImplementation implements FoodService {
    private FoodRepository foodRepository
            ;
@Autowired
    public FoodImplementation(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    @Override
    public void save(Food food) {
        foodRepository.save(food);
    }

    @Override
    public List<Food> findAll() {
        return foodRepository.findAll();
    }

    @Override
    public void DeleteById(String id) {
        foodRepository.deleteById(id);
    }
}
