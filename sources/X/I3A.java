package X;

import androidx.compose.foundation.lazy.LazyListState;
import com.google.common.collect.ImmutableList;

public abstract class I3A {
    public static final void A00(C286575Wy r14, ImmutableList immutableList, ImmutableList immutableList2, String str, String str2, C62320sa r19, C62320sa r20, 0sP r21, 0sP r22, int i) {
        int i2;
        C62320sa r13 = r19;
        0qQ.A0B(r13, 0);
        ImmutableList immutableList3 = immutableList;
        C62320sa r3 = r20;
        0sP r2 = r21;
        0sP r1 = r22;
        C51974G9v.A1P(r2, r3, r1, immutableList);
        ImmutableList immutableList4 = immutableList2;
        String str3 = str2;
        AnonymousClass7TF.A1E(immutableList4, 5, str3);
        C286575Wy r10 = r14;
        r14.ExV(-279550723);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r14, r13) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r14, r2);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r14, r3);
        }
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r14, r1);
        }
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0S(r14, immutableList);
        }
        if ((196608 & i) == 0) {
            i2 |= G9t.A0J(r14, immutableList4);
        }
        String str4 = str;
        if ((1572864 & i) == 0) {
            i2 |= G9t.A0U(r14, str4);
        }
        if ((12582912 & i) == 0) {
            i2 |= G9t.A0V(r14, str3);
        }
        if ((4793491 & i2) != 4793490 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-34978544, "com.instagram.schools.management.ui.SchoolOnboardingSchoolSelectionContent (SchoolOnboardingSchoolSelectionContent.kt:40)");
            }
            I58.A03(r10, immutableList3, HMD.SCHOOL_SELECTION, r13, C58492Isn.A00, (C62320sa) null, (C62320sa) null, AnonymousClass5PI.A01(r10, new JH4(immutableList4, str4, str3, r20, r21, r22), -457301256), 1597488 | (i2 & 14) | (458752 & (i2 << 3)), 12);
            if (0fL.A02()) {
                0fL.A00(-1334071148);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JAX(immutableList3, immutableList4, str4, str3, r13, r3, r2, r1, i3);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: X.MH5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: X.MH5} */
    /* JADX WARNING: type inference failed for: r11v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0107, code lost:
        if (r11 == r9) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0109, code lost:
        r17 = new X.MH5(r14, r0, r10, (X.AnonymousClass4D7) null, 42);
        r15.FLL(r17);
        r17 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x011d, code lost:
        r11 = X.G9w.A03(r15, r1, r14, (X.0sL) r11);
        r9 = X.C288035bG.A00(r15, 2131973044);
        X.AnonymousClass5ZZ.A06(r15, X.C287195Zj.A08(r7, 14.0f), X.C51965G9l.A0S(r15), r9);
        r1 = r8 & 14;
        r8 = r8 >> r11;
        A02(r15, r6, r5, r4, (r1 | (r8 & 112)) | (r8 & 896));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0147, code lost:
        if (X.C51967G9n.A1R(r15) == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0149, code lost:
        X.0fL.A00(-1329824534);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r15, com.google.common.collect.ImmutableList r16, java.lang.String r17, java.lang.String r18, X.C62320sa r19, X.0sP r20, X.0sP r21, int r22) {
        /*
            r0 = 1799975662(0x6b4972ee, float:2.4353683E26)
            r15.ExV(r0)
            r2 = r22
            r0 = r22 & 6
            r4 = r20
            if (r0 != 0) goto L_0x0151
            int r8 = X.C41848B3p.A01(r15, r4)
            r8 = r8 | r22
        L_0x0014:
            r0 = r22 & 48
            r3 = r21
            if (r0 != 0) goto L_0x001f
            int r0 = X.G9t.A0F(r15, r3)
            r8 = r8 | r0
        L_0x001f:
            r0 = r2 & 384(0x180, float:5.38E-43)
            r10 = r19
            if (r0 != 0) goto L_0x002a
            int r0 = X.G9t.A0G(r15, r10)
            r8 = r8 | r0
        L_0x002a:
            r0 = r2 & 3072(0xc00, float:4.305E-42)
            r6 = r16
            if (r0 != 0) goto L_0x0035
            int r0 = X.G9t.A0H(r15, r6)
            r8 = r8 | r0
        L_0x0035:
            r0 = r2 & 24576(0x6000, float:3.4438E-41)
            r5 = r17
            if (r0 != 0) goto L_0x0040
            int r0 = X.G9t.A0S(r15, r5)
            r8 = r8 | r0
        L_0x0040:
            r0 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 & r22
            r12 = r18
            if (r0 != 0) goto L_0x004d
            int r0 = X.G9t.A0T(r15, r12)
            r8 = r8 | r0
        L_0x004d:
            r1 = 74899(0x12493, float:1.04956E-40)
            r1 = r1 & r8
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r0) goto L_0x007b
            boolean r0 = r15.Bwn()
            if (r0 == 0) goto L_0x007b
            r15.Evl()
        L_0x005f:
            X.5Xd r0 = r15.ASQ()
            if (r0 == 0) goto L_0x007a
            r21 = 2
            X.JAB r13 = new X.JAB
            r14 = r10
            r15 = r4
            r16 = r3
            r17 = r6
            r18 = r5
            r19 = r12
            r20 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            r0.A06 = r13
        L_0x007a:
            return
        L_0x007b:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0089
            r1 = 1495237597(0x591f83dd, float:2.80621916E15)
            java.lang.String r0 = "com.instagram.schools.management.ui.SchoolSelectionContent (SchoolOnboardingSchoolSelectionContent.kt:66)"
            X.0fL.A01(r1, r0)
        L_0x0089:
            X.5Qk r7 = androidx.compose.ui.Modifier.A00
            X.5Zx r1 = X.C287275Zs.A07
            X.5Zr r0 = X.C287215Zl.A02
            r11 = 0
            X.5RD r9 = X.C291495hO.A02(r1, r15, r0, r11)
            int r14 = X.C287425a7.A00(r15)
            r1 = r15
            X.5Wx r1 = (X.C286565Wx) r1
            X.5RM r0 = X.C286565Wx.A04(r1)
            androidx.compose.ui.Modifier r13 = X.C287435a8.A01(r15, r7)
            X.C51973G9u.A0y(r15, r1)
            X.C51971G9r.A12(r15, r9, r0)
            X.0sL r9 = X.C287485aD.A02
            boolean r0 = r1.A0K
            if (r0 != 0) goto L_0x00b5
            boolean r0 = X.C51972G9s.A1Q(r15, r14)
            if (r0 != 0) goto L_0x00b8
        L_0x00b5:
            X.C51971G9r.A13(r15, r9, r14)
        L_0x00b8:
            X.C51965G9l.A18(r15, r13)
            r0 = 1798796366(0x6b37744e, float:2.2178266E26)
            java.lang.Object r0 = X.C51967G9n.A0m(r15, r0)
            java.lang.Object r9 = X.AnonymousClass5XT.A00
            java.lang.Object r14 = X.C51972G9s.A0l(r15, r0, r9)
            X.5aT r14 = (X.C287605aT) r14
            X.C286565Wx.A0L(r1, r11)
            java.lang.Object r0 = r15.ECw()
            java.lang.Object r0 = X.C51974G9v.A0Y(r15, r0, r9)
            X.6FV r0 = (X.AnonymousClass6FV) r0
            X.4Cq r0 = r0.A00
            r17 = 0
            androidx.compose.ui.Modifier r16 = X.C287195Zj.A04(r7)
            r21 = 196992(0x30180, float:2.76045E-40)
            int r11 = r8 >> 15
            r11 = r11 & 14
            r21 = r21 | r11
            r11 = r8 & 112(0x70, float:1.57E-43)
            r21 = r21 | r11
            r22 = 24
            r19 = r17
            r20 = r3
            X.C52751Gc3.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r11 = 1798806910(0x6b379d7e, float:2.2197716E26)
            boolean r13 = X.C51967G9n.A1Z(r15, r0, r11)
            boolean r11 = X.C51973G9u.A1I(r8)
            r13 = r13 | r11
            java.lang.Object r11 = r15.ECw()
            if (r13 != 0) goto L_0x0109
            if (r11 != r9) goto L_0x011d
        L_0x0109:
            r22 = 42
            X.MH5 r11 = new X.MH5
            r18 = r14
            r19 = r0
            r20 = r10
            r21 = r17
            r17 = r11
            r17.<init>(r18, r19, r20, r21, r22)
            r15.FLL(r11)
        L_0x011d:
            X.0sL r11 = (X.0sL) r11
            int r11 = X.G9w.A03(r15, r1, r14, r11)
            r0 = 2131973044(0x7f1353b4, float:1.9583113E38)
            java.lang.String r9 = X.C288035bG.A00(r15, r0)
            X.5Z4 r1 = X.C51965G9l.A0S(r15)
            r0 = 1096810496(0x41600000, float:14.0)
            androidx.compose.ui.Modifier r0 = X.C287195Zj.A08(r7, r0)
            X.AnonymousClass5ZZ.A06(r15, r0, r1, r9)
            r1 = r8 & 14
            int r8 = r8 >> r11
            r0 = r8 & 112(0x70, float:1.57E-43)
            r1 = r1 | r0
            r0 = r8 & 896(0x380, float:1.256E-42)
            r1 = r1 | r0
            A02(r15, r6, r5, r4, r1)
            boolean r0 = X.C51967G9n.A1R(r15)
            if (r0 == 0) goto L_0x005f
            r0 = -1329824534(0xffffffffb0bc7cea, float:-1.3714303E-9)
            X.0fL.A00(r0)
            goto L_0x005f
        L_0x0151:
            r8 = r2
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I3A.A01(X.5Wy, com.google.common.collect.ImmutableList, java.lang.String, java.lang.String, X.0sa, X.0sP, X.0sP, int):void");
    }

    public static final void A02(C286575Wy r11, ImmutableList immutableList, String str, 0sP r14, int i) {
        int i2;
        r11.ExV(-596046983);
        int i3 = i;
        0sP r8 = r14;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r11, r14) | i;
        } else {
            i2 = i;
        }
        ImmutableList immutableList2 = immutableList;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r11, immutableList);
        }
        String str2 = str;
        if ((i & 384) == 0) {
            i2 |= G9t.A0Q(r11, str);
        }
        if ((i2 & 147) != 146 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1663284702, "com.instagram.schools.management.ui.SchoolList (SchoolOnboardingSchoolSelectionContent.kt:101)");
            }
            LazyListState A00 = C305066Gi.A00(r11, 0, 0, 0, 3);
            boolean A1Z = C51967G9n.A1Z(r11, immutableList, -1565048422) | AnonymousClass7TF.A1S(i2 & 896, 256) | C51968G9o.A1Q(i2);
            Object ECw = r11.ECw();
            if (A1Z || ECw == AnonymousClass5XT.A00) {
                ECw = C51970G9q.A0z(r11, immutableList, r14, str, 37);
            }
            C51965G9l.A1X(r11, false);
            AnonymousClass6HY.A05(A00, r11, (0sP) ECw);
            if (0fL.A02()) {
                0fL.A00(1639806233);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59141J7x(immutableList2, r8, str2, i3, 13);
        }
    }
}
