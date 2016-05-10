package com.mrding.one.web;

import com.mrding.one.service.IndexService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by mrding on 15-8-8.
 */
@Controller
public class IndexController {

    private static Logger logger = Logger.getLogger(IndexController.class);

    @Autowired
    private IndexService service;

    @RequestMapping("index")
    public @ResponseBody boolean index(String username, String passwd) {
        return service.validate(username, passwd);
    }

    @RequestMapping("index/adduser")
    public @ResponseBody boolean adduser(String username, String passwd) {
        return service.adduser(username, passwd);
    }

}
