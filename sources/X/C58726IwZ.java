package X;

/* renamed from: X.IwZ  reason: case insensitive filesystem */
public final class C58726IwZ extends 0Yg implements 0sP {
    public final float A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58726IwZ(float f, int i) {
        super(1);
        this.A01 = i;
        this.A00 = f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c5 A[Catch:{ all -> 0x01ea, all -> 0x01f2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r43) {
        /*
            r42 = this;
            r4 = r42
            r5 = r43
            int r0 = r4.A01
            switch(r0) {
                case 6: goto L_0x0016;
                case 7: goto L_0x01e3;
                case 8: goto L_0x0009;
                case 9: goto L_0x0025;
                case 10: goto L_0x01cf;
                case 11: goto L_0x0040;
                case 12: goto L_0x004a;
                default: goto L_0x0009;
            }
        L_0x0009:
            com.instagram.ui.widget.framelayout.MediaFrameLayout r5 = (com.instagram.ui.widget.framelayout.MediaFrameLayout) r5
            r0 = 0
            X.0qQ.A0B(r5, r0)
            float r0 = r4.A00
            r5.A00 = r0
        L_0x0013:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0016:
            X.5RU r2 = X.C51968G9o.A0S(r5)
            r0 = 0
            long r0 = X.C285615Rz.A00(r0, r0)
            r2.EpB(r0)
            float r1 = r4.A00
            goto L_0x0039
        L_0x0025:
            X.5RU r2 = X.C51968G9o.A0S(r5)
            r0 = 0
            long r0 = X.C285615Rz.A00(r0, r0)
            r2.EpB(r0)
            float r1 = r4.A00
            r0 = -1098907648(0xffffffffbe800000, float:-0.25)
            float r1 = r1 * r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
        L_0x0039:
            r2.EjG(r1)
            r2.EjH(r1)
            goto L_0x0013
        L_0x0040:
            X.5RU r1 = X.C51968G9o.A0S(r5)
            float r0 = r4.A00
            r1.EOX(r0)
            goto L_0x0013
        L_0x004a:
            X.5Q4 r5 = (X.AnonymousClass5Q4) r5
            r15 = 0
            X.0qQ.A0B(r5, r15)
            r5.AQW()
            X.5QD r9 = r5.Ayw()
            X.5QC r9 = (X.AnonymousClass5QC) r9
            X.5Q5 r0 = r9.A02
            X.5QB r0 = r0.A02
            X.5QA r0 = r0.A01
            r41 = r0
            r17 = 0
            float r2 = X.C51969G9p.A01(r5)
            r0 = r17
            X.5VN r3 = X.C289285dL.A00(r2, r0)
            X.5S8 r2 = new X.5S8
            r2.<init>()
            r11 = 14
            r2.EPk(r11)
            float r1 = r4.A00
            r0 = r41
            r0.EK4(r3, r2)     // Catch:{ all -> 0x01f2 }
            r0 = 1135869952(0x43b40000, float:360.0)
            float r1 = r1 % r0
            float r7 = java.lang.Math.abs(r1)     // Catch:{ all -> 0x01f2 }
            r6 = 0
            r3 = 1119092736(0x42b40000, float:90.0)
            int r0 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x008d
            goto L_0x00a9
        L_0x008d:
            r4 = 1065353216(0x3f800000, float:1.0)
            r2 = 1127481344(0x43340000, float:180.0)
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x009d
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x009d
            float r7 = r7 - r3
        L_0x009a:
            float r7 = r7 / r3
            float r4 = r4 - r7
            goto L_0x00b7
        L_0x009d:
            r1 = 1132920832(0x43870000, float:270.0)
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x00b0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00b0
            float r7 = r7 - r2
            goto L_0x00ad
        L_0x00a9:
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x008d
        L_0x00ad:
            float r4 = r7 / r3
            goto L_0x00b7
        L_0x00b0:
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b6
            float r7 = r7 - r1
            goto L_0x009a
        L_0x00b6:
            r4 = 0
        L_0x00b7:
            float r23 = java.lang.Math.abs(r4)     // Catch:{ all -> 0x01f2 }
            r0 = 1092616192(0x41200000, float:10.0)
            float r23 = r23 * r0
            r33 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r23 > r33 ? 1 : (r23 == r33 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c7
            r23 = 1065353216(0x3f800000, float:1.0)
        L_0x00c7:
            long r0 = r5.Bwg()     // Catch:{ all -> 0x01f2 }
            float r14 = X.C288025bF.A02(r0)     // Catch:{ all -> 0x01f2 }
            float r8 = X.C288025bF.A00(r0)     // Catch:{ all -> 0x01f2 }
            r10 = 6
            java.lang.Float r0 = java.lang.Float.valueOf(r6)     // Catch:{ all -> 0x01f2 }
            r2 = -16777216(0xffffffffff000000, double:NaN)
            r12 = 32
            long r2 = r2 << r12
            X.0eP r24 = X.C51971G9r.A0x(r0, r2)     // Catch:{ all -> 0x01f2 }
            r0 = 1048576000(0x3e800000, float:0.25)
            java.lang.Float r7 = java.lang.Float.valueOf(r0)     // Catch:{ all -> 0x01f2 }
            r0 = -5963127(0xffffffffffa50289, double:NaN)
            long r0 = r0 << r12
            X.0eP r25 = X.C51971G9r.A0x(r7, r0)     // Catch:{ all -> 0x01f2 }
            r0 = 1056964608(0x3f000000, float:0.5)
            java.lang.Float r7 = java.lang.Float.valueOf(r0)     // Catch:{ all -> 0x01f2 }
            r0 = -7010247(0xffffffffff950839, double:NaN)
            long r0 = r0 << r12
            X.0eP r26 = X.C51971G9r.A0x(r7, r0)     // Catch:{ all -> 0x01f2 }
            r0 = 1058642330(0x3f19999a, float:0.6)
            java.lang.Float r7 = java.lang.Float.valueOf(r0)     // Catch:{ all -> 0x01f2 }
            r0 = -9501651(0xffffffffff6f042d, double:NaN)
            long r0 = r0 << r12
            X.0eP r27 = X.C51971G9r.A0x(r7, r0)     // Catch:{ all -> 0x01f2 }
            r0 = 1061158912(0x3f400000, float:0.75)
            java.lang.Float r7 = java.lang.Float.valueOf(r0)     // Catch:{ all -> 0x01f2 }
            r0 = -2442879(0xffffffffffdab981, double:NaN)
            long r0 = r0 << r12
            X.0eP r28 = X.C51971G9r.A0x(r7, r0)     // Catch:{ all -> 0x01f2 }
            java.lang.Float r13 = java.lang.Float.valueOf(r33)     // Catch:{ all -> 0x01f2 }
            X.0eP r29 = X.C51971G9r.A0x(r13, r2)     // Catch:{ all -> 0x01f2 }
            X.0eP[] r0 = new X.0eP[]{r24, r25, r26, r27, r28, r29}     // Catch:{ all -> 0x01f2 }
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r10)     // Catch:{ all -> 0x01f2 }
            X.0eP[] r0 = (X.0eP[]) r0     // Catch:{ all -> 0x01f2 }
            long r36 = X.C289325dP.A00(r14, r8)     // Catch:{ all -> 0x01f2 }
            long r38 = X.C289325dP.A00(r6, r6)     // Catch:{ all -> 0x01f2 }
            r34 = r0
            r35 = r15
            X.Gey r20 = X.C304796Fg.A01(r34, r35, r36, r38)     // Catch:{ all -> 0x01f2 }
            r12 = 1109393408(0x42200000, float:40.0)
            float r0 = r5.F06(r12)     // Catch:{ all -> 0x01f2 }
            r21 = 0
            long r29 = X.AnonymousClass6GR.A00(r0, r0)     // Catch:{ all -> 0x01f2 }
            r31 = 0
            long r27 = X.C51968G9o.A0H(r5)     // Catch:{ all -> 0x01f2 }
            X.5dw r22 = X.C289635dw.A00     // Catch:{ all -> 0x01f2 }
            r19 = r5
            r24 = r11
            r25 = r17
            r19.AQu(r20, r21, r22, r23, r24, r25, r27, r29)     // Catch:{ all -> 0x01f2 }
            float r4 = r4 * r8
            r16 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 * r16
            float r7 = -r4
            X.5QF r4 = r9.A01     // Catch:{ all -> 0x01f2 }
            r4.FHv(r6, r7)     // Catch:{ all -> 0x01f2 }
            r11 = 3
            r0 = 1051372203(0x3eaaaaab, float:0.33333334)
            java.lang.Float r9 = java.lang.Float.valueOf(r0)     // Catch:{ all -> 0x01ea }
            long r0 = X.AnonymousClass5RW.A09     // Catch:{ all -> 0x01ea }
            long r2 = X.C285595Rx.A02(X.AnonymousClass5RX.A0K[(int) (r0 & 63)], X.AnonymousClass5RW.A03(r0), X.AnonymousClass5RW.A02(r0), X.AnonymousClass5RW.A01(r0), r6)     // Catch:{ all -> 0x01ea }
            X.0eP r9 = X.C51971G9r.A0x(r9, r2)     // Catch:{ all -> 0x01ea }
            r2 = 1059760811(0x3f2aaaab, float:0.6666667)
            java.lang.Float r10 = java.lang.Float.valueOf(r2)     // Catch:{ all -> 0x01ea }
            r2 = 1056964608(0x3f000000, float:0.5)
            long r2 = X.C285595Rx.A02(X.AnonymousClass5RX.A0K[(int) (r0 & 63)], X.AnonymousClass5RW.A03(r0), X.AnonymousClass5RW.A02(r0), X.AnonymousClass5RW.A01(r0), r2)     // Catch:{ all -> 0x01ea }
            X.0eP r2 = X.C51971G9r.A0x(r10, r2)     // Catch:{ all -> 0x01ea }
            long r0 = X.C285595Rx.A02(X.AnonymousClass5RX.A0K[(int) (r0 & 63)], X.AnonymousClass5RW.A03(r0), X.AnonymousClass5RW.A02(r0), X.AnonymousClass5RW.A01(r0), r6)     // Catch:{ all -> 0x01ea }
            X.0eP r0 = X.C51971G9r.A0x(r13, r0)     // Catch:{ all -> 0x01ea }
            X.0eP[] r0 = new X.0eP[]{r9, r2, r0}     // Catch:{ all -> 0x01ea }
            float r1 = r8 * r16
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r11)     // Catch:{ all -> 0x01ea }
            X.0eP[] r0 = (X.0eP[]) r0     // Catch:{ all -> 0x01ea }
            long r27 = X.C289325dP.A00(r6, r1)     // Catch:{ all -> 0x01ea }
            r23 = r0
            r24 = r15
            r25 = r38
            X.Gey r30 = X.C304796Fg.A01(r23, r24, r25, r27)     // Catch:{ all -> 0x01ea }
            r34 = 6
            r0 = 1077936128(0x40400000, float:3.0)
            float r8 = r8 * r0
            long r37 = X.C288015bE.A00(r14, r8)     // Catch:{ all -> 0x01ea }
            float r0 = r5.F06(r12)     // Catch:{ all -> 0x01ea }
            long r39 = X.AnonymousClass6GR.A00(r0, r0)     // Catch:{ all -> 0x01ea }
            r29 = r5
            r32 = r22
            r35 = r17
            r29.AQu(r30, r31, r32, r33, r34, r35, r37, r39)     // Catch:{ all -> 0x01ea }
            float r1 = -r7
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4.FHv(r0, r1)     // Catch:{ all -> 0x01f2 }
            r41.EIm()
            goto L_0x0013
        L_0x01cf:
            X.GqI r5 = (X.C53547GqI) r5
            r1 = 0
            X.0qQ.A0B(r5, r1)
            float r0 = r4.A00
            r3 = 0
            r6 = 507(0x1fb, float:7.1E-43)
            r2 = r5
            r4 = r3
            r5 = r0
            r7 = r1
            X.GqI r0 = X.C53547GqI.A00(r2, r3, r4, r5, r6, r7)
            return r0
        L_0x01e3:
            java.lang.String r0 = "setName"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x01ea:
            r2 = move-exception
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            float r0 = -r7
            r4.FHv(r1, r0)     // Catch:{ all -> 0x01f2 }
            throw r2     // Catch:{ all -> 0x01f2 }
        L_0x01f2:
            r0 = move-exception
            r41.EIm()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58726IwZ.invoke(java.lang.Object):java.lang.Object");
    }
}
