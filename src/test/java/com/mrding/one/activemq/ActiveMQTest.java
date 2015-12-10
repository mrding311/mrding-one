package com.mrding.one.activemq;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQDestination;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * Created by DINGSHUAI685 on 2015-12-10.
 */
public class ActiveMQTest {

    private JmsTemplate jmsTemplate;
    private ActiveMQDestination testQueue;
    private static final String BROKER_URI_189 = "tcp://10.20.10.189:61616";
    private static final String BROKER_URI_185 = "tcp://10.20.10.185:61616";

    @Before
    public void setUp() {
        jmsTemplate = new JmsTemplate();
        testQueue = new ActiveMQQueue("test.queue");
    }

    @Test
    public void testSend() {
        jmsTemplate.setConnectionFactory(new ActiveMQConnectionFactory(BROKER_URI_189));
        jmsTemplate.send(testQueue, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(String.valueOf(System.currentTimeMillis()));
            }
        });
    }

    @Test
    public void testReceive() {
        jmsTemplate.setConnectionFactory(new ActiveMQConnectionFactory(BROKER_URI_185));
        System.out.println(jmsTemplate.receive(testQueue));
    }


}
