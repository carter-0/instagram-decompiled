package X;

/* renamed from: X.8sq  reason: invalid class name and case insensitive filesystem */
public abstract class C368558sq {
    /* JADX WARNING: type inference failed for: r9v3, types: [java.lang.Object, X.8tB] */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x007e, code lost:
        if (r6 != false) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C361848gv A00(android.content.Context r27, X.AnonymousClass82L r28, com.facebook.gputimer.GPUTimerImpl r29, X.AnonymousClass82I r30, X.C312156dv r31, com.instagram.common.session.UserSession r32, int r33) {
        /*
            r0 = 0
            r10 = r27
            X.0qQ.A0B(r10, r0)
            r0 = 1
            r2 = r32
            X.0qQ.A0B(r2, r0)
            r0 = 2
            r4 = r28
            X.0qQ.A0B(r4, r0)
            r0 = 5
            r5 = r31
            X.0qQ.A0B(r5, r0)
            X.0xi r9 = X.0tS.A4E
            X.0tS r3 = r9.A00()
            X.0s0 r1 = r3.A2h
            X.0YZ[] r8 = X.0tS.A4G
            r0 = 112(0x70, float:1.57E-43)
            r0 = r8[r0]
            java.lang.Object r0 = r1.CDM(r3, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r21 = r0.booleanValue()
            X.0tS r3 = r9.A00()
            X.0s0 r1 = r3.A2i
            r0 = 105(0x69, float:1.47E-43)
            r0 = r8[r0]
            java.lang.Object r0 = r1.CDM(r3, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r7 = r0.booleanValue()
            X.0tS r3 = r9.A00()
            X.0s0 r1 = r3.A2j
            r0 = 109(0x6d, float:1.53E-43)
            r0 = r8[r0]
            java.lang.Object r0 = r1.CDM(r3, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r6 = r0.booleanValue()
            X.0tS r3 = r9.A00()
            X.0s0 r1 = r3.A0x
            r0 = 108(0x6c, float:1.51E-43)
            r0 = r8[r0]
            java.lang.Object r0 = r1.CDM(r3, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r19 = r21
            if (r7 == 0) goto L_0x0072
            r19 = r21 | 2
        L_0x0072:
            if (r6 == 0) goto L_0x0076
            r19 = r19 | 4
        L_0x0076:
            if (r0 == 0) goto L_0x0160
            X.8sr r18 = X.C368568sr.PROD_AND_DEV
        L_0x007a:
            if (r7 != 0) goto L_0x0080
            r20 = 0
            if (r6 == 0) goto L_0x0082
        L_0x0080:
            r20 = 1
        L_0x0082:
            r3 = 1
            X.8ss r17 = new X.8ss
            r22 = r21
            r17.<init>(r18, r19, r20, r21, r22)
            r19 = 30000(0x7530, float:4.2039E-41)
            r20 = 70000(0x11170, float:9.8091E-41)
            r0 = r33
            if (r0 != r3) goto L_0x0095
            r20 = 0
        L_0x0095:
            r21 = 15000(0x3a98, float:2.102E-41)
            r22 = 0
            com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfig r18 = new com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfig
            r23 = r22
            r24 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24)
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            java.util.concurrent.ScheduledExecutorService r21 = java.util.concurrent.Executors.newScheduledThreadPool(r0)
            X.6ee r12 = new X.6ee
            r12.<init>(r2)
            r9 = 0
            X.0Tu r6 = X.0Tu.A05
            r0 = 36322250659473434(0x810ae50000281a, double:3.033675802790369E-306)
            boolean r0 = X.182.A06(r6, r2, r0)
            if (r0 == 0) goto L_0x00e6
            com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.igsandbox.IgCameraARAnalyticsLoggerHost r15 = new com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.igsandbox.IgCameraARAnalyticsLoggerHost
            r15.<init>(r12)
            X.A8C r0 = com.facebook.cameracore.mediapipeline.arengineservices.igsandboxeffectservicehost.IgSandboxEffectServiceHost.Companion
            r0.A00(r10)
            java.lang.Class<com.meta.arfx.engine.instagram.InstagramAREngineService> r0 = com.meta.arfx.engine.instagram.InstagramAREngineService.class
            android.content.Intent r11 = new android.content.Intent
            r11.<init>(r10, r0)
            X.A6T r14 = new X.A6T
            r14.<init>()
            X.ARu r13 = new X.ARu
            r13.<init>(r2)
            com.facebook.cameracore.mediapipeline.services.networking.implementation.instagram.IgNetworkClientWorkerImplHost r16 = new com.facebook.cameracore.mediapipeline.services.networking.implementation.instagram.IgNetworkClientWorkerImplHost
            r16.<init>()
            X.8t4 r9 = new X.8t4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
        L_0x00e6:
            X.0nl r0 = X.C61560nl.A00()
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r0.A00
            X.0qQ.A07(r0)
            X.0qQ.A0A(r21)
            android.content.Context r24 = r10.getApplicationContext()
            X.8su r16 = new X.8su
            r23 = r16
            r25 = r18
            r26 = r4
            r27 = r12
            r28 = r2
            r23.<init>(r24, r25, r26, r27, r28)
            java.util.HashSet r19 = com.meta.arfx.engine.instagram.InstagramAREngineService.A00
            X.8t2 r14 = new X.8t2
            r15 = r10
            r18 = r9
            r20 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            X.7r4 r1 = new X.7r4
            r1.<init>((com.instagram.common.session.UserSession) r2)
            X.0nO r19 = X.0nY.A00()
            r20 = 616(0x268, float:8.63E-43)
            r21 = 3
            X.0nQ r13 = new X.0nQ
            r18 = r13
            r23 = r3
            r18.<init>(r19, r20, r21, r22, r23)
            X.8tA r12 = X.C368688tA.A00
            X.8tB r9 = new X.8tB
            r9.<init>()
            X.7rW r0 = new X.7rW
            r0.<init>(r1)
            r12.getClass()
            X.8gv r2 = new X.8gv
            r6 = r2
            r7 = r10
            r8 = r0
            r10 = r14
            r11 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            X.8t5 r1 = r14.A0B
            com.facebook.gputimer.GPUTimerImpl r0 = r1.A01
            r4 = r29
            if (r4 == r0) goto L_0x0154
            r1.A01 = r4
            if (r29 == 0) goto L_0x015e
            java.lang.String r0 = "AREngineDoFrame"
            int r0 = r4.createTimerHandle(r0)
        L_0x0152:
            r1.A00 = r0
        L_0x0154:
            X.8tP r0 = r2.A0X
            r4 = r30
            if (r30 == 0) goto L_0x016e
            java.util.Set r1 = r0.A03
            monitor-enter(r1)
            goto L_0x0164
        L_0x015e:
            r0 = -1
            goto L_0x0152
        L_0x0160:
            X.8sr r18 = X.C368568sr.PROD
            goto L_0x007a
        L_0x0164:
            r1.add(r4)     // Catch:{ all -> 0x016b }
            monitor-exit(r1)     // Catch:{ all -> 0x016b }
            r0.A01 = r3
            return r2
        L_0x016b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x016b }
            throw r0
        L_0x016e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C368558sq.A00(android.content.Context, X.82L, com.facebook.gputimer.GPUTimerImpl, X.82I, X.6dv, com.instagram.common.session.UserSession, int):X.8gv");
    }
}
