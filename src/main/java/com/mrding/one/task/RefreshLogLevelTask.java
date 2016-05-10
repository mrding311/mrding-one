package com.mrding.one.task;

import com.mrding.one.utils.PropertyUtils;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *
 * Created by mrding on 15-11-18.
 */
@Component
public class RefreshLogLevelTask {

    private static Logger logger = Logger.getLogger(RefreshLogLevelTask.class);

    @Async
    @Scheduled(cron = "0 0/2 * * * ?")
    public void execute() {
        LogManager.getLogger("com.mrding.one").setLevel(
                Level.toLevel(PropertyUtils.getInstance().getProperty("log.level.com.mrding.one")));
    }

//    @Async
//    @Scheduled(cron = "0/5 * * * * ?")
    public void testLog() {
        logger.info("logging info...");
    }


}
