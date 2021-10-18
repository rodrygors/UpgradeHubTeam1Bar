package com.bar.manager.controller.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DrinkRequest {
    private String name;
    private String description;
    private float alcohol;
    private float price;
}
