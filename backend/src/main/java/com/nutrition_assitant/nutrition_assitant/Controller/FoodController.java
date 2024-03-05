package com.nutrition_assitant.nutrition_assitant.Controller;

import com.nutrition_assitant.nutrition_assitant.Implementation.FoodImplementation;
import com.nutrition_assitant.nutrition_assitant.Model.Food;
import com.nutrition_assitant.nutrition_assitant.Service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")

public class FoodController {

    private FoodImplementation foodImplementation;
@Autowired
    public FoodController(FoodImplementation foodImplementation) {
        this.foodImplementation = foodImplementation;
    }
    @PostMapping("/SaveFood")
    public void PostFood(@RequestBody Food food){
    foodImplementation.save(food);
    }
    @GetMapping("/FindAll")
    public List<Food> FindAll(){
return    foodImplementation.findAll();
    }
    @GetMapping("/Delete/{id}")
    public void FindAll(@PathVariable("id") String id){
           foodImplementation.DeleteById(id);
    }
}

