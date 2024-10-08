package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class S1l {
    public final Context A00;
    public final UserSession A01;
    public volatile C10742RxL A02;

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized X.C10742RxL A00() {
        /*
            r22 = this;
            r3 = r22
            monitor-enter(r3)
            X.RxL r0 = r3.A02     // Catch:{ all -> 0x01b1 }
            if (r0 == 0) goto L_0x000b
            X.RxL r0 = r3.A02     // Catch:{ all -> 0x01b1 }
            goto L_0x01af
        L_0x000b:
            android.content.Context r12 = r3.A00     // Catch:{ Exception -> 0x01a5 }
            com.instagram.common.session.UserSession r4 = r3.A01     // Catch:{ Exception -> 0x01a5 }
            X.AnonymousClass7TG.A1N(r12, r4)     // Catch:{ Exception -> 0x01a5 }
            java.lang.Class<X.S3J> r2 = X.S3J.class
            r1 = 2
            X.TVw r0 = new X.TVw     // Catch:{ Exception -> 0x01a5 }
            r0.<init>(r1, r12, r4)     // Catch:{ Exception -> 0x01a5 }
            java.lang.Object r5 = r4.A01(r2, r0)     // Catch:{ Exception -> 0x01a5 }
            X.S3J r5 = (X.S3J) r5     // Catch:{ Exception -> 0x01a5 }
            r7 = 0
            X.0qQ.A0B(r12, r7)     // Catch:{ Exception -> 0x01a5 }
            java.util.List r1 = r5.A06     // Catch:{ Exception -> 0x01a5 }
            java.util.List r0 = r5.A05     // Catch:{ Exception -> 0x01a5 }
            java.util.ArrayList r0 = X.00k.A0S(r0, r1)     // Catch:{ Exception -> 0x01a5 }
            java.util.HashMap r13 = X.AnonymousClass7TE.A1E()     // Catch:{ Exception -> 0x01a5 }
            r6 = 4
            com.google.common.collect.ImmutableMap$Builder r4 = new com.google.common.collect.ImmutableMap$Builder     // Catch:{ Exception -> 0x01a5 }
            r4.<init>(r6)     // Catch:{ Exception -> 0x01a5 }
            android.os.Bundle r14 = X.AnonymousClass7TE.A0a()     // Catch:{ Exception -> 0x01a5 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ Exception -> 0x01a5 }
        L_0x003e:
            boolean r0 = r11.hasNext()     // Catch:{ Exception -> 0x01a5 }
            if (r0 == 0) goto L_0x0090
            java.lang.Object r10 = r11.next()     // Catch:{ Exception -> 0x01a5 }
            X.Rw8 r10 = (X.C10673Rw8) r10     // Catch:{ Exception -> 0x01a5 }
            java.lang.String r2 = "batch_mldw_falco_executor"
            java.lang.Class<com.facebook.papaya.fb.instagram.executors.mldwfalco.IgAnalyticsMldwFalcoExecutorFactory> r0 = com.facebook.papaya.fb.instagram.executors.mldwfalco.IgAnalyticsMldwFalcoExecutorFactory.class
            r13.put(r2, r0)     // Catch:{ Exception -> 0x01a5 }
            java.util.HashMap r8 = X.AnonymousClass7TE.A1E()     // Catch:{ Exception -> 0x01a5 }
            X.RFV r9 = X.RFV.DEVICE_IDLE_REQUIRED     // Catch:{ Exception -> 0x01a5 }
            boolean r0 = r10.A02     // Catch:{ Exception -> 0x01a5 }
            long r0 = X.G9t.A0k(r0)
            X.Pxe.A1X(r9, r8, r0)     // Catch:{ Exception -> 0x01a5 }
            X.RFV r9 = X.RFV.EXTERNAL_POWER_REQUIRED     // Catch:{ Exception -> 0x01a5 }
            boolean r0 = r10.A01     // Catch:{ Exception -> 0x01a5 }
            long r0 = X.G9t.A0k(r0)
            X.Pxe.A1X(r9, r8, r0)     // Catch:{ Exception -> 0x01a5 }
            X.RFV r9 = X.RFV.WIFI_REQUIRED     // Catch:{ Exception -> 0x01a5 }
            boolean r0 = r10.A03     // Catch:{ Exception -> 0x01a5 }
            long r0 = X.G9t.A0k(r0)
            X.Pxe.A1X(r9, r8, r0)     // Catch:{ Exception -> 0x01a5 }
            com.facebook.papaya.client.type.PapayaRestrictions r1 = new com.facebook.papaya.client.type.PapayaRestrictions     // Catch:{ Exception -> 0x01a5 }
            r1.<init>()     // Catch:{ Exception -> 0x01a5 }
            java.util.Map r0 = r1.A00     // Catch:{ Exception -> 0x01a5 }
            r0.putAll(r8)     // Catch:{ Exception -> 0x01a5 }
            r4.put(r2, r1)     // Catch:{ Exception -> 0x01a5 }
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()     // Catch:{ Exception -> 0x01a5 }
            java.lang.String r0 = "enforce_secure_aggregation"
            r1.putBoolean(r0, r7)     // Catch:{ Exception -> 0x01a5 }
            r14.putBundle(r2, r1)     // Catch:{ Exception -> 0x01a5 }
            goto L_0x003e
        L_0x0090:
            com.google.common.collect.ImmutableMap r15 = r4.build()     // Catch:{ Exception -> 0x01a5 }
            X.0qQ.A07(r15)     // Catch:{ Exception -> 0x01a5 }
            X.1R1 r2 = new X.1R1     // Catch:{ Exception -> 0x01a5 }
            r2.<init>()     // Catch:{ Exception -> 0x01a5 }
            com.instagram.common.session.UserSession r7 = r5.A02     // Catch:{ Exception -> 0x01a5 }
            X.0Tu r4 = X.0Tu.A05     // Catch:{ Exception -> 0x01a5 }
            r0 = 36878530530902208(0x8304d4002200c0, double:3.385469433441176E-306)
            java.lang.String r1 = X.182.A04(r4, r7, r0)     // Catch:{ Exception -> 0x01a5 }
            int r0 = r1.length()     // Catch:{ Exception -> 0x01a5 }
            if (r0 == 0) goto L_0x00b2
            r2.A04(r1)     // Catch:{ Exception -> 0x01a5 }
        L_0x00b2:
            r0 = 36893391116174293(0x831258000a03d5, double:3.394867327406016E-306)
            java.lang.String r1 = X.182.A04(r4, r7, r0)     // Catch:{ Exception -> 0x01a5 }
            int r0 = r1.length()     // Catch:{ Exception -> 0x01a5 }
            if (r0 == 0) goto L_0x00c4
            r2.A04(r1)     // Catch:{ Exception -> 0x01a5 }
        L_0x00c4:
            r0 = 36893391116108756(0x831258000903d4, double:3.39486732736457E-306)
            java.lang.String r1 = X.182.A04(r4, r7, r0)     // Catch:{ Exception -> 0x01a5 }
            int r0 = r1.length()     // Catch:{ Exception -> 0x01a5 }
            if (r0 == 0) goto L_0x00d6
            r2.A04(r1)     // Catch:{ Exception -> 0x01a5 }
        L_0x00d6:
            com.google.common.collect.ImmutableSet r19 = r2.A05()     // Catch:{ Exception -> 0x01a5 }
            X.0qQ.A07(r19)     // Catch:{ Exception -> 0x01a5 }
            X.0sn r16 = X.0sn.A00     // Catch:{ Exception -> 0x01a5 }
            com.facebook.papaya.client.transport.ITransport r0 = r5.A00     // Catch:{ Exception -> 0x01a5 }
            r18 = 0
            com.facebook.papaya.client.engine.impl.EngineFactory r11 = new com.facebook.papaya.client.engine.impl.EngineFactory     // Catch:{ Exception -> 0x01a5 }
            r17 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x01a5 }
            java.lang.String r0 = "federated"
            com.google.common.collect.ImmutableMap r18 = com.google.common.collect.ImmutableMap.of(r0, r11)     // Catch:{ Exception -> 0x01a5 }
            X.Rxw r4 = r5.A01     // Catch:{ Exception -> 0x01a5 }
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()     // Catch:{ Exception -> 0x01a5 }
            X.RFV r7 = X.RFV.MAX_EXECUTION_TIME_PER_DAY_SEC     // Catch:{ Exception -> 0x01a5 }
            long r0 = r4.A00     // Catch:{ Exception -> 0x01a5 }
            X.Pxe.A1X(r7, r2, r0)     // Catch:{ Exception -> 0x01a5 }
            X.RFV r7 = X.RFV.MAX_EXECUTION_TIME_SEC     // Catch:{ Exception -> 0x01a5 }
            long r0 = r4.A01     // Catch:{ Exception -> 0x01a5 }
            X.Pxe.A1X(r7, r2, r0)     // Catch:{ Exception -> 0x01a5 }
            X.RFV r9 = X.RFV.MAX_NETWORK_CONSUMPTION_PER_DAY_BYTES     // Catch:{ Exception -> 0x01a5 }
            long r0 = r4.A02     // Catch:{ Exception -> 0x01a5 }
            r7 = 1048576(0x100000, double:5.180654E-318)
            long r0 = r0 * r7
            X.Pxe.A1X(r9, r2, r0)     // Catch:{ Exception -> 0x01a5 }
            X.RFV r7 = X.RFV.DEVICE_IDLE_REQUIRED     // Catch:{ Exception -> 0x01a5 }
            boolean r0 = r4.A03     // Catch:{ Exception -> 0x01a5 }
            long r0 = X.G9t.A0k(r0)
            X.Pxe.A1X(r7, r2, r0)     // Catch:{ Exception -> 0x01a5 }
            X.RFV r7 = X.RFV.WIFI_REQUIRED     // Catch:{ Exception -> 0x01a5 }
            boolean r0 = r4.A04     // Catch:{ Exception -> 0x01a5 }
            long r0 = X.G9t.A0k(r0)
            X.Pxe.A1X(r7, r2, r0)     // Catch:{ Exception -> 0x01a5 }
            X.RFV r7 = X.RFV.EXTERNAL_POWER_REQUIRED     // Catch:{ Exception -> 0x01a5 }
            boolean r0 = r4.A05     // Catch:{ Exception -> 0x01a5 }
            long r0 = X.G9t.A0k(r0)
            X.Pxe.A1X(r7, r2, r0)     // Catch:{ Exception -> 0x01a5 }
            com.facebook.papaya.client.type.PapayaRestrictions r4 = new com.facebook.papaya.client.type.PapayaRestrictions     // Catch:{ Exception -> 0x01a5 }
            r4.<init>()     // Catch:{ Exception -> 0x01a5 }
            java.util.Map r0 = r4.A00     // Catch:{ Exception -> 0x01a5 }
            r0.putAll(r2)     // Catch:{ Exception -> 0x01a5 }
            java.lang.Class<com.facebook.papaya.fb.instagram.papaya.PapayaExecutionJobService> r0 = com.facebook.papaya.fb.instagram.papaya.PapayaExecutionJobService.class
            android.content.ComponentName r15 = new android.content.ComponentName     // Catch:{ Exception -> 0x01a5 }
            r15.<init>(r12, r0)     // Catch:{ Exception -> 0x01a5 }
            X.RFG r17 = X.RFG.INFO     // Catch:{ Exception -> 0x01a5 }
            java.lang.String r1 = r5.A03     // Catch:{ Exception -> 0x01a5 }
            java.lang.String r0 = r5.A04     // Catch:{ Exception -> 0x01a5 }
            X.RyE r14 = new X.RyE     // Catch:{ Exception -> 0x01a5 }
            r20 = r1
            r21 = r0
            r16 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x01a5 }
            X.RxL r0 = new X.RxL     // Catch:{ Exception -> 0x01a5 }
            r0.<init>(r12, r14)     // Catch:{ Exception -> 0x01a5 }
            r3.A02 = r0     // Catch:{ Exception -> 0x01a5 }
            com.google.common.collect.ImmutableMap$Builder r0 = new com.google.common.collect.ImmutableMap$Builder     // Catch:{ Exception -> 0x01a5 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x01a5 }
            com.google.common.collect.ImmutableMap r0 = r0.build()     // Catch:{ Exception -> 0x01a5 }
            X.0qQ.A07(r0)     // Catch:{ Exception -> 0x01a5 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ Exception -> 0x01a5 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ Exception -> 0x01a5 }
        L_0x016d:
            boolean r0 = r6.hasNext()     // Catch:{ Exception -> 0x01a5 }
            if (r0 == 0) goto L_0x0192
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r6)     // Catch:{ Exception -> 0x01a5 }
            java.lang.String r4 = X.DbT.A13(r0)     // Catch:{ Exception -> 0x01a5 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ Exception -> 0x01a5 }
            com.facebook.papaya.log.LogSink r1 = (com.facebook.papaya.log.LogSink) r1     // Catch:{ Exception -> 0x01a5 }
            X.RxL r0 = r3.A02     // Catch:{ Exception -> 0x01a5 }
            if (r0 == 0) goto L_0x016d
            X.QY4 r2 = r0.A02     // Catch:{ Exception -> 0x01a5 }
            monitor-enter(r2)     // Catch:{ Exception -> 0x01a5 }
            java.util.Map r0 = r2.A00     // Catch:{ all -> 0x018f }
            r0.put(r4, r1)     // Catch:{ all -> 0x018f }
            monitor-exit(r2)     // Catch:{ Exception -> 0x01a5 }
            goto L_0x016d
        L_0x018f:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ Exception -> 0x01a5 }
            goto L_0x01a4
        L_0x0192:
            X.RxL r0 = r3.A02     // Catch:{ Exception -> 0x01a5 }
            if (r0 == 0) goto L_0x01ad
            X.SoR r1 = new X.SoR     // Catch:{ Exception -> 0x01a5 }
            r1.<init>(r5, r3)     // Catch:{ Exception -> 0x01a5 }
            X.SoQ r0 = r0.A01     // Catch:{ Exception -> 0x01a5 }
            monitor-enter(r0)     // Catch:{ Exception -> 0x01a5 }
            r0.A00 = r1     // Catch:{ all -> 0x01a2 }
            monitor-exit(r0)     // Catch:{ Exception -> 0x01a5 }
            goto L_0x01ad
        L_0x01a2:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ Exception -> 0x01a5 }
        L_0x01a4:
            throw r1     // Catch:{ Exception -> 0x01a5 }
        L_0x01a5:
            r2 = move-exception
            java.lang.String r1 = "IgPapayaManager"
            java.lang.String r0 = "Failed to create papaya"
            X.0KC.A0F(r1, r0, r2)     // Catch:{ all -> 0x01b1 }
        L_0x01ad:
            X.RxL r0 = r3.A02     // Catch:{ all -> 0x01b1 }
        L_0x01af:
            monitor-exit(r3)
            return r0
        L_0x01b1:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S1l.A00():X.RxL");
    }

    public S1l(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
