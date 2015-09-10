package com.mrding.one.service;

/**
 * Created by mrding on 15-8-9.
 */
public interface IndexService {

    /**
     * 校验登陆
     * @param username
     * @param passworld
     * @return
     */
    boolean validate(String username, String passworld);

    /**
     * useradd
     * @param username
     * @param passwd
     * @return
     */
    boolean adduser(String username, String passwd);
}
