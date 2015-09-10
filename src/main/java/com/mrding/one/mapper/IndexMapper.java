package com.mrding.one.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * Created by mrding on 15-8-9.
 */
public interface IndexMapper {

    /**
     * validate user
     * @param username
     * @param passworld
     * @return
     */
    Integer count(@Param("username") String username, @Param("passwd") String passworld);

    void adduser(@Param("username") String username, @Param("passwd") String passwd);
}
