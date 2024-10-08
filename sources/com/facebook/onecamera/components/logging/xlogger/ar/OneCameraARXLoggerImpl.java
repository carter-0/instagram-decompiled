package com.facebook.onecamera.components.logging.xlogger.ar;

import X.0dV;
import X.C368758tH;
import android.os.Build;
import android.os.SystemClock;
import com.facebook.jni.HybridData;

public class OneCameraARXLoggerImpl implements C368758tH {
    public static final String TAG = "OneCameraARXLoggerImpl";
    public HybridData mHybridData;

    private native void createStandaloneOneCameraARXLoggerInternal();

    public static native HybridData initHybrid();

    private native boolean onEventInternal(int i, String str, boolean z);

    private native boolean onFailureEventInternal(int i, String str, String str2, int i2, String str3);

    private native boolean onStartEventInternal(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7);

    private native void updateAnnotationInternal(String str, String str2, String str3);

    public OneCameraARXLoggerImpl() {
        HybridData hybridData;
        if (!"robolectric".equals(Build.FINGERPRINT)) {
            loadSoLibrary();
            hybridData = initHybrid();
        } else {
            hybridData = null;
        }
        this.mHybridData = hybridData;
    }

    public static long getElapsedRealtimeNanos() {
        return SystemClock.elapsedRealtimeNanos();
    }

    public static void loadSoLibrary() {
        SystemClock.elapsedRealtimeNanos();
        0dV.A0C("spark-ocarxlogger-native");
        SystemClock.elapsedRealtimeNanos();
    }

    public void createStandaloneOneCameraARXLogger() {
        createStandaloneOneCameraARXLoggerInternal();
    }

    public boolean onEvent(int i, String str, boolean z) {
        return onEventInternal(i, str, z);
    }

    public boolean onFailureEvent(int i, String str, String str2, int i2, String str3) {
        return onFailureEventInternal(i, str, str2, i2, str3);
    }

    public boolean onStartEvent(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return onStartEventInternal(i, str, str2, str3, str4, str5, str6, str7);
    }

    public void updateAnnotation(String str, String str2, String str3) {
        updateAnnotationInternal(str, str2, str3);
    }
}
