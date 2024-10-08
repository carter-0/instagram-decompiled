package X;

public final class J6Z extends 0Yg implements 0sP {
    public final float A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J6Z(AnonymousClass6H1 r2, 0sP r3, 0rh r4, float f, int i) {
        super(1);
        this.A01 = i;
        this.A00 = f;
        if (i != 0) {
            this.A02 = r4;
            this.A04 = r2;
            this.A03 = r3;
        } else {
            this.A03 = r4;
            this.A04 = r2;
            this.A02 = r3;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x016d, code lost:
        r5.Epw(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.A01
            switch(r0) {
                case 0: goto L_0x0027;
                case 1: goto L_0x00a8;
                case 2: goto L_0x00fb;
                case 3: goto L_0x012e;
                case 4: goto L_0x0172;
                default: goto L_0x0005;
            }
        L_0x0005:
            float r1 = X.AnonymousClass7TE.A04(r7)
            java.lang.Object r0 = r6.A02
            X.4cd r0 = (X.C268024cd) r0
            float r2 = r0.Ezv(r1)
            float r0 = r6.A00
            float r2 = r2 * r0
            java.lang.Object r0 = r6.A04
            X.0rh r0 = (X.0rh) r0
            float r1 = r0.A00
            float r1 = r1 + r2
            r0.A00 = r1
            java.lang.Object r0 = r6.A03
            X.0sP r0 = (X.0sP) r0
            X.C51967G9n.A1Q(r0, r1)
        L_0x0024:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x0027:
            X.64v r7 = (X.C3026764v) r7
            X.5Oz r4 = r7.A06
            float r0 = X.C51972G9s.A02(r4)
            float r1 = java.lang.Math.abs(r0)
            float r3 = r6.A00
            float r0 = java.lang.Math.abs(r3)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            float r2 = X.C51972G9s.A02(r4)
            if (r0 < 0) goto L_0x0080
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0071
            r2 = 0
        L_0x0047:
            java.lang.Object r4 = r6.A03
            X.0rh r4 = (X.0rh) r4
            float r0 = r4.A00
            float r3 = r2 - r0
            java.lang.Object r0 = r6.A04
            X.6H1 r0 = (X.AnonymousClass6H1) r0
            java.lang.Object r1 = r6.A02
            X.0sP r1 = (X.0sP) r1
            float r0 = r0.EKW(r3)
            X.C51967G9n.A1Q(r1, r0)
            float r1 = X.AnonymousClass7TE.A00(r3, r0)
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x006b
            r7.A00()
        L_0x006b:
            r7.A00()
            r4.A00 = r2
            goto L_0x0024
        L_0x0071:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x007b
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0047
        L_0x0079:
            r2 = r3
            goto L_0x0047
        L_0x007b:
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0047
            goto L_0x0079
        L_0x0080:
            java.lang.Object r5 = r6.A03
            X.0rh r5 = (X.0rh) r5
            float r0 = r5.A00
            float r2 = r2 - r0
            java.lang.Object r0 = r6.A04
            X.6H1 r0 = (X.AnonymousClass6H1) r0
            java.lang.Object r1 = r6.A02
            X.0sP r1 = (X.0sP) r1
            float r0 = r0.EKW(r2)
            X.C51967G9n.A1Q(r1, r0)
            float r1 = X.AnonymousClass7TE.A00(r2, r0)
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a3
            r7.A00()
        L_0x00a3:
            float r0 = X.C51972G9s.A02(r4)
            goto L_0x00e4
        L_0x00a8:
            X.64v r7 = (X.C3026764v) r7
            X.5Oz r3 = r7.A06
            float r4 = X.C51972G9s.A02(r3)
            float r2 = r6.A00
            r1 = 0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00ec
            r4 = 0
        L_0x00b8:
            java.lang.Object r5 = r6.A02
            X.0rh r5 = (X.0rh) r5
            float r0 = r5.A00
            float r1 = r4 - r0
            java.lang.Object r0 = r6.A04
            X.6H1 r0 = (X.AnonymousClass6H1) r0
            float r2 = r0.EKW(r1)
            java.lang.Object r0 = r6.A03
            X.0sP r0 = (X.0sP) r0
            X.C51967G9n.A1Q(r0, r2)
            float r1 = X.AnonymousClass7TE.A00(r1, r2)
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00e8
            float r0 = X.C51972G9s.A02(r3)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00e8
        L_0x00e1:
            float r0 = r5.A00
            float r0 = r0 + r2
        L_0x00e4:
            r5.A00 = r0
            goto L_0x0024
        L_0x00e8:
            r7.A00()
            goto L_0x00e1
        L_0x00ec:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f6
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b8
        L_0x00f4:
            r4 = r2
            goto L_0x00b8
        L_0x00f6:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b8
            goto L_0x00f4
        L_0x00fb:
            X.5dM r7 = (X.C289295dM) r7
            long r2 = r7.A00
            float r1 = X.C289295dM.A01(r2)
            float r0 = r6.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0024
            float r1 = X.C289295dM.A02(r2)
            java.lang.Object r0 = r6.A03
            X.5Oz r0 = (X.C284945Oz) r0
            float r0 = X.C51971G9r.A02(r0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0024
            java.lang.Object r0 = r6.A04
            X.5Oz r0 = (X.C284945Oz) r0
            float r0 = X.C51971G9r.A02(r0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0024
            java.lang.Object r5 = r6.A02
            X.5Oz r5 = (X.C284945Oz) r5
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0v()
            goto L_0x016d
        L_0x012e:
            X.4ch r2 = X.C51968G9o.A0U(r7)
            java.lang.Object r0 = r6.A02
            com.instagram.model.mediasize.GifUrlImpl r0 = (com.instagram.model.mediasize.GifUrlImpl) r0
            float r4 = X.C69826Nsn.A00(r0)
            java.lang.Object r5 = r6.A04
            X.5Oz r5 = (X.C284945Oz) r5
            long r0 = r2.Bwh()
            int r0 = X.C51965G9l.A04(r0)
            X.C51967G9n.A15(r5, r0)
            float r1 = r6.A00
            r0 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0024
            java.lang.Object r3 = r6.A03
            X.5Oz r3 = (X.C284945Oz) r3
            long r1 = r2.Bwh()
            int r1 = X.C289005cr.A00(r1)
            X.C51967G9n.A15(r3, r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0169
            int r0 = X.C51971G9r.A0B(r3)
        L_0x0169:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x016d:
            r5.Epw(r0)
            goto L_0x0024
        L_0x0172:
            java.lang.Object r5 = r6.A03
            X.IR5 r5 = (X.IR5) r5
            java.lang.Object r4 = r6.A02
            X.7Dt r4 = (X.C328167Dt) r4
            X.HiO r0 = new X.HiO
            r0.<init>(r4)
            r5.A00 = r0
            float r3 = r6.A00
            java.lang.Object r2 = r6.A04
            X.7Rk r2 = (X.C331547Rk) r2
            X.GAV r0 = r2.A01
            float r1 = r0.A00
            boolean r0 = r2.A06
            r4.A02(r3, r1, r0)
            r0 = 17
            X.GOz r1 = new X.GOz
            r1.<init>((int) r0, (java.lang.Object) r5, (java.lang.Object) r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J6Z.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J6Z(Object obj, Object obj2, Object obj3, float f, int i) {
        super(1);
        this.A01 = i;
        this.A00 = f;
        this.A03 = obj;
        this.A04 = obj2;
        this.A02 = obj3;
    }
}
