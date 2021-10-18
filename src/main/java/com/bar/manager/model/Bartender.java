package com.bar.manager.model;

import lombok.*;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Bartender {
    @Id
    private String id;
    private String name;
    private int age;
    private int nif;

}
