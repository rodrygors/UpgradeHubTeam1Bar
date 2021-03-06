package com.bar.manager.repository;

import com.bar.manager.model.Drink;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkRepository extends MongoRepository<Drink, String> {
}
