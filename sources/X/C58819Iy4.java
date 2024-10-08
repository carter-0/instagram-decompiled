package X;

/* renamed from: X.Iy4  reason: case insensitive filesystem */
public final class C58819Iy4 extends 0Yg implements 0sP {
    public final float A00;
    public final float A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final Object A06;
    public final Object A07;
    public final String A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58819Iy4(Object obj, Object obj2, String str, float f, float f2, int i, long j, long j2, long j3) {
        super(1);
        this.A02 = i;
        this.A07 = obj;
        this.A08 = str;
        this.A06 = obj2;
        this.A01 = f;
        this.A00 = f2;
        this.A05 = j;
        this.A04 = j2;
        this.A03 = j3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0058, code lost:
        if ((r1.longValue() % 2) != 1) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r46) {
        /*
            r45 = this;
            r1 = r45
            r0 = r46
            int r2 = r1.A02
            if (r2 == 0) goto L_0x002e
            X.6GH r0 = (X.AnonymousClass6GH) r0
            r7 = 0
            X.0qQ.A0B(r0, r7)
            java.lang.Object r2 = r1.A07
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Integer r3 = X.C304086Cc.A00(r2)
            java.lang.String r4 = r1.A08
            java.lang.Object r2 = r1.A06
            float r5 = r1.A01
            float r6 = r1.A00
            long r8 = r1.A05
            long r10 = r1.A04
            long r12 = r1.A03
            X.Iy4 r1 = new X.Iy4
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r12)
            X.64W r0 = r0.A00(r1)
            return r0
        L_0x002e:
            X.5Q4 r0 = (X.AnonymousClass5Q4) r0
            X.C51970G9q.A15(r0)
            java.lang.Object r3 = r1.A06
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            if (r3 != r2) goto L_0x009a
            java.lang.String r2 = r1.A08
            java.lang.Object r12 = r1.A07
            X.2DO r12 = (X.AnonymousClass2DO) r12
            float r10 = r1.A01
            float r9 = r1.A00
            if (r2 == 0) goto L_0x005a
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r2)
            if (r1 == 0) goto L_0x005a
            long r4 = r1.longValue()
            r1 = 2
            long r4 = r4 % r1
            r2 = 1
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 == 0) goto L_0x005c
        L_0x005a:
            r11 = 1065353216(0x3f800000, float:1.0)
        L_0x005c:
            r1 = 1094713344(0x41400000, float:12.0)
            float r1 = r0.F06(r1)
            float r4 = -r1
            X.5QD r7 = r0.Ayw()
            r3 = r7
            X.5QC r3 = (X.AnonymousClass5QC) r3
            X.5Q5 r1 = r3.A02
            X.5QB r6 = r1.A02
            long r1 = X.C51967G9n.A05(r6)
            X.5QF r8 = r3.A01     // Catch:{ all -> 0x0095 }
            r3 = 0
            r8.FHv(r3, r4)     // Catch:{ all -> 0x0095 }
            r5 = 1065353216(0x3f800000, float:1.0)
            long r3 = r8.AmQ()     // Catch:{ all -> 0x0095 }
            r8.EKJ(r3, r11, r5)     // Catch:{ all -> 0x0095 }
            float r4 = r0.F06(r10)     // Catch:{ all -> 0x0095 }
            float r3 = r0.F06(r9)     // Catch:{ all -> 0x0095 }
            long r16 = X.C288015bE.A00(r4, r3)     // Catch:{ all -> 0x0095 }
            r13 = 0
            r14 = r0
            r15 = r5
            r12.A01(r13, r14, r15, r16)     // Catch:{ all -> 0x0095 }
            goto L_0x016f
        L_0x0095:
            r3 = move-exception
            X.C51968G9o.A1G(r6, r7, r1)
            throw r3
        L_0x009a:
            java.lang.Object r9 = r1.A07
            X.2DO r9 = (X.AnonymousClass2DO) r9
            long r2 = r1.A05
            r43 = r2
            float r4 = r1.A01
            float r5 = r1.A00
            long r13 = r1.A04
            long r15 = r1.A03
            long r7 = r0.Bwg()
            float r2 = X.C288025bF.A00(r7)
            r3 = 1073741824(0x40000000, float:2.0)
            float r6 = r5 / r3
            float r1 = r0.F06(r6)
            float r2 = r2 - r1
            float r1 = X.C288025bF.A02(r7)
            float r1 = r1 / r3
            float r7 = r4 / r3
            float r7 = r0.F06(r7)
            float r1 = r1 - r7
            r8 = 1077936128(0x40400000, float:3.0)
            float r8 = r8 * r4
            r7 = 1090519040(0x41000000, float:8.0)
            float r8 = r8 / r7
            float r20 = r0.F06(r8)
            r11 = 1065353216(0x3f800000, float:1.0)
            float r19 = r0.F06(r11)
            float r18 = r0.F06(r3)
            float r8 = r1 - r20
            float r12 = r8 - r18
            float r7 = r2 - r19
            float r10 = r7 - r18
            long r28 = X.C289325dP.A00(r12, r10)
            float r12 = r0.F06(r4)
            float r10 = r20 + r18
            float r10 = r10 * r3
            float r12 = r12 + r10
            float r10 = r0.F06(r5)
            float r17 = r19 + r18
            float r17 = r17 * r3
            float r10 = r10 + r17
            long r30 = X.C288015bE.A00(r12, r10)
            float r10 = r0.F06(r6)
            float r10 = r10 + r19
            float r10 = r10 + r18
            r22 = 0
            long r32 = X.AnonymousClass6GR.A00(r10, r10)
            X.5dw r23 = X.C289635dw.A00
            r25 = 3
            r34 = 3
            r21 = r0
            r24 = r11
            r26 = r13
            r21.AQv(r22, r23, r24, r25, r26, r28, r30, r32)
            long r37 = X.C289325dP.A00(r8, r7)
            float r8 = r0.F06(r4)
            float r20 = r20 * r3
            float r8 = r8 + r20
            float r7 = r0.F06(r5)
            float r3 = r3 * r19
            float r7 = r7 + r3
            long r39 = X.C288015bE.A00(r8, r7)
            float r3 = r0.F06(r6)
            float r3 = r3 + r19
            long r41 = X.AnonymousClass6GR.A00(r3, r3)
            r30 = r0
            r31 = r22
            r32 = r23
            r33 = r11
            r35 = r15
            r30.AQv(r31, r32, r33, r34, r35, r37, r39, r41)
            X.5QD r3 = r0.Ayw()
            X.5QC r3 = (X.AnonymousClass5QC) r3
            X.5QF r6 = r3.A01
            r6.FHv(r1, r2)
            float r4 = r0.F06(r4)     // Catch:{ all -> 0x0175 }
            float r3 = r0.F06(r5)     // Catch:{ all -> 0x0175 }
            long r16 = X.C288015bE.A00(r4, r3)     // Catch:{ all -> 0x0175 }
            X.5bV r13 = X.C51968G9o.A0R(r43)     // Catch:{ all -> 0x0175 }
            r12 = r9
            r14 = r0
            r15 = r11
            r12.A01(r13, r14, r15, r16)     // Catch:{ all -> 0x0175 }
            float r1 = -r1
            float r0 = -r2
            r6.FHv(r1, r0)
            goto L_0x0172
        L_0x016f:
            X.C51968G9o.A1G(r6, r7, r1)
        L_0x0172:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0175:
            r3 = move-exception
            float r1 = -r1
            float r0 = -r2
            r6.FHv(r1, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58819Iy4.invoke(java.lang.Object):java.lang.Object");
    }
}
