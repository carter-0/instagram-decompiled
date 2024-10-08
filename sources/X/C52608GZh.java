package X;

/* renamed from: X.GZh  reason: case insensitive filesystem */
public abstract class C52608GZh {
    public static final C52614GZn A00(C286575Wy r5, C62320sa r6, int i, int i2, int i3) {
        0qQ.A0B(r6, 2);
        r5.ExS(127782576);
        boolean z = false;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if (0fL.A02()) {
            0fL.A01(1147287455, "com.instagram.barcelona.common.ui.pager.rememberBdsPagerState (BdsHorizontalPager_1_7.kt:63)");
        }
        r5.ExS(-1422384524);
        if ((((i2 & 896) ^ 384) > 256 && r5.AGu(r6)) || (i2 & 384) == 256) {
            z = true;
        }
        Object ECw = r5.ECw();
        if (z || ECw == AnonymousClass5XT.A00) {
            ECw = new MMP(r6, 39);
            r5.FLL(ECw);
        }
        C286565Wx r4 = (C286565Wx) r5;
        C286565Wx.A0L(r4, false);
        GZF A01 = C52610GZj.A01(r5, (C62320sa) ECw, i, C51965G9l.A01(i2), 0);
        boolean A1Y = C51967G9n.A1Y(r5, A01, -1422383619);
        Object ECw2 = r5.ECw();
        if (A1Y || ECw2 == AnonymousClass5XT.A00) {
            ECw2 = new C52614GZn(A01, r6);
            r5.FLL(ECw2);
        }
        C52614GZn gZn = (C52614GZn) ECw2;
        C286565Wx.A0L(r4, false);
        gZn.A01.Epw(r6);
        if (0fL.A02()) {
            0fL.A00(821896412);
        }
        C286565Wx.A0I(r4);
        return gZn;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C304836Fk r32, X.JNT r33, X.C286575Wy r34, X.C287245Zp r35, androidx.compose.ui.Modifier r36, X.C52614GZn r37, X.0sP r38, X.0sJ r39, float r40, int r41, int r42, boolean r43) {
        /*
            r2 = r33
            r12 = r35
            r3 = r43
            r13 = r40
            r8 = r32
            r19 = r36
            r32 = 0
            r0 = -984352187(0xffffffffc553fa45, float:-3391.6418)
            r7 = r34
            r7.ExV(r0)
            r4 = r42
            r0 = r42 & 1
            r6 = r37
            r5 = r41
            if (r0 == 0) goto L_0x0163
            r9 = r41 | 6
        L_0x0022:
            r18 = r42 & 4
            if (r18 == 0) goto L_0x0156
            r9 = r9 | 384(0x180, float:5.38E-43)
        L_0x0028:
            r14 = r42 & 8
            if (r14 == 0) goto L_0x014b
            r9 = r9 | 3072(0xc00, float:4.305E-42)
        L_0x002e:
            r17 = r42 & 16
            if (r17 == 0) goto L_0x0140
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
        L_0x0034:
            r11 = r42 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r11 != 0) goto L_0x0042
            r0 = r0 & r41
            if (r0 != 0) goto L_0x0043
            int r0 = X.G9t.A0d(r7, r3)
        L_0x0042:
            r9 = r9 | r0
        L_0x0043:
            r16 = r42 & 64
            r0 = 1572864(0x180000, float:2.204052E-39)
            if (r16 != 0) goto L_0x0051
            r0 = r41 & r0
            if (r0 != 0) goto L_0x0052
            int r0 = X.G9t.A0U(r7, r12)
        L_0x0051:
            r9 = r9 | r0
        L_0x0052:
            r10 = r4 & 128(0x80, float:1.794E-43)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            if (r10 != 0) goto L_0x0060
            r0 = r41 & r0
            if (r0 != 0) goto L_0x0061
            int r0 = X.G9t.A0V(r7, r2)
        L_0x0060:
            r9 = r9 | r0
        L_0x0061:
            r0 = r4 & 256(0x100, float:3.59E-43)
            r1 = 100663296(0x6000000, float:2.4074124E-35)
            r15 = r39
            if (r0 == 0) goto L_0x0135
            r9 = r9 | r1
        L_0x006a:
            r1 = 38347907(0x2492483, float:1.4777626E-37)
            r1 = r1 & r9
            r0 = 38347906(0x2492482, float:1.4777625E-37)
            if (r1 != r0) goto L_0x00a2
            boolean r0 = r7.Bwn()
            if (r0 == 0) goto L_0x00a2
            r7.Evl()
        L_0x007c:
            X.5Xd r1 = r7.ASQ()
            if (r1 == 0) goto L_0x00a1
            X.JBO r0 = new X.JBO
            r26 = r38
            r20 = r0
            r21 = r8
            r22 = r2
            r23 = r12
            r24 = r19
            r25 = r6
            r27 = r15
            r28 = r13
            r29 = r5
            r30 = r4
            r31 = r3
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1.A06 = r0
        L_0x00a1:
            return
        L_0x00a2:
            if (r18 == 0) goto L_0x00a6
            X.5Qk r19 = androidx.compose.ui.Modifier.A00
        L_0x00a6:
            X.6Fk r8 = X.G9t.A0n(r8, r14)
            if (r17 == 0) goto L_0x00ad
            r13 = 0
        L_0x00ad:
            boolean r3 = X.C51966G9m.A1R(r11, r3)
            if (r16 == 0) goto L_0x00b5
            X.5Zp r12 = X.C287215Zl.A04
        L_0x00b5:
            if (r10 == 0) goto L_0x00b9
            X.GZe r2 = X.C52605GZe.A00
        L_0x00b9:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00c7
            r1 = -694648850(0xffffffffd6987fee, float:-8.3837611E13)
            java.lang.String r0 = "com.instagram.barcelona.common.ui.pager.BdsHorizontalPager (BdsHorizontalPager_1_7.kt:36)"
            X.0fL.A01(r1, r0)
        L_0x00c7:
            X.GZF r1 = r6.A00
            r11 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r10 = java.lang.Float.valueOf(r11)
            r21 = 0
            r0 = 1137180672(0x43c80000, float:400.0)
            X.5b7 r11 = X.C51965G9l.A0F(r10, r11, r0)
            r10 = 3072(0xc00, float:4.305E-42)
            r0 = 22
            X.6F1 r20 = X.C52616GZp.A00(r11, r1, r7, r10, r0)
            X.Ga2 r29 = X.C52628Ga2.A00
            r11 = 816019683(0x30a378e3, float:1.1894169E-9)
            r10 = 5
            X.GaB r0 = new X.GaB
            r0.<init>((int) r10, (java.lang.Object) r15, (java.lang.Object) r6)
            X.5PJ r30 = X.AnonymousClass5PI.A01(r7, r0, r11)
            int r0 = r9 >> 3
            r10 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 & 896(0x380, float:1.256E-42)
            r0 = r0 | r10
            int r10 = r9 >> 12
            r10 = r10 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r10
            r11 = 458752(0x70000, float:6.42848E-40)
            int r10 = r9 << 3
            r11 = r11 & r10
            r0 = r0 | r11
            r10 = 3670016(0x380000, float:5.142788E-39)
            r10 = r10 & r9
            r0 = r0 | r10
            r10 = 234881024(0xe000000, float:1.5777218E-30)
            int r9 = r9 << 9
            r9 = r9 & r10
            r0 = r0 | r9
            r34 = 3078(0xc06, float:4.313E-42)
            r35 = 6672(0x1a10, float:9.35E-42)
            r28 = r21
            r31 = r13
            r33 = r0
            r36 = r3
            r37 = r32
            r23 = r1
            r24 = r2
            r25 = r7
            r26 = r12
            r27 = r19
            r22 = r8
            X.C52617GZq.A00(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x007c
            r0 = 289371667(0x113f7613, float:1.5103628E-28)
            X.0fL.A00(r0)
            goto L_0x007c
        L_0x0135:
            r0 = r41 & r1
            if (r0 != 0) goto L_0x006a
            int r0 = X.G9t.A0M(r7, r15)
            r9 = r9 | r0
            goto L_0x006a
        L_0x0140:
            r0 = r5 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0034
            int r0 = X.G9t.A03(r7, r13)
            r9 = r9 | r0
            goto L_0x0034
        L_0x014b:
            r0 = r5 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x002e
            int r0 = X.G9t.A0R(r7, r8)
            r9 = r9 | r0
            goto L_0x002e
        L_0x0156:
            r0 = r5 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0028
            r0 = r19
            int r0 = X.G9t.A0Q(r7, r0)
            r9 = r9 | r0
            goto L_0x0028
        L_0x0163:
            r0 = r41 & 6
            if (r0 != 0) goto L_0x016f
            int r9 = X.G9t.A0O(r7, r6)
            r9 = r9 | r41
            goto L_0x0022
        L_0x016f:
            r9 = r5
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52608GZh.A01(X.6Fk, X.JNT, X.5Wy, X.5Zp, androidx.compose.ui.Modifier, X.GZn, X.0sP, X.0sJ, float, int, int, boolean):void");
    }
}
