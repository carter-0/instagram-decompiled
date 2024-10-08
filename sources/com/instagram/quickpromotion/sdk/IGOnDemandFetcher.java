package com.instagram.quickpromotion.sdk;

import X.0qQ;
import X.0sP;
import X.C2594641u;
import android.content.Context;

public final class IGOnDemandFetcher {
    public final 0sP A00;
    public final Context A01;
    public final C2594641u A02;
    public final boolean A03;

    public IGOnDemandFetcher(Context context, 0sP r3, boolean z) {
        0qQ.A0B(r3, 3);
        this.A01 = context;
        this.A03 = z;
        this.A00 = r3;
        this.A02 = new C2594641u(context);
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [X.4Vw, X.4D7] */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01d7, code lost:
        if (r4.A05.contains(r12) != false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0200, code lost:
        if (r16 == false) goto L_0x0203;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.AnonymousClass9J8 r15, X.AnonymousClass42S r16, com.instagram.common.session.UserSession r17, com.instagram.quickpromotion.intf.QuickPromotionSurface r18, com.instagram.quickpromotion.sdk.IGOnDemandFetcher r19, X.AnonymousClass42R r20, X.AnonymousClass4D7 r21, X.0sP r22, boolean r23) {
        /*
            r3 = r21
            r4 = r19
            r5 = r15
            boolean r0 = r3 instanceof X.C265714Vw
            if (r0 == 0) goto L_0x0175
            r9 = r3
            X.4Vw r9 = (X.C265714Vw) r9
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0175
            int r2 = r2 - r1
            r9.A00 = r2
        L_0x0017:
            java.lang.Object r1 = r9.A07
            X.1Hj r7 = X.1Hj.A02
            int r0 = r9.A00
            r6 = 2
            r12 = 1
            if (r0 == 0) goto L_0x0045
            if (r0 == r12) goto L_0x0247
            if (r0 != r6) goto L_0x018e
            java.lang.Object r5 = r9.A02
            X.9J8 r5 = (X.AnonymousClass9J8) r5
            java.lang.Object r4 = r9.A01
            com.instagram.quickpromotion.sdk.IGOnDemandFetcher r4 = (com.instagram.quickpromotion.sdk.IGOnDemandFetcher) r4
            X.0eS.A00(r1)
        L_0x0030:
            X.5Jv r1 = (X.C283915Jv) r1
            java.lang.String r3 = r1.A01
            X.4W5 r2 = r1.A00
            if (r2 == 0) goto L_0x017c
            java.lang.String r0 = "62c196cc283670265c8243af7482f62f8856499ba6f7f01c5067e75d05225969"
            X.JV7 r1 = new X.JV7
            r1.<init>((X.AnonymousClass4W5) r2, (java.lang.String) r3, (java.lang.String) r0)
            X.AVG r0 = new X.AVG
            r0.<init>(r1)
            return r0
        L_0x0045:
            X.0eS.A00(r1)
            boolean r0 = r4.A03
            r10 = r17
            r3 = r18
            r8 = r20
            if (r0 == 0) goto L_0x010d
            java.lang.String r0 = "using_slot_fetching"
            X.4Vt r1 = new X.4Vt
            r1.<init>(r15, r0)
            X.0sP r0 = r4.A00
            r0.invoke(r1)
            java.lang.Object r2 = r15.A01
            com.instagram.quickpromotion.intf.Trigger r2 = (com.instagram.quickpromotion.intf.Trigger) r2
            java.util.Map r0 = X.AnonymousClass2kY.A01
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.0qQ.A0B(r2, r12)
            java.util.Map r1 = X.AnonymousClass2kY.A01
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r15 = r1.iterator()
        L_0x0075:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x0098
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r14 = r1.getKey()
            com.instagram.quickpromotion.intf.QuickPromotionSlot r14 = (com.instagram.quickpromotion.intf.QuickPromotionSlot) r14
            java.lang.Object r11 = r1.getValue()
            java.util.List r11 = (java.util.List) r11
            boolean r1 = r11 instanceof java.util.Collection
            if (r1 == 0) goto L_0x009a
            boolean r1 = r11.isEmpty()
            if (r1 == 0) goto L_0x009a
            goto L_0x0075
        L_0x0098:
            r14 = 0
            goto L_0x00b6
        L_0x009a:
            java.util.Iterator r13 = r11.iterator()
        L_0x009e:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x0075
            java.lang.Object r11 = r13.next()
            X.2ka r11 = (X.C227972ka) r11
            com.instagram.quickpromotion.intf.QuickPromotionSurface r1 = r11.A00
            if (r1 != r3) goto L_0x009e
            java.util.EnumSet r1 = r11.A01
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x009e
        L_0x00b6:
            if (r14 == 0) goto L_0x024e
            X.41u r1 = r4.A02
            X.0qQ.A0B(r10, r0)
            X.9IV r13 = new X.9IV
            r13.<init>((com.instagram.common.session.UserSession) r10, (com.instagram.quickpromotion.intf.QuickPromotionSlot) r14)
            java.util.Map r11 = r1.A01
            java.lang.Object r4 = r11.get(r13)
            if (r4 != 0) goto L_0x00d4
            android.content.Context r1 = r1.A00
            com.instagram.quickpromotion.sdk.IGSlotFetcher r4 = new com.instagram.quickpromotion.sdk.IGSlotFetcher
            r4.<init>(r1, r10, r14)
            r11.put(r13, r4)
        L_0x00d4:
            com.instagram.quickpromotion.sdk.IGSlotFetcher r4 = (com.instagram.quickpromotion.sdk.IGSlotFetcher) r4
            r9.A01 = r5
            r9.A02 = r8
            r11 = r16
            r9.A03 = r11
            r9.A04 = r3
            r10 = r22
            r9.A05 = r10
            r9.A06 = r4
            r9.A00 = r12
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = X.C241503Pl.A01
            X.4D7 r1 = X.1Ey.A02(r9)
            X.3Pl r9 = new X.3Pl
            r9.<init>(r1)
            X.4Vz r12 = new X.4Vz
            r12.<init>(r9)
            X.0qQ.A0B(r8, r6)
            r1 = 5
            X.0qQ.A0B(r11, r1)
            r1 = 6
            X.0qQ.A0B(r10, r1)
            java.lang.String r1 = r8.A01
            X.9Iz r6 = new X.9Iz
            r6.<init>((com.instagram.quickpromotion.intf.QuickPromotionSurface) r3, (com.instagram.quickpromotion.intf.Trigger) r2, (java.lang.String) r1)
            monitor-enter(r4)
            goto L_0x0196
        L_0x010d:
            java.lang.String r0 = "using_op_payload"
            X.4Vt r1 = new X.4Vt
            r1.<init>(r15, r0)
            X.0sP r0 = r4.A00
            r0.invoke(r1)
            android.content.Context r0 = r4.A01
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r11 = (int) r0
            java.lang.Object r2 = r15.A01
            com.google.common.collect.CompactHashMap r1 = new com.google.common.collect.CompactHashMap
            r1.<init>()
            X.1J2.A01(r3, r2)
            java.lang.Object r0 = r1.get(r3)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 != 0) goto L_0x0145
            com.google.common.collect.CompactHashSet r0 = new com.google.common.collect.CompactHashSet
            r0.<init>()
            r1.put(r3, r0)
        L_0x0145:
            r0.add(r2)
            java.util.Set r0 = r1.entrySet()
            com.google.common.collect.ImmutableSetMultimap r0 = com.google.common.collect.ImmutableSetMultimap.A00(r0)
            X.4W0 r3 = new X.4W0
            r3.<init>(r0)
            r0 = 0
            X.0qQ.A0B(r8, r0)
            X.3Ns r2 = new X.3Ns
            r2.<init>()
            X.4W1 r1 = new X.4W1
            r1.<init>(r8, r3, r2, r11)
            X.FlK r0 = X.C50931FlK.A00
            r1.ATC(r10, r0)
            r9.A01 = r4
            r9.A02 = r15
            r9.A00 = r6
            java.lang.Object r1 = r2.A0E(r9)
            if (r1 != r7) goto L_0x0030
            return r7
        L_0x0175:
            X.4Vw r9 = new X.4Vw
            r9.<init>(r4, r3)
            goto L_0x0017
        L_0x017c:
            java.lang.String r2 = "No QP response received"
            X.4Vv r1 = new X.4Vv
            r1.<init>(r5, r2)
            X.0sP r0 = r4.A00
            r0.invoke(r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L_0x018e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0196:
            java.util.Map r2 = r4.A04     // Catch:{ all -> 0x024b }
            java.lang.Object r1 = r2.get(r6)     // Catch:{ all -> 0x024b }
            if (r1 != 0) goto L_0x01a6
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet     // Catch:{ all -> 0x024b }
            r1.<init>()     // Catch:{ all -> 0x024b }
            r2.put(r6, r1)     // Catch:{ all -> 0x024b }
        L_0x01a6:
            java.util.Set r1 = (java.util.Set) r1     // Catch:{ all -> 0x024b }
            r1.add(r12)     // Catch:{ all -> 0x024b }
            monitor-exit(r4)
            java.lang.String r2 = "before_sync_block"
            X.4Vt r1 = new X.4Vt
            r1.<init>(r5, r2)
            r10.invoke(r1)
            monitor-enter(r4)
            java.lang.String r2 = "inside_sync_block"
            X.4Vt r1 = new X.4Vt     // Catch:{ all -> 0x024b }
            r1.<init>(r5, r2)     // Catch:{ all -> 0x024b }
            r10.invoke(r1)     // Catch:{ all -> 0x024b }
            java.lang.Integer r2 = r4.A00     // Catch:{ all -> 0x024b }
            X.4Vy r1 = r4.A02     // Catch:{ all -> 0x024b }
            java.lang.String r12 = r6.A02     // Catch:{ all -> 0x024b }
            if (r12 != 0) goto L_0x01cb
            java.lang.String r12 = "empty_trigger_context"
        L_0x01cb:
            java.lang.Integer r6 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x024b }
            if (r2 != r6) goto L_0x01d9
            java.util.Set r3 = r4.A05     // Catch:{ all -> 0x024b }
            boolean r3 = r3.contains(r12)     // Catch:{ all -> 0x024b }
            r16 = 1
            if (r3 == 0) goto L_0x01db
        L_0x01d9:
            r16 = 0
        L_0x01db:
            X.0qQ.A0B(r2, r0)     // Catch:{ all -> 0x024b }
            r0 = 3
            X.0qQ.A0B(r1, r0)     // Catch:{ all -> 0x024b }
            java.lang.Integer r13 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x024b }
            r12 = 0
            r17 = r23
            if (r2 == r13) goto L_0x0203
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x024b }
            if (r2 == r0) goto L_0x0202
            if (r23 == 0) goto L_0x01f0
            goto L_0x01f3
        L_0x01f0:
            long r2 = r1.A02     // Catch:{ all -> 0x024b }
            goto L_0x01f5
        L_0x01f3:
            long r2 = r1.A01     // Catch:{ all -> 0x024b }
        L_0x01f5:
            long r0 = r1.A00     // Catch:{ all -> 0x024b }
            long r0 = r0 + r2
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x024b }
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0202
            if (r16 == 0) goto L_0x0203
        L_0x0202:
            r12 = 1
        L_0x0203:
            if (r12 == 0) goto L_0x0207
            r4.A00 = r13     // Catch:{ all -> 0x024b }
        L_0x0207:
            monitor-exit(r4)
            java.lang.String r1 = "after_sync_block"
            X.4Vt r0 = new X.4Vt
            r0.<init>(r5, r1)
            r10.invoke(r0)
            java.lang.String r0 = "should_fetch_"
            java.lang.String r1 = X.002.A1D(r0, r12)
            X.4Vt r0 = new X.4Vt
            r0.<init>(r5, r1)
            r10.invoke(r0)
            if (r12 == 0) goto L_0x023d
            X.4Cq r2 = r11.A00
            r15 = 0
            X.9KV r11 = new X.9KV
            r16 = r10
            r14 = r8
            r13 = r4
            r12 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17)
            X.19B r1 = X.19B.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1Eo.A03(r0, r1, r11, r2)
        L_0x0236:
            java.lang.Object r1 = r9.A00()
            if (r1 != r7) goto L_0x024a
            return r7
        L_0x023d:
            monitor-enter(r4)
            java.lang.Integer r0 = r4.A00     // Catch:{ all -> 0x024b }
            if (r0 != r6) goto L_0x0245
            com.instagram.quickpromotion.sdk.IGSlotFetcher.A02(r5, r4, r10)     // Catch:{ all -> 0x024b }
        L_0x0245:
            monitor-exit(r4)
            goto L_0x0236
        L_0x0247:
            X.0eS.A00(r1)
        L_0x024a:
            return r1
        L_0x024b:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x024e:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quickpromotion.sdk.IGOnDemandFetcher.A00(X.9J8, X.42S, com.instagram.common.session.UserSession, com.instagram.quickpromotion.intf.QuickPromotionSurface, com.instagram.quickpromotion.sdk.IGOnDemandFetcher, X.42R, X.4D7, X.0sP, boolean):java.lang.Object");
    }
}
