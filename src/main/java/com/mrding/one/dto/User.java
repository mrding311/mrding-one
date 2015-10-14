package com.mrding.one.dto;

import java.io.Serializable;

/**
 * Created by DINGSHUAI685 on 2015-10-14.
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String id;
    private int age;
    //0ÎªÅ®£»1ÎªÄÐ
    private int sex;

    public User(String name, int sex, int age, String id) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
