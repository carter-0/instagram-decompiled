package X;

/* renamed from: X.HVj  reason: case insensitive filesystem */
public abstract class C54852HVj {
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008c, code lost:
        if (r5.AGw(r4) == false) goto L_0x008e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r24, X.C299635va r25, X.C53008Ggz r26, com.instagram.common.session.UserSession r27, X.AnonymousClass4DU r28, java.lang.String r29, X.C62320sa r30, X.C62320sa r31, X.C62320sa r32, X.C62320sa r33, int r34, int r35) {
        /*
            r4 = r26
            r11 = 0
            r6 = r27
            r3 = r28
            boolean r27 = X.AnonymousClass7TF.A1U(r11, r6, r3)
            r5 = 2
            r18 = r25
            r2 = r30
            r23 = r31
            r15 = r32
            r1 = r18
            r0 = r23
            X.C51974G9v.A0d(r5, r1, r2, r0, r15)
            r0 = 7
            r14 = r33
            X.0qQ.A0B(r14, r0)
            r0 = 659465654(0x274ea5b6, float:2.8678075E-15)
            r5 = r24
            r5.ExV(r0)
            r0 = r35
            r7 = r35 & 1
            r1 = r34
            if (r7 == 0) goto L_0x01c4
            r8 = r34 | 6
        L_0x0033:
            r7 = r35 & 2
            if (r7 == 0) goto L_0x01b9
            r8 = r8 | 48
        L_0x0039:
            r7 = r35 & 4
            if (r7 == 0) goto L_0x01ac
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x003f:
            r7 = r35 & 8
            r26 = r29
            if (r7 == 0) goto L_0x019f
            r8 = r8 | 3072(0xc00, float:4.305E-42)
        L_0x0047:
            r7 = r35 & 16
            if (r7 == 0) goto L_0x0194
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
        L_0x004d:
            r9 = r35 & 32
            r7 = 196608(0x30000, float:2.75506E-40)
            if (r9 != 0) goto L_0x005d
            r7 = r34 & r7
            if (r7 != 0) goto L_0x005e
            r7 = r23
            int r7 = X.G9t.A0J(r5, r7)
        L_0x005d:
            r8 = r8 | r7
        L_0x005e:
            r9 = r35 & 64
            r7 = 1572864(0x180000, float:2.204052E-39)
            if (r9 != 0) goto L_0x006c
            r7 = r34 & r7
            if (r7 != 0) goto L_0x006d
            int r7 = X.G9t.A0K(r5, r15)
        L_0x006c:
            r8 = r8 | r7
        L_0x006d:
            r9 = r0 & 128(0x80, float:1.794E-43)
            r7 = 12582912(0xc00000, float:1.7632415E-38)
            if (r9 != 0) goto L_0x007b
            r7 = r34 & r7
            if (r7 != 0) goto L_0x007c
            int r7 = X.G9t.A0L(r5, r14)
        L_0x007b:
            r8 = r8 | r7
        L_0x007c:
            r7 = 100663296(0x6000000, float:2.4074124E-35)
            r7 = r7 & r34
            if (r7 != 0) goto L_0x0091
            r7 = r0 & 256(0x100, float:3.59E-43)
            if (r7 != 0) goto L_0x008e
            boolean r9 = r5.AGw(r4)
            r7 = 67108864(0x4000000, float:1.5046328E-36)
            if (r9 != 0) goto L_0x0090
        L_0x008e:
            r7 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0090:
            r8 = r8 | r7
        L_0x0091:
            r9 = 38347923(0x2492493, float:1.4777644E-37)
            r9 = r9 & r8
            r7 = 38347922(0x2492492, float:1.4777643E-37)
            if (r9 != r7) goto L_0x00c7
            boolean r7 = r5.Bwn()
            if (r7 == 0) goto L_0x00c7
            r5.Evl()
        L_0x00a3:
            X.5Xd r7 = r5.ASQ()
            if (r7 == 0) goto L_0x00c6
            X.JBW r5 = new X.JBW
            r16 = r5
            r17 = r18
            r18 = r4
            r19 = r6
            r20 = r3
            r21 = r26
            r22 = r2
            r24 = r15
            r25 = r14
            r26 = r1
            r27 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r7.A06 = r5
        L_0x00c6:
            return
        L_0x00c7:
            r5.Ewr()
            r7 = r34 & 1
            if (r7 == 0) goto L_0x016a
            boolean r7 = r5.Aw3()
            if (r7 != 0) goto L_0x016a
            r5.Evl()
        L_0x00d7:
            boolean r7 = X.C51967G9n.A1S(r5)
            if (r7 == 0) goto L_0x00e5
            r8 = -1931767560(0xffffffff8cdb90f8, float:-3.3829543E-31)
            java.lang.String r7 = "com.instagram.barcelonaig.permalink.ui.BarcelonaIgPermalinkScreen (BarcelonaIgPermalinkScreen.kt:48)"
            X.0fL.A01(r8, r7)
        L_0x00e5:
            X.0Ud r7 = r4.A0D
            r29 = 0
            X.4gU r13 = X.AnonymousClass6FW.A02(r5, r7, r11)
            r7 = 388193143(0x17235b77, float:5.2783585E-25)
            java.lang.Object r10 = X.C51967G9n.A0m(r5, r7)
            java.lang.Object r9 = X.AnonymousClass5XT.A00
            if (r10 != r9) goto L_0x0100
            X.Hpu r10 = new X.Hpu
            r10.<init>()
            r5.FLL(r10)
        L_0x0100:
            X.5Wx r8 = X.C51965G9l.A0H(r5, r11)
            X.62M r22 = X.AnonymousClass62M.A01
            java.lang.Object r7 = r13.getValue()
            X.JwF r7 = (X.C61077JwF) r7
            java.lang.Object r7 = r7.A00
            X.GmK r7 = (X.C53334GmK) r7
            X.62P r7 = r7.A0K
            int r12 = r7.size()
            r7 = 388197668(0x17236d24, float:5.2805895E-25)
            boolean r12 = X.C51967G9n.A1V(r5, r7, r12)
            java.lang.Object r7 = r5.ECw()
            if (r12 != 0) goto L_0x0125
            if (r7 != r9) goto L_0x012f
        L_0x0125:
            r9 = 11
            X.J6j r7 = new X.J6j
            r7.<init>((int) r9, (java.lang.Object) r4, (java.lang.Object) r13)
            r5.FLL(r7)
        L_0x012f:
            X.C286565Wx.A0L(r8, r11)
            X.5Qk r28 = androidx.compose.ui.Modifier.A00
            r9 = 1201171205(0x47986b05, float:78038.04)
            X.JBr r8 = new X.JBr
            r19 = r13
            r20 = r10
            r21 = r7
            r24 = r15
            r25 = r14
            r16 = r8
            r17 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.5PJ r30 = X.AnonymousClass5PI.A01(r5, r8, r9)
            r32 = 1572870(0x180006, float:2.20406E-39)
            r33 = 62
            r34 = 0
            r31 = 0
            r27 = r5
            X.C52683Gav.A00(r27, r28, r29, r30, r31, r32, r33, r34)
            boolean r7 = X.0fL.A02()
            if (r7 == 0) goto L_0x00a3
            r7 = -1314646207(0xffffffffb1a41741, float:-4.775672E-9)
            X.0fL.A00(r7)
            goto L_0x00a3
        L_0x016a:
            r7 = r0 & 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L_0x00d7
            X.H6T r10 = new X.H6T
            r4 = r26
            r10.<init>(r6, r3, r4, r2)
            X.07g r12 = X.C51975G9x.A0P(r5)
            if (r12 == 0) goto L_0x01d3
            r9 = 0
            X.2YQ r8 = X.C51975G9x.A0Q(r12)
            java.lang.Class<X.Ggz> r7 = X.C53008Ggz.class
            r4 = -1439476281(0xffffffffaa3355c7, float:-1.5928154E-13)
            r5.ExT(r4)
            X.2YL r4 = X.C54765HRx.A00(r10, r12, r8, r7, r9)
            X.2YL r4 = X.C51975G9x.A0O(r4, r5)
            X.Ggz r4 = (X.C53008Ggz) r4
            goto L_0x00d7
        L_0x0194:
            r7 = r1 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L_0x004d
            int r7 = X.G9t.A0I(r5, r2)
            r8 = r8 | r7
            goto L_0x004d
        L_0x019f:
            r7 = r1 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0047
            r7 = r26
            int r7 = X.G9t.A0R(r5, r7)
            r8 = r8 | r7
            goto L_0x0047
        L_0x01ac:
            r7 = r1 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x003f
            r7 = r18
            int r7 = X.G9t.A0Q(r5, r7)
            r8 = r8 | r7
            goto L_0x003f
        L_0x01b9:
            r7 = r34 & 48
            if (r7 != 0) goto L_0x0039
            int r7 = X.G9t.A0F(r5, r3)
            r8 = r8 | r7
            goto L_0x0039
        L_0x01c4:
            r7 = r34 & 6
            if (r7 != 0) goto L_0x01d0
            int r8 = X.C41848B3p.A01(r5, r6)
            r8 = r8 | r34
            goto L_0x0033
        L_0x01d0:
            r8 = r1
            goto L_0x0033
        L_0x01d3:
            java.lang.IllegalStateException r0 = X.G9w.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54852HVj.A00(X.5Wy, X.5va, X.Ggz, com.instagram.common.session.UserSession, X.4DU, java.lang.String, X.0sa, X.0sa, X.0sa, X.0sa, int, int):void");
    }
}
