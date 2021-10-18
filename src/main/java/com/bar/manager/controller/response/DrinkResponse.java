package com.bar.manager.controller.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DrinkResponse {
    private String id;
    private String name;
    private String description;
    private float alcohol;
    private float price;
}
