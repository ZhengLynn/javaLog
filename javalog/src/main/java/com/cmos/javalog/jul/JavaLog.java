package com.cmos.javalog.jul;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class JavaLog {

    public static void main(String[] args) throws IOException {
        // 设置配置文件路径，使用自定义的配置文件
        System.setProperty("java.util.logging.config.file", JavaLog.class.getClassLoader().getResource("logging.properties").getPath());

        Logger logger = Logger.getLogger("moreThread2File");
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                logger.log(Level.INFO, i + " thread-1" + System.lineSeparator());
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                logger.log(Level.INFO, i + " thread-2" + System.lineSeparator());
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                logger.log(Level.INFO, i + " thread-3" + System.lineSeparator());
            }
        }).start();
    }

    public static void testLog() throws IOException {
        /*
         * 为指定子系统查找或创建一个logger
         * name: logger名称
         * resourceBundleName: 绑定资源
         */
        Logger logger = Logger.getLogger("test", "E:/20204_022.JF");
        /*
         * 创建一个FileHandler，并指定属性
         * pattern: 日志文件存储路径
         * limit: 最大存储字节数
         * count: 日志文件数量
         * append: 是否可以追究
         */
        FileHandler fileHandler = new FileHandler("E:/test.log", 102400, 1, true);
        logger.addHandler(fileHandler);
        // 指定 logger 输出级别
        logger.setLevel(Level.INFO);
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        // 格式化log
        fileHandler.setFormatter(simpleFormatter);

        logger.log(Level.INFO, "这是一个INFO消息");
        logger.log(Level.WARNING, "这是一个WARNING警告", 2);
        logger.log(Level.SEVERE, "这是一个SEVERE服务器消息");
    }
}
