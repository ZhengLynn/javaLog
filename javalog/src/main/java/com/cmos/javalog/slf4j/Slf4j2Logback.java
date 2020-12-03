// package com.cmos.javalog.slf4j;
//
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.slf4j.MDC;
//
// public class Slf4j2Logback {
//     private static Logger logger = LoggerFactory.getLogger(Slf4j2Logback.class);
//
//     public static void main(String[] args) {
//         new Thread(() -> {
//             for (int i = 0; i < 100; i++) {
//                 MDC.put("logFileName","Slf4j2Logback");
//                 logger.info("{}", i + " thread-1" + System.lineSeparator());
//                 MDC.remove("logFileName");
//             }
//         }).start();
//         new Thread(() -> {
//             for (int i = 0; i < 100; i++) {
//                 MDC.put("logFileName","Slf4j2Logback");
//                 logger.info("{}", i + " thread-2" + System.lineSeparator());
//                 MDC.remove("logFileName");
//             }
//         }).start();
//         new Thread(() -> {
//             for (int i = 0; i < 100; i++) {
//                 MDC.put("logFileName","Slf4j2Logback");
//                 logger.info("{}", i + " thread-3" + System.lineSeparator());
//                 MDC.remove("logFileName");
//             }
//         }).start();
//     }
// }
