package com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl;

import X.0dV;
import X.AnonymousClass000;
import X.C312156dv;
import X.C312166dw;
import X.C342147o7;
import android.os.Build;
import android.os.SystemClock;
import com.facebook.jni.HybridData;

public class QPLUserFlowImpl implements C312156dv {
    public static final String TAG = "QPLUserFlowImpl";
    public final boolean mEnableLazyLoad;
    public HybridData mHybridData;
    public volatile boolean mIsNativeLibLoadedAndInit = false;

    private native void annotateInternal(long j, String str, String str2, boolean z, String str3);

    private native void endCancelInternal(long j, String str, String str2);

    private native void endFailInternal(long j, String str, int i, String str2, String str3);

    private native void endSuccessInternal(long j, String str);

    public static native HybridData initHybrid();

    private native long instanceIdWithStringInternal(int i, String str);

    private native void markPointInternal(long j, int i, String str);

    private native long startInternal(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7);

    private native void startWithFlowInstanceIdInternal(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7);

    public void annotate(long j, String str, String str2) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        annotateInternal(j, str, str2, false, "");
    }

    public void annotateWithCrucialData(long j, String str, String str2) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        annotateInternal(j, str, str2, true, "");
    }

    private void initNative() {
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

    public void endCancel(long j, String str) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        endCancelInternal(j, str, "");
    }

    public void endFail(long j, String str, int i, String str2, String str3) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        endFailInternal(j, str, i, str2, str3);
    }

    public void endSuccess(long j) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        endSuccessInternal(j, "");
    }

    public long getInstanceIdWithString(int i, String str) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        return instanceIdWithStringInternal(i, str);
    }

    public void markPoint(long j, int i) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        markPointInternal(j, i, "");
    }

    public long start(int i, C342147o7 r4, long j) {
        throw new RuntimeException(AnonymousClass000.A00(115));
    }

    public void startWithFlowInstanceId(long j, C342147o7 r5, long j2) {
        throw new RuntimeException(AnonymousClass000.A00(115));
    }

    public QPLUserFlowImpl(boolean z) {
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
        0dV.A0C("spark-qpluserflow-native");
        SystemClock.elapsedRealtimeNanos();
    }

    public void annotate(long j, String str, String str2, String str3) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        annotateInternal(j, str, str2, false, str3);
    }

    public void annotateWithCrucialData(long j, String str, String str2, String str3) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        annotateInternal(j, str, str2, true, str3);
    }

    public void endCancel(long j, String str, String str2) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        endCancelInternal(j, str, str2);
    }

    public void endFail(long j, String str, int i, String str2) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        endFailInternal(j, str, i, str2, "");
    }

    public void endSuccess(long j, String str) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        endSuccessInternal(j, str);
    }

    public void markPoint(long j, int i, String str) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        markPointInternal(j, i, str);
    }

    public long start(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        return startInternal(i, str, str2, str3, str4, str5, str6, str7);
    }

    public void startWithFlowInstanceId(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        startWithFlowInstanceIdInternal(j, str, str2, str3, str4, str5, str6, str7);
    }
}
