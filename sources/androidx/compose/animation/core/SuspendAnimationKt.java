package androidx.compose.animation.core;

import X.0sL;
import X.0sP;
import X.1Hj;
import X.AnonymousClass4D7;
import X.AnonymousClass5PV;
import X.AnonymousClass5b9;
import X.AnonymousClass6GZ;
import X.AnonymousClass6HR;
import X.C262094Cc;
import X.C287725af;
import X.C287765aj;
import X.C287795am;
import X.C287805an;
import X.C287955b5;
import X.C3025864f;
import X.C3025964g;
import X.C3026764v;
import X.C377469Ly;
import X.C60340gF;
import X.GQH;

public abstract class SuspendAnimationKt {
    public static final Object A02(AnonymousClass5b9 r8, C287955b5 r9, Object obj, AnonymousClass4D7 r11, 0sP r12, boolean z) {
        long j;
        C287955b5 r6 = r9;
        Object value = r9.A05.getValue();
        AnonymousClass5b9 r1 = r8;
        C3025864f r0 = new C3025864f(r1, r9.A02, r9.A04, value, obj);
        if (z) {
            j = r9.A01;
        } else {
            j = Long.MIN_VALUE;
        }
        Object A01 = A01(r0, r6, r11, r12, j);
        if (A01 != 1Hj.A02) {
            return C60340gF.A00;
        }
        return A01;
    }

    public static final Object A04(C287955b5 r7, AnonymousClass6HR r8, AnonymousClass4D7 r9, 0sP r10, boolean z) {
        long j;
        C287955b5 r4 = r7;
        GQH gqh = new GQH(r7.A02, r8, r7.A04, r7.A05.getValue());
        if (z) {
            j = r7.A01;
        } else {
            j = Long.MIN_VALUE;
        }
        Object A01 = A01(gqh, r4, r9, r10, j);
        if (A01 != 1Hj.A02) {
            return C60340gF.A00;
        }
        return A01;
    }

    public static final void A05(C3025964g r4, C3026764v r5, C287955b5 r6, 0sP r7, float f, long j) {
        long j2;
        if (f == 0.0f) {
            j2 = r4.AzP();
        } else {
            j2 = (long) (((float) (j - r5.A03)) / f);
        }
        r5.A01 = j;
        r5.A06.Epw(r4.CDQ(j2));
        r5.A02 = r4.CDf(j2);
        if (r4.CTe(j2)) {
            r5.A00 = r5.A01;
            r5.A05.Epw(false);
        }
        A06(r5, r6);
        r7.invoke(r5);
    }

    public static final float A00(C262094Cc r1) {
        AnonymousClass5PV r0 = (AnonymousClass5PV) r1.get(AnonymousClass5PV.A00);
        if (r0 == null) {
            return 1.0f;
        }
        float BpW = r0.BpW();
        if (BpW >= 0.0f) {
            return BpW;
        }
        throw new IllegalStateException("negative scale factor");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.9Jd, X.4D7] */
    /* JADX WARNING: type inference failed for: r14v3, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00da A[Catch:{ CancellationException -> 0x011a }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0119 A[Catch:{ CancellationException -> 0x011a }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C3025964g r24, X.C287955b5 r25, X.AnonymousClass4D7 r26, X.0sP r27, long r28) {
        /*
            r10 = r25
            r9 = r24
            r13 = r27
            r6 = 0
            r4 = r26
            boolean r0 = X.C376739Jd.A00(r6, r4)
            if (r0 == 0) goto L_0x013f
            r0 = r4
            X.9Jd r0 = (X.C376739Jd) r0
            int r3 = r0.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x013f
            int r3 = r3 - r2
            r0.A00 = r3
        L_0x001d:
            java.lang.Object r2 = r0.A05
            X.1Hj r5 = X.1Hj.A02
            int r1 = r0.A00
            r4 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0047
            if (r1 == r3) goto L_0x0033
            if (r1 == r4) goto L_0x0033
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r0)
        L_0x0032:
            throw r7
        L_0x0033:
            java.lang.Object r14 = r0.A04
            X.0rm r14 = (X.0rm) r14
            java.lang.Object r13 = r0.A03
            X.0sP r13 = (X.0sP) r13
            java.lang.Object r9 = r0.A02
            X.64g r9 = (X.C3025964g) r9
            java.lang.Object r10 = r0.A01
            X.5b5 r10 = (X.C287955b5) r10
            X.0eS.A00(r2)     // Catch:{ CancellationException -> 0x011a }
            goto L_0x00c5
        L_0x0047:
            X.0eS.A00(r2)
            r1 = 0
            java.lang.Object r12 = r9.CDQ(r1)
            X.5af r11 = r9.CDf(r1)
            X.0rm r14 = new X.0rm
            r14.<init>()
            r7 = -9223372036854775808
            r21 = r28
            int r1 = (r28 > r7 ? 1 : (r28 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0098
            X.4Cc r1 = r0.getContext()     // Catch:{ CancellationException -> 0x011a }
            float r15 = A00(r1)     // Catch:{ CancellationException -> 0x011a }
            X.64s r8 = new X.64s     // Catch:{ CancellationException -> 0x011a }
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ CancellationException -> 0x011a }
            r0.A01 = r10     // Catch:{ CancellationException -> 0x011a }
            r0.A02 = r9     // Catch:{ CancellationException -> 0x011a }
            r0.A03 = r13     // Catch:{ CancellationException -> 0x011a }
            r0.A04 = r14     // Catch:{ CancellationException -> 0x011a }
            r0.A00 = r3     // Catch:{ CancellationException -> 0x011a }
            boolean r1 = r9.CVL()     // Catch:{ CancellationException -> 0x011a }
            if (r1 == 0) goto L_0x008d
            X.4Cc r2 = r0.getContext()     // Catch:{ CancellationException -> 0x011a }
            X.JZq r1 = X.C59818JZp.A00     // Catch:{ CancellationException -> 0x011a }
            r2.get(r1)     // Catch:{ CancellationException -> 0x011a }
            java.lang.Object r1 = X.C3026564t.A01(r0, r8)     // Catch:{ CancellationException -> 0x011a }
            goto L_0x0117
        L_0x008d:
            X.9L6 r1 = new X.9L6     // Catch:{ CancellationException -> 0x011a }
            r1.<init>(r8, r4)     // Catch:{ CancellationException -> 0x011a }
            java.lang.Object r1 = X.C3026564t.A01(r0, r1)     // Catch:{ CancellationException -> 0x011a }
            goto L_0x0117
        L_0x0098:
            X.5an r17 = r9.CAq()     // Catch:{ CancellationException -> 0x011a }
            java.lang.Object r19 = r9.C4T()     // Catch:{ CancellationException -> 0x011a }
            X.9L8 r1 = new X.9L8     // Catch:{ CancellationException -> 0x011a }
            r1.<init>(r10, r3)     // Catch:{ CancellationException -> 0x011a }
            X.64v r15 = new X.64v     // Catch:{ CancellationException -> 0x011a }
            r16 = r11
            r18 = r12
            r20 = r1
            r23 = r21
            r15.<init>(r16, r17, r18, r19, r20, r21, r23)     // Catch:{ CancellationException -> 0x011a }
            X.4Cc r1 = r0.getContext()     // Catch:{ CancellationException -> 0x011a }
            float r27 = A00(r1)     // Catch:{ CancellationException -> 0x011a }
            r23 = r9
            r24 = r15
            r26 = r13
            A05(r23, r24, r25, r26, r27, r28)     // Catch:{ CancellationException -> 0x011a }
            r14.A00 = r15     // Catch:{ CancellationException -> 0x011a }
        L_0x00c5:
            java.lang.Object r1 = r14.A00     // Catch:{ CancellationException -> 0x011a }
            X.0qQ.A0A(r1)     // Catch:{ CancellationException -> 0x011a }
            X.64v r1 = (X.C3026764v) r1     // Catch:{ CancellationException -> 0x011a }
            X.5Oz r1 = r1.A05     // Catch:{ CancellationException -> 0x011a }
            java.lang.Object r1 = r1.getValue()     // Catch:{ CancellationException -> 0x011a }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ CancellationException -> 0x011a }
            boolean r1 = r1.booleanValue()     // Catch:{ CancellationException -> 0x011a }
            if (r1 == 0) goto L_0x0146
            X.4Cc r1 = r0.getContext()     // Catch:{ CancellationException -> 0x011a }
            float r20 = A00(r1)     // Catch:{ CancellationException -> 0x011a }
            X.5mC r7 = new X.5mC     // Catch:{ CancellationException -> 0x011a }
            r15 = r7
            r16 = r9
            r17 = r10
            r18 = r13
            r19 = r14
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ CancellationException -> 0x011a }
            r0.A01 = r10     // Catch:{ CancellationException -> 0x011a }
            r0.A02 = r9     // Catch:{ CancellationException -> 0x011a }
            r0.A03 = r13     // Catch:{ CancellationException -> 0x011a }
            r0.A04 = r14     // Catch:{ CancellationException -> 0x011a }
            r0.A00 = r4     // Catch:{ CancellationException -> 0x011a }
            boolean r1 = r9.CVL()     // Catch:{ CancellationException -> 0x011a }
            if (r1 == 0) goto L_0x010e
            X.4Cc r2 = r0.getContext()     // Catch:{ CancellationException -> 0x011a }
            X.JZq r1 = X.C59818JZp.A00     // Catch:{ CancellationException -> 0x011a }
            r2.get(r1)     // Catch:{ CancellationException -> 0x011a }
            java.lang.Object r1 = X.C3026564t.A01(r0, r7)     // Catch:{ CancellationException -> 0x011a }
            goto L_0x0117
        L_0x010e:
            X.9L6 r1 = new X.9L6     // Catch:{ CancellationException -> 0x011a }
            r1.<init>(r7, r4)     // Catch:{ CancellationException -> 0x011a }
            java.lang.Object r1 = X.C3026564t.A01(r0, r1)     // Catch:{ CancellationException -> 0x011a }
        L_0x0117:
            if (r1 != r5) goto L_0x00c5
            return r5
        L_0x011a:
            r7 = move-exception
            java.lang.Object r0 = r14.A00
            X.64v r0 = (X.C3026764v) r0
            if (r0 == 0) goto L_0x012a
            X.5Oz r1 = r0.A05
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r1.Epw(r0)
        L_0x012a:
            java.lang.Object r0 = r14.A00
            X.64v r0 = (X.C3026764v) r0
            if (r0 == 0) goto L_0x013d
            long r4 = r0.A01
            long r1 = r10.A01
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x013d
        L_0x0138:
            if (r3 == 0) goto L_0x0032
            r10.A03 = r6
            throw r7
        L_0x013d:
            r3 = 0
            goto L_0x0138
        L_0x013f:
            X.9Jd r0 = new X.9Jd
            r0.<init>(r4)
            goto L_0x001d
        L_0x0146:
            X.0gF r5 = X.C60340gF.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SuspendAnimationKt.A01(X.64g, X.5b5, X.4D7, X.0sP, long):java.lang.Object");
    }

    public static final Object A03(AnonymousClass5b9 r16, AnonymousClass4D7 r17, 0sL r18, float f, float f2, float f3) {
        C287805an r3 = C287765aj.A02;
        Float f4 = new Float(f);
        Float f5 = new Float(f2);
        Float f6 = new Float(f3);
        0sP r0 = ((C287795am) r3).A01;
        C287725af r2 = (C287725af) r0.invoke(f6);
        if (r2 == null) {
            r2 = AnonymousClass6GZ.A01((C287725af) r0.invoke(f4));
        }
        C3025864f r10 = new C3025864f(r16, r2, r3, f4, f5);
        C3025864f r9 = r10;
        C287955b5 r102 = new C287955b5(r2, r3, f4, Long.MIN_VALUE, Long.MIN_VALUE, false);
        Object A01 = A01(r9, r102, r17, new C377469Ly(0, (Object) r3, (Object) r18), Long.MIN_VALUE);
        1Hj r02 = 1Hj.A02;
        if (A01 != r02) {
            A01 = C60340gF.A00;
        }
        if (A01 != r02) {
            return C60340gF.A00;
        }
        return A01;
    }

    public static final void A06(C3026764v r5, C287955b5 r6) {
        r6.A05.Epw(r5.A06.getValue());
        C287725af r4 = r6.A02;
        C287725af r3 = r5.A02;
        int A01 = r4.A01();
        for (int i = 0; i < A01; i++) {
            r4.A03(i, r3.A00(i));
        }
        r6.A00 = r5.A00;
        r6.A01 = r5.A01;
        r6.A03 = ((Boolean) r5.A05.getValue()).booleanValue();
    }
}
