package com.parag.springboot.service;

import com.parag.springboot.domainobject.ResponseDom;

import java.util.List;

public interface UserService <T>{
    public List getUserdetails();
    public ResponseDom upsert(T t);
}
