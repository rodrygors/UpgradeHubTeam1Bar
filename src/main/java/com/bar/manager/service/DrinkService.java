package com.bar.manager.service;

import com.bar.manager.repository.DrinkRepository;
import org.springframework.stereotype.Service;

@Service
public class DrinkService {
    private final DrinkRepository drinkRepo;

    public DrinkService(DrinkRepository drinkRepo) {
        this.drinkRepo = drinkRepo;
    }
}
