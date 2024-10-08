package X;

/* renamed from: X.GBq  reason: case insensitive filesystem */
public final class C52019GBq {
    public final AnonymousClass4DH A00;
    public final C227232is A01;
    public final GD6 A02;
    public final GD9 A03;
    public final GBE A04;

    public C52019GBq(AnonymousClass4DH r2, C227232is r3, GBE gbe, GD6 gd6, GD9 gd9) {
        0qQ.A0B(gd9, 3);
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = gd9;
        this.A02 = gd6;
        this.A04 = gbe;
    }

    public final C52058GDe A04(C267324bN r2) {
        0qQ.A0B(r2, 0);
        return this.A02.A0A.BzC(r2);
    }

    public final int A03() {
        return this.A01.A0N().A06();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C52078GDy A05(int r11) {
        /*
            r10 = this;
            X.2is r0 = r10.A01
            X.GBj r1 = r0.A0N()
            r0 = 0
            android.view.View r1 = r1.A0A(r11)
            if (r1 == 0) goto L_0x009c
            java.lang.Object r8 = r1.getTag()
        L_0x0011:
            boolean r1 = r8 instanceof X.C52079GDz
            if (r1 == 0) goto L_0x009b
            X.GDz r8 = (X.C52079GDz) r8
            if (r8 == 0) goto L_0x009b
            X.GD9 r1 = r10.A03
            X.4bN r9 = r1.A03(r11)
            if (r9 == 0) goto L_0x009f
            X.GBE r4 = r10.A04
            X.GD6 r1 = r10.A02
            X.GBg r1 = r1.A0A
            X.GDe r2 = r1.BzC(r9)
            r1 = 1
            X.0qQ.A0B(r2, r1)
            java.lang.Integer r1 = r2.A0H
            r6 = 0
            if (r1 == 0) goto L_0x004e
            int r3 = r1.intValue()
            java.util.List r2 = X.C52076GDw.A01(r9)
            if (r2 == 0) goto L_0x004e
            java.util.List r1 = r9.A0R
            if (r1 == 0) goto L_0x0046
            java.lang.Object r6 = r1.get(r3)
        L_0x0046:
            int r1 = r2.indexOf(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
        L_0x004e:
            com.instagram.common.session.UserSession r7 = r4.A0a
            boolean r1 = X.C52076GDw.A05(r9, r7)
            r5 = r1 ^ 1
            r4 = 0
            X.0qQ.A0B(r7, r4)
            X.0Tu r3 = X.0Tu.A05
            r1 = 36327013778208891(0x810f3a0000387b, double:3.0366880182582116E-306)
            boolean r1 = X.182.A06(r3, r7, r1)
            if (r1 == 0) goto L_0x0077
            boolean r1 = X.C52076GDw.A05(r9, r7)
            if (r1 == 0) goto L_0x0077
            boolean r1 = r9.CcK()
            if (r1 != 0) goto L_0x0077
            r5 = 0
            if (r6 == 0) goto L_0x0077
            r5 = 1
        L_0x0077:
            boolean r1 = X.C52076GDw.A02(r9)
            if (r1 == 0) goto L_0x009f
            if (r5 == 0) goto L_0x009f
            java.util.List r3 = r8.A0A
            if (r6 == 0) goto L_0x009b
            int r1 = r3.size()
            X.2HY r1 = X.C229632nm.A0C(r4, r1)
            int r2 = r6.intValue()
            boolean r1 = r1.A01(r2)
            if (r1 == 0) goto L_0x009b
            java.lang.Object r0 = r3.get(r2)
            X.GDy r0 = (X.C52078GDy) r0
        L_0x009b:
            return r0
        L_0x009c:
            r8 = r0
            goto L_0x0011
        L_0x009f:
            X.GDy r0 = r8.A07
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52019GBq.A05(int):X.GDy");
    }

    public static int A00(C52016GBn gBn) {
        return C52016GBn.A01(gBn).A03();
    }

    public static C52058GDe A01(C267324bN r1, C52016GBn gBn) {
        return C52016GBn.A01(gBn).A04(r1);
    }

    public static C52078GDy A02(C52016GBn gBn) {
        C52019GBq A012 = C52016GBn.A01(gBn);
        return A012.A05(A012.A03());
    }
}
