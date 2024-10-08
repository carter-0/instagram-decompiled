package X;

import java.util.Map;
import java.util.Set;

public final class Q38 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Q3K A01;
    public final /* synthetic */ AnonymousClass6RB A02;
    public final /* synthetic */ JPG A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;
    public final /* synthetic */ Set A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public Q38(Q3K q3k, AnonymousClass6RB r2, JPG jpg, String str, Map map, Set set, long j, boolean z, boolean z2) {
        this.A02 = r2;
        this.A04 = str;
        this.A05 = map;
        this.A06 = set;
        this.A00 = j;
        this.A01 = q3k;
        this.A07 = z;
        this.A08 = z2;
        this.A03 = jpg;
    }

    public static void A00(Q3A q3a, Q31 q31, Object obj) {
        q31.A01("cache_src", "memory");
        q3a.invoke(new Q4C(new 0eP(obj, new C7305Q3h(0Yt.A0B(q31.A02), 0Yt.A0B(q31.A01)))));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0095, code lost:
        if (r5.A00.A00.get(r2) == null) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a4, code lost:
        if (r23 != false) goto L_0x00a6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r27 = this;
            r7 = r27
            X.6RB r6 = r7.A02
            X.6Qu r0 = r6.A02
            if (r0 == 0) goto L_0x003d
            X.6Qq r10 = r0.A00
        L_0x000a:
            java.lang.String r2 = r7.A04
            java.util.Map r5 = r7.A05
            java.util.Set r9 = r7.A06
            r8 = r5
            if (r9 == 0) goto L_0x003f
            java.util.LinkedHashMap r8 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r4 = X.AnonymousClass7TF.A0u(r5)
        L_0x001b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x003f
            java.lang.Object r3 = r4.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            boolean r0 = r9.contains(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r3.getKey()
            java.lang.Object r0 = r3.getValue()
            r8.put(r1, r0)
            goto L_0x001b
        L_0x003d:
            r10 = 0
            goto L_0x000a
        L_0x003f:
            java.lang.String r4 = X.Q32.A00(r10, r2, r8)
            long r0 = r7.A00
            X.Q3K r3 = r7.A01
            X.Q39 r8 = new X.Q39
            r9 = r3
            r10 = r2
            r11 = r5
            r12 = r0
            r8.<init>(r9, r10, r11, r12)
            X.6RD r15 = r6.A06
            boolean r3 = r7.A07
            java.util.concurrent.Executor r10 = r6.A0D
            boolean r1 = r7.A08
            X.JPG r0 = r7.A03
            r22 = 9
            X.IxD r21 = new X.IxD
            r23 = r6
            r24 = r0
            r25 = r5
            r26 = r1
            r21.<init>(r22, r23, r24, r25, r26)
            r7 = 0
            X.AnonymousClass7TF.A1D(r4, r7, r10)
            java.lang.StringBuilder r5 = X.AnonymousClass7TF.A0n(r4)
            r0 = 58
            r5.append(r0)
            long r0 = r8.A00
            java.lang.String r9 = X.Pxe.A10(r5, r0)
            java.util.Set r6 = r15.A04
            boolean r5 = r6.contains(r9)
            if (r5 != 0) goto L_0x00e2
            r6.add(r9)
            X.6Qu r5 = r15.A00
            if (r5 == 0) goto L_0x0097
            X.6Qq r5 = r5.A00
            java.util.Map r5 = r5.A00
            java.lang.Object r5 = r5.get(r2)
            r23 = 1
            if (r5 != 0) goto L_0x0099
        L_0x0097:
            r23 = 0
        L_0x0099:
            X.6RA r5 = r15.A02
            X.6R6 r6 = r5.A00(r2)
            X.Q3K r5 = r8.A01
            if (r3 == 0) goto L_0x00a6
            r11 = 1
            if (r23 == 0) goto L_0x00a7
        L_0x00a6:
            r11 = 0
        L_0x00a7:
            X.Q3A r14 = new X.Q3A
            r20 = r10
            r22 = r3
            r17 = r9
            r18 = r4
            r19 = r2
            r16 = r8
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.0JR r2 = r6.A02
            long r20 = r2.now()
            X.Q34 r9 = new X.Q34
            r9.<init>()
            X.6Qy r2 = r6.A01
            X.Q3r r8 = r2.EzP(r4)
            r12 = 0
            if (r8 == 0) goto L_0x00e3
            boolean r2 = r8 instanceof X.C7317Q3t
            if (r2 == 0) goto L_0x00e3
            long r2 = r8.A00
            X.Q3K r4 = r8.A01
            r15 = r4
            r16 = r2
            r18 = r0
            boolean r0 = X.Q32.A04(r15, r16, r18, r20)
            if (r0 == 0) goto L_0x013e
            A00(r14, r9, r8)
        L_0x00e2:
            return
        L_0x00e3:
            if (r11 == 0) goto L_0x013e
            X.6R2 r8 = r6.A00
            java.util.concurrent.atomic.AtomicReference r2 = r8.A05
            java.lang.Object r2 = r2.get()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r11 = r2.get(r4)
            X.Q41 r11 = (X.Q41) r11
            if (r11 == 0) goto L_0x013e
            long r2 = r11.A00
            r16 = r2
            r18 = r0
            boolean r13 = X.Q32.A03(r16, r18, r20)
            if (r13 == 0) goto L_0x013e
            X.T9F r12 = r11.A01
            X.R9R r11 = new X.R9R
            r11.<init>(r5, r12, r2)
            A00(r14, r9, r11)
            X.6Qo r2 = r6.A03
            long r22 = r2.currentMonotonicTimestamp()
            X.TWT r12 = new X.TWT
            r15 = r6
            r16 = r4
            r17 = r14
            r13 = r5
            r14 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r20, r22)
            X.R9M r15 = new X.R9M
            r15.<init>()
            java.util.concurrent.Executor r2 = r8.A04
            X.TNm r1 = new X.TNm
            r13 = r1
            r14 = r8
            r16 = r10
            r17 = r12
            r18 = r4
            r19 = r7
            r13.<init>(r14, r15, r16, r17, r18, r19)
            java.util.concurrent.FutureTask r0 = new java.util.concurrent.FutureTask
            r0.<init>(r1)
            r2.execute(r0)
            return
        L_0x013e:
            r14.invoke(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q38.run():void");
    }
}
