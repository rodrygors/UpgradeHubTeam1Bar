package com.bar.manager.controller.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientRequest {
    @NotBlank(message =  "Name is mandatory")
    private String name;
    private int age;
}
