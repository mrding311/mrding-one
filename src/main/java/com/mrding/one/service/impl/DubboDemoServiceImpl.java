package com.mrding.one.service.impl;

import com.mrding.one.dto.User;
import com.mrding.one.service.DubboDemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DINGSHUAI685 on 2015-10-14.
 */
public class DubboDemoServiceImpl implements DubboDemoService{
    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }

    @Override
    public List<User> getUsers() {
        List<User> list = new ArrayList<User>();
        list.add(new User("mrding", 1, 25, "001"));
        list.add(new User("dingshuai", 1, 35, "002"));
        list.add(new User("xiaohong", 0, 25, "003"));
        return list;
    }
}
