package com.bar.manager.controller.response;

import com.bar.manager.model.Bartender;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BartenderResponse {
    private String id;
    private String name;
    private int age;
    private int nif;

    public BartenderResponse bartenderToBartenderResponse(Bartender bartender){
        this.id = bartender.getId();
        this.name = bartender.getName();
        this.age = bartender.getAge();
        this.nif = bartender.getNif();
        return this;
    }
}
