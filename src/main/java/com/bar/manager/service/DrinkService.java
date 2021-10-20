package com.bar.manager.service;

import com.bar.manager.exception.DrinkNotFound;
import com.bar.manager.model.Drink;
import com.bar.manager.repository.DrinkRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinkService {
    private final DrinkRepository drinkRepo;

    public DrinkService(DrinkRepository drinkRepo) {
        this.drinkRepo = drinkRepo;
    }

    public Drink findById(String id) {
        return drinkRepo.findById(id).orElseThrow(DrinkNotFound::new);
    }

    public List<Drink> findAll() {
        return drinkRepo.findAll();
    }

    public Drink addDrink(Drink drink) {
        return drinkRepo.save(drink);
    }

    public Drink updateDrink(Drink newDrink, String id) {
        Drink drink = this.findById(id);
        drink.setName(newDrink.getName());
        drink.setDescription(newDrink.getDescription());
        drink.setAlcohol(newDrink.getAlcohol());
        drink.setPrice(newDrink.getPrice());
        return drinkRepo.save(drink);
    }

    public void deleteById(String id) {
        if(drinkRepo.existsById(id)){
            drinkRepo.deleteById(id);
        }
        else throw new DrinkNotFound();

    }
}
