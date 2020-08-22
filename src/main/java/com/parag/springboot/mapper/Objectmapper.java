package com.parag.springboot.mapper;

import com.parag.springboot.domainobject.RequestUserDetailsDom;
import com.parag.springboot.domainobject.ResponseUserDetailsDom;
import com.parag.springboot.entity.UserDetails;

import javax.swing.text.html.parser.Entity;
import java.util.LinkedList;
import java.util.List;

public class Objectmapper {

    public UserDetails mappDOMtoEntity(RequestUserDetailsDom requestUserDetailsDom){
        return UserDetails.builder()
                .id(requestUserDetailsDom.getId())
                .firstName(requestUserDetailsDom.getFirstName())
                .lastName(requestUserDetailsDom.getLastName())
                .email(requestUserDetailsDom.getEmail())
                .password(requestUserDetailsDom.getPassword()).build();
    }

    public List<ResponseUserDetailsDom> mappEntityToDom(List<UserDetails> userDetails){

        List<ResponseUserDetailsDom> response= new LinkedList<>();
        userDetails.forEach(entity->response.add(ResponseUserDetailsDom.builder()
                .id(entity.getId())
                .name(entity.getFirstName()+" "+entity.getLastName())
                .email(entity.getEmail())
                .build()));

        return response;
    }

}