package com.bar.manager.controller;

import com.bar.manager.controller.request.ClientRequest;
import com.bar.manager.controller.response.ClientResponse;
import com.bar.manager.model.Client;
import com.bar.manager.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClientController {
    private final ClientService clientServ;

    public ClientController(ClientService clientServ) {
        this.clientServ = clientServ;
    }

    @GetMapping(value = "/clients/{id}")
    public ClientResponse getClientById(@PathVariable(value = "id") String id){
        Client client = clientServ.findById(id);
        return new ClientResponse().clientToClientResponse(client);
    }

    @GetMapping(value = "/clients")
    public List<ClientResponse> getClients(){
        List<Client> clients = clientServ.findAll();
        List<ClientResponse> clientResponses = new ArrayList<>();
        for(Client client : clients){
            clientResponses.add(new ClientResponse().clientToClientResponse(client));
        }
        return clientResponses;
    }

    @PostMapping(value = "/clients")
    public ClientResponse addClient(@RequestBody ClientRequest clientRequest){
        Client client = clientServ.addClient(Client.builder()
                .name(clientRequest.getName())
                .age(clientRequest.getAge())
                .build()
        );
        return new ClientResponse().clientToClientResponse(client);
    }

    @PutMapping(value = "/clients/{id}")
    public ClientResponse updateClient(@RequestBody ClientRequest clientRequest, @PathVariable(value = "id")String id){
        Client client = clientServ.updateClient(Client.builder()
                .name(clientRequest.getName())
                .age(clientRequest.getAge())
                .build(), id
        );
        return new ClientResponse().clientToClientResponse(client);
    }

    @DeleteMapping(value = "/clients/{id}")
    public void deleteClientById(@PathVariable(value = "id")String id){
        clientServ.deleteById(id);
    }
}
