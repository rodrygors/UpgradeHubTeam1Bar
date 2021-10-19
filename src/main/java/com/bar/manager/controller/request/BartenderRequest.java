package com.bar.manager.controller.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BartenderRequest {
    @NotBlank (message =  "Name is mandatory")
    private String name;
    private int age;
    @Min(0)
    private int nif;
}
