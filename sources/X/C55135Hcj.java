package X;

/* renamed from: X.Hcj  reason: case insensitive filesystem */
public abstract class C55135Hcj {
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r15, X.C15050ULg r16, X.C62320sa r17, X.0sL r18, X.AnonymousClass62P r19, int r20, int r21, int r22, boolean r23) {
        /*
            r8 = r19
            r0 = 4
            r9 = r17
            r6 = r18
            X.DbW.A1N(r9, r0, r6)
            r0 = 1112539571(0x425001b3, float:52.00166)
            r1 = r15
            r15.ExV(r0)
            r10 = r22
            r4 = r22 & 1
            r12 = r21
            if (r4 == 0) goto L_0x0142
            r2 = r21 | 6
        L_0x001b:
            r0 = r22 & 2
            r11 = r20
            if (r0 == 0) goto L_0x0137
            r2 = r2 | 48
        L_0x0023:
            r0 = r22 & 4
            r7 = r16
            if (r0 == 0) goto L_0x012c
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x002b:
            r0 = r22 & 8
            r14 = r23
            if (r0 == 0) goto L_0x0121
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x0033:
            r0 = r22 & 16
            if (r0 == 0) goto L_0x0116
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x0039:
            r3 = r22 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r3 != 0) goto L_0x0047
            r0 = r21 & r0
            if (r0 != 0) goto L_0x0048
            int r0 = X.G9t.A0J(r15, r6)
        L_0x0047:
            r2 = r2 | r0
        L_0x0048:
            r3 = 74899(0x12493, float:1.04956E-40)
            r3 = r3 & r2
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r3 != r0) goto L_0x0069
            boolean r0 = r15.Bwn()
            if (r0 == 0) goto L_0x0069
            r15.Evl()
        L_0x005a:
            X.5Xd r0 = r1.ASQ()
            if (r0 == 0) goto L_0x0068
            r13 = 1
            X.JAc r5 = new X.JAc
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0.A06 = r5
        L_0x0068:
            return
        L_0x0069:
            if (r4 == 0) goto L_0x006d
            X.62P r8 = X.C55354HgM.A00
        L_0x006d:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x007b
            r3 = -762929251(0xffffffffd2869f9d, float:-2.89101742E11)
            java.lang.String r0 = "com.instagram.schools.tab.ui.SchoolRootComponent (SchoolRootComposeComponents.kt:36)"
            X.0fL.A01(r3, r0)
        L_0x007b:
            r0 = -1465864110(0xffffffffa8a0b052, float:-1.7840035E-14)
            boolean r0 = X.C51973G9u.A1N(r15, r0, r2)
            java.lang.Object r3 = r15.ECw()
            if (r0 != 0) goto L_0x008c
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r3 != r0) goto L_0x0095
        L_0x008c:
            r0 = 3
            X.Wvp r3 = new X.Wvp
            r3.<init>(r8, r0)
            r15.FLL(r3)
        L_0x0095:
            X.0sa r3 = (X.C62320sa) r3
            X.5Wx r5 = X.C51965G9l.A0G(r15)
            int r0 = r2 >> 3
            r2 = r0 & 14
            r0 = 2
            X.GZF r16 = X.C52610GZj.A01(r15, r3, r11, r2, r0)
            java.lang.Object r0 = r15.ECw()
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            java.lang.Object r0 = X.C51974G9v.A0Y(r15, r0, r4)
            X.6FV r0 = (X.AnonymousClass6FV) r0
            X.4Cq r2 = r0.A00
            r0 = -1465861554(0xffffffffa8a0ba4e, float:-1.7844365E-14)
            java.lang.Object r3 = X.C51967G9n.A0m(r15, r0)
            if (r3 != r4) goto L_0x00ef
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r8)
            java.util.Iterator r4 = r8.iterator()
        L_0x00c3:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00e8
            java.lang.Object r0 = r4.next()
            X.HMW r0 = (X.HMW) r0
            int r0 = r0.A00
            java.lang.Integer r20 = X.AnonymousClass05K.A00
            java.lang.Integer r18 = java.lang.Integer.valueOf(r0)
            r19 = 0
            X.Gmg r0 = new X.Gmg
            r21 = r19
            r22 = r19
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22)
            r3.add(r0)
            goto L_0x00c3
        L_0x00e8:
            X.62P r3 = X.AnonymousClass62Q.A00(r3)
            r15.FLL(r3)
        L_0x00ef:
            X.62P r3 = (X.AnonymousClass62P) r3
            X.C286565Wx.A0I(r5)
            r0 = 1674781681(0x63d323f1, float:7.7897057E21)
            X.J9r r15 = new X.J9r
            r17 = r7
            r18 = r9
            r19 = r6
            r20 = r8
            r21 = r3
            r22 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r0 = X.C51975G9x.A1T(r1, r15, r0)
            if (r0 == 0) goto L_0x005a
            r0 = -540035776(0xffffffffdfcfb540, float:-2.9933879E19)
            X.0fL.A00(r0)
            goto L_0x005a
        L_0x0116:
            r0 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0039
            int r0 = X.G9t.A0I(r15, r9)
            r2 = r2 | r0
            goto L_0x0039
        L_0x0121:
            r0 = r12 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0033
            int r0 = X.G9t.A0b(r15, r14)
            r2 = r2 | r0
            goto L_0x0033
        L_0x012c:
            r0 = r12 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x002b
            int r0 = X.G9t.A0G(r15, r7)
            r2 = r2 | r0
            goto L_0x002b
        L_0x0137:
            r0 = r21 & 48
            if (r0 != 0) goto L_0x0023
            int r0 = X.G9t.A06(r15, r11)
            r2 = r2 | r0
            goto L_0x0023
        L_0x0142:
            r0 = r21 & 6
            if (r0 != 0) goto L_0x014e
            int r2 = X.G9t.A0O(r15, r8)
            r2 = r2 | r21
            goto L_0x001b
        L_0x014e:
            r2 = r12
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55135Hcj.A00(X.5Wy, X.ULg, X.0sa, X.0sL, X.62P, int, int, int, boolean):void");
    }
}
