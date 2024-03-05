package com.nutrition_assitant.nutrition_assitant.Implementation;

import com.nutrition_assitant.nutrition_assitant.Model.PhysicalDetails;
import com.nutrition_assitant.nutrition_assitant.Repository.PhysicalDetailsRepository;
import com.nutrition_assitant.nutrition_assitant.Service.PhysicalDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class PhysicalDetailsImplementation implements PhysicalDetailsService {

    private PhysicalDetailsRepository physicalDetailsRepository;
@Autowired
    public PhysicalDetailsImplementation(PhysicalDetailsRepository physicalDetailsRepository) {
        this.physicalDetailsRepository = physicalDetailsRepository;
    }

    @Override
    public void save(PhysicalDetails physicalDetails) {
        physicalDetailsRepository.save(physicalDetails);
    }

    @Override
    public Optional<PhysicalDetails> FindById(String id) {
        return physicalDetailsRepository.findById(id);
    }
}
