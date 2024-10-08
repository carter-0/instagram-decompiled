package com.facebook.quickpromotion.sdk.controllers;

import X.002;
import X.0qQ;
import X.0sJ;
import X.AnonymousClass2t5;
import X.AnonymousClass421;
import X.C2595141z;
import X.C62320sa;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public final class QPSdkOnDemandSurfaceController {
    public ImmutableList A00;
    public final AnonymousClass2t5 A01 = new AnonymousClass2t5();
    public final C2595141z A02;
    public final String A03;
    public final HashMap A04;
    public final Map A05 = new HashMap();
    public final C62320sa A06;
    public final AnonymousClass421 A07;
    public final String A08;
    public final 0sJ A09;

    public QPSdkOnDemandSurfaceController(C2595141z r3, AnonymousClass421 r4, String str, String str2, C62320sa r7, 0sJ r8) {
        0qQ.A0B(str2, 2);
        this.A06 = r7;
        ImmutableList of = ImmutableList.of();
        0qQ.A07(of);
        this.A00 = of;
        this.A08 = str2;
        this.A02 = r3;
        this.A07 = r4;
        this.A09 = r8;
        this.A04 = new HashMap();
        this.A03 = 002.A0i("onDemandCache/", str, str2, '/');
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.9JX, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b5, code lost:
        if (r15.length() == 0) goto L_0x00b7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046 A[LOOP:0: B:10:0x0040->B:12:0x0046, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.facebook.quickpromotion.sdk.controllers.QPSdkOnDemandSurfaceController r19, X.AnonymousClass42S r20, X.AnonymousClass42R r21, X.AnonymousClass426 r22, java.lang.Object r23, java.util.Set r24, X.AnonymousClass4D7 r25) {
        /*
            r3 = r19
            r4 = 7
            r5 = r25
            boolean r0 = X.AnonymousClass9JX.A00(r4, r5)
            if (r0 == 0) goto L_0x0190
            r7 = r5
            X.9JX r7 = (X.AnonymousClass9JX) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0190
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0019:
            java.lang.Object r1 = r7.A02
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r5 = 10
            r4 = 1
            if (r0 == 0) goto L_0x005c
            if (r0 != r4) goto L_0x01b7
            java.lang.Object r3 = r7.A01
            com.facebook.quickpromotion.sdk.controllers.QPSdkOnDemandSurfaceController r3 = (com.facebook.quickpromotion.sdk.controllers.QPSdkOnDemandSurfaceController) r3
            X.0eS.A00(r1)
        L_0x002d:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r1 = X.0Yv.A1F(r1)
            int r0 = X.0Yv.A1E(r1, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            java.util.Iterator r4 = r1.iterator()
        L_0x0040:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0197
            java.lang.Object r2 = r4.next()
            X.4VR r2 = (X.AnonymousClass4VR) r2
            r0 = r2
            X.4VQ r0 = (X.AnonymousClass4VQ) r0
            X.4UC r0 = r0.A01
            java.lang.String r1 = r0.A0D
            X.0eP r0 = new X.0eP
            r0.<init>(r1, r2)
            r5.add(r0)
            goto L_0x0040
        L_0x005c:
            X.0eS.A00(r1)
            r19 = r22
            r0 = r19
            com.google.common.collect.ImmutableSet r0 = r0.A04
            r2 = r24
            java.util.Set r1 = X.00k.A0l(r2, r0)
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00f6
            monitor-enter(r3)
            int r0 = X.0Yv.A1E(r1, r5)     // Catch:{ all -> 0x01bf }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x01bf }
            r10.<init>(r0)     // Catch:{ all -> 0x01bf }
            java.util.Iterator r16 = r1.iterator()     // Catch:{ all -> 0x01bf }
        L_0x0081:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x01bf }
            if (r0 == 0) goto L_0x00f9
            java.lang.Object r8 = r16.next()     // Catch:{ all -> 0x01bf }
            r12 = r21
            java.lang.String r2 = r12.A01     // Catch:{ all -> 0x01bf }
            java.lang.String r0 = r3.A08     // Catch:{ all -> 0x01bf }
            r1 = 0
            X.9J8 r11 = new X.9J8     // Catch:{ all -> 0x01bf }
            r11.<init>((java.lang.String) r0, (java.lang.Object) r8, (java.lang.String) r2)     // Catch:{ all -> 0x01bf }
            java.util.HashMap r9 = r3.A04     // Catch:{ all -> 0x01bf }
            java.lang.Object r0 = r9.get(r11)     // Catch:{ all -> 0x01bf }
            if (r0 != 0) goto L_0x00f0
            X.0sJ r13 = r3.A09     // Catch:{ all -> 0x01bf }
            X.41z r8 = r3.A02     // Catch:{ all -> 0x01bf }
            java.lang.Object r0 = r11.A01     // Catch:{ all -> 0x01bf }
            com.instagram.quickpromotion.intf.Trigger r0 = (com.instagram.quickpromotion.intf.Trigger) r0     // Catch:{ all -> 0x01bf }
            X.0qQ.A0B(r0, r1)     // Catch:{ all -> 0x01bf }
            java.lang.String r14 = r0.A01     // Catch:{ all -> 0x01bf }
            java.lang.String r15 = r11.A03     // Catch:{ all -> 0x01bf }
            if (r15 == 0) goto L_0x00b7
            int r1 = r15.length()     // Catch:{ all -> 0x01bf }
            r0 = 0
            if (r1 != 0) goto L_0x00b8
        L_0x00b7:
            r0 = 1
        L_0x00b8:
            r2 = 47
            if (r0 == 0) goto L_0x00cd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bf }
            r1.<init>()     // Catch:{ all -> 0x01bf }
            java.lang.String r0 = r3.A03     // Catch:{ all -> 0x01bf }
            r1.append(r0)     // Catch:{ all -> 0x01bf }
            r1.append(r2)     // Catch:{ all -> 0x01bf }
            r1.append(r14)     // Catch:{ all -> 0x01bf }
            goto L_0x00e3
        L_0x00cd:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01bf }
            r1.<init>()     // Catch:{ all -> 0x01bf }
            java.lang.String r0 = r3.A03     // Catch:{ all -> 0x01bf }
            r1.append(r0)     // Catch:{ all -> 0x01bf }
            r1.append(r2)     // Catch:{ all -> 0x01bf }
            r1.append(r14)     // Catch:{ all -> 0x01bf }
            r1.append(r2)     // Catch:{ all -> 0x01bf }
            r1.append(r15)     // Catch:{ all -> 0x01bf }
        L_0x00e3:
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01bf }
            java.lang.Object r0 = r13.invoke(r11, r12, r8, r0)     // Catch:{ all -> 0x01bf }
            com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache r0 = (com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache) r0     // Catch:{ all -> 0x01bf }
            r9.put(r11, r0)     // Catch:{ all -> 0x01bf }
        L_0x00f0:
            com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache r0 = (com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache) r0     // Catch:{ all -> 0x01bf }
            r10.add(r0)     // Catch:{ all -> 0x01bf }
            goto L_0x0081
        L_0x00f6:
            X.0sn r10 = X.0sn.A00
            goto L_0x00fa
        L_0x00f9:
            monitor-exit(r3)
        L_0x00fa:
            int r0 = X.0Yv.A1E(r10, r5)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            java.util.Iterator r11 = r10.iterator()
        L_0x0107:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0185
            java.lang.Object r13 = r11.next()
            com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache r13 = (com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache) r13
            r0 = r19
            boolean r1 = r0.A0D
            r15 = r20
            X.0qQ.A0B(r15, r4)
            r16 = 0
            X.3Ns r9 = new X.3Ns
            r9.<init>()
            monitor-enter(r13)
            java.lang.Integer r2 = r13.A01     // Catch:{ all -> 0x01c2 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x01c2 }
            r14 = r23
            if (r2 == r0) goto L_0x0150
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x01c2 }
            if (r2 != r0) goto L_0x0136
            java.util.ArrayList r0 = r13.A04     // Catch:{ all -> 0x01c2 }
            r0.add(r9)     // Catch:{ all -> 0x01c2 }
            goto L_0x0180
        L_0x0136:
            r13.A01 = r0     // Catch:{ all -> 0x01c2 }
            java.util.ArrayList r0 = r13.A04     // Catch:{ all -> 0x01c2 }
            r0.add(r9)     // Catch:{ all -> 0x01c2 }
            X.4Cq r2 = r15.A00     // Catch:{ all -> 0x01c2 }
            r17 = 0
            X.9KI r12 = new X.9KI     // Catch:{ all -> 0x01c2 }
            r18 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x01c2 }
            X.19B r1 = X.19B.A00     // Catch:{ all -> 0x01c2 }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x01c2 }
            X.1Eo.A03(r0, r1, r12, r2)     // Catch:{ all -> 0x01c2 }
            goto L_0x0180
        L_0x0150:
            boolean r0 = r13.A02     // Catch:{ all -> 0x01c2 }
            if (r0 == 0) goto L_0x015a
            java.util.ArrayList r0 = r13.A04     // Catch:{ all -> 0x01c2 }
            r0.add(r9)     // Catch:{ all -> 0x01c2 }
            goto L_0x0180
        L_0x015a:
            boolean r0 = com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache.A02(r13, r1)     // Catch:{ all -> 0x01c2 }
            if (r0 == 0) goto L_0x017b
            r13.A02 = r4     // Catch:{ all -> 0x01c2 }
            java.util.ArrayList r0 = r13.A04     // Catch:{ all -> 0x01c2 }
            r0.add(r9)     // Catch:{ all -> 0x01c2 }
            X.4Cq r10 = r15.A00     // Catch:{ all -> 0x01c2 }
            X.9KI r2 = new X.9KI     // Catch:{ all -> 0x01c2 }
            r12 = r2
            r17 = r4
            r18 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x01c2 }
            X.19B r1 = X.19B.A00     // Catch:{ all -> 0x01c2 }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x01c2 }
            X.1Eo.A03(r0, r1, r2, r10)     // Catch:{ all -> 0x01c2 }
            goto L_0x0180
        L_0x017b:
            com.google.common.collect.ImmutableList r0 = r13.A00     // Catch:{ all -> 0x01c2 }
            r9.A0K(r0)     // Catch:{ all -> 0x01c2 }
        L_0x0180:
            monitor-exit(r13)
            r8.add(r9)
            goto L_0x0107
        L_0x0185:
            r7.A01 = r3
            r7.A00 = r4
            java.lang.Object r1 = X.AnonymousClass42T.A00(r8, r7)
            if (r1 != r6) goto L_0x002d
            return r6
        L_0x0190:
            X.9JX r7 = new X.9JX
            r7.<init>(r3, r5, r4)
            goto L_0x0019
        L_0x0197:
            java.util.Map r0 = X.0Yt.A08(r5)
            java.util.Collection r1 = r0.values()
            com.google.common.collect.ImmutableList r0 = r3.A00
            java.util.Collection[] r0 = new java.util.Collection[]{r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            java.util.ArrayList r1 = X.0Yv.A1F(r0)
            X.5IK r0 = new X.5IK
            r0.<init>()
            java.util.List r6 = X.00k.A0g(r1, r0)
            return r6
        L_0x01b7:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x01bf:
            r1 = move-exception
            monitor-exit(r3)
            throw r1
        L_0x01c2:
            r1 = move-exception
            monitor-exit(r13)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.quickpromotion.sdk.controllers.QPSdkOnDemandSurfaceController.A00(com.facebook.quickpromotion.sdk.controllers.QPSdkOnDemandSurfaceController, X.42S, X.42R, X.426, java.lang.Object, java.util.Set, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r21v1, types: [X.4D7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0130 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass42S r16, X.AnonymousClass42R r17, X.AnonymousClass426 r18, java.lang.Object r19, java.util.Set r20, X.AnonymousClass4D7 r21) {
        /*
            r15 = this;
            r8 = r18
            r3 = 6
            r5 = r21
            boolean r0 = X.C376709Ja.A00(r3, r5)
            if (r0 == 0) goto L_0x01e4
            r4 = r5
            X.9Ja r4 = (X.C376709Ja) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x01e4
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0019:
            java.lang.Object r1 = r4.A03
            X.1Hj r3 = X.1Hj.A02
            int r2 = r4.A00
            r0 = 1
            if (r2 == 0) goto L_0x01d0
            if (r2 != r0) goto L_0x01eb
            java.lang.Object r8 = r4.A02
            X.426 r8 = (X.AnonymousClass426) r8
            java.lang.Object r9 = r4.A01
            com.facebook.quickpromotion.sdk.controllers.QPSdkOnDemandSurfaceController r9 = (com.facebook.quickpromotion.sdk.controllers.QPSdkOnDemandSurfaceController) r9
            X.0eS.A00(r1)
        L_0x002f:
            java.util.List r1 = (java.util.List) r1
            r5 = 0
            X.0qQ.A0B(r1, r5)
            X.0qQ.A0B(r8, r0)
            int r3 = r1.size()
            X.2t5 r0 = r9.A01
            com.facebook.quicklog.QuickPerformanceLogger r7 = r0.A00
            r6 = 716778457(0x2ab92bd9, float:3.2893027E-13)
            com.facebook.quicklog.MarkerEditor r2 = r7.withMarker(r6, r5)
            X.0qQ.A0A(r2)
            X.2bM r4 = r0.A01
            java.lang.String r0 = "valid_promotion_count_is_"
            java.lang.String r0 = X.002.A0O(r0, r3)
            java.lang.String r0 = r4.A00(r0, r5, r5)
            r2.point(r0)
            java.lang.String r0 = "valid_promotion_count"
            r2.annotate(r0, r3)
            r2.markerEditingCompleted()
            X.0sa r0 = r9.A06
            java.lang.Object r12 = r0.invoke()
            X.2t4 r12 = (X.AnonymousClass2t4) r12
            X.5IL r3 = new X.5IL
            r3.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r14 = r1.iterator()
        L_0x007c:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0130
            java.lang.Object r10 = r14.next()
            X.4VR r10 = (X.AnonymousClass4VR) r10
            X.5IN r1 = r12.A00(r10, r8)
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x00da
            boolean r0 = r1.A06
            if (r0 == 0) goto L_0x00c8
            r0 = r10
            X.4VQ r0 = (X.AnonymousClass4VQ) r0
            X.4UC r0 = r0.A01
            java.lang.String r2 = r0.A0D
            com.facebook.quicklog.MarkerEditor r1 = r7.withMarker(r6, r5)
            X.0qQ.A0A(r1)
            java.lang.String r0 = "waterfall_force_pass_"
            java.lang.String r0 = X.002.A0R(r0, r2)
            java.lang.String r0 = r4.A00(r0, r5, r5)
            r1.point(r0)
            r1.markerEditingCompleted()
            X.5IL r3 = new X.5IL
            r3.<init>()
            X.0qQ.A0B(r10, r5)
            X.4VR r0 = r3.A00
            if (r0 != 0) goto L_0x00c0
            r3.A00 = r10
        L_0x00c0:
            java.util.ArrayList r0 = r3.A01
            r0.add(r10)
        L_0x00c5:
            java.util.ArrayList r3 = r3.A01
        L_0x00c7:
            return r3
        L_0x00c8:
            X.0qQ.A0B(r10, r5)
            X.4VR r0 = r3.A00
            if (r0 != 0) goto L_0x00d1
            r3.A00 = r10
        L_0x00d1:
            java.util.ArrayList r0 = r3.A01
            r0.add(r10)
            r11.add(r10)
            goto L_0x007c
        L_0x00da:
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x0101
            r0 = r10
            X.4VQ r0 = (X.AnonymousClass4VQ) r0
            X.4UC r0 = r0.A01
            java.lang.String r2 = r0.A0D
            com.facebook.quicklog.MarkerEditor r1 = r7.withMarker(r6, r5)
            X.0qQ.A0A(r1)
            java.lang.String r0 = "waterfall_fail_"
            java.lang.String r0 = X.002.A0R(r0, r2)
            java.lang.String r0 = r4.A00(r0, r5, r5)
            r1.point(r0)
            r1.markerEditingCompleted()
            r9.add(r10)
            goto L_0x007c
        L_0x0101:
            java.lang.String r2 = r1.A04
            if (r2 != 0) goto L_0x0107
            java.lang.String r2 = "null"
        L_0x0107:
            X.4VQ r10 = (X.AnonymousClass4VQ) r10
            X.4UC r0 = r10.A01
            java.lang.String r13 = r0.A0D
            java.lang.String r1 = " "
            java.lang.String r0 = "_"
            java.lang.String r10 = X.00p.A0g(r2, r1, r0, r5)
            com.facebook.quicklog.MarkerEditor r2 = r7.withMarker(r6)
            X.0qQ.A0A(r2)
            java.lang.String r1 = "waterfall_fail_"
            r0 = 95
            java.lang.String r0 = X.002.A0i(r1, r13, r10, r0)
            java.lang.String r0 = r4.A00(r0, r5, r5)
            r2.point(r0)
            r2.markerEditingCompleted()
            goto L_0x007c
        L_0x0130:
            java.util.Iterator r11 = r11.iterator()
        L_0x0134:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x016e
            java.lang.Object r10 = r11.next()
            X.4VR r10 = (X.AnonymousClass4VR) r10
            X.429 r0 = r8.A02
            X.0qQ.A0B(r10, r5)
            X.0sP r1 = r0.A03
            X.0Ae r0 = r0.A00
            java.lang.Object r2 = r1.invoke(r0)
            X.0Ak r2 = (X.0Ak) r2
            X.0Aj r0 = r2.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x0134
            X.4VQ r10 = (X.AnonymousClass4VQ) r10
            X.4UC r0 = r10.A01
            java.lang.String r0 = r0.A0D
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "promotion_id"
            r2.A0Q(r0, r1)
            r2.Cgf()
            goto L_0x0134
        L_0x016e:
            java.util.Iterator r10 = r9.iterator()
        L_0x0172:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x01ac
            java.lang.Object r9 = r10.next()
            X.4VR r9 = (X.AnonymousClass4VR) r9
            X.429 r0 = r8.A02
            X.0qQ.A0B(r9, r5)
            X.0sP r1 = r0.A03
            X.0Ae r0 = r0.A00
            java.lang.Object r2 = r1.invoke(r0)
            X.0Ak r2 = (X.0Ak) r2
            X.0Aj r0 = r2.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x0172
            X.4VQ r9 = (X.AnonymousClass4VQ) r9
            X.4UC r0 = r9.A01
            java.lang.String r0 = r0.A0D
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "promotion_id"
            r2.A0Q(r0, r1)
            r2.Cgf()
            goto L_0x0172
        L_0x01ac:
            java.util.ArrayList r0 = r3.A01
            int r2 = r0.size()
            com.facebook.quicklog.MarkerEditor r1 = r7.withMarker(r6, r5)
            X.0qQ.A0A(r1)
            java.lang.String r0 = "eligible_promotion_count_is_"
            java.lang.String r0 = X.002.A0O(r0, r2)
            java.lang.String r0 = r4.A00(r0, r5, r5)
            r1.point(r0)
            java.lang.String r0 = "eligible_promotion_count"
            r1.annotate(r0, r2)
            r1.markerEditingCompleted()
            goto L_0x00c5
        L_0x01d0:
            X.0eS.A00(r1)
            r4.A01 = r15
            r4.A02 = r8
            r4.A00 = r0
            r21 = r4
            java.lang.Object r1 = A00(r15, r16, r17, r18, r19, r20, r21)
            if (r1 == r3) goto L_0x00c7
            r9 = r15
            goto L_0x002f
        L_0x01e4:
            X.9Ja r4 = new X.9Ja
            r4.<init>(r15, r5, r3)
            goto L_0x0019
        L_0x01eb:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.quickpromotion.sdk.controllers.QPSdkOnDemandSurfaceController.A01(X.42S, X.42R, X.426, java.lang.Object, java.util.Set, X.4D7):java.lang.Object");
    }
}
