package util;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MyLogger {
    private static final DateTimeFormatter fomatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

    private static void log(Object obj) {
        String time = LocalTime.now().format(fomatter);
        System.out.printf("%s [%9s] %s\n", time, Thread.currentThread().getName(), obj);
    }
}
