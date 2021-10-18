package com.bar.manager.controller;

import com.bar.manager.service.DrinkService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DrinkController {
    private final DrinkService drinkServ;

    public DrinkController(DrinkService drinkServ) {
        this.drinkServ = drinkServ;
    }
}
