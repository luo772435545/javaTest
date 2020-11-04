package test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLog {
     private static Logger logger = LoggerFactory.getLogger(TestLog.class);

    public static void main(String[] args) {
        logger.debug("这是日志");
        logger.info("这是日志");
        logger.warn("这是日志");
        logger.error("这是日志");
    }
}
