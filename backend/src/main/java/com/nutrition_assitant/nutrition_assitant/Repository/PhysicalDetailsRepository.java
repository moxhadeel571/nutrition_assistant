package com.nutrition_assitant.nutrition_assitant.Repository;

import com.nutrition_assitant.nutrition_assitant.Model.PhysicalDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysicalDetailsRepository extends MongoRepository<PhysicalDetails, String> {
}
