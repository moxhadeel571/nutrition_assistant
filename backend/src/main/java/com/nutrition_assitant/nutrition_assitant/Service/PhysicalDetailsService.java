package com.nutrition_assitant.nutrition_assitant.Service;

import com.nutrition_assitant.nutrition_assitant.Model.PhysicalDetails;

import java.util.Optional;

public interface PhysicalDetailsService {
    void save(PhysicalDetails physicalDetails);

    Optional<PhysicalDetails> FindById(String id);
}
