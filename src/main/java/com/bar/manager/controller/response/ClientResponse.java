package com.bar.manager.controller.response;

import com.bar.manager.model.Client;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientResponse {
    private String id;
    private String name;
    private int age;

    public ClientResponse clientToClientResponse (Client client){
        this.id= client.getId();
        this.name= client.getName();
        this.age= client.getAge();
        return this;
    }
}
