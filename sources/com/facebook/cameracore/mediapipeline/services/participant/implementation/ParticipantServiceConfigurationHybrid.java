package com.facebook.cameracore.mediapipeline.services.participant.implementation;

import X.C380919aj;
import X.C392789vN;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public final class ParticipantServiceConfigurationHybrid extends ServiceConfiguration {
    public static final C392789vN Companion = new Object();
    public final C380919aj configuration;

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.facebook.cameracore.mediapipeline.services.participant.implementation.ParticipantServiceDelegateBridge] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ParticipantServiceConfigurationHybrid(X.C380919aj r3) {
        /*
            r2 = this;
            r0 = 1
            X.0qQ.A0B(r3, r0)
            X.B0W r1 = r3.A00
            com.facebook.cameracore.mediapipeline.services.participant.implementation.ParticipantServiceDelegateBridge r0 = new com.facebook.cameracore.mediapipeline.services.participant.implementation.ParticipantServiceDelegateBridge
            r0.<init>()
            r0.delegate = r1
            com.facebook.jni.HybridData r0 = initHybrid(r0)
            r2.<init>(r0)
            r2.configuration = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.participant.implementation.ParticipantServiceConfigurationHybrid.<init>(X.9aj):void");
    }

    public static final native HybridData initHybrid(ParticipantServiceDelegateBridge participantServiceDelegateBridge);
}
