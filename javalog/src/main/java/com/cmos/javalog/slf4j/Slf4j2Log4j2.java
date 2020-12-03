// package com.cmos.javalog.slf4j;
//
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
//
// public class Slf4j2Log4j2 {
//
//     private static Logger logger = LoggerFactory.getLogger("log4jFile");
//
//     public static void main(String[] args) {
//         new Thread(() -> {
//             for (int i = 0; i < 100; i++) {
//                 ThreadContext.put("log4jFile", "Slf4j2Log4j2.log");
//                 logger.warn("{}", i + " thread-1" + System.lineSeparator());
//                 ThreadContext.clearAll();
//             }
//         }).start();
//         new Thread(() -> {
//             for (int i = 0; i < 100; i++) {
//                 ThreadContext.put("log4jFile", "Slf4j2Log4j2.log");
//                 logger.warn("{}", i + " thread-2" + System.lineSeparator());
//                 ThreadContext.clearAll();
//             }
//         }).start();
//         new Thread(() -> {
//             for (int i = 0; i < 100; i++) {
//                 ThreadContext.put("log4jFile", "Slf4j2Log4j2.log");
//                 logger.warn("{}", i + " thread-3" + System.lineSeparator());
//                 ThreadContext.clearAll();
//             }
//         }).start();
//     }
// }
