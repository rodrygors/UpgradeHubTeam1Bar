package com.bar.manager.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Min;

@Document
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Drink {
    @Id
    private String id;
    private String name;
    private String description;
    @Min(0)
    private float alcohol;
    @Min(0)
    private float price;
}
