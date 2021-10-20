package com.bar.manager.controller.response;

import com.bar.manager.model.Drink;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DrinkResponse {
    private String id;
    private String name;
    private String description;
    private float alcohol;
    private float price;

    public DrinkResponse drinkToDrinkResponse (Drink drink){
        this.id= drink.getId();
        this.name= drink.getName();
        this.description= drink.getDescription();
        this.alcohol = drink.getAlcohol();
        this.price = drink.getPrice();
        return this;
    }
}
