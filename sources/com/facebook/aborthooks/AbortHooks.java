package com.facebook.aborthooks;

public final class AbortHooks {
    public static final AbortHooks INSTANCE = null;
    public static volatile boolean sInstalled;

    public static final native void hookAbort();

    public static final native void hookAndroidLogAssert();

    public static final native void hookAndroidSetAbortMessage();

    public static final native void install();

    public static final native void installAll(long j);

    public static final native void setGlogFatalHandler();
}
