package com.facebook.jni;

public class ThreadScopeSupport {
    public static native void runStdFunctionImpl(long j);

    public static void runStdFunction(long j) {
        runStdFunctionImpl(j);
    }
}
