package com.facebook.quicklog;

public class QuickPerformanceLoggerNativeProvider {
    public static long getAppStartTimeMs() {
        return 0;
    }

    public static QuickPerformanceLogger getQPLInstance() {
        return QuickPerformanceLoggerProvider.getQPLInstance();
    }
}
