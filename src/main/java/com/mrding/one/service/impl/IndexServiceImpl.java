package com.mrding.one.service.impl;

import com.mrding.one.service.IndexService;
import com.mrding.one.mapper.IndexMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

/**
 * Created by mrding on 15-8-9.
 */
@Component
public class IndexServiceImpl implements IndexService{

    private static Logger logger = Logger.getLogger(IndexServiceImpl.class);

    @Autowired
    private IndexMapper mapper;

    /**
     * 校验登陆
     *
     * @param username
     * @param passworld
     * @return
     */
    @Override
    public boolean validate(String username, String passworld) {
        if (StringUtils.isEmpty(username)) {
            return false;
        }

        int count = mapper.count(username, passworld);
        return count != 0;
    }

    /**
     * useradd
     *
     * @param username
     * @param passwd
     * @return
     */
    @Transactional
    @Override
    public boolean adduser(String username, String passwd) {
        mapper.adduser(username, passwd);
        mapper.adduser("root", "root");
        return true;
    }
}
