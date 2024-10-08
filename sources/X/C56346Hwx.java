package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.Hwx  reason: case insensitive filesystem */
public abstract class C56346Hwx {
    public static final void A00(C286575Wy r34, ImmutableList immutableList, HM5 hm5, C54635HLs hLs, String str, String str2, C62320sa r40, C62320sa r41, C62320sa r42, C62320sa r43, 0sP r44, int i, int i2, boolean z) {
        int i3;
        int i4;
        C62320sa r5 = r40;
        C62320sa r4 = r41;
        boolean A1Z = AnonymousClass7TG.A1Z(r5, r4);
        C62320sa r3 = r42;
        C62320sa r2 = r43;
        0sP r1 = r44;
        AnonymousClass7TG.A0w(2, r3, r2, r1);
        ImmutableList immutableList2 = immutableList;
        C54635HLs hLs2 = hLs;
        String str3 = str;
        C51973G9u.A0u(5, str3, hLs2, immutableList2);
        C286575Wy r8 = r34;
        r8.ExV(-1406523795);
        int i5 = i;
        int i6 = 4;
        if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r8, r5) | i;
        } else {
            i3 = i5;
        }
        if ((i & 48) == 0) {
            i3 |= G9t.A0F(r8, r4);
        }
        if ((i5 & 384) == 0) {
            i3 |= G9t.A0G(r8, r3);
        }
        if ((i5 & 3072) == 0) {
            i3 |= G9t.A0H(r8, r2);
        }
        if ((i5 & 24576) == 0) {
            i3 |= G9t.A0I(r8, r1);
        }
        if ((196608 & i) == 0) {
            i3 |= G9t.A0T(r8, str3);
        }
        String str4 = str2;
        if ((1572864 & i) == 0) {
            i3 |= G9t.A0U(r8, str4);
        }
        boolean z2 = z;
        if ((12582912 & i) == 0) {
            i3 |= G9t.A0f(r8, z2);
        }
        HM5 hm52 = hm5;
        if ((i & 100663296) == 0) {
            i3 |= G9t.A0W(r8, hm52);
        }
        if ((i & 805306368) == 0) {
            i3 |= G9t.A0X(r8, hLs2);
        }
        int i7 = i2;
        if ((i2 & 6) == 0) {
            if (!r8.AGu(immutableList2)) {
                i6 = 2;
            }
            i4 = i2 | i6;
        } else {
            i4 = i7;
        }
        if ((i3 & 306783379) == 306783378 && (i4 & 3) == 2 && r8.Bwn()) {
            r8.Evl();
        } else {
            if (0fL.A02()) {
                0fL.A01(792298625, "com.instagram.schools.management.ui.SchoolOnboardingConfirmSchoolContent (SchoolOnboardingConfirmSchoolContent.kt:52)");
            }
            HMD hmd = HMD.CONFIRM_SCHOOL;
            int i8 = A1Z ? 1 : 0;
            I58.A03(r8, immutableList2, hmd, r5, r4, (C62320sa) null, (C62320sa) null, AnonymousClass5PI.A01(r8, new JHS(hm52, hLs2, r2, r3, r1, str4, str3, i8, z2), -815432920), 1597440 | (i3 & 14) | (i3 & 112) | (458752 & (i4 << 15)), 12);
            if (0fL.A02()) {
                0fL.A00(268548570);
            }
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            C62320sa r20 = r3;
            C62320sa r21 = r2;
            C62320sa r18 = r5;
            C62320sa r19 = r4;
            String str5 = str3;
            String str6 = str4;
            HM5 hm53 = hm52;
            C54635HLs hLs3 = hLs2;
            ImmutableList immutableList3 = immutableList2;
            ASQ.A06 = new JCG(immutableList3, hm53, hLs3, str5, str6, r18, r19, r20, r21, r1, i5, i7, z2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: X.MH5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: X.MH5} */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x023e, code lost:
        if (r1 == r0) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0240, code lost:
        r19 = new X.MH5(r7, r13, r40, (X.AnonymousClass4D7) null, 41);
        r5.FLL(r19);
        r19 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0254, code lost:
        X.C51968G9o.A1E(r5, r2, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x025b, code lost:
        if (X.C51967G9n.A1R(r5) == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x025d, code lost:
        X.0fL.A00(-507905222);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r41, X.HM5 r42, X.C54635HLs r43, java.lang.String r44, java.lang.String r45, X.C62320sa r46, X.C62320sa r47, X.0sP r48, int r49, boolean r50) {
        /*
            r0 = -1197660039(0xffffffffb89d2879, float:-7.493882E-5)
            r5 = r41
            r5.ExV(r0)
            r4 = r49
            r0 = r49 & 6
            r41 = r46
            if (r0 != 0) goto L_0x02a1
            r0 = r41
            int r3 = X.C41848B3p.A01(r5, r0)
            r3 = r3 | r49
        L_0x0018:
            r0 = r49 & 48
            r40 = r47
            if (r0 != 0) goto L_0x0025
            r0 = r40
            int r0 = X.G9t.A0F(r5, r0)
            r3 = r3 | r0
        L_0x0025:
            r0 = r4 & 384(0x180, float:5.38E-43)
            r32 = r48
            if (r0 != 0) goto L_0x0032
            r0 = r32
            int r0 = X.G9t.A0G(r5, r0)
            r3 = r3 | r0
        L_0x0032:
            r0 = r4 & 3072(0xc00, float:4.305E-42)
            r10 = r44
            if (r0 != 0) goto L_0x003d
            int r0 = X.G9t.A0R(r5, r10)
            r3 = r3 | r0
        L_0x003d:
            r0 = r4 & 24576(0x6000, float:3.4438E-41)
            r17 = r45
            if (r0 != 0) goto L_0x004a
            r0 = r17
            int r0 = X.G9t.A0S(r5, r0)
            r3 = r3 | r0
        L_0x004a:
            r0 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 & r49
            r2 = 131072(0x20000, float:1.83671E-40)
            r39 = r50
            if (r0 != 0) goto L_0x005b
            r0 = r39
            int r0 = X.G9t.A0d(r5, r0)
            r3 = r3 | r0
        L_0x005b:
            r0 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 & r49
            r18 = r42
            if (r0 != 0) goto L_0x006a
            r0 = r18
            int r0 = X.G9t.A0U(r5, r0)
            r3 = r3 | r0
        L_0x006a:
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 & r49
            r15 = r43
            if (r0 != 0) goto L_0x0077
            int r0 = X.G9t.A0V(r5, r15)
            r3 = r3 | r0
        L_0x0077:
            r1 = 4793491(0x492493, float:6.717112E-39)
            r1 = r1 & r3
            r0 = 4793490(0x492492, float:6.71711E-39)
            if (r1 != r0) goto L_0x00a7
            boolean r0 = r5.Bwn()
            if (r0 == 0) goto L_0x00a7
            r5.Evl()
        L_0x0089:
            X.5Xd r1 = r5.ASQ()
            if (r1 == 0) goto L_0x00a6
            X.JAW r0 = new X.JAW
            r5 = r0
            r6 = r18
            r7 = r15
            r8 = r10
            r9 = r17
            r10 = r41
            r11 = r40
            r12 = r32
            r13 = r4
            r14 = r39
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1.A06 = r0
        L_0x00a6:
            return
        L_0x00a7:
            boolean r0 = X.0fL.A02()
            r8 = -1
            if (r0 == 0) goto L_0x00b6
            r1 = -1914181056(0xffffffff8de7ea40, float:-1.4292868E-30)
            java.lang.String r0 = "com.instagram.schools.management.ui.ConfirmCodeContent (SchoolOnboardingConfirmSchoolContent.kt:83)"
            X.0fL.A01(r1, r0)
        L_0x00b6:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r39)
            r0 = -7277166(0xffffffffff90f592, float:NaN)
            r5.ExS(r0)
            r0 = 458752(0x70000, float:6.42848E-40)
            boolean r1 = X.C51972G9s.A1P(r0, r3, r2)
            boolean r0 = X.C51973G9u.A1G(r3)
            r1 = r1 | r0
            java.lang.Object r6 = r5.ECw()
            r9 = 0
            if (r1 != 0) goto L_0x00d6
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r6 != r0) goto L_0x00e4
        L_0x00d6:
            r2 = 37
            X.MG9 r6 = new X.MG9
            r1 = r41
            r0 = r39
            r6.<init>(r1, r9, r2, r0)
            r5.FLL(r6)
        L_0x00e4:
            X.0sL r6 = (X.0sL) r6
            r2 = r5
            X.5Wx r2 = (X.C286565Wx) r2
            r1 = 0
            X.C286565Wx.A0L(r2, r1)
            X.C286645Xf.A04(r5, r7, r6)
            X.4bM r13 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.A01
            java.lang.Object r7 = r5.AJO(r13)
            r0 = -7272398(0xffffffffff910832, float:NaN)
            r5.ExS(r0)
            boolean r0 = X.C51974G9v.A1V(r3)
            boolean r6 = X.C51966G9m.A1U(r5, r7, r0)
            java.lang.Object r0 = r5.ECw()
            if (r6 != 0) goto L_0x010e
            java.lang.Object r6 = X.AnonymousClass5XT.A00
            if (r0 != r6) goto L_0x0118
        L_0x010e:
            r6 = 38
            X.MGw r0 = new X.MGw
            r0.<init>(r15, r7, r9, r6)
            r5.FLL(r0)
        L_0x0118:
            X.C51968G9o.A1E(r5, r2, r0, r15)
            r0 = 2131955091(0x7f130d93, float:1.95467E38)
            r14 = 1
            java.lang.String r12 = X.C51968G9o.A14(r5, r10, r0)
            X.5Z4 r0 = X.C51966G9m.A0h(r5)
            X.5ZB r0 = r0.A02
            X.5ZD r11 = r0.A08
            r0 = -7251554(0xffffffffff91599e, float:NaN)
            java.lang.Object r7 = X.C51967G9n.A0m(r5, r0)
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r7 != r0) goto L_0x013f
            long r6 = X.AnonymousClass5RW.A08
            X.5Tq r7 = X.I58.A00(r11, r10, r12, r6)
            r5.FLL(r7)
        L_0x013f:
            X.5Tq r7 = (X.C286025Tq) r7
            X.C286565Wx.A0L(r2, r1)
            if (r42 == 0) goto L_0x0290
            int r11 = r18.ordinal()
            if (r11 == r8) goto L_0x0290
            if (r11 == r14) goto L_0x0294
            r6 = 2
            if (r11 == r6) goto L_0x0272
            if (r11 == r1) goto L_0x0268
            r6 = 3
            if (r11 == r6) goto L_0x027c
            r6 = 4
            if (r11 != r6) goto L_0x02a4
            r6 = -224260477(0xfffffffff2a20e83, float:-6.419727E30)
            r5.ExS(r6)
            X.IPY r6 = X.IPY.A00
            java.lang.Object r13 = r5.AJO(r13)
            r11 = 944801330(0x38508632, float:4.9716044E-5)
            boolean r11 = X.C51967G9n.A1Z(r5, r13, r11)
            java.lang.Object r12 = r5.ECw()
            if (r11 != 0) goto L_0x0174
            if (r12 != r0) goto L_0x017e
        L_0x0174:
            r11 = 14
            X.MFx r12 = new X.MFx
            r12.<init>(r13, r9, r11)
            r5.FLL(r12)
        L_0x017e:
            X.C51968G9o.A1E(r5, r2, r12, r13)
        L_0x0181:
            X.C286565Wx.A0L(r2, r1)
        L_0x0184:
            X.JLj r6 = (X.C59485JLj) r6
            X.5Qk r16 = androidx.compose.ui.Modifier.A00
            r11 = r16
            androidx.compose.ui.Modifier r13 = X.I28.A02(r5, r11)
            X.5RD r12 = X.C51969G9p.A0Z(r5, r1)
            int r14 = X.C287425a7.A00(r5)
            X.5RM r11 = X.C286565Wx.A04(r2)
            androidx.compose.ui.Modifier r13 = X.C287435a8.A01(r5, r13)
            X.C51973G9u.A0y(r5, r2)
            X.C51971G9r.A12(r5, r12, r11)
            X.0sL r12 = X.C287485aD.A02
            boolean r11 = r2.A0K
            if (r11 != 0) goto L_0x01b0
            boolean r11 = X.C51972G9s.A1Q(r5, r14)
            if (r11 != 0) goto L_0x01b3
        L_0x01b0:
            X.C51971G9r.A13(r5, r12, r14)
        L_0x01b3:
            X.C51965G9l.A18(r5, r13)
            r11 = 2131955090(0x7f130d92, float:1.9546698E38)
            java.lang.String r22 = X.C288035bG.A00(r5, r11)
            r13 = 1119879168(0x42c00000, float:96.0)
            r12 = 2131238454(0x7f081e36, float:1.8093187E38)
            X.Gpi r11 = new X.Gpi
            r11.<init>(r12, r13)
            r23 = 24576(0x6000, float:3.4438E-41)
            r24 = 4070(0xfe6, float:5.703E-42)
            r19 = r5
            r20 = r11
            r21 = r7
            X.I7M.A08(r19, r20, r21, r22, r23, r24)
            r7 = 944825241(0x3850e399, float:4.980303E-5)
            java.lang.Object r7 = X.C51974G9v.A0W(r5, r0, r7)
            X.5aT r7 = (X.C287605aT) r7
            X.C286565Wx.A0L(r2, r1)
            java.lang.Object r11 = r5.ECw()
            java.lang.Object r11 = X.C51974G9v.A0Y(r5, r11, r0)
            X.6FV r11 = (X.AnonymousClass6FV) r11
            X.4Cq r13 = r11.A00
            if (r45 != 0) goto L_0x0265
            java.lang.String r28 = ""
        L_0x01f0:
            r11 = 2131956505(0x7f131319, float:1.9549568E38)
            java.lang.String r29 = X.C288035bG.A00(r5, r11)
            r12 = 3
            X.I23 r11 = new X.I23
            r11.<init>(r9, r8, r12, r8)
            androidx.compose.ui.Modifier r23 = X.C51966G9m.A0T(r16)
            r12 = 12585984(0xc00c00, float:1.763672E-38)
            int r8 = r3 >> 3
            r35 = r8 & 112(0x70, float:1.57E-43)
            r35 = r35 | r12
            r36 = 6
            r37 = 64352(0xfb60, float:9.0176E-41)
            r25 = r9
            r26 = r9
            r27 = r9
            r30 = r9
            r31 = r9
            r33 = r1
            r34 = r1
            r38 = r1
            r19 = r7
            r20 = r9
            r21 = r11
            r22 = r5
            r24 = r6
            X.I7P.A01(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r1 = 944841481(0x38512309, float:4.9862112E-5)
            boolean r6 = X.C51967G9n.A1Z(r5, r13, r1)
            boolean r1 = X.C51973G9u.A1H(r3)
            r6 = r6 | r1
            java.lang.Object r1 = r5.ECw()
            if (r6 != 0) goto L_0x0240
            if (r1 != r0) goto L_0x0254
        L_0x0240:
            r24 = 41
            X.MH5 r1 = new X.MH5
            r19 = r1
            r20 = r7
            r21 = r13
            r22 = r40
            r23 = r9
            r19.<init>(r20, r21, r22, r23, r24)
            r5.FLL(r1)
        L_0x0254:
            X.C51968G9o.A1E(r5, r2, r1, r7)
            boolean r0 = X.C51967G9n.A1R(r5)
            if (r0 == 0) goto L_0x0089
            r0 = -507905222(0xffffffffe1b9fb3a, float:-4.288438E20)
            X.0fL.A00(r0)
            goto L_0x0089
        L_0x0265:
            r28 = r17
            goto L_0x01f0
        L_0x0268:
            r6 = -7240916(0xffffffffff91832c, float:NaN)
            r5.ExS(r6)
            r6 = 2131976374(0x7f1360b6, float:1.9589867E38)
            goto L_0x0285
        L_0x0272:
            r6 = -7243986(0xffffffffff91772e, float:NaN)
            r5.ExS(r6)
            r6 = 2131964476(0x7f13323c, float:1.9565735E38)
            goto L_0x0285
        L_0x027c:
            r6 = -7237855(0xffffffffff918f21, float:NaN)
            r5.ExS(r6)
            r6 = 2131956211(0x7f1311f3, float:1.9548971E38)
        L_0x0285:
            java.lang.String r11 = X.C288035bG.A00(r5, r6)
            X.Gpg r6 = new X.Gpg
            r6.<init>(r11)
            goto L_0x0181
        L_0x0290:
            r6 = -7225333(0xffffffffff91c00b, float:NaN)
            goto L_0x0297
        L_0x0294:
            r6 = -7246037(0xffffffffff916f2b, float:NaN)
        L_0x0297:
            r5.ExS(r6)
            X.C286565Wx.A0L(r2, r1)
            X.IPY r6 = X.IPY.A00
            goto L_0x0184
        L_0x02a1:
            r3 = r4
            goto L_0x0018
        L_0x02a4:
            r0 = -7246653(0xffffffffff916cc3, float:NaN)
            X.Wub r0 = X.C51972G9s.A0v(r5, r2, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56346Hwx.A01(X.5Wy, X.HM5, X.HLs, java.lang.String, java.lang.String, X.0sa, X.0sa, X.0sP, int, boolean):void");
    }
}
