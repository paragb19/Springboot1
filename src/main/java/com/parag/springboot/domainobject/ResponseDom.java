package com.parag.springboot.domainobject;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.parag.springboot.enums.Status;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Builder
public class ResponseDom {
    @JsonProperty(value = "Status")
    private Status status;
    @JsonProperty(value = "Description")
    private String responseText;
    @JsonProperty(value = "key")
    private int key;
}
