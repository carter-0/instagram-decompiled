package com.facebook.react.internal.turbomodule.core;

import X.SMk;
import com.facebook.react.reactperflogger.NativeModulePerfLogger;

public class TurboModulePerfLogger {
    public static native void jniEnableCppLogging(NativeModulePerfLogger nativeModulePerfLogger);

    static {
        SMk.A00();
    }
}
