package com.mrding.one.task;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import javax.jms.*;

/**
 * Created by dingshuai685 on 2015-09-10.
 */
@Component
public class MessageSendTask {

    @Autowired
    private JmsTemplate jmsTemplate;
    @Autowired
    private ActiveMQQueue queue;

    @Async
    @Scheduled(cron = "0/10 * * * * ?")
    public void execute() {
        jmsTemplate.send(new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(String.valueOf(System.currentTimeMillis()));
            }
        });

        jmsTemplate.send(queue, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(String.valueOf(System.currentTimeMillis()));
            }
        });
    }

}
