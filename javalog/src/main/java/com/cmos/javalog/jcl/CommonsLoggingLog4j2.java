// package com.cmos.javalog.jcl;
//
// import org.apache.logging.log4j.ThreadContext;
// import org.apache.commons.logging.Log;
// import org.apache.commons.logging.LogFactory;
//
// public class CommonsLoggingLog4j2 {
//     private static Log log = LogFactory.getLog("log4jFile");
//
//     public static void main(String[] args) {
//         new Thread(() -> {
//             for (int i = 0; i < 100; i++) {
//                 ThreadContext.put("log4jFile", "CommonsLoggingLog4j2.log");
//                 log.warn(i + " thread-1" + System.lineSeparator());
//                 ThreadContext.clearAll();
//             }
//         }).start();
//         new Thread(() -> {
//             for (int i = 0; i < 100; i++) {
//                 ThreadContext.put("log4jFile", "CommonsLoggingLog4j2.log");
//                 log.warn(i + " thread-2" + System.lineSeparator());
//                 ThreadContext.clearAll();
//             }
//         }).start();
//         new Thread(() -> {
//             for (int i = 0; i < 100; i++) {
//                 ThreadContext.put("log4jFile", "CommonsLoggingLog4j2.log");
//                 log.warn(i + " thread-3" + System.lineSeparator());
//                 ThreadContext.clearAll();
//             }
//         }).start();
//     }
// }
