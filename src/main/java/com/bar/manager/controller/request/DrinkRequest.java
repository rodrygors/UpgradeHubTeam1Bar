package com.bar.manager.controller.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DrinkRequest {
    private String name;
    private String description;
    @Min(0)
    private float alcohol;
    @Min(0)
    private float price;
}
