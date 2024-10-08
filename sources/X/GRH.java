package X;

public abstract class GRH {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        if ((r19 & 48) == 32) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        if ((r4 & 384) == 256) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.GRG A00(X.GRJ r13, X.GRI r14, X.C287805an r15, X.C286575Wy r16, java.lang.Object r17, java.lang.Object r18, int r19) {
        /*
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x000e
            r1 = 469740043(0x1bffaa0b, float:4.22961E-22)
            java.lang.String r0 = "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:260)"
            X.0fL.A01(r1, r0)
        L_0x000e:
            r2 = r16
            java.lang.Object r8 = r2.ECw()
            java.lang.Object r3 = X.AnonymousClass5XT.A00
            r9 = r13
            r10 = r14
            r12 = r17
            r13 = r18
            if (r8 != r3) goto L_0x0027
            X.GRG r8 = new X.GRG
            r11 = r15
            r8.<init>(r9, r10, r11, r12, r13)
            r2.FLL(r8)
        L_0x0027:
            X.GRG r8 = (X.GRG) r8
            r4 = r19
            r0 = r19 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r1 = 32
            r7 = 1
            r15 = 0
            if (r0 <= r1) goto L_0x003b
            boolean r0 = r2.AGw(r12)
            if (r0 != 0) goto L_0x0040
        L_0x003b:
            r0 = r19 & 48
            r6 = 0
            if (r0 != r1) goto L_0x0041
        L_0x0040:
            r6 = 1
        L_0x0041:
            r0 = r4 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r5 = 256(0x100, float:3.59E-43)
            if (r0 <= r5) goto L_0x004f
            boolean r0 = r2.AGw(r13)
            if (r0 != 0) goto L_0x0054
        L_0x004f:
            r1 = r4 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r5) goto L_0x0055
        L_0x0054:
            r0 = 1
        L_0x0055:
            r6 = r6 | r0
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r19
            r0 = r0 ^ 24576(0x6000, float:3.4438E-41)
            r1 = 16384(0x4000, float:2.2959E-41)
            if (r0 <= r1) goto L_0x0067
            boolean r0 = r2.AGw(r9)
            if (r0 != 0) goto L_0x006c
        L_0x0067:
            r0 = r4 & 24576(0x6000, float:3.4438E-41)
            if (r0 == r1) goto L_0x006c
            r7 = 0
        L_0x006c:
            r6 = r6 | r7
            java.lang.Object r14 = r2.ECw()
            if (r6 != 0) goto L_0x0075
            if (r14 != r3) goto L_0x0085
        L_0x0075:
            X.IoC r14 = new X.IoC
            r16 = r9
            r17 = r8
            r18 = r12
            r19 = r13
            r14.<init>(r15, r16, r17, r18, r19)
            r2.FLL(r14)
        L_0x0085:
            X.0sa r14 = (X.C62320sa) r14
            X.C286645Xf.A05(r2, r14)
            boolean r1 = r2.AGw(r10)
            java.lang.Object r0 = r2.ECw()
            if (r1 != 0) goto L_0x0096
            if (r0 != r3) goto L_0x009b
        L_0x0096:
            r0 = 6
            X.J6U r0 = X.J6U.A00(r2, r10, r8, r0)
        L_0x009b:
            X.0sP r0 = (X.0sP) r0
            X.C286645Xf.A03(r2, r8, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00ac
            r0 = -640337835(0xffffffffd9d53855, float:-7.5020135E15)
            X.0fL.A00(r0)
        L_0x00ac:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GRH.A00(X.GRJ, X.GRI, X.5an, X.5Wy, java.lang.Object, java.lang.Object, int):X.GRG");
    }

    public static final GRG A01(GRJ grj, GRI gri, C286575Wy r9, float f, float f2, int i) {
        if (0fL.A02()) {
            0fL.A01(1364886622, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:316)");
        }
        Float valueOf = Float.valueOf(f);
        Float valueOf2 = Float.valueOf(f2);
        int i2 = i << 3;
        GRG A00 = A00(grj, gri, C287765aj.A02, r9, valueOf, valueOf2, C51971G9r.A04(i) | (57344 & i2) | (i2 & 458752));
        if (0fL.A02()) {
            0fL.A00(-161138920);
        }
        return A00;
    }

    public static final GRI A02(C286575Wy r2) {
        if (0fL.A02()) {
            0fL.A01(621579947, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        Object ECw = r2.ECw();
        if (ECw == AnonymousClass5XT.A00) {
            ECw = new GRI();
            r2.FLL(ECw);
        }
        GRI gri = (GRI) ECw;
        gri.A00(r2, 0);
        if (0fL.A02()) {
            0fL.A00(-343757249);
        }
        return gri;
    }
}
