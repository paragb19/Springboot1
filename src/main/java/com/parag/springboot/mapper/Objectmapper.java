package com.parag.springboot.mapper;

import com.parag.springboot.domainobject.UserDetailsDom;
import com.parag.springboot.entity.UserDetails;

public class Objectmapper {

    public UserDetails mappDOMtoEntity(UserDetailsDom userDetailsDom){
        return UserDetails.builder()
                .id(userDetailsDom.getId())
                .firstName(userDetailsDom.getFirstName())
                .lastName(userDetailsDom.getLastName())
                .email(userDetailsDom.getEmail())
                .password(userDetailsDom.getPassword()).build();
    }
}