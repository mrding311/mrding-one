package com.mrding.one.zk;

import org.apache.zookeeper.*;

/**
 * Created by DINGSHUAI685 on 2015-10-15.
 */
public class RegistIdeploy implements Watcher {

    private ZooKeeper zk;

    public void connectZk() {
        try {
            zk = new ZooKeeper("iqsz-d2229:2181", 50000, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void regist(String node) throws KeeperException, InterruptedException {
        if (zk == null) {
            connectZk();
        }
        zk.create("/" + node, node.getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL);
    }

    public static void main(String[] args) throws InterruptedException, KeeperException {
        RegistIdeploy test = new RegistIdeploy();
        test.regist("ideploy1");
        System.out.println("");
    }

    @Override
    public void process(WatchedEvent event) {}

}
