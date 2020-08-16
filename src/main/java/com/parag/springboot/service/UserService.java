package com.parag.springboot.service;

import java.util.List;

public interface UserService <T>{
    public List getUserdetails();
    public String upsert(T t);
}
