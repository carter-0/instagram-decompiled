package com.instagram.devicesegmentation.logging;

import X.0dV;
import X.AnonymousClass9Fo;
import com.facebook.jni.HybridData;

public final class PerfMetricRunnerJni {
    public static final AnonymousClass9Fo Companion = new Object();
    public final HybridData mHybridData = initHybrid();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    public final native String getProgressLog();

    public final native float getResultMax();

    public final native float getResultMean();

    public final native float getResultMedian();

    public final native float getResultMin();

    public final native String getResultName();

    public final native float getResultQuartile1();

    public final native float getResultQuartile3();

    public final native int getResultSampleCount();

    public final native float getResultStdDev();

    public final native String getResultUnits();

    public final native boolean runBenchmark(String str);

    public final native void setTempFilename(String str);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.9Fo, java.lang.Object] */
    static {
        0dV.A0C("benchmarkjni");
    }
}
