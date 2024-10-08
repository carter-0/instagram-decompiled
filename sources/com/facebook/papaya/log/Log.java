package com.facebook.papaya.log;

import X.0dV;

public class Log {
    public static native void nativeAddLogSink(String str, int i, LogSink logSink);

    public static native void nativeRemoveLogSink(String str);

    static {
        0dV.A0C("papaya-log");
    }
}
