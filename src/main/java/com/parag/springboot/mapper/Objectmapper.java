package com.parag.springboot.mapper;

import com.parag.springboot.domainobject.RequestUserDetailsDom;
import com.parag.springboot.entity.UserDetails;

public class Objectmapper {

    public UserDetails mappDOMtoEntity(RequestUserDetailsDom requestUserDetailsDom){
        return UserDetails.builder()
                .id(requestUserDetailsDom.getId())
                .firstName(requestUserDetailsDom.getFirstName())
                .lastName(requestUserDetailsDom.getLastName())
                .email(requestUserDetailsDom.getEmail())
                .password(requestUserDetailsDom.getPassword()).build();
    }
}