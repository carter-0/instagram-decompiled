package com.facebook.hermes.instrumentation;

import X.0dV;

public class HermesSamplingProfiler {
    public static native void disable();

    public static native void dumpSampledTraceToFile(String str);

    public static native void enable();

    static {
        0dV.A0C("jsijniprofiler");
    }
}
