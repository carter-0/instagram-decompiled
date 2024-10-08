package com.facebook.appperf.messagequeue.monitor.extra.libcio;

import X.0dV;
import java.util.Set;

public final class LibcHook {
    public final native void nativeCleanup();

    public final native void nativeInitialize();

    public final native boolean nativeIsTracingEnabled();

    public final native boolean nativeStartTracing();

    public final native Set nativeStopTracing();

    public LibcHook() {
        0dV.A0C("libciohook");
    }
}
