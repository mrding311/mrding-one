package com.mrding.one.task;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * Created by dingshuai685 on 2015-09-10.
 */
@Component
public class MessageReceiveTask2 {

    private static Logger logger = Logger.getLogger(MessageReceiveTask2.class);

    public void processMessage(String message) {
        logger.info("=============================" + message);
    }


}
