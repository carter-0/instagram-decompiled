package X;

public abstract class HVJ {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v40, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v41, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v98, resolved type: X.IxG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: X.IxG} */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0242, code lost:
        if (r0 != r11) goto L_0x0253;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0244, code lost:
        r11 = new X.C58769IxG(23, r9, r26, r1, r16);
        r7.FLL(r11);
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0253, code lost:
        r23 = r7;
        X.AnonymousClass5ZZ.A02(r23, r24, r25, r26, (X.C268454dQ) null, (X.C291715hl) null, (X.AnonymousClass5ZD) null, (java.util.Map) null, X.C51965G9l.A0z(r10, r0), 0, 0, r21, r20, r8 & 14, X.C51965G9l.A02(r8 >> 15) | ((r8 << 6) & 7168), 17404, 0, 0, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0286, code lost:
        if (X.0fL.A02() == false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0288, code lost:
        X.0fL.A00(-874117508);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x013f, code lost:
        if (r0 == null) goto L_0x0141;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0205  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r33, androidx.compose.ui.Modifier r34, X.C286025Tq r35, X.AnonymousClass5Z4 r36, X.AnonymousClass62P r37, int r38, int r39, int r40, int r41, boolean r42, boolean r43) {
        /*
            r2 = r43
            r20 = r39
            r21 = r38
            r22 = r34
            r3 = 0
            r25 = r35
            r6 = r37
            r0 = r25
            int r18 = X.DbW.A02(r3, r0, r6)
            r0 = 689227370(0x2914c66a, float:3.3034698E-14)
            r7 = r33
            r7.ExV(r0)
            r4 = r41
            r0 = r41 & 1
            r5 = r40
            if (r0 == 0) goto L_0x02c9
            r8 = r40 | 6
        L_0x0025:
            r0 = r41 & 2
            r26 = r36
            if (r0 == 0) goto L_0x02bc
            r8 = r8 | 48
        L_0x002d:
            r0 = r41 & 4
            if (r0 == 0) goto L_0x02b1
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x0033:
            r0 = r41 & 8
            r19 = r42
            if (r0 == 0) goto L_0x02a4
            r8 = r8 | 3072(0xc00, float:4.305E-42)
        L_0x003b:
            r12 = r41 & 16
            if (r12 == 0) goto L_0x0297
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
        L_0x0041:
            r11 = r41 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r11 != 0) goto L_0x0051
            r0 = r0 & r40
            if (r0 != 0) goto L_0x0052
            r0 = r21
            int r0 = X.G9t.A0A(r7, r0)
        L_0x0051:
            r8 = r8 | r0
        L_0x0052:
            r10 = r41 & 64
            r0 = 1572864(0x180000, float:2.204052E-39)
            if (r10 != 0) goto L_0x0062
            r0 = r40 & r0
            if (r0 != 0) goto L_0x0063
            r0 = r20
            int r0 = X.G9t.A0B(r7, r0)
        L_0x0062:
            r8 = r8 | r0
        L_0x0063:
            r9 = r4 & 128(0x80, float:1.794E-43)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            if (r9 != 0) goto L_0x0071
            r0 = r40 & r0
            if (r0 != 0) goto L_0x0072
            int r0 = X.G9t.A0f(r7, r2)
        L_0x0071:
            r8 = r8 | r0
        L_0x0072:
            r0 = 4793491(0x492493, float:6.717112E-39)
            r1 = r8 & r0
            r0 = 4793490(0x492492, float:6.71711E-39)
            if (r1 != r0) goto L_0x00a5
            boolean r0 = r7.Bwn()
            if (r0 == 0) goto L_0x00a5
            r7.Evl()
        L_0x0085:
            X.5Xd r1 = r7.ASQ()
            if (r1 == 0) goto L_0x00a4
            X.JAz r0 = new X.JAz
            r7 = r0
            r8 = r22
            r9 = r25
            r10 = r26
            r11 = r6
            r12 = r21
            r13 = r20
            r14 = r5
            r15 = r4
            r16 = r19
            r17 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1.A06 = r0
        L_0x00a4:
            return
        L_0x00a5:
            if (r12 == 0) goto L_0x00a9
            X.5Qk r22 = androidx.compose.ui.Modifier.A00
        L_0x00a9:
            if (r11 == 0) goto L_0x00ae
            r21 = 2147483647(0x7fffffff, float:NaN)
        L_0x00ae:
            if (r10 == 0) goto L_0x00b2
            r20 = 1
        L_0x00b2:
            boolean r2 = X.C51966G9m.A1Q(r9, r2)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00c4
            r1 = 6429343(0x621a9f, float:9.009428E-39)
            java.lang.String r0 = "com.instagram.barcelona.interactive.LinearGradientText (LinearGradientText.kt:54)"
            X.0fL.A01(r1, r0)
        L_0x00c4:
            r0 = -388103554(0xffffffffe8de027e, float:-8.3872907E24)
            java.lang.Object r12 = X.C51967G9n.A0m(r7, r0)
            java.lang.Object r11 = X.AnonymousClass5XT.A00
            if (r12 != r11) goto L_0x00da
            r1 = 0
            X.0eM r0 = X.C284905Ot.A01
            androidx.compose.runtime.ParcelableSnapshotMutableFloatState r12 = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState
            r12.<init>(r1)
            r7.FLL(r12)
        L_0x00da:
            X.5Wx r10 = X.C51965G9l.A0H(r7, r3)
            r0 = -388101253(0xffffffffe8de0b7b, float:-8.388617E24)
            java.lang.Object r9 = X.C51967G9n.A0m(r7, r0)
            r17 = 0
            if (r9 != r11) goto L_0x00ef
            r0 = r17
            androidx.compose.runtime.ParcelableSnapshotMutableState r9 = X.G9t.A0o(r7, r0)
        L_0x00ef:
            X.C286565Wx.A0L(r10, r3)
            r0 = -388099111(0xffffffffe8de13d9, float:-8.389852E24)
            java.lang.Object r1 = X.C51967G9n.A0m(r7, r0)
            if (r1 != r11) goto L_0x0105
            r0 = 9
            X.Iwb r1 = new X.Iwb
            r1.<init>(r12, r0)
            r7.FLL(r1)
        L_0x0105:
            X.0sP r1 = X.C51965G9l.A0z(r10, r1)
            r0 = 6
            X.HVK.A00(r7, r1, r0)
            com.instagram.common.session.UserSession r0 = X.C51968G9o.A0h(r7)
            X.0qQ.A0B(r0, r3)
            X.6CV r13 = X.AnonymousClass6CU.A00(r0)
            boolean r0 = r13.A01()
            if (r0 == 0) goto L_0x0141
            java.util.List r0 = r13.A01
            if (r0 != 0) goto L_0x0143
            com.instagram.common.session.UserSession r15 = r13.A05
            X.0Tu r14 = X.0Tu.A05
            r0 = 36885531327660680(0x830b3200230288, double:3.389896765501179E-306)
            java.lang.String r0 = X.182.A04(r14, r15, r0)
            java.util.List r1 = X.DbX.A0x(r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0141
            java.util.List r0 = X.AnonymousClass6CV.A00(r1)
            r13.A01 = r0
            if (r0 != 0) goto L_0x0143
        L_0x0141:
            X.0sn r0 = X.0sn.A00
        L_0x0143:
            X.62P r13 = X.AnonymousClass62Q.A00(r0)
            r0 = -388091387(0xffffffffe8de3205, float:-8.3943045E24)
            r7.ExS(r0)
            if (r42 == 0) goto L_0x0294
            X.0qQ.A0B(r13, r3)
            r0 = -549214419(0xffffffffdf43a72d, float:-1.4098287E19)
            boolean r0 = X.C51967G9n.A1U(r7, r0)
            if (r0 == 0) goto L_0x0163
            r1 = 2049361814(0x7a26c796, float:2.1649234E35)
            java.lang.String r0 = "com.instagram.barcelona.interactive.rememberSparkleSystem (SparkleSystem.kt:36)"
            X.0fL.A01(r1, r0)
        L_0x0163:
            r0 = 864689921(0x338a1f01, float:6.431765E-8)
            java.lang.Object r1 = X.C51967G9n.A0m(r7, r0)
            if (r1 != r11) goto L_0x0174
            X.Hn3 r1 = new X.Hn3
            r1.<init>()
            r7.FLL(r1)
        L_0x0174:
            X.Hn3 r1 = (X.C55768Hn3) r1
            X.C286565Wx.A0L(r10, r3)
            X.5Oz r0 = r1.A02
            r0.Epw(r13)
            r0 = 864693021(0x338a2b1d, float:6.433968E-8)
            boolean r13 = X.C51967G9n.A1Z(r7, r1, r0)
            java.lang.Object r0 = r7.ECw()
            if (r13 != 0) goto L_0x018d
            if (r0 != r11) goto L_0x0197
        L_0x018d:
            r13 = 10
            X.Iwb r0 = new X.Iwb
            r0.<init>(r1, r13)
            r7.FLL(r0)
        L_0x0197:
            X.0sP r0 = X.C51965G9l.A0z(r10, r0)
            X.HVK.A00(r7, r0, r3)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x01aa
            r0 = -1001471778(0xffffffffc44ec0de, float:-827.01355)
            X.0fL.A00(r0)
        L_0x01aa:
            X.C286565Wx.A0L(r10, r3)
        L_0x01ad:
            X.C286565Wx.A0L(r10, r3)
            X.4bM r0 = X.AnonymousClass5YA.A01
            java.lang.Object r16 = r7.AJO(r0)
            if (r1 == 0) goto L_0x0290
            X.5Qk r15 = androidx.compose.ui.Modifier.A00
            X.0qQ.A0B(r15, r3)
            r0 = -565451636(0xffffffffde4be48c, float:-3.67300545E18)
            boolean r0 = X.C51967G9n.A1U(r7, r0)
            if (r0 == 0) goto L_0x01ce
            r13 = -145166591(0xfffffffff758ef01, float:-4.3999363E33)
            java.lang.String r0 = "com.instagram.barcelona.interactive.sparkles (SparkleSystem.kt:45)"
            X.0fL.A01(r13, r0)
        L_0x01ce:
            r0 = 2131231073(0x7f080161, float:1.8078217E38)
            X.2DO r14 = X.C287975bA.A00(r7, r0, r3)
            r0 = 418058561(0x18eb1141, float:6.07635E-24)
            boolean r13 = X.C51973G9u.A1S(r7, r1, r14, r0)
            java.lang.Object r0 = r7.ECw()
            if (r13 != 0) goto L_0x01e4
            if (r0 != r11) goto L_0x01ed
        L_0x01e4:
            r13 = 7
            X.J6j r0 = new X.J6j
            r0.<init>((int) r13, (java.lang.Object) r1, (java.lang.Object) r14)
            r7.FLL(r0)
        L_0x01ed:
            androidx.compose.ui.Modifier r13 = X.C51975G9x.A0I(r10, r15, r0, r3)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x01fd
            r0 = -1184513208(0xffffffffb965c348, float:-2.191189E-4)
            X.0fL.A00(r0)
        L_0x01fd:
            r0 = r22
            androidx.compose.ui.Modifier r13 = X.C51967G9n.A0B(r10, r0, r13)
        L_0x0203:
            if (r2 == 0) goto L_0x020f
            X.5Qk r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r0 = X.AnonymousClass6FZ.A00(r0).Ezh(new androidx.compose.animation.SizeAnimationModifierElement(new X.C287965b7(new X.C289005cr(1 | (1 << 32)), 1.0f, 400.0f), X.C287215Zl.A0E))
            androidx.compose.ui.Modifier r13 = r13.Ezh(r0)
        L_0x020f:
            X.J1H r0 = X.J1H.A00
            androidx.compose.ui.Modifier r14 = X.C51970G9q.A0X(r13, r0)
            r0 = -388071114(0xffffffffe8de8136, float:-8.405991E24)
            boolean r13 = X.C51974G9v.A1Z(r7, r0, r8)
            java.lang.Object r0 = r7.ECw()
            if (r13 != 0) goto L_0x0224
            if (r0 != r11) goto L_0x022a
        L_0x0224:
            r0 = r18
            X.J6W r0 = X.J6W.A00(r7, r12, r6, r9, r0)
        L_0x022a:
            androidx.compose.ui.Modifier r24 = X.C51975G9x.A0I(r10, r14, r0, r3)
            r12 = -388061492(0xffffffffe8dea6cc, float:-8.411538E24)
            r0 = r16
            boolean r12 = X.G9t.A1X(r7, r1, r0, r12)
            boolean r0 = X.C51973G9u.A1H(r8)
            r12 = r12 | r0
            java.lang.Object r0 = r7.ECw()
            if (r12 != 0) goto L_0x0244
            if (r0 != r11) goto L_0x0253
        L_0x0244:
            r12 = 23
            X.IxG r0 = new X.IxG
            r11 = r0
            r13 = r9
            r14 = r26
            r15 = r1
            r11.<init>(r12, r13, r14, r15, r16)
            r7.FLL(r0)
        L_0x0253:
            X.0sP r31 = X.C51965G9l.A0z(r10, r0)
            r36 = r8 & 14
            int r0 = r8 >> 15
            int r37 = X.C51965G9l.A02(r0)
            int r0 = r8 << 6
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r37 = r37 | r0
            r38 = 17404(0x43fc, float:2.4388E-41)
            r39 = 0
            r28 = r17
            r29 = r17
            r30 = r17
            r32 = r3
            r33 = r3
            r34 = r21
            r35 = r20
            r41 = r39
            r43 = r3
            r23 = r7
            r27 = r17
            X.AnonymousClass5ZZ.A02(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r41, r43)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0085
            r0 = -874117508(0xffffffffcbe6067c, float:-3.014988E7)
            X.0fL.A00(r0)
            goto L_0x0085
        L_0x0290:
            r13 = r22
            goto L_0x0203
        L_0x0294:
            r1 = 0
            goto L_0x01ad
        L_0x0297:
            r0 = r5 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0041
            r0 = r22
            int r0 = X.G9t.A0S(r7, r0)
            r8 = r8 | r0
            goto L_0x0041
        L_0x02a4:
            r0 = r5 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x003b
            r0 = r19
            int r0 = X.G9t.A0b(r7, r0)
            r8 = r8 | r0
            goto L_0x003b
        L_0x02b1:
            r0 = r5 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0033
            int r0 = X.G9t.A0Q(r7, r6)
            r8 = r8 | r0
            goto L_0x0033
        L_0x02bc:
            r0 = r40 & 48
            if (r0 != 0) goto L_0x002d
            r0 = r26
            int r0 = X.G9t.A0P(r7, r0)
            r8 = r8 | r0
            goto L_0x002d
        L_0x02c9:
            r0 = r40 & 6
            if (r0 != 0) goto L_0x02d7
            r0 = r25
            int r8 = X.G9t.A0O(r7, r0)
            r8 = r8 | r40
            goto L_0x0025
        L_0x02d7:
            r8 = r5
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HVJ.A00(X.5Wy, androidx.compose.ui.Modifier, X.5Tq, X.5Z4, X.62P, int, int, int, int, boolean, boolean):void");
    }
}
