package X;

import java.util.List;

/* renamed from: X.GZj  reason: case insensitive filesystem */
public abstract class C52610GZj {
    public static final GZQ A00;
    public static final C21114XFe A01 = new C21114XFe();

    static {
        List list = 0sn.A00;
        A00 = new GZQ(AnonymousClass6Gj.Horizontal, C52606GZf.A00, (C52640GaE) null, (C52640GaE) null, new IGU(2), list, list, list, 19E.A02(19B.A00), 0.0f, 0, 0, 0, 0, 0, 0, 0, false, false, false);
    }

    public static final long A00(JLH jlh, int i) {
        int A002;
        GZQ gzq = (GZQ) jlh;
        int i2 = gzq.A06;
        int i3 = gzq.A05;
        int i4 = -gzq.A08;
        int i5 = gzq.A03;
        long j = (((long) i) * ((long) (i2 + i3))) + ((long) i4) + ((long) i5);
        AnonymousClass6Gj r5 = gzq.A09;
        AnonymousClass6Gj r4 = AnonymousClass6Gj.Horizontal;
        long A0m = G9t.A0m(gzq.A0J);
        if (r5 == r4) {
            A002 = C51965G9l.A04(A0m);
        } else {
            A002 = C289005cr.A00(A0m);
        }
        long A03 = j - ((long) (A002 - C229632nm.A03(gzq.A0A.E3C(A002, i3, i4, i5, i - 1, i), 0, A002)));
        if (A03 < 0) {
            return 0;
        }
        return A03;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if ((r14 & 6) == 4) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        if ((r14 & 48) == 32) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.GZF A01(X.C286575Wy r11, X.C62320sa r12, int r13, int r14, int r15) {
        /*
            r0 = r15 & 1
            r3 = 0
            if (r0 == 0) goto L_0x0006
            r13 = 0
        L_0x0006:
            r5 = 0
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0015
            r1 = 1088479535(0x40e0e12f, float:7.027488)
            java.lang.String r0 = "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:86)"
            X.0fL.A01(r1, r0)
        L_0x0015:
            java.lang.Object[] r9 = new java.lang.Object[r3]
            X.5Tp r7 = X.GZF.A0b
            r0 = r14 & 14
            r0 = r0 ^ 6
            r1 = 4
            r6 = r11
            if (r0 <= r1) goto L_0x0027
            boolean r0 = r11.AGs(r13)
            if (r0 != 0) goto L_0x002c
        L_0x0027:
            r0 = r14 & 6
            r4 = 0
            if (r0 != r1) goto L_0x002d
        L_0x002c:
            r4 = 1
        L_0x002d:
            r0 = r14 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r2 = 32
            if (r0 <= r2) goto L_0x003b
            boolean r0 = r11.AGr(r5)
            if (r0 != 0) goto L_0x0040
        L_0x003b:
            r1 = r14 & 48
            r0 = 0
            if (r1 != r2) goto L_0x0041
        L_0x0040:
            r0 = 1
        L_0x0041:
            r4 = r4 | r0
            r0 = r14 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r1 = 256(0x100, float:3.59E-43)
            if (r0 <= r1) goto L_0x0050
            boolean r0 = r11.AGu(r12)
            if (r0 != 0) goto L_0x0054
        L_0x0050:
            r0 = r14 & 384(0x180, float:5.38E-43)
            if (r0 != r1) goto L_0x0055
        L_0x0054:
            r3 = 1
        L_0x0055:
            r4 = r4 | r3
            java.lang.Object r8 = r11.ECw()
            if (r4 != 0) goto L_0x0060
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r8 != r0) goto L_0x0068
        L_0x0060:
            X.GZk r8 = new X.GZk
            r8.<init>(r12, r13)
            r11.FLL(r8)
        L_0x0068:
            X.0sa r8 = (X.C62320sa) r8
            r10 = 0
            r11 = 4
            java.lang.Object r1 = X.C305136Gr.A00(r6, r7, r8, r9, r10, r11)
            X.GZF r1 = (X.GZF) r1
            X.5Oz r0 = r1.A0B
            r0.Epw(r12)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0083
            r0 = 1555684444(0x5cb9dc5c, float:4.18521267E17)
            X.0fL.A00(r0)
        L_0x0083:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52610GZj.A01(X.5Wy, X.0sa, int, int, int):X.GZF");
    }
}
