// package com.cmos.javalog.slf4j;
//
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
//
// public class Slf4j2JUL {
//     public static void main(String[] args) {
//         // 设置配置文件路径，使用自定义的配置文件
//         System.setProperty("java.util.logging.config.file", Slf4j2JUL.class
//                 .getClassLoader().getResource("logging.properties").getPath());
//
//         Logger logger = LoggerFactory.getLogger("Slf4j2JUL");
//         new Thread(() -> {
//             for (int i = 0; i < 100; i++) {
//                 logger.info("{}", i + " thread-1" + System.lineSeparator());
//             }
//         }).start();
//         new Thread(() -> {
//             for (int i = 0; i < 100; i++) {
//                 logger.info("{}", i + " thread-2" + System.lineSeparator());
//             }
//         }).start();
//         new Thread(() -> {
//             for (int i = 0; i < 100; i++) {
//                 logger.info("{}", i + " thread-3" + System.lineSeparator());
//             }
//         }).start();
//     }
// }
