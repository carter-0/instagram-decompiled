package X;

/* renamed from: X.Hup  reason: case insensitive filesystem */
public abstract class C56222Hup {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v75, resolved type: X.J6b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v3, resolved type: X.J6b} */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0132, code lost:
        if (r4 == X.AnonymousClass5XT.A00) goto L_0x0134;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r28, androidx.compose.ui.Modifier r29, X.C54652HMj r30, X.C69316NjH r31, X.C62320sa r32, X.0sL r33, float r34, int r35, int r36, int r37, boolean r38) {
        /*
            r21 = r33
            r22 = r30
            r10 = r38
            r20 = r35
            r12 = r34
            r23 = r29
            r8 = 0
            r11 = 1
            r15 = r32
            X.0qQ.A0B(r15, r11)
            r0 = -1903463734(0xffffffff8e8b72ca, float:-3.4376683E-30)
            r1 = r28
            r1.ExV(r0)
            r3 = r37
            r0 = r37 & 1
            r38 = r31
            r2 = r36
            if (r0 == 0) goto L_0x02ac
            r0 = r36 | 6
        L_0x0027:
            r4 = r37 & 2
            if (r4 == 0) goto L_0x02a1
            r0 = r0 | 48
        L_0x002d:
            r16 = r37 & 4
            if (r16 == 0) goto L_0x0294
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0033:
            r14 = r37 & 8
            if (r14 == 0) goto L_0x0289
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0039:
            r13 = r37 & 16
            if (r13 == 0) goto L_0x027c
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x003f:
            r5 = r37 & 32
            r4 = 196608(0x30000, float:2.75506E-40)
            if (r5 != 0) goto L_0x004d
            r4 = r36 & r4
            if (r4 != 0) goto L_0x004e
            int r4 = X.G9t.A0d(r1, r10)
        L_0x004d:
            r0 = r0 | r4
        L_0x004e:
            r9 = r37 & 64
            r4 = 1572864(0x180000, float:2.204052E-39)
            if (r9 != 0) goto L_0x005e
            r4 = r36 & r4
            if (r4 != 0) goto L_0x005f
            r4 = r22
            int r4 = X.G9t.A0U(r1, r4)
        L_0x005e:
            r0 = r0 | r4
        L_0x005f:
            r6 = r3 & 128(0x80, float:1.794E-43)
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            if (r6 == 0) goto L_0x026f
            r0 = r0 | r19
        L_0x0067:
            r4 = 4793491(0x492493, float:6.717112E-39)
            r7 = r0 & r4
            r4 = 4793490(0x492492, float:6.71711E-39)
            if (r7 != r4) goto L_0x009e
            boolean r4 = r1.Bwn()
            if (r4 == 0) goto L_0x009e
            r1.Evl()
        L_0x007a:
            X.5Xd r1 = r1.ASQ()
            if (r1 == 0) goto L_0x009d
            X.JAu r0 = new X.JAu
            r24 = r0
            r25 = r23
            r26 = r22
            r27 = r38
            r28 = r15
            r29 = r21
            r30 = r12
            r31 = r20
            r32 = r2
            r33 = r3
            r34 = r10
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r1.A06 = r0
        L_0x009d:
            return
        L_0x009e:
            if (r16 == 0) goto L_0x00a2
            X.5Qk r23 = androidx.compose.ui.Modifier.A00
        L_0x00a2:
            if (r14 == 0) goto L_0x00a6
            r12 = 1119879168(0x42c00000, float:96.0)
        L_0x00a6:
            if (r13 == 0) goto L_0x00aa
            r20 = 2
        L_0x00aa:
            boolean r10 = X.C51966G9m.A1Q(r5, r10)
            if (r9 == 0) goto L_0x00b2
            X.HMj r22 = X.C54652HMj.SMALL
        L_0x00b2:
            if (r6 == 0) goto L_0x00b6
            r21 = 0
        L_0x00b6:
            boolean r4 = X.0fL.A02()
            if (r4 == 0) goto L_0x00c4
            r5 = 1138811841(0x43e0e3c1, float:449.77933)
            java.lang.String r4 = "com.instagram.barcelona.common.ui.button.FollowButton (FollowButton.kt:48)"
            X.0fL.A01(r5, r4)
        L_0x00c4:
            r18 = r0 & 14
            r4 = r38
            java.lang.String r17 = A00(r1, r4)
            r4 = 2131975854(0x7f135eae, float:1.9588812E38)
            java.lang.String r13 = X.C288035bG.A00(r1, r4)
            X.NjH r4 = X.C69316NjH.CANCEL
            java.lang.String r9 = A00(r1, r4)
            X.NjH r5 = X.C69316NjH.UNKNOWN
            r4 = r38
            if (r4 == r5) goto L_0x01ea
            X.4bM r4 = X.AnonymousClass5YA.A05
            java.lang.Object r5 = r1.AJO(r4)
            r4 = 1270553952(0x4bbb1d60, float:2.4525504E7)
            boolean r6 = X.C51967G9n.A1Z(r1, r5, r4)
            r16 = r0 & 112(0x70, float:1.57E-43)
            boolean r4 = X.C51972G9s.A1J(r16)
            r4 = r4 | r6
            java.lang.Object r7 = r1.ECw()
            if (r4 != 0) goto L_0x00fd
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r7 != r4) goto L_0x0103
        L_0x00fd:
            r4 = 35
            X.MMX r7 = X.C51970G9q.A0u(r1, r5, r15, r4)
        L_0x0103:
            X.0sa r7 = (X.C62320sa) r7
            X.5Wx r6 = X.C51965G9l.A0H(r1, r8)
            r24 = 0
            r5 = 2143289344(0x7fc00000, float:NaN)
            r4 = r23
            androidx.compose.ui.Modifier r5 = X.C287205Zk.A0E(r4, r12, r5)
            r14 = 1270563888(0x4bbb4430, float:2.4545376E7)
            r4 = r17
            boolean r4 = X.C51967G9n.A1Y(r1, r4, r14)
            boolean r14 = X.C51972G9s.A1I(r18)
            r4 = r4 | r14
            boolean r14 = X.C51972G9s.A1X(r1, r13, r9, r4)
            boolean r4 = X.C51972G9s.A1J(r16)
            r14 = r14 | r4
            java.lang.Object r4 = r1.ECw()
            if (r14 != 0) goto L_0x0134
            java.lang.Object r14 = X.AnonymousClass5XT.A00
            if (r4 != r14) goto L_0x014a
        L_0x0134:
            X.J6b r4 = new X.J6b
            r25 = r4
            r26 = r15
            r27 = r38
            r28 = r17
            r29 = r13
            r30 = r9
            r31 = r11
            r25.<init>((java.lang.Object) r26, (java.lang.Object) r27, (java.lang.String) r28, (java.lang.String) r29, (java.lang.String) r30, (int) r31)
            r1.FLL(r4)
        L_0x014a:
            androidx.compose.ui.Modifier r26 = X.C51975G9x.A0G(r6, r5, r4)
            r4 = 325448208(0x1365f210, float:2.902321E-27)
            boolean r4 = X.C51967G9n.A1U(r1, r4)
            if (r4 == 0) goto L_0x015f
            r5 = 268004521(0xff96ca9, float:2.459515E-29)
            java.lang.String r4 = "com.instagram.barcelona.common.ui.button.toBdsButtonStyle (FollowButton.kt:126)"
            X.0fL.A01(r5, r4)
        L_0x015f:
            int r5 = r38.ordinal()
            if (r5 == r11) goto L_0x0232
            r4 = 7
            if (r5 == r4) goto L_0x0232
            r4 = 3
            if (r5 == r4) goto L_0x0232
            r4 = 4
            if (r5 == r4) goto L_0x0232
            r4 = 888212969(0x34f10de9, float:4.489987E-7)
            r1.ExS(r4)
            if (r10 == 0) goto L_0x01f8
            r4 = 888214160(0x34f11290, float:4.4903254E-7)
            boolean r4 = X.C51967G9n.A1U(r1, r4)
            if (r4 == 0) goto L_0x0187
            r5 = -975633717(0xffffffffc5d902cb, float:-6944.349)
            java.lang.String r4 = "com.instagram.barcelona.common.ui.button.BdsButtonStyles.primaryLabel (BdsButton.kt:257)"
            X.0fL.A01(r5, r4)
        L_0x0187:
            long r32 = X.C51966G9m.A0H(r1)
            long r34 = X.C51966G9m.A0A(r1)
            java.lang.Integer r30 = X.AnonymousClass05K.A00
            r31 = 1050253722(0x3e99999a, float:0.3)
            X.GlU r28 = new X.GlU
            r29 = r24
            r36 = r34
            r28.<init>(r29, r30, r31, r32, r34, r36)
            boolean r4 = X.0fL.A02()
            if (r4 == 0) goto L_0x01a9
            r4 = -133961416(0xfffffffff803e938, float:-1.0701893E34)
        L_0x01a6:
            X.0fL.A00(r4)
        L_0x01a9:
            X.C286565Wx.A0L(r6, r8)
        L_0x01ac:
            boolean r4 = X.C51967G9n.A1b(r6, r8)
            if (r4 == 0) goto L_0x01b8
            r4 = -771908480(0xffffffffd1fd9c80, float:-1.36156545E11)
            X.0fL.A00(r4)
        L_0x01b8:
            X.C286565Wx.A0L(r6, r8)
            r5 = 337605886(0x141f74fe, float:8.050521E-27)
            X.J7x r4 = new X.J7x
            r29 = r4
            r30 = r21
            r31 = r22
            r32 = r17
            r33 = r20
            r34 = r11
            r29.<init>(r30, r31, r32, r33, r34)
            X.5PJ r30 = X.AnonymousClass5PI.A01(r1, r4, r5)
            r4 = 458752(0x70000, float:6.42848E-40)
            int r31 = r0 >> 3
            r31 = r31 & r4
            r31 = r31 | r19
            r32 = 76
            r33 = r8
            r34 = r8
            r25 = r1
            r27 = r22
            r29 = r7
            X.HUS.A00(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
        L_0x01ea:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x007a
            r0 = -1377615640(0xffffffffade340e8, float:-2.5835736E-11)
            X.0fL.A00(r0)
            goto L_0x007a
        L_0x01f8:
            r4 = 888215635(0x34f11853, float:4.4907446E-7)
            boolean r4 = X.C51967G9n.A1U(r1, r4)
            if (r4 == 0) goto L_0x0209
            r5 = -467491559(0xffffffffe422a519, float:-1.2001076E22)
            java.lang.String r4 = "com.instagram.barcelona.common.ui.button.BdsButtonStyles.primaryOutlined (BdsButton.kt:316)"
            X.0fL.A01(r5, r4)
        L_0x0209:
            long r32 = X.C51966G9m.A0J(r1)
            long r34 = X.C51966G9m.A0H(r1)
            java.lang.Integer r30 = X.AnonymousClass05K.A00
            r9 = 1065353216(0x3f800000, float:1.0)
            long r4 = X.C51965G9l.A0A(r1)
            X.6Fh r29 = X.AnonymousClass6C9.A00(r9, r4)
            r31 = 1050253722(0x3e99999a, float:0.3)
            X.GlU r28 = new X.GlU
            r36 = r34
            r28.<init>(r29, r30, r31, r32, r34, r36)
            boolean r4 = X.0fL.A02()
            if (r4 == 0) goto L_0x01a9
            r4 = -1775902882(0xffffffff9625df5e, float:-1.3399076E-25)
            goto L_0x01a6
        L_0x0232:
            r4 = 888211477(0x34f10815, float:4.4895629E-7)
            boolean r4 = X.C51967G9n.A1U(r1, r4)
            if (r4 == 0) goto L_0x0243
            r5 = 1182618(0x120b9a, float:1.657201E-39)
            java.lang.String r4 = "com.instagram.barcelona.common.ui.button.BdsButtonStyles.secondaryOutlined (BdsButton.kt:327)"
            X.0fL.A01(r5, r4)
        L_0x0243:
            long r32 = X.C51966G9m.A0J(r1)
            long r34 = X.C51966G9m.A0M(r1)
            java.lang.Integer r30 = X.AnonymousClass05K.A00
            r9 = 1065353216(0x3f800000, float:1.0)
            long r4 = X.C51965G9l.A0A(r1)
            X.6Fh r29 = X.AnonymousClass6C9.A00(r9, r4)
            r31 = 1050253722(0x3e99999a, float:0.3)
            X.GlU r28 = new X.GlU
            r36 = r34
            r28.<init>(r29, r30, r31, r32, r34, r36)
            boolean r4 = X.0fL.A02()
            if (r4 == 0) goto L_0x01ac
            r4 = -1874336905(0xffffffff9047e377, float:-3.9421063E-29)
            X.0fL.A00(r4)
            goto L_0x01ac
        L_0x026f:
            r4 = r36 & r19
            if (r4 != 0) goto L_0x0067
            r4 = r21
            int r4 = X.G9t.A0L(r1, r4)
            r0 = r0 | r4
            goto L_0x0067
        L_0x027c:
            r4 = r2 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x003f
            r4 = r20
            int r4 = X.G9t.A09(r1, r4)
            r0 = r0 | r4
            goto L_0x003f
        L_0x0289:
            r4 = r2 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x0039
            int r4 = X.G9t.A02(r1, r12)
            r0 = r0 | r4
            goto L_0x0039
        L_0x0294:
            r4 = r2 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0033
            r4 = r23
            int r4 = X.G9t.A0Q(r1, r4)
            r0 = r0 | r4
            goto L_0x0033
        L_0x02a1:
            r4 = r36 & 48
            if (r4 != 0) goto L_0x002d
            int r4 = X.G9t.A0F(r1, r15)
            r0 = r0 | r4
            goto L_0x002d
        L_0x02ac:
            r0 = r36 & 6
            if (r0 != 0) goto L_0x02ba
            r0 = r38
            int r0 = X.G9t.A0O(r1, r0)
            r0 = r0 | r36
            goto L_0x0027
        L_0x02ba:
            r0 = r2
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56222Hup.A01(X.5Wy, androidx.compose.ui.Modifier, X.HMj, X.NjH, X.0sa, X.0sL, float, int, int, int, boolean):void");
    }

    public static final String A00(C286575Wy r2, C69316NjH njH) {
        C286565Wx r22;
        String str;
        int i;
        if (C51967G9n.A1U(r2, 1918330322)) {
            0fL.A01(-590911488, "com.instagram.barcelona.common.ui.button.toText (FollowButton.kt:107)");
        }
        switch (njH.ordinal()) {
            case 0:
                r2.ExS(-2014222061);
                i = 2131962612;
                break;
            case 1:
                r2.ExS(-2014219210);
                i = 2131962616;
                break;
            case 2:
                r2.ExS(-2014216332);
                i = 2131962620;
                break;
            case 3:
                r2.ExS(-2014213450);
                i = 2131962625;
                break;
            case 4:
                r2.ExS(-2014210605);
                i = 2131962611;
                break;
            case 5:
                r2.ExS(-2014207688);
                i = 2131962613;
                break;
            case 6:
                r2.ExS(-2014204781);
                i = 2131962624;
                break;
            case 7:
                r2.ExS(-2014201996);
                i = 2131962628;
                break;
            case 8:
                r2.ExS(-2014199246);
                i = 2131962610;
                break;
            case 9:
                r2.ExS(1984599197);
                r22 = C51965G9l.A0G(r2);
                str = "";
                break;
            case 10:
                r2.ExS(-2014196393);
                i = 2131962631;
                break;
            case 11:
                r2.ExS(-2014193451);
                i = 2131962627;
                break;
            default:
                throw C51973G9u.A0o(r2, -2014347647);
        }
        str = C288035bG.A00(r2, i);
        r22 = C51965G9l.A0G(r2);
        if (0fL.A02()) {
            0fL.A00(-252036516);
        }
        C286565Wx.A0I(r22);
        return str;
    }
}
