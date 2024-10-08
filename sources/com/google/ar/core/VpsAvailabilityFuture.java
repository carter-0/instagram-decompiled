package com.google.ar.core;

public abstract class VpsAvailabilityFuture {

    public abstract class CallbackWrapper {
        public abstract void accept(int i);
    }

    public static native void nativeReleaseFuture(long j, long j2);

    public native boolean nativeCancel(long j, long j2, long j3);

    public native int nativeGetResult(long j, long j2);

    public native int nativeGetState(long j, long j2);
}
