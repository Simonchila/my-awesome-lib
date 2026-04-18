package com.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TechSpirit {

    public static String getStatusReport() {
        String os = System.getProperty("os.name");
        String version = System.getProperty("java.version");
        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        return String.format(
                "🚀 [System Boot] %s\n" +
                        "🌟 OS: %s\n" +
                        "⚙️ Engine: Java %s\n" +
                        "📡 Status: Ready for Liftoff! ",
                time, os, version
        );
    }

    public static int add(int a, int b) {
        return a + b;
    }
}