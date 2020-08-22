package com.parag.springboot.service.impl;


import com.parag.springboot.ApplicationConstant;
import com.parag.springboot.domainobject.ResponseDom;
import com.parag.springboot.domainobject.ResponseUserDetailsDom;
import com.parag.springboot.entity.UserDetails;
import com.parag.springboot.enums.Status;
import com.parag.springboot.repository.UserRepository;
import com.parag.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@ComponentScan(basePackages="com.parag.springboot")
@Transactional
public class UserServiceImpl implements UserService<UserDetails,ResponseUserDetailsDom> {

    @Autowired
    private UserRepository userRepository;

    public List<ResponseUserDetailsDom> getUserdetails() {
        return ((List<ResponseUserDetailsDom>)(Object)userRepository.findAll());
    }

    public ResponseDom upsert(UserDetails userDetails){

        try {
            userRepository.save(userDetails);
            return( ResponseDom.builder().status(Status.SUCCESS).responseText(ApplicationConstant.Successtext).key(userDetails.getId()).build());
        }catch (Exception ex){
            return( ResponseDom.builder().status(Status.ERROR).responseText(ApplicationConstant.FailureText+ex.getMessage()).key(userDetails.getId()).build());
        }
    }
}

