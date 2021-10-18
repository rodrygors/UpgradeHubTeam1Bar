package com.bar.manager.controller.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientResponse {
    private String id;
    private String nome;
    private int age;
}
