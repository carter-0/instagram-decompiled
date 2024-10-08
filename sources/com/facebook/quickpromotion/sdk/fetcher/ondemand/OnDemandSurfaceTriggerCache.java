package com.facebook.quickpromotion.sdk.fetcher.ondemand;

import X.0qQ;
import X.AnonymousClass05K;
import X.AnonymousClass42R;
import X.AnonymousClass9J8;
import X.C2595041y;
import X.C2595141z;
import com.google.common.collect.ImmutableList;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.ArrayList;

public final class OnDemandSurfaceTriggerCache {
    public ImmutableList A00 = ImmutableList.of();
    public Integer A01 = AnonymousClass05K.A00;
    public boolean A02;
    public long A03;
    public final ArrayList A04 = new ArrayList();
    public final AnonymousClass9J8 A05;
    public final C2595141z A06;
    public final AnonymousClass42R A07;
    public final String A08;

    /* JADX WARNING: type inference failed for: r8v1, types: [X.9Jf, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    public static final java.lang.Object A01(X.AnonymousClass42S r12, com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache r13, java.lang.Object r14, X.AnonymousClass4D7 r15, boolean r16) {
        /*
            r10 = r13
            r11 = r14
            r3 = r16
            r9 = 0
            r4 = r15
            boolean r0 = X.C376759Jf.A00(r9, r15)
            if (r0 == 0) goto L_0x0032
            r8 = r4
            X.9Jf r8 = (X.C376759Jf) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0032
            int r2 = r2 - r1
            r8.A00 = r2
        L_0x001a:
            java.lang.Object r6 = r8.A04
            X.1Hj r7 = X.1Hj.A02
            int r0 = r8.A00
            r2 = 1
            if (r0 == 0) goto L_0x0040
            if (r0 != r2) goto L_0x0038
            boolean r3 = r8.A05
            java.lang.Object r12 = r8.A03
            X.42S r12 = (X.AnonymousClass42S) r12
            java.lang.Object r11 = r8.A02
            java.lang.Object r10 = r8.A01
            com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache r10 = (com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache) r10
            goto L_0x006a
        L_0x0032:
            X.9Jf r8 = new X.9Jf
            r8.<init>(r13, r15, r9)
            goto L_0x001a
        L_0x0038:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0040:
            X.0eS.A00(r6)
            X.41z r0 = r13.A06     // Catch:{ all -> 0x0070 }
            X.41x r6 = r0.A02     // Catch:{ all -> 0x0070 }
            java.lang.String r1 = r13.A08     // Catch:{ all -> 0x0070 }
            X.4Cq r5 = r12.A00     // Catch:{ all -> 0x0070 }
            r0 = 0
            X.9KW r4 = new X.9KW     // Catch:{ all -> 0x0070 }
            r4.<init>(r6, r1, r0, r9)     // Catch:{ all -> 0x0070 }
            X.19B r1 = X.19B.A00     // Catch:{ all -> 0x0070 }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0070 }
            X.2Q8 r0 = X.1Eo.A01(r0, r1, r4, r5)     // Catch:{ all -> 0x0070 }
            r8.A01 = r13     // Catch:{ all -> 0x0070 }
            r8.A02 = r14     // Catch:{ all -> 0x0070 }
            r8.A03 = r12     // Catch:{ all -> 0x0070 }
            r8.A05 = r3     // Catch:{ all -> 0x0070 }
            r8.A00 = r2     // Catch:{ all -> 0x0070 }
            java.lang.Object r6 = r0.A0E(r8)     // Catch:{ all -> 0x0070 }
            if (r6 != r7) goto L_0x006d
            return r7
        L_0x006a:
            X.0eS.A00(r6)     // Catch:{ all -> 0x0070 }
        L_0x006d:
            X.9IL r6 = (X.AnonymousClass9IL) r6     // Catch:{ all -> 0x0070 }
            goto L_0x0076
        L_0x0070:
            r0 = move-exception
            X.0eQ r6 = new X.0eQ
            r6.<init>(r0)
        L_0x0076:
            java.lang.Throwable r0 = X.0eR.A00(r6)
            if (r0 == 0) goto L_0x008d
            X.41z r0 = r10.A06
            X.0Gb r5 = r0.A00
            java.lang.String r4 = "OnDemandSurfaceTriggerCache"
            java.lang.String r1 = "Error deserializing for stash key "
            java.lang.String r0 = r10.A08
            java.lang.String r0 = X.002.A0R(r1, r0)
            r5.Ew0(r4, r0)
        L_0x008d:
            boolean r0 = r6 instanceof X.0eQ
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00ab
            X.9IL r6 = (X.AnonymousClass9IL) r6
            long r0 = r6.A01
            r10.A03 = r0
            java.lang.Object r0 = r6.A02
            X.4VX r0 = (X.AnonymousClass4VX) r0
            if (r0 == 0) goto L_0x00a5
            com.google.common.collect.ImmutableList r0 = r0.E4g()
            if (r0 != 0) goto L_0x00a9
        L_0x00a5:
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
        L_0x00a9:
            r10.A00 = r0
        L_0x00ab:
            monitor-enter(r10)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x00f6 }
            r10.A01 = r0     // Catch:{ all -> 0x00f6 }
            r0 = 0
            if (r3 == 0) goto L_0x00b4
            r0 = 1
        L_0x00b4:
            boolean r0 = A02(r10, r0)     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x00d1
            r10.A02 = r2     // Catch:{ all -> 0x00f6 }
            X.4Cq r2 = r12.A00     // Catch:{ all -> 0x00f6 }
            r13 = 0
            r15 = 0
            if (r3 == 0) goto L_0x00c3
            r15 = 1
        L_0x00c3:
            r14 = 2
            X.9KI r9 = new X.9KI     // Catch:{ all -> 0x00f6 }
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x00f6 }
            X.19B r1 = X.19B.A00     // Catch:{ all -> 0x00f6 }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x00f6 }
            X.1Eo.A03(r0, r1, r9, r2)     // Catch:{ all -> 0x00f6 }
            goto L_0x00f2
        L_0x00d1:
            java.util.ArrayList r3 = r10.A04     // Catch:{ all -> 0x00f6 }
            java.util.Iterator r2 = r3.iterator()     // Catch:{ all -> 0x00f6 }
            X.0qQ.A07(r2)     // Catch:{ all -> 0x00f6 }
        L_0x00da:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x00ef
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x00f6 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x00f6 }
            X.3Ns r1 = (X.C241063Ns) r1     // Catch:{ all -> 0x00f6 }
            com.google.common.collect.ImmutableList r0 = r10.A00     // Catch:{ all -> 0x00f6 }
            r1.A0K(r0)     // Catch:{ all -> 0x00f6 }
            goto L_0x00da
        L_0x00ef:
            r3.clear()     // Catch:{ all -> 0x00f6 }
        L_0x00f2:
            monitor-exit(r10)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x00f6:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache.A01(X.42S, com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache, java.lang.Object, X.4D7, boolean):java.lang.Object");
    }

    public static final boolean A02(OnDemandSurfaceTriggerCache onDemandSurfaceTriggerCache, boolean z) {
        long j;
        if (z) {
            return true;
        }
        long j2 = onDemandSurfaceTriggerCache.A03;
        if (j2 == 0) {
            return true;
        }
        long now = onDemandSurfaceTriggerCache.A06.A01.now();
        String str = onDemandSurfaceTriggerCache.A05.A02;
        0qQ.A0B(str, 0);
        if (str.equals(String.valueOf(QuickPromotionSurface.A0B.A00))) {
            j = C2595041y.A01;
        } else {
            j = C2595041y.A00;
        }
        return now > j2 + j;
    }

    /* JADX WARNING: type inference failed for: r14v1, types: [X.9Je, X.4D7] */
    /* JADX WARNING: type inference failed for: r14v4 */
    /* JADX WARNING: type inference failed for: r14v5 */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0174  */
    public static final java.lang.Object A00(X.AnonymousClass42S r16, com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache r17, java.lang.Object r18, X.AnonymousClass4D7 r19, boolean r20) {
        /*
            r10 = r18
            r9 = r16
            r2 = r17
            r3 = 0
            r5 = r19
            boolean r0 = r5 instanceof X.C376749Je
            if (r0 == 0) goto L_0x0015
            r0 = r5
            X.9Je r0 = (X.C376749Je) r0
            int r1 = r0.A06
            r0 = 1
            if (r1 == r3) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x003e
            r14 = r5
            X.9Je r14 = (X.C376749Je) r14
            int r4 = r14.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r1
            if (r0 == 0) goto L_0x003e
            int r4 = r4 - r1
            r14.A00 = r4
        L_0x0026:
            java.lang.Object r6 = r14.A05
            X.1Hj r4 = X.1Hj.A02
            int r0 = r14.A00
            r5 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0056
            if (r0 == r1) goto L_0x004c
            if (r0 != r5) goto L_0x0044
            long r0 = r14.A01
            java.lang.Object r7 = r14.A03
            java.lang.Object r2 = r14.A02
            com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache r2 = (com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache) r2
            goto L_0x0160
        L_0x003e:
            X.9Je r14 = new X.9Je
            r14.<init>(r2, r5, r3)
            goto L_0x0026
        L_0x0044:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x004c:
            java.lang.Object r9 = r14.A03
            X.42S r9 = (X.AnonymousClass42S) r9
            java.lang.Object r2 = r14.A02
            com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache r2 = (com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache) r2
            goto L_0x00dc
        L_0x0056:
            X.0eS.A00(r6)
            X.41z r0 = r2.A06     // Catch:{ all -> 0x00ec }
            com.instagram.quickpromotion.sdk.IGOnDemandFetcher r12 = r0.A04     // Catch:{ all -> 0x00ec }
            X.9J8 r8 = r2.A05     // Catch:{ all -> 0x00ec }
            X.42R r13 = r2.A07     // Catch:{ all -> 0x00ec }
            r16 = 0
            if (r20 == 0) goto L_0x0067
            r16 = 1
        L_0x0067:
            r14.A02 = r2     // Catch:{ all -> 0x00ec }
            r14.A03 = r9     // Catch:{ all -> 0x00ec }
            r14.A00 = r1     // Catch:{ all -> 0x00ec }
            com.instagram.common.session.UserSession r10 = (com.instagram.common.session.UserSession) r10     // Catch:{ all -> 0x00ec }
            java.lang.String r1 = "Unknown surface id"
            java.lang.String r6 = "igsdk_starts_execution"
            X.4Vt r0 = new X.4Vt     // Catch:{ all -> 0x00ec }
            r0.<init>(r8, r6)     // Catch:{ all -> 0x00ec }
            X.0sP r15 = r12.A00     // Catch:{ all -> 0x00ec }
            r15.invoke(r0)     // Catch:{ all -> 0x00ec }
            com.instagram.quickpromotion.intf.QuickPromotionSurface r0 = com.instagram.quickpromotion.intf.QuickPromotionSurface.A06     // Catch:{ all -> 0x00a1 }
            java.lang.String r0 = r8.A02     // Catch:{ all -> 0x00a1 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x00a1 }
            java.util.Map r6 = com.instagram.quickpromotion.intf.QuickPromotionSurface.A02     // Catch:{ all -> 0x00a1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00a1 }
            java.lang.Object r11 = r6.get(r0)     // Catch:{ all -> 0x00a1 }
            com.instagram.quickpromotion.intf.QuickPromotionSurface r11 = (com.instagram.quickpromotion.intf.QuickPromotionSurface) r11     // Catch:{ all -> 0x00a1 }
            if (r11 != 0) goto L_0x00a7
            X.4Vv r0 = new X.4Vv     // Catch:{ all -> 0x00a1 }
            r0.<init>(r8, r1)     // Catch:{ all -> 0x00a1 }
            r15.invoke(r0)     // Catch:{ all -> 0x00a1 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00a1 }
            r0.<init>(r1)     // Catch:{ all -> 0x00a1 }
            throw r0     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            r0 = move-exception
            X.0eQ r11 = new X.0eQ     // Catch:{ all -> 0x00ec }
            r11.<init>(r0)     // Catch:{ all -> 0x00ec }
        L_0x00a7:
            java.lang.Throwable r6 = X.0eR.A00(r11)     // Catch:{ all -> 0x00ec }
            if (r6 == 0) goto L_0x00cd
            java.lang.String r1 = "Invalid surface id "
            java.lang.String r0 = r8.A02     // Catch:{ all -> 0x00ec }
            java.lang.String r1 = X.002.A0R(r1, r0)     // Catch:{ all -> 0x00ec }
            X.4Vv r0 = new X.4Vv     // Catch:{ all -> 0x00ec }
            r0.<init>(r8, r1)     // Catch:{ all -> 0x00ec }
            r15.invoke(r0)     // Catch:{ all -> 0x00ec }
            java.lang.String r0 = "IGOnDemandFetcher"
            X.0KC.A0F(r0, r1, r6)     // Catch:{ all -> 0x00ec }
            java.lang.Integer r7 = X.AnonymousClass05K.A1F     // Catch:{ all -> 0x00ec }
            java.lang.String r0 = "IGOnDemandFetcher:"
            java.lang.String r0 = X.002.A0R(r0, r1)     // Catch:{ all -> 0x00ec }
            X.C46436Dey.A00(r10, r7, r0, r6)     // Catch:{ all -> 0x00ec }
        L_0x00cd:
            boolean r0 = r11 instanceof X.0eQ     // Catch:{ all -> 0x00ec }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00e3
            com.instagram.quickpromotion.intf.QuickPromotionSurface r11 = (com.instagram.quickpromotion.intf.QuickPromotionSurface) r11     // Catch:{ all -> 0x00ec }
            java.lang.Object r6 = com.instagram.quickpromotion.sdk.IGOnDemandFetcher.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x00ec }
            if (r6 != r4) goto L_0x00df
            return r4
        L_0x00dc:
            X.0eS.A00(r6)     // Catch:{ all -> 0x00ec }
        L_0x00df:
            X.4VX r6 = (X.AnonymousClass4VX) r6     // Catch:{ all -> 0x00ec }
            r7 = r6
            goto L_0x00f2
        L_0x00e3:
            X.0eS.A00(r11)     // Catch:{ all -> 0x00ec }
            X.MCr r0 = new X.MCr     // Catch:{ all -> 0x00ec }
            r0.<init>()     // Catch:{ all -> 0x00ec }
            throw r0     // Catch:{ all -> 0x00ec }
        L_0x00ec:
            r0 = move-exception
            X.0eQ r7 = new X.0eQ
            r7.<init>(r0)
        L_0x00f2:
            java.lang.Throwable r8 = X.0eR.A00(r7)
            if (r8 == 0) goto L_0x0117
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Error fetching promotions for "
            r1.append(r0)
            X.9J8 r0 = r2.A05
            r1.append(r0)
            java.lang.String r6 = r1.toString()
            java.lang.String r1 = "OnDemandSurfaceTriggerCache"
            X.0KC.A0F(r1, r6, r8)
            X.41z r0 = r2.A06
            X.0Gb r0 = r0.A00
            r0.Ew2(r1, r6, r8)
        L_0x0117:
            boolean r0 = r7 instanceof X.0eQ
            r6 = r0 ^ 1
            if (r6 == 0) goto L_0x0128
            X.41z r0 = r2.A06
            X.0JP r0 = r0.A01
            long r0 = r0.now()
        L_0x0125:
            if (r6 == 0) goto L_0x017f
            goto L_0x012b
        L_0x0128:
            long r0 = r2.A03
            goto L_0x0125
        L_0x012b:
            X.41z r6 = r2.A06     // Catch:{ all -> 0x0168 }
            X.41x r10 = r6.A02     // Catch:{ all -> 0x0168 }
            java.lang.String r8 = r2.A08     // Catch:{ all -> 0x0168 }
            X.9IL r6 = new X.9IL     // Catch:{ all -> 0x0168 }
            r6.<init>(r0, r7, r3)     // Catch:{ all -> 0x0168 }
            X.4Cq r9 = r9.A00     // Catch:{ all -> 0x0168 }
            r19 = 0
            X.9KY r15 = new X.9KY     // Catch:{ all -> 0x0168 }
            r18 = r8
            r20 = r3
            r16 = r10
            r17 = r6
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0168 }
            X.19B r8 = X.19B.A00     // Catch:{ all -> 0x0168 }
            java.lang.Integer r6 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0168 }
            X.2Q8 r6 = X.1Eo.A01(r6, r8, r15, r9)     // Catch:{ all -> 0x0168 }
            r14.A02 = r2     // Catch:{ all -> 0x0168 }
            r14.A03 = r7     // Catch:{ all -> 0x0168 }
            r14.A04 = r7     // Catch:{ all -> 0x0168 }
            r14.A01 = r0     // Catch:{ all -> 0x0168 }
            r14.A00 = r5     // Catch:{ all -> 0x0168 }
            java.lang.Object r5 = r6.CfH(r14)     // Catch:{ all -> 0x0168 }
            if (r5 != r4) goto L_0x0163
            return r4
        L_0x0160:
            X.0eS.A00(r6)     // Catch:{ all -> 0x0166 }
        L_0x0163:
            X.0gF r4 = X.C60340gF.A00     // Catch:{ all -> 0x0166 }
            goto L_0x016e
        L_0x0166:
            r5 = move-exception
            goto L_0x0169
        L_0x0168:
            r5 = move-exception
        L_0x0169:
            X.0eQ r4 = new X.0eQ
            r4.<init>(r5)
        L_0x016e:
            java.lang.Throwable r8 = X.0eR.A00(r4)
            if (r8 == 0) goto L_0x017f
            X.41z r4 = r2.A06
            X.0Gb r6 = r4.A00
            java.lang.String r5 = "OnDemandSurfaceTriggerCache"
            java.lang.String r4 = "Error serializing fetched promotions"
            r6.Ew2(r5, r4, r8)
        L_0x017f:
            monitor-enter(r2)
            r2.A03 = r0     // Catch:{ all -> 0x01be }
            boolean r0 = r7 instanceof X.0eQ     // Catch:{ all -> 0x01be }
            if (r0 == 0) goto L_0x0187
            r7 = 0
        L_0x0187:
            X.4VX r7 = (X.AnonymousClass4VX) r7     // Catch:{ all -> 0x01be }
            if (r7 == 0) goto L_0x0191
            com.google.common.collect.ImmutableList r0 = r7.E4g()     // Catch:{ all -> 0x01be }
            if (r0 != 0) goto L_0x0195
        L_0x0191:
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()     // Catch:{ all -> 0x01be }
        L_0x0195:
            r2.A00 = r0     // Catch:{ all -> 0x01be }
            java.util.ArrayList r5 = r2.A04     // Catch:{ all -> 0x01be }
            java.util.Iterator r4 = r5.iterator()     // Catch:{ all -> 0x01be }
            X.0qQ.A07(r4)     // Catch:{ all -> 0x01be }
        L_0x01a0:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x01be }
            if (r0 == 0) goto L_0x01b5
            java.lang.Object r1 = r4.next()     // Catch:{ all -> 0x01be }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x01be }
            X.3Ns r1 = (X.C241063Ns) r1     // Catch:{ all -> 0x01be }
            com.google.common.collect.ImmutableList r0 = r2.A00     // Catch:{ all -> 0x01be }
            r1.A0K(r0)     // Catch:{ all -> 0x01be }
            goto L_0x01a0
        L_0x01b5:
            r5.clear()     // Catch:{ all -> 0x01be }
            r2.A02 = r3     // Catch:{ all -> 0x01be }
            X.0gF r0 = X.C60340gF.A00     // Catch:{ all -> 0x01be }
            monitor-exit(r2)
            return r0
        L_0x01be:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache.A00(X.42S, com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache, java.lang.Object, X.4D7, boolean):java.lang.Object");
    }

    public OnDemandSurfaceTriggerCache(AnonymousClass9J8 r2, C2595141z r3, AnonymousClass42R r4, String str) {
        this.A05 = r2;
        this.A07 = r4;
        this.A06 = r3;
        this.A08 = str;
    }
}
