package com.mrding.one.zk;

import org.apache.log4j.Logger;
import org.apache.zookeeper.*;

import java.util.concurrent.CountDownLatch;

/**
 * Created by DINGSHUAI685 on 2015-10-15.
 */
public class CloudEnvironment implements Watcher {

    private static Logger logger = Logger.getLogger(CloudEnvironment.class);

    private ZooKeeper zk;

    public void connectZk() {
        try {
            zk = new ZooKeeper("10.20.8.161:2181,10.20.8.126:2181,10.20.8.175:2181", 3000, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException, KeeperException {
        CloudEnvironment env = new CloudEnvironment();
        env.connectZk();
        env.handle();
    }

    private void handle() throws KeeperException, InterruptedException {
        zk.exists("/esales-collect/test", true);
        zk.exists("/esales-collect/test", true);
        zk.exists("/esales-collect/test", true);
        zk.exists("/esales-collect/test", true);
    }

    @Override
    public void process(WatchedEvent event) {
        logger.info(event.toString());
    }
}
