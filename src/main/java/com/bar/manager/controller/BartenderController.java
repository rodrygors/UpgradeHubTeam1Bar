package com.bar.manager.controller;

import com.bar.manager.service.BartenderService;

public class BartenderController {
    private final BartenderService bartenderServ;

    public BartenderController(BartenderService bartenderServ) {
        this.bartenderServ = bartenderServ;
    }
}
