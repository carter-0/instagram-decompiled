package com.facebook.cameracore.mediapipeline.arengineservices.igeffectservicehost;

import X.0qQ;
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
import com.instagram.common.session.UserSession;
import java.util.List;

public class IgEffectServiceHost extends EffectServiceHost {
    public static volatile boolean sIsLibraryLoaded;
    public IARClassBenchmark mARClassBenchmark;
    public ARExperimentConfig mARExperimentConfig;
    public AnalyticsLogger mAnalyticsLogger;
    public NetworkClient mNetworkClient;
    public final UserSession mUserSession;

    private native HybridData initHybrid(EffectServiceHostConfig effectServiceHostConfig, AnalyticsLogger analyticsLogger, NetworkClient networkClient, ARExperimentConfig aRExperimentConfig, ARClass aRClass, List list, IARClassBenchmark iARClassBenchmark);

    /* JADX WARNING: type inference failed for: r13v0, types: [java.lang.Object, X.B0w] */
    /* JADX WARNING: type inference failed for: r1v12, types: [java.lang.Object, X.B0z] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IgEffectServiceHost(android.content.Context r22, com.instagram.common.session.UserSession r23, com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHostConfig r24, X.C312566eh r25, com.facebook.cameracore.mediapipeline.arclass.common.ARClass r26, X.C312546ef r27, X.AnonymousClass82L r28) {
        /*
            r21 = this;
            X.ARX r13 = new X.ARX
            r13.<init>()
            X.0wb r3 = X.0wb.A01
            java.lang.Class<com.facebook.cameracore.mediapipeline.arengineservices.igeffectservicehost.IgEffectServiceHost> r4 = com.facebook.cameracore.mediapipeline.arengineservices.igeffectservicehost.IgEffectServiceHost.class
            monitor-enter(r4)
            boolean r0 = sIsLibraryLoaded     // Catch:{ all -> 0x015b }
            r11 = r22
            if (r0 != 0) goto L_0x002e
            boolean r0 = X.0oI.A0C(r11)     // Catch:{ all -> 0x015b }
            if (r0 != 0) goto L_0x0026
            java.lang.String r1 = "caffe2_ig_ops"
            r0 = 16
            X.0dV.A0D(r1, r0)     // Catch:{ UnsatisfiedLinkError -> 0x001e }
            goto L_0x0026
        L_0x001e:
            r2 = move-exception
            java.lang.String r1 = "IgEffectServiceHost"
            java.lang.String r0 = "caffe2 ops lib soloader load error: "
            X.0KC.A0J(r1, r0, r2)     // Catch:{ all -> 0x015b }
        L_0x0026:
            java.lang.String r0 = "graphicsengine-arengineservices-igeffectservicehost-native"
            X.0dV.A0C(r0)     // Catch:{ all -> 0x015b }
            r0 = 1
            sIsLibraryLoaded = r0     // Catch:{ all -> 0x015b }
        L_0x002e:
            monitor-exit(r4)
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioServiceModule r0 = new com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioServiceModule
            r0.<init>()
            r5.add(r0)
            com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation.WorldTrackerV2DataProviderModule r0 = new com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation.WorldTrackerV2DataProviderModule
            r0.<init>()
            r5.add(r0)
            com.facebook.cameracore.mediapipeline.services.multipeer.implementation.MultipeerServiceModule r0 = new com.facebook.cameracore.mediapipeline.services.multipeer.implementation.MultipeerServiceModule
            r0.<init>()
            r5.add(r0)
            com.facebook.cameracore.mediapipeline.services.participant.implementation.ParticipantServiceModule r0 = new com.facebook.cameracore.mediapipeline.services.participant.implementation.ParticipantServiceModule
            r0.<init>()
            r5.add(r0)
            com.facebook.cameracore.mediapipeline.services.graphql.implementation.GraphQLServiceModule r0 = new com.facebook.cameracore.mediapipeline.services.graphql.implementation.GraphQLServiceModule
            r0.<init>()
            r5.add(r0)
            X.8yi r2 = X.C380939al.A03
            r4 = r23
            com.instagram.ar.core.voltron.IgArVoltronModuleLoader r1 = com.instagram.ar.core.voltron.IgArVoltronModuleLoader.getInstance(r4)
            X.1US r0 = X.1US.A09
            X.83y r0 = r1.getModuleLoader(r0)
            X.ARa.A00(r2, r0, r3, r5)
            X.8yi r2 = X.C380939al.A04
            com.instagram.ar.core.voltron.IgArVoltronModuleLoader r1 = com.instagram.ar.core.voltron.IgArVoltronModuleLoader.getInstance(r4)
            X.1US r0 = X.1US.A0C
            X.83y r0 = r1.getModuleLoader(r0)
            X.ARa.A00(r2, r0, r3, r5)
            X.ARZ r2 = X.C39629A2t.A00
            com.instagram.ar.core.voltron.IgArVoltronModuleLoader r1 = com.instagram.ar.core.voltron.IgArVoltronModuleLoader.getInstance(r4)
            X.1US r0 = X.1US.A05
            X.AnonymousClass7TG.A1E(r2, r3, r1, r0, r5)
            X.ARZ r2 = X.C39629A2t.A03
            com.instagram.ar.core.voltron.IgArVoltronModuleLoader r1 = com.instagram.ar.core.voltron.IgArVoltronModuleLoader.getInstance(r4)
            X.1US r0 = X.1US.A08
            X.AnonymousClass7TG.A1E(r2, r3, r1, r0, r5)
            X.ARZ r2 = X.C39629A2t.A04
            com.instagram.ar.core.voltron.IgArVoltronModuleLoader r1 = com.instagram.ar.core.voltron.IgArVoltronModuleLoader.getInstance(r4)
            X.1US r0 = X.1US.A0A
            X.AnonymousClass7TG.A1E(r2, r3, r1, r0, r5)
            X.ARZ r2 = X.C39629A2t.A05
            com.instagram.ar.core.voltron.IgArVoltronModuleLoader r1 = com.instagram.ar.core.voltron.IgArVoltronModuleLoader.getInstance(r4)
            X.1US r0 = X.1US.A0G
            X.AnonymousClass7TG.A1E(r2, r3, r1, r0, r5)
            X.ARZ r2 = X.C39629A2t.A07
            com.instagram.ar.core.voltron.IgArVoltronModuleLoader r1 = com.instagram.ar.core.voltron.IgArVoltronModuleLoader.getInstance(r4)
            X.1US r0 = X.1US.A0F
            X.AnonymousClass7TG.A1E(r2, r3, r1, r0, r5)
            X.ARZ r2 = X.C39629A2t.A02
            com.instagram.ar.core.voltron.IgArVoltronModuleLoader r1 = com.instagram.ar.core.voltron.IgArVoltronModuleLoader.getInstance(r4)
            X.1US r0 = X.1US.A07
            X.AnonymousClass7TG.A1E(r2, r3, r1, r0, r5)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36315297107414136(0x81049200000c78, double:3.029278348468362E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x00d5
            X.ARZ r2 = X.C39629A2t.A01
            com.instagram.ar.core.voltron.IgArVoltronModuleLoader r1 = com.instagram.ar.core.voltron.IgArVoltronModuleLoader.getInstance(r4)
            X.1US r0 = X.1US.A06
            X.AnonymousClass7TG.A1E(r2, r3, r1, r0, r5)
        L_0x00d5:
            X.ARZ r2 = X.C39629A2t.A06
            com.instagram.ar.core.voltron.IgArVoltronModuleLoader r1 = com.instagram.ar.core.voltron.IgArVoltronModuleLoader.getInstance(r4)
            X.1US r0 = X.1US.A0E
            X.AnonymousClass7TG.A1E(r2, r3, r1, r0, r5)
            r15 = 0
            r8 = r21
            r9 = r24
            r2 = r25
            r10 = r8
            r12 = r9
            r14 = r5
            r16 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r8.mUserSession = r4
            X.1YL r7 = X.AnonymousClass1YM.A00
            java.lang.Integer r5 = X.AnonymousClass05K.A0A
            r0 = 0
            long r5 = r2.BOQ(r5, r0)
            int r1 = (int) r5
            r0 = 1
            if (r1 == r0) goto L_0x0158
            r0 = 2
            if (r1 == r0) goto L_0x0155
            X.6ej r1 = X.C312586ej.USE_DEFAULT
        L_0x0104:
            com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl r0 = new com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl
            r5 = r27
            r0.<init>(r5, r7, r1)
            r8.mAnalyticsLogger = r0
            X.6ef r0 = r0.mCameraARAnalyticsLogger
            if (r0 == 0) goto L_0x0116
            r1 = r28
            r0.Ek3(r1)
        L_0x0116:
            com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common.ARExperimentConfigImpl r0 = new com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common.ARExperimentConfigImpl
            r0.<init>(r2)
            r8.mARExperimentConfig = r0
            X.Slw r1 = new X.Slw
            r1.<init>()
            com.facebook.cameracore.mediapipeline.services.networking.implementation.NetworkClientImpl r0 = new com.facebook.cameracore.mediapipeline.services.networking.implementation.NetworkClientImpl
            r0.<init>(r1)
            r8.mNetworkClient = r0
            com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger r2 = r8.mAnalyticsLogger
            com.instagram.ar.core.voltron.IgArVoltronModuleLoader r1 = com.instagram.ar.core.voltron.IgArVoltronModuleLoader.getInstance(r4)
            X.1US r0 = X.1US.A04
            X.83y r18 = r1.getModuleLoader(r0)
            com.facebook.cameracore.mediapipeline.arclass.benchmark.implementation.instagram.InstagramARClassBenchmark r15 = new com.facebook.cameracore.mediapipeline.arclass.benchmark.implementation.instagram.InstagramARClassBenchmark
            r16 = r11
            r17 = r2
            r19 = r3
            r20 = r4
            r15.<init>(r16, r17, r18, r19, r20)
            r8.mARClassBenchmark = r15
            com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger r10 = r8.mAnalyticsLogger
            com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkClient r11 = r8.mNetworkClient
            com.facebook.cameracore.mediapipeline.services.experimentconfig.interfaces.ARExperimentConfig r12 = r8.mARExperimentConfig
            java.util.List r14 = r8.mServiceModules
            r13 = r26
            com.facebook.jni.HybridData r0 = r8.initHybrid(r9, r10, r11, r12, r13, r14, r15)
            r8.mHybridData = r0
            return
        L_0x0155:
            X.6ej r1 = X.C312586ej.OVERRIDE_DISABLE_OPTIMIZED
            goto L_0x0104
        L_0x0158:
            X.6ej r1 = X.C312586ej.OVERRIDE_ENABLE_OPTIMIZED
            goto L_0x0104
        L_0x015b:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.arengineservices.igeffectservicehost.IgEffectServiceHost.<init>(android.content.Context, com.instagram.common.session.UserSession, com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHostConfig, X.6eh, com.facebook.cameracore.mediapipeline.arclass.common.ARClass, X.6ef, X.82L):void");
    }

    public AnalyticsLogger getAnalyticsLogger() {
        return this.mAnalyticsLogger;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.cameracore.mediapipeline.arengineservices.interfaces.PluginConfigProvider, java.lang.Object] */
    public PluginConfigProvider getEnginePluginConfigProvider() {
        Context context = this.mContext;
        C392699vE r0 = IgPluginConfigProvider.Companion;
        0qQ.A0B(context, 1);
        ? obj = new Object();
        obj.mHybridData = IgPluginConfigProvider.initHybrid(context);
        return obj;
    }

    public void destroy() {
        HybridData hybridData;
        super.destroy();
        HybridData hybridData2 = this.mARExperimentConfig.mHybridData;
        if (hybridData2 != null) {
            hybridData2.resetNative();
        }
        AnalyticsLogger analyticsLogger = this.mAnalyticsLogger;
        if (analyticsLogger != null) {
            AnalyticsLoggerImpl analyticsLoggerImpl = (AnalyticsLoggerImpl) analyticsLogger;
            analyticsLoggerImpl.mHybridData.resetNative();
            analyticsLoggerImpl.mCameraARAnalyticsLogger = null;
        }
        this.mAnalyticsLogger = null;
        NetworkClient networkClient = this.mNetworkClient;
        if (!(networkClient == null || (hybridData = networkClient.mHybridData) == null)) {
            hybridData.resetNative();
        }
        this.mNetworkClient = null;
    }
}
