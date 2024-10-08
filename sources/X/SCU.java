package X;

public abstract class SCU {
    public static final SNH A00 = SNH.A01("k");
    public static final SNH A01 = SNH.A01("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x014f, code lost:
        if (r3.A01 == 1.0f) goto L_0x0151;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C11816Sh2 A00(X.S7N r22, X.C12828T8z r23) {
        /*
            r2 = r23
            java.lang.Integer r3 = r2.A0E()
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r0 = 0
            r5 = 0
            if (r3 != r1) goto L_0x0010
            r5 = 1
            r2.A0J()
        L_0x0010:
            r6 = 0
            r12 = 0
            r14 = 0
            r13 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r7 = 0
            r8 = 0
        L_0x0019:
            boolean r1 = r2.A0Q()
            if (r1 == 0) goto L_0x00d0
            X.SNH r1 = A01
            int r3 = r2.A0D(r1)
            r1 = r22
            switch(r3) {
                case 0: goto L_0x00ae;
                case 1: goto L_0x00a8;
                case 2: goto L_0x0031;
                case 3: goto L_0x0058;
                case 4: goto L_0x005d;
                case 5: goto L_0x0053;
                case 6: goto L_0x004e;
                case 7: goto L_0x0049;
                case 8: goto L_0x0044;
                case 9: goto L_0x003f;
                default: goto L_0x002a;
            }
        L_0x002a:
            r2.A0M()
            r2.A0N()
            goto L_0x0019
        L_0x0031:
            X.Sh9 r4 = X.C11823Sh9.A00
            r3 = 1065353216(0x3f800000, float:1.0)
            java.util.ArrayList r1 = X.SL6.A00(r1, r4, r2, r3, r0)
            X.QGc r13 = new X.QGc
            r13.<init>(r1)
            goto L_0x0019
        L_0x003f:
            X.QGY r10 = X.C11390SRe.A01(r1, r2, r0)
            goto L_0x0019
        L_0x0044:
            X.QGY r9 = X.C11390SRe.A01(r1, r2, r0)
            goto L_0x0019
        L_0x0049:
            X.QGY r8 = X.C11390SRe.A01(r1, r2, r0)
            goto L_0x0019
        L_0x004e:
            X.QGY r7 = X.C11390SRe.A01(r1, r2, r0)
            goto L_0x0019
        L_0x0053:
            X.QGa r11 = X.C11390SRe.A03(r1, r2)
            goto L_0x0019
        L_0x0058:
            java.lang.String r3 = "Lottie doesn't support 3D layers."
            r1.A03(r3)
        L_0x005d:
            X.QGY r6 = X.C11390SRe.A01(r1, r2, r0)
            java.util.List r3 = r6.A00
            boolean r4 = r3.isEmpty()
            r21 = 0
            if (r4 == 0) goto L_0x0084
            java.lang.Float r19 = java.lang.Float.valueOf(r21)
            r16 = 0
            float r4 = r1.A00
            java.lang.Float r18 = java.lang.Float.valueOf(r4)
            X.ST4 r15 = new X.ST4
            r20 = r19
            r17 = r1
            r15.<init>((android.view.animation.Interpolator) r16, (X.S7N) r17, (java.lang.Float) r18, (java.lang.Object) r19, (java.lang.Object) r20, (float) r21)
            r3.add(r15)
            goto L_0x0019
        L_0x0084:
            java.lang.Object r4 = r3.get(r0)
            X.ST4 r4 = (X.ST4) r4
            java.lang.Object r4 = r4.A0E
            if (r4 != 0) goto L_0x0019
            java.lang.Float r19 = java.lang.Float.valueOf(r21)
            r16 = 0
            float r4 = r1.A00
            java.lang.Float r18 = java.lang.Float.valueOf(r4)
            X.ST4 r15 = new X.ST4
            r20 = r19
            r17 = r1
            r15.<init>((android.view.animation.Interpolator) r16, (X.S7N) r17, (java.lang.Float) r18, (java.lang.Object) r19, (java.lang.Object) r20, (float) r21)
            r3.set(r0, r15)
            goto L_0x0019
        L_0x00a8:
            X.Tgd r14 = X.SL5.A01(r1, r2)
            goto L_0x0019
        L_0x00ae:
            r2.A0J()
        L_0x00b1:
            boolean r3 = r2.A0Q()
            if (r3 == 0) goto L_0x00cb
            X.SNH r3 = A00
            int r3 = r2.A0D(r3)
            if (r3 == 0) goto L_0x00c6
            r2.A0M()
            r2.A0N()
            goto L_0x00b1
        L_0x00c6:
            X.Sgm r12 = X.SL5.A00(r1, r2)
            goto L_0x00b1
        L_0x00cb:
            r2.A0L()
            goto L_0x0019
        L_0x00d0:
            if (r5 == 0) goto L_0x00d5
            r2.A0L()
        L_0x00d5:
            if (r12 == 0) goto L_0x00f0
            boolean r1 = r12.CcS()
            if (r1 == 0) goto L_0x00f1
            java.util.List r1 = r12.A00
            java.lang.Object r1 = r1.get(r0)
            X.ST4 r1 = (X.ST4) r1
            java.lang.Object r2 = r1.A0E
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            r1 = 0
            boolean r1 = r2.equals(r1, r1)
            if (r1 == 0) goto L_0x00f1
        L_0x00f0:
            r12 = 0
        L_0x00f1:
            if (r14 == 0) goto L_0x0112
            boolean r1 = r14 instanceof X.C11801Sgn
            if (r1 != 0) goto L_0x0113
            boolean r1 = r14.CcS()
            if (r1 == 0) goto L_0x0113
            java.util.List r1 = r14.BKA()
            java.lang.Object r1 = r1.get(r0)
            X.ST4 r1 = (X.ST4) r1
            java.lang.Object r2 = r1.A0E
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            r1 = 0
            boolean r1 = r2.equals(r1, r1)
            if (r1 == 0) goto L_0x0113
        L_0x0112:
            r14 = 0
        L_0x0113:
            if (r6 == 0) goto L_0x012e
            boolean r1 = r6.CcS()
            if (r1 == 0) goto L_0x012f
            java.util.List r1 = r6.A00
            java.lang.Object r1 = r1.get(r0)
            X.ST4 r1 = (X.ST4) r1
            java.lang.Object r1 = r1.A0E
            float r2 = X.AnonymousClass7TE.A04(r1)
            r1 = 0
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x012f
        L_0x012e:
            r6 = 0
        L_0x012f:
            if (r13 == 0) goto L_0x0151
            boolean r1 = r13.CcS()
            if (r1 == 0) goto L_0x0152
            java.util.List r1 = r13.A00
            java.lang.Object r1 = r1.get(r0)
            X.ST4 r1 = (X.ST4) r1
            java.lang.Object r3 = r1.A0E
            X.S0z r3 = (X.S0z) r3
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r3.A00
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0152
            float r1 = r3.A01
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0152
        L_0x0151:
            r13 = 0
        L_0x0152:
            if (r9 == 0) goto L_0x016d
            boolean r1 = r9.CcS()
            if (r1 == 0) goto L_0x016e
            java.util.List r1 = r9.A00
            java.lang.Object r1 = r1.get(r0)
            X.ST4 r1 = (X.ST4) r1
            java.lang.Object r1 = r1.A0E
            float r2 = X.AnonymousClass7TE.A04(r1)
            r1 = 0
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x016e
        L_0x016d:
            r9 = 0
        L_0x016e:
            if (r10 == 0) goto L_0x0189
            boolean r1 = r10.CcS()
            if (r1 == 0) goto L_0x018a
            java.util.List r1 = r10.A00
            java.lang.Object r0 = r1.get(r0)
            X.ST4 r0 = (X.ST4) r0
            java.lang.Object r0 = r0.A0E
            float r1 = X.AnonymousClass7TE.A04(r0)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x018a
        L_0x0189:
            r10 = 0
        L_0x018a:
            X.Sh2 r5 = new X.Sh2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SCU.A00(X.S7N, X.T8z):X.Sh2");
    }
}
