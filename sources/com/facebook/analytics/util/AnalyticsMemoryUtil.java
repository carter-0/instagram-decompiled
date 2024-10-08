package com.facebook.analytics.util;

import X.0dV;

public final class AnalyticsMemoryUtil {
    public static native String[] getLoadedLibraries();

    public static native long getPeakRss();

    static {
        0dV.A0C("analyticsutil-jni");
    }
}
