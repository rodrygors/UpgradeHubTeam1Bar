package com.bar.manager.controller.response;

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
}
