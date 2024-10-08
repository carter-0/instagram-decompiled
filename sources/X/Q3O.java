package X;

import android.os.Handler;
import java.util.Map;
import java.util.Set;

public final class Q3O {
    public static final Handler A07 = AnonymousClass7TF.A0D();
    public final C307776Rk A00;
    public final C307446Qd A01;
    public final AnonymousClass6RB A02;
    public final Object A03 = Pxe.A0p();
    public final Map A04 = AnonymousClass7TE.A1H();
    public final Map A05 = AnonymousClass7TE.A1H();
    public final Set A06 = DbS.A0y();

    public Q3O(C307776Rk r2, C307446Qd r3, AnonymousClass6RB r4) {
        0qQ.A0B(r2, 3);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02e7, code lost:
        if (r1 == null) goto L_0x02e9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A00(X.Q3O r35, X.C307896Rx r36, X.C7310Q3m r37, X.Q37 r38, java.lang.Integer r39) {
        /*
            r24 = r39
            r3 = r37
            boolean r0 = r3 instanceof X.C7311Q3n
            java.lang.String r6 = "BloksComponentQueryManager"
            r7 = r36
            r9 = r38
            if (r0 != 0) goto L_0x0035
            boolean r0 = r3 instanceof X.R9Q
            if (r0 == 0) goto L_0x0390
            java.lang.Integer r24 = X.AnonymousClass05K.A0C
            X.4uI r1 = r9.A00
            java.lang.String r0 = "appId"
            java.lang.Object r2 = X.Q3I.A00(r7, r1, r0)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0023
            java.lang.String r2 = "unknown"
        L_0x0023:
            java.lang.String r1 = "Network request failed for component query with app id "
            java.lang.String r0 = ". To find the server-side error trace, open Opes and filter to buenopaths containing that app id."
            java.lang.String r2 = X.002.A0g(r1, r2, r0)
            r0 = r3
            X.R9Q r0 = (X.R9Q) r0
            java.lang.Throwable r1 = r0.A00
            X.6Rm r0 = r7.A03
            X.1Kn.A00(r0, r6, r2, r1)
        L_0x0035:
            java.util.Set r0 = r9.A06
            if (r0 != 0) goto L_0x003b
            X.0sl r0 = X.0sl.A00
        L_0x003b:
            java.util.Iterator r1 = r0.iterator()
        L_0x003f:
            boolean r0 = r1.hasNext()
            r8 = r35
            if (r0 == 0) goto L_0x0076
            java.lang.Object r2 = r1.next()
            java.util.Set r0 = r8.A06
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x003f
            java.util.Map r1 = r8.A05
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto L_0x0062
            java.util.LinkedHashSet r0 = X.DbS.A0y()
            r1.put(r2, r0)
        L_0x0062:
            java.util.Set r0 = (java.util.Set) r0
            java.lang.String r2 = r9.A04
            r0.add(r2)
            java.util.Map r1 = r8.A04
            X.S5l r0 = new X.S5l
            r0.<init>(r3, r9)
            r1.put(r2, r0)
            X.0sn r0 = X.0sn.A00
            return r0
        L_0x0076:
            java.util.Set r0 = r8.A06
            java.lang.String r5 = r9.A04
            r0.add(r5)
            java.util.Map r0 = r8.A04
            r39 = r0
            r0.remove(r5)
            r0 = r24
            java.util.Map r23 = X.C9814Rhc.A00(r3, r0)
            boolean r0 = r3 instanceof X.C7312Q3o
            r4 = 0
            if (r0 != 0) goto L_0x00f2
            java.lang.String r0 = "query_info_"
            java.lang.String r2 = X.002.A0R(r0, r5)
            X.Q3P r1 = new X.Q3P
            r0 = r23
            r1.<init>(r2, r0)
            X.S5m r0 = new X.S5m
            r0.<init>(r1, r4)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
        L_0x00a6:
            java.util.ArrayList r4 = X.00k.A0U(r0)
            java.util.Map r3 = r8.A05
            java.lang.Object r0 = r3.get(r5)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            if (r0 == 0) goto L_0x00ef
            java.util.Set r0 = X.00k.A0k(r0)
        L_0x00b8:
            java.util.Iterator r9 = r0.iterator()
        L_0x00bc:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0379
            java.lang.Object r2 = r9.next()
            java.lang.String r2 = (java.lang.String) r2
            r0 = r39
            java.lang.Object r0 = r0.get(r2)
            X.S5l r0 = (X.C11014S5l) r0
            if (r0 != 0) goto L_0x00de
            java.lang.String r1 = "Expected to find pending response for "
            java.lang.String r0 = " but found none."
            java.lang.String r0 = X.002.A0g(r1, r2, r0)
            X.1Kn.A02(r6, r0)
            goto L_0x00bc
        L_0x00de:
            X.Q37 r2 = r0.A01
            X.Q3m r1 = r0.A00
            r0 = r24
            java.util.List r0 = A00(r8, r7, r1, r2, r0)
            r4.addAll(r0)
            r3.remove(r5)
            goto L_0x00bc
        L_0x00ef:
            X.0sl r0 = X.0sl.A00
            goto L_0x00b8
        L_0x00f2:
            java.util.Map r0 = r9.A05
            if (r0 == 0) goto L_0x0153
            java.util.Map r2 = X.0Yt.A0B(r0)
        L_0x00fa:
            X.Q3o r3 = (X.C7312Q3o) r3
            X.Q3u r0 = r3.A00
            java.util.Map r3 = r0.A01
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            java.util.Iterator r12 = X.AnonymousClass7TF.A0u(r2)
        L_0x0108:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0158
            java.lang.Object r0 = r12.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r11 = r0.getKey()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r0.getValue()
            X.Q36 r10 = (X.Q36) r10
            java.lang.Object r0 = r3.get(r11)
            if (r0 != 0) goto L_0x014f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Missing "
            r2.append(r0)
            r2.append(r11)
            java.lang.String r0 = " parseResult for target "
            r2.append(r0)
            int r0 = r10.A00
            r2.append(r0)
            r0 = 58
            r2.append(r0)
            java.util.List r0 = r10.A02
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            X.1Kn.A02(r6, r0)
            goto L_0x0108
        L_0x014f:
            r1.put(r10, r0)
            goto L_0x0108
        L_0x0153:
            X.0sm r2 = X.0Yt.A0E()
            goto L_0x00fa
        L_0x0158:
            boolean r0 = r9.A08
            if (r0 == 0) goto L_0x0370
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.concurrent.atomic.AtomicInteger r0 = X.C276604tb.A00
            int r0 = r0.incrementAndGet()
            X.AnonymousClass7TF.A1M(r3, r0)
        L_0x0169:
            int r0 = r1.size()
            java.util.ArrayList r22 = X.DbS.A0v(r0)
            java.util.Iterator r21 = X.AnonymousClass7TF.A0s(r1)
        L_0x0175:
            boolean r0 = r21.hasNext()
            if (r0 == 0) goto L_0x0373
            java.lang.Object r0 = r21.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r11 = r0.getValue()
            X.68u r11 = (X.C3034368u) r11
            java.lang.Object r10 = r0.getKey()
            X.Q36 r10 = (X.Q36) r10
            int r0 = r10.A00
            r38 = r0
            X.4tV r1 = r11.A02
            X.0qQ.A0A(r1)
            X.Q49 r0 = new X.Q49
            r0.<init>(r1, r3)
            X.4tV r2 = X.C7288Q2n.A00(r4, r0, r1)
            X.68v r1 = r11.A01
            java.util.List r0 = r1.A05
            r37 = r0
            java.util.Map r0 = r1.A06
            r36 = r0
            java.util.List r0 = r1.A02
            r35 = r0
            java.util.List r12 = r1.A01
            X.0qQ.A06(r12)
            r0 = 10
            int r11 = X.0Yv.A1E(r12, r0)
            java.util.ArrayList r20 = new java.util.ArrayList
            r0 = r20
            r0.<init>(r11)
            java.util.Iterator r19 = r12.iterator()
        L_0x01c3:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x0278
            java.lang.Object r12 = r19.next()
            X.Q37 r12 = (X.Q37) r12
            X.0qQ.A0A(r2)
            X.0qQ.A0A(r12)
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r0 = 1
            X.0qQ.A0B(r12, r0)
            java.util.Map r13 = r12.A05
            if (r13 == 0) goto L_0x023e
            int r0 = r13.size()
            int r0 = X.0se.A0L(r0)
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>(r0)
            java.util.Set r0 = r13.entrySet()
            java.util.Iterator r18 = r0.iterator()
        L_0x01f6:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x023f
            java.lang.Object r0 = r18.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r17 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            X.Q36 r0 = (X.Q36) r0
            java.lang.String r13 = r0.A01
            X.Q2v r0 = new X.Q2v
            r0.<init>(r13)
            X.4tV r13 = X.C7299Q2y.A00(r2, r0)
            if (r13 == 0) goto L_0x037e
            java.lang.String r16 = r13.A0C()
            X.0qQ.A0A(r16)
            int r0 = r13.A03
            r25 = r0
            java.util.List r0 = r13.A09
            if (r0 == 0) goto L_0x023b
            java.util.List r15 = X.00k.A0a(r0)
        L_0x022c:
            X.Q36 r14 = new X.Q36
            r13 = r25
            r0 = r16
            r14.<init>(r15, r13, r0)
            r0 = r17
            r11.put(r0, r14)
            goto L_0x01f6
        L_0x023b:
            X.0sn r15 = X.0sn.A00
            goto L_0x022c
        L_0x023e:
            r11 = 0
        L_0x023f:
            java.lang.String r0 = r12.A04
            r30 = r0
            X.4uI r0 = r12.A00
            r18 = r0
            X.4uI r0 = r12.A03
            r17 = r0
            X.4uI r0 = r12.A02
            r16 = r0
            java.util.Set r0 = r12.A06
            r15 = r0
            X.4uI r0 = r12.A01
            r14 = r0
            boolean r0 = r12.A07
            r13 = r0
            boolean r0 = r12.A08
            X.Q37 r12 = new X.Q37
            r25 = r12
            r26 = r18
            r27 = r17
            r28 = r16
            r29 = r14
            r31 = r11
            r32 = r15
            r33 = r13
            r34 = r0
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r0 = r20
            r0.add(r12)
            goto L_0x01c3
        L_0x0278:
            java.util.List r0 = r1.A03
            r14 = r0
            X.68t r13 = r1.A00
            java.util.Map r12 = r1.A07
            java.util.List r0 = r1.A04
            X.68v r11 = new X.68v
            r25 = r11
            r26 = r13
            r27 = r37
            r28 = r35
            r29 = r20
            r30 = r14
            r31 = r0
            r32 = r36
            r33 = r12
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33)
            r0 = r38
            long r0 = (long) r0
            X.Q4L r13 = new X.Q4L
            r13.<init>(r0)
            java.util.List r14 = java.util.Collections.singletonList(r2)
            X.0qQ.A07(r14)
            X.Q43 r12 = new X.Q43
            r12.<init>(r13)
            r0 = 1
            X.R9Y r1 = new X.R9Y
            r1.<init>(r0, r14, r13)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r12, r1)
            java.lang.Object r12 = r0.first
            X.0qQ.A06(r12)
            X.Tee r12 = (X.C13670Tee) r12
            java.lang.Object r1 = r0.second
            X.0qQ.A06(r1)
            X.Q42 r1 = (X.Q42) r1
            X.68u r0 = new X.68u
            r0.<init>(r4, r11, r2, r4)
            X.Q4Q r11 = new X.Q4Q
            r11.<init>(r0, r12, r1)
            X.4uI r2 = r9.A02
            if (r2 == 0) goto L_0x02e9
            X.6Tm r1 = X.AnonymousClass6Tm.A01
            java.util.List r0 = r10.A02
            X.6Rx r0 = X.C307896Rx.A02(r7, r0)
            java.lang.Object r1 = X.AnonymousClass6Tn.A00(r0, r1, r2)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>"
            X.0qQ.A0C(r1, r0)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto L_0x02ed
        L_0x02e9:
            X.0sm r1 = X.0Yt.A0E()
        L_0x02ed:
            int r0 = r1.size()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r13 = r0.iterator()
        L_0x02fe:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x033a
            java.lang.Object r1 = r13.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r12 = r1.getKey()
            java.lang.String r12 = (java.lang.String) r12
            if (r3 == 0) goto L_0x0328
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0328
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            java.lang.String r0 = X.C7283Q2i.A00(r0, r3)
            X.0qQ.A07(r0)
            java.lang.String r12 = X.C7283Q2i.A01(r12, r0)
            X.0qQ.A07(r12)
        L_0x0328:
            java.lang.Object r0 = r1.getValue()
            X.Q3P r1 = new X.Q3P
            r1.<init>(r12, r0)
            X.S5m r0 = new X.S5m
            r0.<init>(r1, r4)
            r2.add(r0)
            goto L_0x02fe
        L_0x033a:
            java.lang.String r0 = "query_info_"
            java.lang.String r12 = X.002.A0R(r0, r5)
            java.util.List r1 = r10.A02
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0359
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            java.lang.String r0 = X.C7283Q2i.A00(r0, r1)
            X.0qQ.A07(r0)
            java.lang.String r12 = X.C7283Q2i.A01(r12, r0)
            X.0qQ.A07(r12)
        L_0x0359:
            X.Q3P r1 = new X.Q3P
            r0 = r23
            r1.<init>(r12, r0)
            X.S5m r0 = new X.S5m
            r0.<init>(r1, r11)
            java.util.ArrayList r1 = X.00k.A0T(r0, r2)
            r0 = r22
            r0.add(r1)
            goto L_0x0175
        L_0x0370:
            r3 = r4
            goto L_0x0169
        L_0x0373:
            java.util.ArrayList r0 = X.0Yv.A1F(r22)
            goto L_0x00a6
        L_0x0379:
            java.util.List r0 = X.00k.A0a(r4)
            return r0
        L_0x037e:
            r0 = 1264(0x4f0, float:1.771E-42)
            java.lang.String r1 = X.C273654mx.A00(r0)
            java.lang.String r0 = r12.A04
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        L_0x0390:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q3O.A00(X.Q3O, X.6Rx, X.Q3m, X.Q37, java.lang.Integer):java.util.List");
    }
}
