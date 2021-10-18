package com.bar.manager.repository;

import com.bar.manager.model.Bartender;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BartenderRepository extends MongoRepository <Bartender, String> {
}
