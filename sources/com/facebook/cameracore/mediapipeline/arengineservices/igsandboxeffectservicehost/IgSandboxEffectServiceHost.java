package com.facebook.cameracore.mediapipeline.arengineservices.igsandboxeffectservicehost;

import X.0qQ;
import X.A8C;
import X.C392699vE;
import android.content.Context;
import com.facebook.cameracore.mediapipeline.arclass.benchmark.interfaces.IARClassBenchmark;
import com.facebook.cameracore.mediapipeline.arclass.common.ARClass;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHostConfig;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.PluginConfigProvider;
import com.facebook.cameracore.mediapipeline.engine.provider.ig4a.IgPluginConfigProvider;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.cameracore.mediapipeline.services.experimentconfig.interfaces.ARExperimentConfig;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkClient;
import com.facebook.jni.HybridData;
import java.util.List;

public final class IgSandboxEffectServiceHost extends EffectServiceHost {
    public static final A8C Companion = new Object();
    public static volatile boolean isLibraryLoaded;
    public final AnalyticsLogger analyticsLogger;
    public final ARExperimentConfig arExperimentConfig;
    public final NetworkClient networkClient;

    /* JADX WARNING: type inference failed for: r13v0, types: [java.lang.Object, X.B0w] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IgSandboxEffectServiceHost(android.content.Context r18, com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHostConfig r19, X.C312576ei r20, com.facebook.cameracore.mediapipeline.arclass.common.ARClass r21, X.C312546ef r22, X.AnonymousClass82L r23, X.C41794B0z r24) {
        /*
            r17 = this;
            r0 = 3
            r3 = r20
            X.0qQ.A0B(r3, r0)
            r5 = r22
            r4 = r23
            X.AnonymousClass7TG.A1S(r5, r4)
            r0 = 7
            r2 = r24
            X.0qQ.A0B(r2, r0)
            X.ARY r13 = new X.ARY
            r13.<init>()
            X.A8C r0 = Companion
            X.0wb r8 = X.0wb.A01
            r11 = r18
            r0.A00(r11)
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation.WorldTrackerV2DataProviderModule r0 = new com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation.WorldTrackerV2DataProviderModule
            r0.<init>()
            r7.add(r0)
            com.facebook.cameracore.mediapipeline.services.graphql.implementation.GraphQLServiceModule r0 = new com.facebook.cameracore.mediapipeline.services.graphql.implementation.GraphQLServiceModule
            r0.<init>()
            r7.add(r0)
            X.ARZ r1 = X.C39629A2t.A05
            X.1US r0 = X.1US.A0G
            X.ASP.A00(r1, r8, r0, r7)
            X.ARZ r1 = X.C39629A2t.A07
            X.1US r0 = X.1US.A0F
            X.ASP.A00(r1, r8, r0, r7)
            X.ARZ r1 = X.C39629A2t.A03
            X.1US r0 = X.1US.A08
            X.ASP.A00(r1, r8, r0, r7)
            X.ARZ r1 = X.C39629A2t.A01
            X.1US r0 = X.1US.A06
            X.ASP.A00(r1, r8, r0, r7)
            X.ARZ r1 = X.C39629A2t.A04
            X.1US r0 = X.1US.A0A
            X.ASP.A00(r1, r8, r0, r7)
            X.8yi r6 = X.C380939al.A03
            X.1US r1 = X.1US.A09
            X.ASP r0 = new X.ASP
            r0.<init>(r1)
            X.ARa.A00(r6, r0, r8, r7)
            X.8yi r6 = X.C380939al.A04
            X.1US r1 = X.1US.A0C
            X.ASP r0 = new X.ASP
            r0.<init>(r1)
            X.ARa.A00(r6, r0, r8, r7)
            X.ARZ r1 = X.C39629A2t.A00
            X.1US r0 = X.1US.A05
            X.ASP.A00(r1, r8, r0, r7)
            r15 = 0
            r8 = r17
            r9 = r19
            r10 = r8
            r12 = r9
            r14 = r7
            r16 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16)
            X.1YL r7 = X.AnonymousClass1YM.A00
            java.lang.Integer r6 = X.AnonymousClass05K.A0A
            r0 = 0
            long r0 = r3.BOQ(r6, r0)
            int r6 = (int) r0
            r0 = 1
            if (r6 == r0) goto L_0x00c1
            r0 = 2
            if (r6 == r0) goto L_0x00be
            X.6ej r0 = X.C312586ej.USE_DEFAULT
        L_0x0097:
            com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl r10 = new com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl
            r10.<init>(r5, r7, r0)
            r8.analyticsLogger = r10
            X.6ef r0 = r10.mCameraARAnalyticsLogger
            if (r0 == 0) goto L_0x00a5
            r0.Ek3(r4)
        L_0x00a5:
            com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common.ARExperimentConfigImpl r12 = new com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common.ARExperimentConfigImpl
            r12.<init>(r3)
            r8.arExperimentConfig = r12
            com.facebook.cameracore.mediapipeline.services.networking.implementation.NetworkClientImpl r11 = new com.facebook.cameracore.mediapipeline.services.networking.implementation.NetworkClientImpl
            r11.<init>(r2)
            r8.networkClient = r11
            java.util.List r14 = r8.mServiceModules
            r13 = r21
            com.facebook.jni.HybridData r0 = r8.initHybrid(r9, r10, r11, r12, r13, r14, r15)
            r8.mHybridData = r0
            return
        L_0x00be:
            X.6ej r0 = X.C312586ej.OVERRIDE_DISABLE_OPTIMIZED
            goto L_0x0097
        L_0x00c1:
            X.6ej r0 = X.C312586ej.OVERRIDE_ENABLE_OPTIMIZED
            goto L_0x0097
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.arengineservices.igsandboxeffectservicehost.IgSandboxEffectServiceHost.<init>(android.content.Context, com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHostConfig, X.6ei, com.facebook.cameracore.mediapipeline.arclass.common.ARClass, X.6ef, X.82L, X.B0z):void");
    }

    private final native HybridData initHybrid(EffectServiceHostConfig effectServiceHostConfig, AnalyticsLogger analyticsLogger2, NetworkClient networkClient2, ARExperimentConfig aRExperimentConfig, ARClass aRClass, List list, IARClassBenchmark iARClassBenchmark);

    public void destroy() {
        HybridData hybridData = this.arExperimentConfig.mHybridData;
        if (hybridData != null) {
            hybridData.resetNative();
        }
        AnalyticsLoggerImpl analyticsLoggerImpl = (AnalyticsLoggerImpl) this.analyticsLogger;
        analyticsLoggerImpl.mHybridData.resetNative();
        analyticsLoggerImpl.mCameraARAnalyticsLogger = null;
        HybridData hybridData2 = this.networkClient.mHybridData;
        if (hybridData2 != null) {
            hybridData2.resetNative();
        }
        super.destroy();
    }

    public AnalyticsLogger getAnalyticsLogger() {
        return this.analyticsLogger;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.cameracore.mediapipeline.arengineservices.interfaces.PluginConfigProvider, java.lang.Object] */
    public PluginConfigProvider getEnginePluginConfigProvider() {
        C392699vE r0 = IgPluginConfigProvider.Companion;
        Context context = this.mContext;
        0qQ.A06(context);
        ? obj = new Object();
        obj.mHybridData = IgPluginConfigProvider.initHybrid(context);
        return obj;
    }
}
