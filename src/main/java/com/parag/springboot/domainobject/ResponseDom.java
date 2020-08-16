package com.parag.springboot.domainobject;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class ResponseDom {
    @JsonProperty(value = "Status")
    private String response;
    @JsonProperty(value = "Description")
    private String responseText;
}
