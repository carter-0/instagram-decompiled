package com.instagram.debug.devoptions.debughead.config;

import X.0tS;

public final class DebugHeadConfigurations {
    public static final DebugHeadConfigurations INSTANCE = new Object();
    public static final boolean isDebugHeadEnabled;
    public static final boolean isMemoryLeakAnalysisEnabled = false;
    public static final boolean isMemoryLeakDetectionEnabled;
    public static final boolean isMemoryMetricsDebuggingEnabled;

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.debug.devoptions.debughead.config.DebugHeadConfigurations, java.lang.Object] */
    static {
        boolean A0V = 0tS.A4E.A00().A0V();
        isDebugHeadEnabled = A0V;
        isMemoryLeakDetectionEnabled = A0V;
        isMemoryMetricsDebuggingEnabled = A0V;
    }

    public static final boolean isDebugHeadEnabled() {
        return isDebugHeadEnabled;
    }

    public static final boolean isMemoryLeakAnalysisEnabled() {
        return isMemoryLeakAnalysisEnabled;
    }

    public static final boolean isMemoryLeakDetectionEnabled() {
        return isMemoryLeakDetectionEnabled;
    }

    public static final boolean isMemoryMetricsDebuggingEnabled() {
        return isMemoryMetricsDebuggingEnabled;
    }
}
