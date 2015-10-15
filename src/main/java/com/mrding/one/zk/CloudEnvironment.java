package com.mrding.one.zk;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

/**
 * Created by DINGSHUAI685 on 2015-10-15.
 */
public class CloudEnvironment {

    private static final String ZK_HOST = "iqsz-d2229:2181";
    private static final int SESSION_TIMEOUT = 5000;

    public static void main(String[] args) {
        try {
            ZooKeeper zk = new ZooKeeper(ZK_HOST, SESSION_TIMEOUT, new Watcher() {
                @Override
                public void process(WatchedEvent watchedEvent) {
                    if (watchedEvent.getPath().startsWith("/rndcloud")) {

                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
