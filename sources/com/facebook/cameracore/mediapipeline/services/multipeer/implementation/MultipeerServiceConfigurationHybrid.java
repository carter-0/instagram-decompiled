package com.facebook.cameracore.mediapipeline.services.multipeer.implementation;

import X.C380909ai;
import X.C392769vL;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public final class MultipeerServiceConfigurationHybrid extends ServiceConfiguration {
    public static final C392769vL Companion = new Object();
    public final C380909ai configuration;

    /* JADX WARNING: type inference failed for: r0v1, types: [com.facebook.cameracore.mediapipeline.services.multipeer.implementation.MultipeerServiceDelegateBridge, java.lang.Object] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MultipeerServiceConfigurationHybrid(X.C380909ai r3) {
        /*
            r2 = this;
            r0 = 1
            X.0qQ.A0B(r3, r0)
            X.B0V r1 = r3.A00
            com.facebook.cameracore.mediapipeline.services.multipeer.implementation.MultipeerServiceDelegateBridge r0 = new com.facebook.cameracore.mediapipeline.services.multipeer.implementation.MultipeerServiceDelegateBridge
            r0.<init>()
            r0.delegate = r1
            com.facebook.jni.HybridData r0 = initHybrid(r0)
            r2.<init>(r0)
            r2.configuration = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.multipeer.implementation.MultipeerServiceConfigurationHybrid.<init>(X.9ai):void");
    }

    public static final native HybridData initHybrid(MultipeerServiceDelegateBridge multipeerServiceDelegateBridge);
}
