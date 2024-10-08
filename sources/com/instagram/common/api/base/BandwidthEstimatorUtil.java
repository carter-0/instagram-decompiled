package com.instagram.common.api.base;

import X.C63981Bg;
import com.facebook.jni.HybridData;

public final class BandwidthEstimatorUtil {
    public static final C63981Bg Companion = null;
    public final HybridData mHybridData = initHybrid(13964, 13965);

    public static final native HybridData initHybrid(int i, int i2);

    public final native void addDownloadSample(long j, long j2);

    public final native void addUploadSample(long j, long j2);

    public final native long getDownloadBandwidthEstimate();

    public final native long getUploadBandwidthEstimate();

    public BandwidthEstimatorUtil(int i, int i2) {
    }
}
