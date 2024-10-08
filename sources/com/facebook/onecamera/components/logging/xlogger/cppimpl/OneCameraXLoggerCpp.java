package com.facebook.onecamera.components.logging.xlogger.cppimpl;

import X.0dV;
import X.C312166dw;
import X.C344057rF;
import X.C368758tH;
import android.os.Build;
import android.os.SystemClock;
import com.facebook.jni.HybridData;
import com.facebook.onecamera.components.logging.xlogger.ar.OneCameraARXLoggerImpl;
import java.util.List;

public class OneCameraXLoggerCpp implements C344057rF {
    public static final String TAG = "OneCameraXLoggerCpp";
    public final boolean mEnableLazyLoad;
    public HybridData mHybridData;
    public volatile boolean mIsNativeLibLoadedAndInit = false;

    private native String getActiveSessionIdInternal();

    private native String getRecordingSessionIdInternal();

    public static native HybridData initHybrid();

    private native void initializeOneCameraARXLogger(OneCameraARXLoggerImpl oneCameraARXLoggerImpl);

    private native void onAnnotationUpdateEventInternal(int i, String str);

    private native String onEventInternal(int i, int i2, String str, String str2, String str3, int i3, String[] strArr, String[] strArr2, String[] strArr3, long j, long j2, long j3, int i4, boolean z, boolean z2, boolean z3);

    private native String onFailureEventInternal(int i, int i2, String str, String str2);

    private native String onPostCaptureEventInternal(int i, int i2, String str, String str2, int i3);

    public C368758tH createOneCameraARXLogger() {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        OneCameraARXLoggerImpl oneCameraARXLoggerImpl = new OneCameraARXLoggerImpl();
        initializeOneCameraARXLogger(oneCameraARXLoggerImpl);
        return oneCameraARXLoggerImpl;
    }

    public String getActiveSessionId() {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return "mock_for_test";
        }
        if (this.mIsNativeLibLoadedAndInit) {
            return getActiveSessionIdInternal();
        }
        return "Hybrid_Not_Init";
    }

    public String getRecordingSessionId() {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return "mock_for_test";
        }
        if (this.mIsNativeLibLoadedAndInit) {
            return getRecordingSessionIdInternal();
        }
        return "Hybrid_Not_Init";
    }

    public void initNative() {
        if (!this.mIsNativeLibLoadedAndInit) {
            synchronized (this) {
                if (!this.mIsNativeLibLoadedAndInit) {
                    loadSoLibrary();
                    this.mHybridData = initHybrid();
                    this.mIsNativeLibLoadedAndInit = true;
                }
            }
        }
    }

    public void onAnnotationUpdateEvent(int i, String str) {
        if (!"robolectric".equals(Build.FINGERPRINT)) {
            if (this.mEnableLazyLoad) {
                initNative();
            }
            onAnnotationUpdateEventInternal(i, str);
        }
    }

    public String onEvent(int i, int i2, String str, String str2, String str3, int i3, List list, List list2, List list3, long j, long j2, long j3, int i4, boolean z, boolean z2, boolean z3) {
        String[] strArr;
        String[] strArr2;
        if (this.mEnableLazyLoad) {
            initNative();
        }
        String[] strArr3 = null;
        List list4 = list;
        if (list != null) {
            strArr = (String[]) list4.toArray(new String[0]);
        } else {
            strArr = null;
        }
        List list5 = list2;
        if (list2 != null) {
            strArr2 = (String[]) list5.toArray(new String[0]);
        } else {
            strArr2 = null;
        }
        List list6 = list3;
        if (list3 != null) {
            strArr3 = (String[]) list6.toArray(new String[0]);
        }
        return onEventInternal(i, i2, str, str2, str3, i3, strArr, strArr2, strArr3, j, j2, j3, i4, z, z2, z3);
    }

    public String onFailureEvent(int i, int i2, String str, String str2) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        return onFailureEventInternal(i, i2, str, str2);
    }

    public String onPostCaptureEvent(int i, int i2, String str, String str2, int i3) {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return "mock_for_test";
        }
        if (this.mEnableLazyLoad) {
            initNative();
        }
        return onPostCaptureEventInternal(i, i2, str, str2, i3);
    }

    public OneCameraXLoggerCpp(boolean z) {
        this.mEnableLazyLoad = z;
        C312166dw.A00();
        if ("robolectric".equals(Build.FINGERPRINT)) {
            this.mHybridData = null;
        } else if (!z) {
            initNative();
        }
    }

    public static long getElapsedRealtimeNanos() {
        return SystemClock.elapsedRealtimeNanos();
    }

    public static void loadSoLibrary() {
        SystemClock.elapsedRealtimeNanos();
        0dV.A0C("spark-ocxlogger-native");
        SystemClock.elapsedRealtimeNanos();
    }
}
