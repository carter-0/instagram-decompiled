package com.facebook.cameracore.mediapipeline.services.messagechannel.implementation;

import X.C392759vK;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public final class ServiceMessageChannelHybrid extends ServiceConfiguration {
    public static final C392759vK Companion = new Object();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ServiceMessageChannelHybrid(X.C39674A4o r5) {
        /*
            r4 = this;
            r0 = 1
            X.0qQ.A0B(r5, r0)
            X.A8o r0 = r5.A01
            X.0qQ.A07(r0)
            com.facebook.cameracore.mediapipeline.services.messagechannel.implementation.ServiceMessageDataSourceHybrid r3 = new com.facebook.cameracore.mediapipeline.services.messagechannel.implementation.ServiceMessageDataSourceHybrid
            r3.<init>(r0)
            r0.A01 = r3
            X.ACv r0 = r0.A00
            if (r0 == 0) goto L_0x001f
            int r2 = r0.A00
            java.nio.ByteBuffer r1 = r0.A01
            int r0 = r1.position()
            r3.setConfiguration(r2, r1, r0)
        L_0x001f:
            X.6eR r0 = r5.A00
            int r0 = r0.A00
            com.facebook.jni.HybridData r0 = initHybrid(r3, r0)
            X.0qQ.A0A(r0)
            r4.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.messagechannel.implementation.ServiceMessageChannelHybrid.<init>(X.A4o):void");
    }

    public static final native HybridData initHybrid(ServiceMessageDataSourceHybrid serviceMessageDataSourceHybrid, int i);
}
