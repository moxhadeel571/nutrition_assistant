package com.nutrition_assitant.nutrition_assitant.Controller;

import com.nutrition_assitant.nutrition_assitant.Implementation.NutritionalGoalImplementation;
import com.nutrition_assitant.nutrition_assitant.Model.NutritionalGoal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")

public class NutritionalGoalController {

    private NutritionalGoalImplementation nutritionalGoalImplementation;
@Autowired
    public NutritionalGoalController(NutritionalGoalImplementation nutritionalGoalImplementation) {
        this.nutritionalGoalImplementation = nutritionalGoalImplementation;
    }
    @PostMapping("/SaveNutrition")
    public void postNutritionalGoalImplementation(@RequestBody NutritionalGoal nutritionalGoal){
    nutritionalGoalImplementation.save(nutritionalGoal);
    }
    @GetMapping("/FindAllByOne")
    public List<NutritionalGoal> getNutrition(){
    return nutritionalGoalImplementation.findAll();
    }
}
