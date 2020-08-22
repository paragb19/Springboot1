package com.parag.springboot.domainobject;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Builder
public class ResponseUserDetailsDom {
    @JsonProperty(value = "Id")
    private int id;
    @JsonProperty(value = "Name")
    private String name;
    @JsonProperty(value = "Email")
    private String email;

}

