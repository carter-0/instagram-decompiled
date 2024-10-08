package X;

/* renamed from: X.Hyf  reason: case insensitive filesystem */
public abstract class C56447Hyf {
    public static final C362088hK A00 = C362088hK.A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0060, code lost:
        if (r1 == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bc, code lost:
        if ((r49 & 64) != 0) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01e3, code lost:
        if ((r7 & 1572864) != 1048576) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0209, code lost:
        if ((r7 & 1572864) == 1048576) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x022f, code lost:
        if ((r7 & 1572864) == 1048576) goto L_0x0231;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r40, X.C56605I4e r41, com.instagram.creation.genai.magicmod.model.MagicModLaunchParams r42, X.C52968GgL r43, java.lang.String r44, X.C62320sa r45, X.0sL r46, X.0sL r47, int r48, int r49, boolean r50) {
        /*
            r4 = r43
            r21 = r44
            r9 = 0
            r20 = 3
            r19 = 1
            r16 = 7
            r0 = -1620943075(0xffffffff9f625f1d, float:-4.7936037E-20)
            r5 = r40
            r5.ExV(r0)
            r2 = r49
            r0 = r49 & 1
            r3 = r48
            if (r0 == 0) goto L_0x0343
            r7 = r48 | 6
        L_0x001d:
            r0 = r49 & 2
            r38 = r50
            if (r0 == 0) goto L_0x0336
            r7 = r7 | 48
        L_0x0025:
            r6 = r49 & 4
            if (r6 == 0) goto L_0x0329
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x002b:
            r0 = r49 & 8
            r35 = r46
            if (r0 == 0) goto L_0x031c
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x0033:
            r0 = r49 & 16
            r40 = r45
            if (r0 == 0) goto L_0x030f
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
        L_0x003b:
            r1 = r49 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            r39 = r47
            if (r1 != 0) goto L_0x004d
            r0 = r48 & r0
            if (r0 != 0) goto L_0x004e
            r0 = r39
            int r0 = X.G9t.A0J(r5, r0)
        L_0x004d:
            r7 = r7 | r0
        L_0x004e:
            r18 = 1572864(0x180000, float:2.204052E-39)
            r0 = r48 & r18
            if (r0 != 0) goto L_0x0065
            r0 = r49 & 64
            if (r0 != 0) goto L_0x0062
            r0 = 2097152(0x200000, float:2.938736E-39)
            boolean r1 = X.G9t.A1V(r5, r4, r0, r3)
            r0 = 1048576(0x100000, float:1.469368E-39)
            if (r1 != 0) goto L_0x0064
        L_0x0062:
            r0 = 524288(0x80000, float:7.34684E-40)
        L_0x0064:
            r7 = r7 | r0
        L_0x0065:
            r1 = r2 & 128(0x80, float:1.794E-43)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r37 = r42
            if (r1 != 0) goto L_0x0077
            r0 = r48 & r0
            if (r0 != 0) goto L_0x0078
            r0 = r37
            int r0 = X.G9t.A0L(r5, r0)
        L_0x0077:
            r7 = r7 | r0
        L_0x0078:
            r1 = 4793491(0x492493, float:6.717112E-39)
            r1 = r1 & r7
            r0 = 4793490(0x492492, float:6.71711E-39)
            if (r1 != r0) goto L_0x00aa
            boolean r0 = r5.Bwn()
            if (r0 == 0) goto L_0x00aa
            r5.Evl()
        L_0x008a:
            X.5Xd r1 = r5.ASQ()
            if (r1 == 0) goto L_0x00a9
            X.JB6 r0 = new X.JB6
            r5 = r0
            r6 = r41
            r7 = r37
            r8 = r4
            r9 = r21
            r10 = r40
            r11 = r35
            r12 = r39
            r13 = r3
            r14 = r2
            r15 = r38
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.A06 = r0
        L_0x00a9:
            return
        L_0x00aa:
            r5.Ewr()
            r0 = r48 & 1
            if (r0 == 0) goto L_0x02d5
            boolean r0 = r5.Aw3()
            if (r0 != 0) goto L_0x02d5
            r5.Evl()
            r0 = r49 & 64
            if (r0 == 0) goto L_0x00c2
        L_0x00be:
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r7 = r7 & r0
        L_0x00c2:
            boolean r0 = X.C51967G9n.A1S(r5)
            if (r0 == 0) goto L_0x00d0
            r1 = 245293401(0xe9ee159, float:3.916701E-30)
            java.lang.String r0 = "com.instagram.creation.genai.magicmod.tools.restyle.ui.MagicModRestyleScreen (MagicModRestyleScreen.kt:59)"
            X.0fL.A01(r1, r0)
        L_0x00d0:
            X.0Ud r0 = r4.A0A
            r1 = 0
            X.4gU r8 = X.AnonymousClass6FW.A02(r5, r0, r9)
            r0 = 1227072641(0x4923a481, float:670280.06)
            java.lang.Object r10 = X.C51967G9n.A0m(r5, r0)
            java.lang.Object r6 = X.AnonymousClass5XT.A00
            if (r10 != r6) goto L_0x00ed
            r10 = 16
            X.Ivh r0 = new X.Ivh
            r0.<init>(r8, r10)
            X.5TX r10 = X.C51969G9p.A0R(r5, r0)
        L_0x00ed:
            X.5Wx r0 = X.C51965G9l.A0H(r5, r9)
            r11 = 1227075832(0x4923b0f8, float:670479.5)
            java.lang.Object r12 = X.C51976G9y.A0I(r5, r6, r11)
            java.lang.Object r11 = X.C51967G9n.A0o(r0, r8, r9)
            X.GnW r11 = (X.C53399GnW) r11
            java.lang.Object r14 = r11.A03
            r11 = 1227077978(0x4923b95a, float:670613.6)
            boolean r13 = X.C51967G9n.A1Y(r5, r8, r11)
            java.lang.Object r11 = r5.ECw()
            if (r13 != 0) goto L_0x010f
            if (r11 != r6) goto L_0x0119
        L_0x010f:
            r13 = 13
            X.MGX r11 = new X.MGX
            r11.<init>(r12, r8, r1, r13)
            r5.FLL(r11)
        L_0x0119:
            X.C51968G9o.A1E(r5, r0, r11, r14)
            X.5Qk r14 = androidx.compose.ui.Modifier.A00
            X.5RD r13 = X.C51966G9m.A0a(r9)
            int r15 = X.C287425a7.A00(r5)
            X.5RM r11 = X.C286565Wx.A04(r0)
            androidx.compose.ui.Modifier r14 = X.C287435a8.A01(r5, r14)
            X.C51973G9u.A0y(r5, r0)
            X.C51971G9r.A12(r5, r13, r11)
            X.0sL r13 = X.C287485aD.A02
            boolean r11 = r0.A0K
            if (r11 != 0) goto L_0x0140
            boolean r11 = X.C51972G9s.A1Q(r5, r15)
            if (r11 != 0) goto L_0x0143
        L_0x0140:
            X.C51971G9r.A13(r5, r13, r15)
        L_0x0143:
            X.C51965G9l.A18(r5, r14)
            r11 = r37
            com.instagram.creation.capture.quickcapture.aspectratioutil.intf.CreationLayoutConfig r11 = r11.A00
            boolean r30 = r11.CTv()
            r13 = -1093751396(0xffffffffbecead9c, float:-0.40366828)
            r23 = 9
            X.J7t r11 = new X.J7t
            r22 = r11
            r24 = r4
            r25 = r10
            r26 = r8
            r27 = r37
            r22.<init>(r23, r24, r25, r26, r27)
            r17 = 1
            r10 = 2
            X.5PJ r24 = X.AnonymousClass5PI.A01(r5, r11, r13)
            r13 = -749188037(0xffffffffd3584c3b, float:-9.2899187E11)
            X.J9I r11 = new X.J9I
            r31 = r11
            r32 = r19
            r33 = r12
            r34 = r4
            r36 = r8
            r31.<init>(r32, r33, r34, r35, r36, r37, r38)
            X.5PJ r25 = X.AnonymousClass5PI.A01(r5, r11, r13)
            r12 = -404624678(0xffffffffe7e1eada, float:-2.1337294E24)
            r11 = 42
            X.5PJ r26 = X.JG1.A00(r5, r8, r4, r11, r12)
            r11 = 224256(0x36c00, float:3.1425E-40)
            r28 = r7 & 112(0x70, float:1.57E-43)
            r28 = r28 | r11
            r29 = 68
            r22 = r5
            r23 = r1
            r27 = r1
            r31 = r38
            X.HY5.A00(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            java.lang.Object r11 = r8.getValue()
            X.GnW r11 = (X.C53399GnW) r11
            java.lang.Object r11 = r11.A03
            X.HLZ r11 = (X.HLZ) r11
            int r11 = r11.ordinal()
            if (r11 == r10) goto L_0x02ca
            if (r11 == r9) goto L_0x02c1
            r10 = r19
            if (r11 == r10) goto L_0x029e
            java.lang.Integer r12 = X.AnonymousClass05K.A00
            r10 = 6
            X.JwM r11 = new X.JwM
            r11.<init>((X.C59496JLu) r1, (java.lang.Integer) r12, (java.lang.Integer) r1, (int) r10)
        L_0x01ba:
            java.lang.Object r10 = r8.getValue()
            X.GnW r10 = (X.C53399GnW) r10
            java.lang.Object r10 = r10.A05
            r16 = r10
            r10 = r16
            X.HLB r10 = (X.HLB) r10
            r16 = r10
            r10 = 1567819541(0x5d730715, float:1.0944993E18)
            r5.ExS(r10)
            r10 = 3670016(0x380000, float:5.142788E-39)
            r14 = r7 & r10
            r14 = r14 ^ r18
            r15 = 1048576(0x100000, float:1.469368E-39)
            if (r14 <= r15) goto L_0x01e0
            boolean r10 = r5.AGw(r4)
            if (r10 != 0) goto L_0x01e5
        L_0x01e0:
            r10 = r7 & r18
            r12 = 0
            if (r10 != r15) goto L_0x01e6
        L_0x01e5:
            r12 = 1
        L_0x01e6:
            java.lang.Object r10 = r5.ECw()
            if (r12 != 0) goto L_0x01ee
            if (r10 != r6) goto L_0x01f4
        L_0x01ee:
            r10 = 57
            X.Imy r10 = X.C51970G9q.A0r(r5, r4, r10)
        L_0x01f4:
            X.0Ya r12 = X.C51965G9l.A12(r0, r10)
            r10 = 1567827416(0x5d7325d8, float:1.09504046E18)
            r5.ExS(r10)
            if (r14 <= r15) goto L_0x0206
            boolean r10 = r5.AGw(r4)
            if (r10 != 0) goto L_0x020b
        L_0x0206:
            r10 = r7 & r18
            r13 = 0
            if (r10 != r15) goto L_0x020c
        L_0x020b:
            r13 = 1
        L_0x020c:
            java.lang.Object r10 = r5.ECw()
            if (r13 != 0) goto L_0x0214
            if (r10 != r6) goto L_0x021a
        L_0x0214:
            r10 = 58
            X.Imy r10 = X.C51970G9q.A0r(r5, r4, r10)
        L_0x021a:
            X.0Ya r10 = X.C51965G9l.A12(r0, r10)
            r13 = 1567814823(0x5d72f4a7, float:1.09417508E18)
            r5.ExS(r13)
            if (r14 <= r15) goto L_0x022c
            boolean r13 = r5.AGw(r4)
            if (r13 != 0) goto L_0x0231
        L_0x022c:
            r13 = r7 & r18
            r14 = 0
            if (r13 != r15) goto L_0x0232
        L_0x0231:
            r14 = 1
        L_0x0232:
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r7
            boolean r13 = X.C51972G9s.A1K(r13)
            r14 = r14 | r13
            java.lang.Object r13 = r5.ECw()
            if (r14 != 0) goto L_0x0243
            if (r13 != r6) goto L_0x024b
        L_0x0243:
            r14 = 28
            r13 = r40
            X.IwQ r13 = X.C58717IwQ.A01(r5, r13, r4, r14)
        L_0x024b:
            X.0sa r25 = X.C51965G9l.A0y(r0, r13, r9)
            r13 = 1567822580(0x5d7312f4, float:1.09470814E18)
            boolean r14 = X.C51967G9n.A1Y(r5, r8, r13)
            r13 = 458752(0x70000, float:6.42848E-40)
            r7 = r7 & r13
            r13 = 131072(0x20000, float:1.83671E-40)
            if (r7 == r13) goto L_0x025f
            r17 = 0
        L_0x025f:
            r14 = r14 | r17
            java.lang.Object r13 = r5.ECw()
            if (r14 != 0) goto L_0x0269
            if (r13 != r6) goto L_0x0275
        L_0x0269:
            r7 = 19
            X.J6k r13 = new X.J6k
            r6 = r39
            r13.<init>((int) r7, (java.lang.Object) r8, (java.lang.Object) r6)
            r5.FLL(r13)
        L_0x0275:
            X.0sP r29 = X.C51965G9l.A0z(r0, r13)
            X.0sa r10 = (X.C62320sa) r10
            X.0sa r12 = (X.C62320sa) r12
            r31 = 136(0x88, float:1.9E-43)
            r27 = r10
            r28 = r12
            r30 = r9
            r32 = r9
            r23 = r11
            r24 = r16
            r26 = r1
            X.C56576I2g.A01(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            boolean r0 = X.C51967G9n.A1R(r5)
            if (r0 == 0) goto L_0x008a
            r0 = -525015837(0xffffffffe0b4e4e3, float:-1.0427834E20)
            X.0fL.A00(r0)
            goto L_0x008a
        L_0x029e:
            java.lang.Object r10 = r8.getValue()
            X.GnW r10 = (X.C53399GnW) r10
            java.lang.Object r10 = r10.A01
            boolean r10 = X.G9w.A1b(r10)
            if (r10 == 0) goto L_0x02b7
            java.lang.Integer r12 = X.AnonymousClass05K.A0C
            X.JwM r11 = new X.JwM
            r10 = r20
            r11.<init>((X.C59496JLu) r1, (java.lang.Integer) r1, (java.lang.Integer) r12, (int) r10)
            goto L_0x01ba
        L_0x02b7:
            java.lang.Integer r12 = X.AnonymousClass05K.A00
            r10 = 6
            X.JwM r11 = new X.JwM
            r11.<init>((X.C59496JLu) r1, (java.lang.Integer) r12, (java.lang.Integer) r1, (int) r10)
            goto L_0x01ba
        L_0x02c1:
            X.JwM r11 = new X.JwM
            r10 = r16
            r11.<init>((X.C59496JLu) r1, (java.lang.Integer) r1, (java.lang.Integer) r1, (int) r10)
            goto L_0x01ba
        L_0x02ca:
            java.lang.Integer r12 = X.AnonymousClass05K.A00
            X.IQN r10 = X.IQN.A00
            X.JwM r11 = new X.JwM
            r11.<init>((X.C59496JLu) r10, (java.lang.Integer) r12, (java.lang.Integer) r12)
            goto L_0x01ba
        L_0x02d5:
            if (r6 == 0) goto L_0x02d9
            r21 = 0
        L_0x02d9:
            r0 = r49 & 64
            if (r0 == 0) goto L_0x00c2
            android.content.Context r6 = X.C51975G9x.A0A(r5)
            android.app.Application r6 = (android.app.Application) r6
            com.instagram.common.session.UserSession r4 = X.C51968G9o.A0h(r5)
            X.H6V r10 = new X.H6V
            r1 = r41
            r0 = r21
            r10.<init>(r6, r4, r1, r0)
            X.07g r8 = X.C51975G9x.A0P(r5)
            if (r8 == 0) goto L_0x0354
            r6 = 0
            X.2YQ r4 = X.C51975G9x.A0Q(r8)
            java.lang.Class<X.GgL> r1 = X.C52968GgL.class
            r0 = -1439476281(0xffffffffaa3355c7, float:-1.5928154E-13)
            r5.ExT(r0)
            X.2YL r0 = X.C54765HRx.A00(r10, r8, r4, r1, r6)
            X.2YL r4 = X.C51975G9x.A0O(r0, r5)
            X.GgL r4 = (X.C52968GgL) r4
            goto L_0x00be
        L_0x030f:
            r0 = r3 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x003b
            r0 = r40
            int r0 = X.G9t.A0I(r5, r0)
            r7 = r7 | r0
            goto L_0x003b
        L_0x031c:
            r0 = r3 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0033
            r0 = r35
            int r0 = X.G9t.A0H(r5, r0)
            r7 = r7 | r0
            goto L_0x0033
        L_0x0329:
            r0 = r3 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x002b
            r0 = r21
            int r0 = X.G9t.A0Q(r5, r0)
            r7 = r7 | r0
            goto L_0x002b
        L_0x0336:
            r0 = r48 & 48
            if (r0 != 0) goto L_0x0025
            r0 = r38
            int r0 = X.G9t.A0Z(r5, r0)
            r7 = r7 | r0
            goto L_0x0025
        L_0x0343:
            r0 = r48 & 6
            if (r0 != 0) goto L_0x0351
            r0 = r41
            int r7 = X.C41848B3p.A01(r5, r0)
            r7 = r7 | r48
            goto L_0x001d
        L_0x0351:
            r7 = r3
            goto L_0x001d
        L_0x0354:
            java.lang.IllegalStateException r0 = X.G9w.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56447Hyf.A00(X.5Wy, X.I4e, com.instagram.creation.genai.magicmod.model.MagicModLaunchParams, X.GgL, java.lang.String, X.0sa, X.0sL, X.0sL, int, int, boolean):void");
    }
}
