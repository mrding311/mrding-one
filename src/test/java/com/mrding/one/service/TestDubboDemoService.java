package com.mrding.one.service;

import com.mrding.one.dto.User;
import com.mrding.one.service.DubboDemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by DINGSHUAI685 on 2015-10-14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestDubboDemoService {

    @Autowired
    private DubboDemoService service;

    @Test
    public void testDubboService() {
        assertEquals("Hello, mrding", service.sayHello("mrding"));
        List<User> list = service.getUsers();
        assertEquals(3, service.getUsers().size());
        assertEquals("mrding", list.get(0).getName());
        assertEquals("dingshuai", list.get(1).getName());
        assertEquals("xiaohong", list.get(2).getName());
    }

}
