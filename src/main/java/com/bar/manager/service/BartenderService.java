package com.bar.manager.service;

import com.bar.manager.repository.BartenderRepository;

public class BartenderService {
    private final BartenderRepository bartenderRepo;

    public BartenderService(BartenderRepository bartenderRepo) {
        this.bartenderRepo = bartenderRepo;
    }
}
