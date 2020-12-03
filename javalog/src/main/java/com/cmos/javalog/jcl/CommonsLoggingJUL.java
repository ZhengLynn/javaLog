package com.cmos.javalog.jcl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;

public class CommonsLoggingJUL {
    public static void main(String[] args) throws IOException {
        // 设置JUL配置文件路径，使用自定义的配置文件
        System.setProperty("java.util.logging.config.file", CommonsLoggingJUL.class.getClassLoader().getResource("logging.properties").getPath());

        Log log = LogFactory.getLog("CommonsJUL");
        // log.trace("This is TRACE COMMONS-JUL");
        // log.debug("This is DEBUG COMMONS-JUL");
        // log.info("This is INFO COMMONS-JUL");
        // log.warn("This is WARN COMMONS-JUL");
        // log.error("This is ERROR COMMONS-JUL");
        // log.fatal("This is FATAL COMMONS-JUL");

        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                log.info(i + " thread-1" + System.lineSeparator());
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                log.info(i + " thread-2" + System.lineSeparator());
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                log.info(i + " thread-3" + System.lineSeparator());
            }
        }).start();

    }
}
