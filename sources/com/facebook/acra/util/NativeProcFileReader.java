package com.facebook.acra.util;

import java.util.concurrent.atomic.AtomicBoolean;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
public class NativeProcFileReader {
    public static final AtomicBoolean sReadyToUse = null;

    private native int[] getOpenFDLimitsNative();

    public native int getOpenFDCount();

    public native String getOpenFileDescriptors();
}
