package com.bar.manager.service;

import com.bar.manager.exception.ClientNotFound;
import com.bar.manager.model.Client;
import com.bar.manager.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private final ClientRepository clientRepo;

    public ClientService(ClientRepository clientRepo) {
        this.clientRepo = clientRepo;
    }

    public Client findById(String id) {
        return clientRepo.findById(id).orElseThrow(ClientNotFound::new);
    }

    public List<Client> findAll() {
        return clientRepo.findAll();
    }

    public Client addClient(Client client) {
        return clientRepo.save(client);
    }

    public Client updateClient(Client newClient, String id) {
        Client client = this.findById(id);
        client.setAge(newClient.getAge());
        client.setName(newClient.getName());
        return client;
    }

    public void deleteById(String id) {
        if(clientRepo.existsById(id)){
            clientRepo.deleteById(id);
        }
        else throw new ClientNotFound();
    }
}
