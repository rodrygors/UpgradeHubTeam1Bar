package com.bar.manager.controller;

import com.bar.manager.service.ClientService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    private final ClientService clientServ;

    public ClientController(ClientService clientServ) {
        this.clientServ = clientServ;
    }
}
