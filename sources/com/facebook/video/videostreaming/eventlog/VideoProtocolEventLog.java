package com.facebook.video.videostreaming.eventlog;

import X.0dV;
import X.C9590RdU;
import com.facebook.jni.HybridClassBase;
import com.facebook.proxygen.EventBase;
import com.facebook.xanalytics.XAnalyticsHolder;

public abstract class VideoProtocolEventLog extends HybridClassBase {
    public static final C9590RdU Companion = new Object();

    private final native void initHybrid(EventBase eventBase, XAnalyticsHolder xAnalyticsHolder);

    public final native String[] getLogLines();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.RdU, java.lang.Object] */
    static {
        0dV.A0C("android-video-protocol-eventlog");
    }
}
