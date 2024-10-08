package com.facebook.cameracore.ardelivery.networkconsentmanager.impl;

import X.0dV;
import X.0qQ;
import X.C390979s9;
import X.XUQ;
import com.facebook.cameracore.ardelivery.networkconsentmanager.interfaces.NetworkConsentStorage;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.common.util.TriState;
import com.facebook.jni.HybridData;

public final class NetworkConsentManagerJNI {
    public static final XUQ Companion = new Object();
    public final HybridData mHybridData;

    public NetworkConsentManagerJNI(NetworkConsentStorage networkConsentStorage, AnalyticsLogger analyticsLogger) {
        0qQ.A0B(networkConsentStorage, 1);
        0qQ.A0B(analyticsLogger, 2);
        this.mHybridData = initHybrid(networkConsentStorage, analyticsLogger);
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybrid(NetworkConsentStorage networkConsentStorage, AnalyticsLogger analyticsLogger);

    private final native void setUserConsent(String str, boolean z, int i);

    public native TriState hasUserAllowedNetworking(String str);

    public void setUserConsent(String str, boolean z, C390979s9 r4) {
        0qQ.A0B(str, 0);
        0qQ.A0B(r4, 2);
        setUserConsent(str, z, r4.A00);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.XUQ, java.lang.Object] */
    static {
        0dV.A0C("ard-android-network-consent-manager-impl");
    }
}
