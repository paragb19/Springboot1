package com.parag.springboot.service.impl;


import com.parag.springboot.dao.UserDao;
import com.parag.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@ComponentScan(basePackages="com.parag.springboot")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public List getUserdetails() {
        return userDao.getUserdetails();
    }
}

