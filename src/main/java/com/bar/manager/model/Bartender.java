package com.bar.manager.model;

import lombok.*;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.mongodb.core.index.Indexed;
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
    @Indexed (unique = true)
    private int nif;

}
