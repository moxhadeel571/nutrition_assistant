package com.nutrition_assitant.nutrition_assitant.Controller;

import com.nutrition_assitant.nutrition_assitant.Implementation.PhysicalDetailsImplementation;
import com.nutrition_assitant.nutrition_assitant.Model.PhysicalDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")

public class PhysicalDetailsController {
    private PhysicalDetailsImplementation physicalDetailsImplementation;
@Autowired
    public PhysicalDetailsController(PhysicalDetailsImplementation physicalDetailsImplementation) {
        this.physicalDetailsImplementation = physicalDetailsImplementation;
    }

    @PostMapping(value = "/postPhysical" )
    public void postphysical(@RequestBody PhysicalDetails physicalDetails){
        physicalDetailsImplementation.save(physicalDetails);
    }
    @GetMapping("/FindPhysical/{id}")
    public Optional<PhysicalDetails> getPhysicaldetails(@PathVariable("id") String id){
    return physicalDetailsImplementation.FindById(id);
    }
}
