package X;

/* renamed from: X.SRe  reason: case insensitive filesystem */
public abstract class C11390SRe {
    /* JADX WARNING: type inference failed for: r0v1, types: [X.QGX, X.Sgo] */
    public static QGX A00(S7N s7n, C12828T8z t8z) {
        return new C11802Sgo(SL6.A00(s7n, C11818Sh4.A00, t8z, 1.0f, false));
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.QGY, X.Sgo] */
    public static QGY A01(S7N s7n, C12828T8z t8z, boolean z) {
        float f;
        if (z) {
            f = SSo.A00();
        } else {
            f = 1.0f;
        }
        return new C11802Sgo(SL6.A00(s7n, C11819Sh5.A00, t8z, f, false));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Tbp, X.Sh3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.QGZ, X.Sgo] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0027, code lost:
        r3 = r11.A00;
        r2 = r3.length;
        r1 = r10.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.QGZ A02(X.S7N r9, X.C12828T8z r10, int r11) {
        /*
            X.Sh3 r1 = new X.Sh3
            r1.<init>()
            r1.A00 = r11
            r0 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            java.util.ArrayList r8 = X.SL6.A00(r9, r1, r10, r0, r7)
            r9 = 0
        L_0x000f:
            int r0 = r8.size()
            if (r9 >= r0) goto L_0x0068
            java.lang.Object r4 = r8.get(r9)
            X.ST4 r4 = (X.ST4) r4
            java.lang.Object r11 = r4.A0E
            X.S5S r11 = (X.S5S) r11
            java.lang.Object r10 = r4.A08
            X.S5S r10 = (X.S5S) r10
            if (r11 == 0) goto L_0x0062
            if (r10 == 0) goto L_0x0062
            float[] r3 = r11.A00
            int r2 = r3.length
            float[] r1 = r10.A00
            int r0 = r1.length
            if (r2 == r0) goto L_0x0062
            int r6 = r2 + r0
            float[] r5 = new float[r6]
            java.lang.System.arraycopy(r3, r7, r5, r7, r2)
            java.lang.System.arraycopy(r1, r7, r5, r2, r0)
            java.util.Arrays.sort(r5)
            r4 = 2143289344(0x7fc00000, float:NaN)
            r3 = 0
            r2 = 0
        L_0x0040:
            if (r3 >= r6) goto L_0x0051
            r1 = r5[r3]
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x004e
            r5[r2] = r1
            int r2 = r2 + 1
            r4 = r5[r3]
        L_0x004e:
            int r3 = r3 + 1
            goto L_0x0040
        L_0x0051:
            float[] r0 = java.util.Arrays.copyOfRange(r5, r7, r2)
            X.S5S r1 = r11.A00(r0)
            X.S5S r0 = r10.A00(r0)
            X.ST4 r4 = new X.ST4
            r4.<init>(r1, r0)
        L_0x0062:
            r8.set(r9, r4)
            int r9 = r9 + 1
            goto L_0x000f
        L_0x0068:
            X.QGZ r0 = new X.QGZ
            r0.<init>(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11390SRe.A02(X.S7N, X.T8z, int):X.QGZ");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Sgo, X.QGa] */
    public static C7487QGa A03(S7N s7n, C12828T8z t8z) {
        return new C11802Sgo(SL6.A00(s7n, C11820Sh6.A00, t8z, 1.0f, false));
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.QGb, X.Sgo] */
    public static C7488QGb A04(S7N s7n, C12828T8z t8z) {
        return new C11802Sgo(SL6.A00(s7n, C11822Sh8.A00, t8z, SSo.A00(), true));
    }
}
