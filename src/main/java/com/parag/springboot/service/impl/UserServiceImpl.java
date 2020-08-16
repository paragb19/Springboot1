package com.parag.springboot.service.impl;


import com.parag.springboot.domainobject.ResponseDom;
import com.parag.springboot.entity.UserDetails;
import com.parag.springboot.repository.UserRepository;
import com.parag.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@ComponentScan(basePackages="com.parag.springboot")
@Transactional
public class UserServiceImpl implements UserService<UserDetails> {

    @Autowired
    private UserRepository userRepository;

    public List getUserdetails() {
        return userRepository.findAll();
    }

    public ResponseDom upsert(UserDetails userDetails){
        try {
            userRepository.save(userDetails);
            return (new ResponseDom("Success","Insert/Update Completed Successfuly"));
        }catch (Exception ex){
            return (new ResponseDom("Error","Insert/Update did not complete"));
        }
    }
}

