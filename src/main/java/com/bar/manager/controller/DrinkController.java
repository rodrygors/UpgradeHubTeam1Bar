package com.bar.manager.controller;

import com.bar.manager.controller.request.ClientRequest;
import com.bar.manager.controller.request.DrinkRequest;
import com.bar.manager.controller.response.ClientResponse;
import com.bar.manager.controller.response.DrinkResponse;
import com.bar.manager.model.Client;
import com.bar.manager.model.Drink;
import com.bar.manager.service.DrinkService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DrinkController {
    private final DrinkService drinkServ;

    public DrinkController(DrinkService drinkServ) {

        this.drinkServ = drinkServ;
    }

    @GetMapping(value = "/drinks/{id}")
    public DrinkResponse getById(@PathVariable(value = "id") String id) {
        Drink newDrink = drinkServ.findById(id);
        return new DrinkResponse().drinkToDrinkResponse(newDrink);

    }

    @GetMapping(value = "/drinks")
    public List<DrinkResponse> getDrinks() {
        List<Drink> drinks = drinkServ.findAll();
        List<DrinkResponse> drinkResponses = new ArrayList<>();
        for (Drink drink : drinks) {
            drinkResponses.add(new DrinkResponse().drinkToDrinkResponse(drink));
        }
        return drinkResponses;
    }

    @PostMapping(value = "/drinks")
    public DrinkResponse addDrinks(@RequestBody DrinkRequest drinkRequest) {
        Drink drink = drinkServ.addDrink(Drink.builder()
                .name(drinkRequest.getName())
                .description(drinkRequest.getDescription())
                .alcohol(drinkRequest.getAlcohol())
                .price(drinkRequest.getPrice())
                .build()
        );
        return new DrinkResponse().drinkToDrinkResponse(drink);
    }

    @PutMapping(value = "/drinks/{id}")
    public DrinkResponse updateDrinks(@RequestBody DrinkRequest drinkRequest, @PathVariable(value = "id") String id) {
        Drink drink = drinkServ.updateDrink(Drink.builder()
                .name(drinkRequest.getName())
                .description(drinkRequest.getDescription())
                .alcohol(drinkRequest.getAlcohol())
                .price(drinkRequest.getPrice())
                .build(), id
        );
        return new DrinkResponse().drinkToDrinkResponse(drink);
    }

    @DeleteMapping(value = "/drinks/{id}")
    public void deleteDrinksById(@PathVariable(value = "id") String id) {
        drinkServ.deleteById(id);
    }
}

