// package com.cmos.javalog.log4j;
//
// import org.apache.log4j.FileAppender;
// import org.apache.log4j.Logger;
// import org.apache.log4j.PatternLayout;
//
// import java.io.IOException;
//
// public class Log4JTest {
//
//     private static Logger logger = Logger.getLogger(Log4JTest.class);
//
//     public static void main(String[] args) throws IOException {
//
//         FileAppender fileAppender = new FileAppender(new PatternLayout("%m"), "E:/logs/newLog.log");
//         logger.addAppender(fileAppender);
//
//
//         new Thread(() -> {
//             for (int i = 0; i < 100; i++) {
//                 logger.debug(i + " thread-1" + System.lineSeparator());
//             }
//         }).start();
//         new Thread(() -> {
//             for (int i = 0; i < 100; i++) {
//                 logger.debug(i + " thread-2" + System.lineSeparator());
//             }
//         }).start();
//         new Thread(() -> {
//             for (int i = 0; i < 100; i++) {
//                 logger.debug(i + " thread-3" + System.lineSeparator());
//             }
//         }).start();
//     }
// }
