package com.mrding.one.task;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * Created by dingshuai685 on 2015-09-10.
 */
@Component
public class MessageReceiveTask {

    private static Logger logger = Logger.getLogger(MessageReceiveTask.class);

    public void processMessage(String message) {
        logger.info("QUEUE" + message);
    }

    public void processTopicMessage(String message) {
        logger.info("TOPIC_11111_" + message);
    }

    public void processTopic2Message(String message) {
        logger.info("TOPIC_22222_" + message);
    }

}
