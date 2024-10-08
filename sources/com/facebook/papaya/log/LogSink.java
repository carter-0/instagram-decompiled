package com.facebook.papaya.log;

import X.0dV;
import java.util.Map;

public abstract class LogSink {
    public abstract void event(long j, long j2, long j3, int i, Map map, String str);

    public abstract void log(long j, long j2, long j3, int i, String str, int i2, String str2);

    static {
        0dV.A0C("papaya-log");
    }
}
