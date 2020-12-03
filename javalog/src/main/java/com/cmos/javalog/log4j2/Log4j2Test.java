// package com.cmos.javalog.log4j2;
//
// import org.apache.logging.log4j.LogManager;
// import org.apache.logging.log4j.Logger;
// import org.apache.logging.log4j.ThreadContext;
//
// public class Log4j2Test {
//     private static Logger logger = LogManager.getLogger("log4jFile");
//     public static void main(String[] args) {
//         new Thread(() -> {
//             for (int i = 0; i < 100; i++) {
//                 ThreadContext.put("log4jFile", "log4j2-1.log");
//                 logger.warn(i + " thread-1" + System.lineSeparator());
//                 ThreadContext.clearAll();
//             }
//         }).start();
//         new Thread(() -> {
//             for (int i = 0; i < 100; i++) {
//                 ThreadContext.put("log4jFile", "log4j2-2.log");
//                 logger.warn(i + " thread-2" + System.lineSeparator());
//                 ThreadContext.clearAll();
//             }
//         }).start();
//         new Thread(() -> {
//             for (int i = 0; i < 100; i++) {
//                 ThreadContext.put("log4jFile", "log4j2-3.log");
//                 logger.warn(i + " thread-3" + System.lineSeparator());
//                 ThreadContext.clearAll();
//             }
//         }).start();
//     }
// }
