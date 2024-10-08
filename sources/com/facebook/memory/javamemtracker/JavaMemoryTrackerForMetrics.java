package com.facebook.memory.javamemtracker;

import X.0T6;
import X.0c6;
import X.0dV;
import X.2QU;
import X.AnonymousClass0T8;
import X.C272474km;
import X.C272484kn;
import X.C2807153c;
import android.os.Build;
import com.facebook.memory.common.MapStats;
import com.facebook.memory.common.SurfaceVisitStats;
import java.nio.ByteBuffer;
import java.util.List;

public class JavaMemoryTrackerForMetrics {
    public static JavaMemoryTrackerForMetrics sInstance;
    public final 0T6 mDeallocationListener;
    public final 0c6 mDeallocationMonitor;
    public final long[] mGcStats = new long[4];
    public boolean mInitialized;
    public final boolean mLogGcStats;
    public final int mNumberOfAllocationMaps;
    public final AnonymousClass0T8 mPhantomReferenceProcessor;
    public final int mThresholdBytes;

    public JavaMemoryTrackerForMetrics(int i, int i2, boolean z, boolean z2) {
        C272474km r2 = new C272474km(this);
        this.mDeallocationListener = r2;
        C272484kn r1 = new C272484kn(this);
        this.mPhantomReferenceProcessor = r1;
        this.mDeallocationMonitor = new 0c6(r2, r1, false);
        this.mThresholdBytes = i;
        this.mNumberOfAllocationMaps = 1;
        this.mLogGcStats = true;
        if (Build.VERSION.SDK_INT > 29) {
            nativePrepare();
            new C2807153c(this).start();
        }
    }

    private native void nativeActivateHooks();

    private native boolean nativeGetAllocatedAndMaxSizeAndDiscardTag(int i, Object obj);

    private native void nativeGetMapStats(Object obj);

    private native int nativeGetObjectCountAnnotation(ByteBuffer byteBuffer, Object obj);

    public static native void nativeInitialize(boolean z, Object obj, int i, int i2, List list, List list2, int i3, int i4, int i5, int i6, boolean z2, int i7, boolean z3, boolean z4, int i8, int i9, Class cls);

    private native void nativePauseTrackingOnThisThread();

    public static native void nativePrepare();

    /* access modifiers changed from: private */
    public native void nativeRegisterDeallocation(long[] jArr, String[] strArr, int i);

    private native void nativeResumeTrackingOnThisThread();

    private native void nativeSetCurrentTag(int i);

    public static native void nativeStartPhantomReferenceLoop();

    private native long nativeStopCurrentTag();

    public static native void nativeStopPhantomReferenceLoop();

    public void startTrackingAccumulationForSurface(int i, boolean z, int i2) {
        synchronized (this) {
            if (!this.mInitialized) {
                nativeInitialize(false, this.mDeallocationMonitor, this.mThresholdBytes, this.mNumberOfAllocationMaps, (List) null, (List) null, 0, 0, 0, 0, false, 0, false, false, 0, 0, (Class) null);
                this.mDeallocationMonitor.A00();
                this.mInitialized = true;
            }
        }
        if (this.mLogGcStats) {
            2QU.A00(this.mGcStats);
        }
        nativeSetCurrentTag(i);
    }

    static {
        0dV.A0C("javamemmetrics");
    }

    public void getAccumulatedSizeAndStopTrackingSurface(int i, SurfaceVisitStats surfaceVisitStats, long[] jArr) {
        boolean nativeGetAllocatedAndMaxSizeAndDiscardTag = nativeGetAllocatedAndMaxSizeAndDiscardTag(i, surfaceVisitStats);
        if (this.mLogGcStats) {
            long[] jArr2 = this.mGcStats;
            int length = jArr2.length;
            long[] jArr3 = new long[length];
            System.arraycopy(jArr2, 0, jArr3, 0, length);
            2QU.A00(this.mGcStats);
            int i2 = 0;
            while (true) {
                long[] jArr4 = this.mGcStats;
                if (i2 >= jArr4.length) {
                    break;
                }
                jArr[i2] = jArr4[i2] - jArr3[i2];
                i2++;
            }
        }
        if (nativeGetAllocatedAndMaxSizeAndDiscardTag) {
            synchronized (this) {
                this.mInitialized = false;
            }
        }
    }

    public long stopTrackingAllocationsForSurface(int i) {
        return nativeStopCurrentTag();
    }

    public void getMapStats(MapStats mapStats) {
        nativeGetMapStats(mapStats);
    }
}
