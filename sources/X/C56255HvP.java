package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.HvP  reason: case insensitive filesystem */
public abstract class C56255HvP {
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0098, code lost:
        if (X.182.A06(X.DbS.A0J(r5, 0), r5, 36318269224785986L) == false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bb, code lost:
        if (r4 != false) goto L_0x00bd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r26, X.C333877aI r27, X.C62320sa r28, X.0sP r29, int r30, boolean r31) {
        /*
            r1 = 0
            r24 = r29
            r2 = r24
            r0 = r28
            boolean r9 = X.AnonymousClass7TF.A1U(r1, r2, r0)
            r20 = 3
            r10 = r27
            r0 = r20
            X.0qQ.A0B(r10, r0)
            r0 = -832144858(0xffffffffce667a26, float:-9.666912E8)
            r2 = r26
            r2.ExV(r0)
            r6 = r30
            r0 = r30 & 14
            if (r0 != 0) goto L_0x01c3
            r0 = r24
            int r3 = X.C41848B3p.A01(r2, r0)
            r3 = r3 | r30
        L_0x002a:
            r0 = r30 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0035
            r0 = r28
            int r0 = X.G9t.A0F(r2, r0)
            r3 = r3 | r0
        L_0x0035:
            r0 = r6 & 896(0x380, float:1.256E-42)
            r21 = r31
            if (r0 != 0) goto L_0x0042
            r0 = r21
            int r0 = X.G9t.A0a(r2, r0)
            r3 = r3 | r0
        L_0x0042:
            r0 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x004b
            int r0 = X.G9t.A0R(r2, r10)
            r3 = r3 | r0
        L_0x004b:
            r3 = r3 & 5851(0x16db, float:8.199E-42)
            r0 = 1170(0x492, float:1.64E-42)
            if (r3 != r0) goto L_0x0072
            boolean r0 = r2.Bwn()
            if (r0 == 0) goto L_0x0072
            r2.Evl()
        L_0x005a:
            X.5Xd r1 = r2.ASQ()
            if (r1 == 0) goto L_0x0071
            X.J8U r0 = new X.J8U
            r4 = r24
            r5 = r28
            r7 = r20
            r8 = r21
            r2 = r0
            r3 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1.A06 = r0
        L_0x0071:
            return
        L_0x0072:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0080
            r3 = -887124439(0xffffffffcb1f8e29, float:-1.0456617E7)
            java.lang.String r0 = "com.instagram.comments.mvvm.view.compose.CommentCoverNotRevealedTitle (CommentCoverNotRevealedTitle.kt:32)"
            X.0fL.A01(r3, r0)
        L_0x0080:
            com.instagram.common.session.UserSession r5 = X.C51968G9o.A0h(r2)
            X.1Av r11 = X.1Au.A00(r5)
            if (r31 == 0) goto L_0x009a
            X.0Tu r0 = X.DbS.A0J(r5, r1)
            r3 = 36318269224785986(0x81074600001842, double:3.031157927462076E-306)
            boolean r3 = X.182.A06(r0, r5, r3)
            r0 = 1
            if (r3 != 0) goto L_0x009b
        L_0x009a:
            r0 = 0
        L_0x009b:
            X.0xa r7 = r11.A01
            java.lang.String r3 = "comment_cover_updated_nux_count"
            int r4 = r7.getInt(r3, r1)
            r3 = r20
            boolean r5 = X.AnonymousClass7TF.A1T(r4, r3)
            java.lang.String r3 = "comment_cover_nux_count"
            int r4 = r7.getInt(r3, r1)
            r3 = r20
            boolean r4 = X.AnonymousClass7TF.A1T(r4, r3)
            if (r0 == 0) goto L_0x00b9
            if (r5 != 0) goto L_0x00bd
        L_0x00b9:
            r25 = 0
            if (r4 == 0) goto L_0x00bf
        L_0x00bd:
            r25 = 1
        L_0x00bf:
            if (r0 == 0) goto L_0x01bd
            if (r5 != 0) goto L_0x01bf
        L_0x00c3:
            r19 = 0
        L_0x00c5:
            r28.invoke()
            X.5Qk r8 = androidx.compose.ui.Modifier.A00
            r13 = 0
            r12 = 1115947008(0x42840000, float:66.0)
            r3 = 1103101952(0x41c00000, float:24.0)
            r7 = 0
            androidx.compose.ui.Modifier r12 = X.C287195Zj.A0B(r8, r12, r7, r3, r7)
            r3 = 1094713344(0x41400000, float:12.0)
            androidx.compose.ui.Modifier r12 = X.C287195Zj.A09(r12, r7, r3)
            X.Io3 r3 = new X.Io3
            r22 = r3
            r23 = r11
            r26 = r0
            r27 = r5
            r22.<init>(r23, r24, r25, r26, r27)
            androidx.compose.ui.Modifier r9 = X.C287635aW.A05(r12, r13, r13, r3, r9)
            X.5RD r13 = X.C51969G9p.A0Z(r2, r1)
            int r14 = X.C287425a7.A00(r2)
            r3 = r2
            X.5Wx r3 = (X.C286565Wx) r3
            X.5RM r11 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r12 = X.C287435a8.A01(r2, r9)
            X.0sa r9 = X.C287485aD.A00
            X.C51973G9u.A0z(r2, r3, r9)
            X.0sL r15 = X.C287485aD.A03
            X.0sL r18 = X.C51969G9p.A0w(r2, r13, r11, r15)
            X.0sL r13 = X.C287485aD.A02
            boolean r11 = r3.A0K
            if (r11 != 0) goto L_0x0115
            boolean r11 = X.C51972G9s.A1Q(r2, r14)
            if (r11 != 0) goto L_0x0118
        L_0x0115:
            X.C51971G9r.A13(r2, r13, r14)
        L_0x0118:
            X.0sL r17 = X.C51966G9m.A1K(r2, r12)
            r11 = -674709582(0xffffffffd7c8bfb2, float:-4.41451301E14)
            r2.ExS(r11)
            if (r19 == 0) goto L_0x012b
            X.7aI r11 = X.C333877aI.TOP
            if (r10 != r11) goto L_0x012b
            A00(r2, r1, r0, r5, r4)
        L_0x012b:
            X.C286565Wx.A0L(r3, r1)
            androidx.compose.ui.Modifier r11 = X.C51966G9m.A0T(r8)
            X.5RD r16 = X.C51968G9o.A0V(r2)
            int r12 = X.C287425a7.A00(r2)
            X.5RM r14 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r11 = X.C287435a8.A01(r2, r11)
            X.C51973G9u.A0z(r2, r3, r9)
            r9 = r16
            X.C287595aO.A00(r2, r9, r15)
            r9 = r18
            boolean r9 = X.C51965G9l.A1Y(r2, r3, r14, r9)
            if (r9 != 0) goto L_0x0158
            boolean r9 = X.C51972G9s.A1Q(r2, r12)
            if (r9 != 0) goto L_0x015b
        L_0x0158:
            X.C51971G9r.A13(r2, r13, r12)
        L_0x015b:
            r9 = r17
            X.C287595aO.A00(r2, r11, r9)
            r9 = 1098907648(0x41800000, float:16.0)
            androidx.compose.ui.Modifier r11 = X.C287205Zk.A0B(r8, r9)
            r9 = 1082130432(0x40800000, float:4.0)
            androidx.compose.ui.Modifier r12 = X.C287195Zj.A0B(r11, r7, r7, r9, r7)
            r9 = 2131238268(0x7f081d7c, float:1.809281E38)
            X.2DO r13 = X.C287975bA.A00(r2, r9, r1)
            r9 = 2131972446(0x7f13515e, float:1.95819E38)
            java.lang.String r14 = X.C288035bG.A00(r2, r9)
            long r16 = X.C51966G9m.A0M(r2)
            r15 = 392(0x188, float:5.5E-43)
            r11 = r2
            X.C288165bT.A07(r11, r12, r13, r14, r15, r16)
            r12 = 1086324736(0x40c00000, float:6.0)
            r11 = 1099956224(0x41900000, float:18.0)
            androidx.compose.ui.Modifier r12 = X.C287195Zj.A0B(r8, r12, r7, r11, r7)
            java.lang.String r14 = X.C288035bG.A00(r2, r9)
            long r16 = X.C51966G9m.A0M(r2)
            r15 = 5
            X.5Z4 r13 = X.C51966G9m.A0f(r2)
            r11 = r2
            X.AnonymousClass5ZZ.A0P(r11, r12, r13, r14, r15, r16)
            r2.ASN()
            r7 = -674673547(0xffffffffd7c94c75, float:-4.42660435E14)
            r2.ExS(r7)
            if (r19 == 0) goto L_0x01af
            X.7aI r7 = X.C333877aI.BOTTOM
            if (r10 != r7) goto L_0x01af
            A00(r2, r1, r0, r5, r4)
        L_0x01af:
            boolean r0 = X.C51971G9r.A1S(r2, r3, r1)
            if (r0 == 0) goto L_0x005a
            r0 = 350684560(0x14e70590, float:2.3327233E-26)
            X.0fL.A00(r0)
            goto L_0x005a
        L_0x01bd:
            if (r4 == 0) goto L_0x00c3
        L_0x01bf:
            r19 = 1
            goto L_0x00c5
        L_0x01c3:
            r3 = r6
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56255HvP.A01(X.5Wy, X.7aI, X.0sa, X.0sP, int, boolean):void");
    }

    public static final void A00(C286575Wy r13, int i, boolean z, boolean z2, boolean z3) {
        int i2;
        C286575Wy r11 = r13;
        r13.ExV(-1079053485);
        int i3 = i;
        boolean z4 = z;
        if ((i & 14) == 0) {
            i2 = G9t.A0Y(r13, z) | i;
        } else {
            i2 = i;
        }
        boolean z5 = z2;
        if ((i & 112) == 0) {
            i2 |= G9t.A0Z(r13, z5);
        }
        boolean z6 = z3;
        if ((i & 896) == 0) {
            i2 |= G9t.A0a(r13, z6);
        }
        if ((i2 & 731) != 146 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1151647827, "com.instagram.comments.mvvm.view.compose.NuxText (CommentCoverNotRevealedTitle.kt:107)");
            }
            C285245Qk r7 = Modifier.A00;
            Modifier A0T = C51966G9m.A0T(r7);
            AnonymousClass5RD A02 = C287395a4.A02(C287275Zs.A01, r13, C287215Zl.A05, 0);
            int A00 = C287425a7.A00(r13);
            C286565Wx r8 = (C286565Wx) r11;
            AnonymousClass5RM A04 = C286565Wx.A04(r8);
            Modifier A01 = C287435a8.A01(r13, A0T);
            C51973G9u.A0y(r13, r8);
            C51971G9r.A12(r13, A02, A04);
            0sL r1 = C287485aD.A02;
            if (r8.A0K || !C51972G9s.A1Q(r13, A00)) {
                C51971G9r.A13(r13, r1, A00);
            }
            C51965G9l.A18(r13, A01);
            String A002 = C288035bG.A00(r13, I0P.A00.A00(C51968G9o.A0h(r13), z, z5, z6));
            AnonymousClass5ZZ.A0P(r11, C51967G9n.A0F(r7, 8.0f), C51966G9m.A0b(r13), A002, 5, C51966G9m.A0M(r13));
            if (C51967G9n.A1R(r11)) {
                0fL.A00(-756972814);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J78(z4, z5, z6, i3);
        }
    }
}
