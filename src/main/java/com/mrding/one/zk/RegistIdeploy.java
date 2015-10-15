package com.mrding.one.zk;

import org.apache.zookeeper.*;

import java.io.IOException;

/**
 * Created by DINGSHUAI685 on 2015-10-15.
 */
public class RegistIdeploy {

    private static final String ZK_HOST = "iqsz-d2229:2181";
    private static final int SESSION_TIMEOUT = 5000;
    private static String zNode = "/rndcloud/ideploy1";

    public static void main(String[] args) {
        try {
            ZooKeeper zk = new ZooKeeper(ZK_HOST, SESSION_TIMEOUT, new Watcher() {
                @Override
                public void process(WatchedEvent watchedEvent) {

                }
            });

            zk.create(zNode, "192.168.1.1".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL);
            Thread.sleep(Long.MAX_VALUE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
