package com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation;

import X.0dV;
import X.C372128zj;
import X.C392649v9;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.WorldTrackingDataProviderDelegateWrapper;
import com.facebook.jni.HybridData;

public final class WorldTrackerDataProviderConfigurationHybrid extends ServiceConfiguration {
    public static final C392649v9 Companion = new Object();
    public final C372128zj configuration;

    public static final native HybridData initHybrid(int i, int i2, boolean z, boolean z2, int i3, DeviceConfig deviceConfig, WorldTrackingDataProviderDelegateWrapper worldTrackingDataProviderDelegateWrapper, String str, boolean z3);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.9v9] */
    static {
        0dV.A0C("worldtrackerdataprovider");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public WorldTrackerDataProviderConfigurationHybrid(X.C372128zj r11) {
        /*
            r10 = this;
            int r1 = r11.A02
            int r2 = r11.A03
            boolean r3 = r11.A08
            boolean r4 = r11.A07
            java.lang.Integer r0 = r11.A06
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x002f
            r5 = 1
        L_0x0011:
            com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig r6 = r11.A04
            X.0qQ.A07(r6)
            com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.WorldTrackingDataProviderDelegateWrapper r7 = r11.A05
            X.0qQ.A07(r7)
            java.lang.String r8 = r11.A00
            X.0qQ.A07(r8)
            boolean r9 = r11.A01
            com.facebook.jni.HybridData r0 = initHybrid(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            X.0qQ.A0A(r0)
            r10.<init>(r0)
            r10.configuration = r11
            return
        L_0x002f:
            r5 = 0
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation.WorldTrackerDataProviderConfigurationHybrid.<init>(X.8zj):void");
    }
}
