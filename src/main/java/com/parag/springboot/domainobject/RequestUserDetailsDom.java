package com.parag.springboot.domainobject;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@ToString
@Getter
@Setter
public class RequestUserDetailsDom {
        @JsonProperty(value = "id")
        private int id;
        @JsonProperty(value = "fname")
        private String firstName;
        @JsonProperty(value = "lname")
        private String lastName;
        @JsonProperty(value = "email")
        private String email;
        @JsonProperty(value = "password")
        private String password;

}
