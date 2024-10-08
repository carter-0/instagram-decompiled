package com.facebook.cameracore.mediapipeline.dataproviders.facetracker.implementation;

import X.C372158zq;
import X.C392609v5;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfiguration$FaceTrackerErrorHandler;
import com.facebook.jni.HybridData;

public final class FaceTrackerDataProviderConfigurationHybrid extends ServiceConfiguration {
    public static final C392609v5 Companion = new Object();
    public final C372158zq configuration;

    public static final native HybridData initHybrid(int i, String[] strArr, String[] strArr2, String str, FaceTrackerDataProviderConfiguration$FaceTrackerErrorHandler faceTrackerDataProviderConfiguration$FaceTrackerErrorHandler, boolean z, Integer num, Integer num2);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FaceTrackerDataProviderConfigurationHybrid(X.C372158zq r9) {
        /*
            r8 = this;
            java.lang.Integer r0 = r9.A01
            int r0 = X.C368548sp.A00(r0)
            java.lang.String[] r1 = r9.A06
            X.0qQ.A07(r1)
            java.lang.String[] r2 = r9.A05
            java.lang.String r3 = r9.A04
            com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfiguration$FaceTrackerErrorHandler r4 = r9.A00
            boolean r5 = r9.A07
            java.lang.Integer r6 = r9.A02
            java.lang.Integer r7 = r9.A03
            com.facebook.jni.HybridData r0 = initHybrid(r0, r1, r2, r3, r4, r5, r6, r7)
            r8.<init>(r0)
            r8.configuration = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.dataproviders.facetracker.implementation.FaceTrackerDataProviderConfigurationHybrid.<init>(X.8zq):void");
    }
}
