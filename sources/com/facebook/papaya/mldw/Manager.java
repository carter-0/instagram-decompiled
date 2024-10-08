package com.facebook.papaya.mldw;

import X.0dV;
import X.AnonymousClass7TE;
import com.facebook.papaya.log.LogSink;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

public class Manager {
    public static final Map sHosts = AnonymousClass7TE.A1E();

    public static native void nativeAddLogSink(String str, int i, LogSink logSink);

    public static native SettableFuture nativeCleanup(int i);

    public static native Host nativeRegisterHost(int i, ScheduledExecutorService scheduledExecutorService, String str, ITransport iTransport, ImmutableList immutableList);

    public static native void nativeRemoveLogSink(String str);

    public static native void nativeUnregisterHost(int i);

    static {
        0dV.A0C("papaya-mldw");
    }
}
