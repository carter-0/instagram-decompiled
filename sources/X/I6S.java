package X;

import android.view.View;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

public abstract class I6S {
    public static final void A00(View view, C286575Wy r33, Modifier modifier, C48145EZn eZn, ULT ult, C53358Gmi gmi, 0sP r38, 0sP r39, 0sP r40, 0sL r41, AnonymousClass62P r42, int i, int i2, int i3, boolean z, boolean z2) {
        Modifier modifier2 = modifier;
        ULT ult2 = ult;
        C53358Gmi gmi2 = gmi;
        AnonymousClass7TG.A1R(gmi2, ult2);
        AnonymousClass62P r12 = r42;
        0qQ.A0B(r12, 9);
        C286575Wy r1 = r33;
        r1.ExV(-1511697734);
        int i4 = i3;
        if ((i4 & C249703kE.FLAG_MOVED) != 0) {
            modifier2 = Modifier.A00;
        }
        if (0fL.A02()) {
            0fL.A01(-1027906521, "com.instagram.invite.view.InviteContactContent (InviteContactContent.kt:70)");
        }
        0sP r9 = r39;
        boolean z3 = z2;
        boolean z4 = z;
        View view2 = view;
        C48145EZn eZn2 = eZn;
        0sP r8 = r38;
        0sP r10 = r40;
        0sL r11 = r41;
        int i5 = i2;
        C304846Fl.A01((C304806Fh) null, r1, modifier2, (AnonymousClass5S2) null, AnonymousClass5PI.A01(r1, new JCC(gmi2, ult2, eZn2, r8, r9, r10, r11, r12, view2, 0, z3, z4), 1415145532), 0.0f, ((i2 >> 3) & 14) | 1572864, 62, 0, 0);
        if (0fL.A02()) {
            0fL.A00(1434239114);
        }
        C286625Xd ASQ = r1.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59265JCr(view2, modifier2, eZn2, ult2, gmi2, r8, r9, r10, r11, r12, i, i5, i4, z4, z3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        if ((r39 & 6) == 4) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C286575Wy r33, androidx.compose.ui.Modifier r34, X.C48145EZn r35, X.C53358Gmi r36, X.0sP r37, X.0sL r38, int r39, int r40, boolean r41) {
        /*
            r13 = r34
            r1 = -29806118(0xfffffffffe3931da, float:-6.1541506E37)
            r0 = r33
            r0.ExV(r1)
            r17 = r40
            r1 = r40 & 32
            if (r1 == 0) goto L_0x0012
            X.5Qk r13 = androidx.compose.ui.Modifier.A00
        L_0x0012:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0020
            r2 = 699384955(0x29afc47b, float:7.805645E-14)
            java.lang.String r1 = "com.instagram.invite.view.ContactList (InviteContactContent.kt:125)"
            X.0fL.A01(r2, r1)
        L_0x0020:
            r3 = 0
            r9 = 3
            androidx.compose.foundation.lazy.LazyListState r1 = X.C305066Gi.A00(r0, r3, r3, r3, r9)
            r2 = -1299859174(0xffffffffb285b91a, float:-1.5567412E-8)
            boolean r6 = X.C51967G9n.A1Y(r0, r1, r2)
            r16 = r39
            r2 = r39 & 14
            r2 = r2 ^ 6
            r5 = 4
            r12 = r37
            if (r2 <= r5) goto L_0x003e
            boolean r2 = r0.AGu(r12)
            if (r2 != 0) goto L_0x0043
        L_0x003e:
            r4 = r39 & 6
            r2 = 0
            if (r4 != r5) goto L_0x0044
        L_0x0043:
            r2 = 1
        L_0x0044:
            r6 = r6 | r2
            java.lang.Object r2 = r0.ECw()
            r10 = 0
            if (r6 != 0) goto L_0x0050
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r2 != r4) goto L_0x005a
        L_0x0050:
            r4 = 37
            X.MH0 r2 = new X.MH0
            r2.<init>((java.lang.Object) r1, (java.lang.Object) r12, (X.AnonymousClass4D7) r10, (int) r4)
            r0.FLL(r2)
        L_0x005a:
            X.5Wx r5 = X.C51975G9x.A0E(r0, r2, r1)
            X.5RD r4 = X.C51966G9m.A0a(r3)
            int r7 = X.C287425a7.A00(r0)
            X.5RM r2 = X.C286565Wx.A04(r5)
            androidx.compose.ui.Modifier r6 = X.C287435a8.A01(r0, r13)
            X.C51973G9u.A0y(r0, r5)
            X.C51971G9r.A12(r0, r4, r2)
            X.0sL r4 = X.C287485aD.A02
            boolean r2 = r5.A0K
            if (r2 != 0) goto L_0x0080
            boolean r2 = X.C51972G9s.A1Q(r0, r7)
            if (r2 != 0) goto L_0x0083
        L_0x0080:
            X.C51971G9r.A13(r0, r4, r7)
        L_0x0083:
            X.C51965G9l.A18(r0, r6)
            r11 = r36
            java.lang.Integer r4 = r11.A03
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            boolean r26 = X.AnonymousClass7TF.A1W(r4, r8)
            X.5b7 r6 = X.C51972G9s.A0K(r10)
            r2 = 0
            X.GeF r18 = X.I74.A00(r6, r2)
            X.5b7 r6 = X.C51972G9s.A0K(r10)
            X.GeG r19 = X.I74.A04(r6, r2)
            r7 = -2063457224(0xffffffff85022438, float:-6.119223E-36)
            r6 = 41
            X.JJR r6 = X.JJR.A00(r11, r6)
            X.5PJ r23 = X.AnonymousClass5PI.A01(r0, r6, r7)
            r24 = 200064(0x30d80, float:2.8035E-40)
            r25 = 18
            r20 = r0
            r21 = r10
            r22 = r10
            X.C56663I6s.A07(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            boolean r34 = X.AnonymousClass7TF.A1W(r4, r6)
            X.5b7 r6 = X.C51972G9s.A0K(r10)
            X.GeF r26 = X.I74.A00(r6, r2)
            X.5b7 r6 = X.C51972G9s.A0K(r10)
            X.GeG r27 = X.I74.A04(r6, r2)
            r6 = -1430907409(0xffffffffaab615ef, float:-3.2344914E-13)
            X.JH6 r2 = new X.JH6
            r15 = r35
            r14 = r38
            r19 = r41
            r35 = r2
            r36 = r9
            r37 = r1
            r38 = r11
            r39 = r14
            r40 = r15
            r35.<init>(r36, r37, r38, r39, r40, r41)
            X.5PJ r31 = X.AnonymousClass5PI.A01(r0, r2, r6)
            r28 = r0
            r29 = r10
            r30 = r10
            r32 = r24
            r33 = r25
            X.C56663I6s.A07(r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r1 = -1433624510(0xffffffffaa8ca042, float:-2.4980197E-13)
            r0.ExS(r1)
            java.util.List r1 = r11.A05
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x011f
            if (r4 == r8) goto L_0x011f
            int r2 = r11.A02
            java.lang.String r1 = r11.A04
            java.lang.String r23 = X.G9w.A0h(r0, r1, r2)
            long r25 = X.C51966G9m.A0M(r0)
            r24 = 130046(0x1fbfe, float:1.82233E-40)
            X.C52636GaA.A0I(r20, r21, r22, r23, r24, r25)
        L_0x011f:
            boolean r1 = X.C51971G9r.A1S(r0, r5, r3)
            if (r1 == 0) goto L_0x012b
            r1 = 1997405839(0x770dfe8f, float:2.879988E33)
            X.0fL.A00(r1)
        L_0x012b:
            X.5Xd r0 = r0.ASQ()
            if (r0 == 0) goto L_0x013a
            r18 = 5
            X.JAe r10 = new X.JAe
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0.A06 = r10
        L_0x013a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I6S.A02(X.5Wy, androidx.compose.ui.Modifier, X.EZn, X.Gmi, X.0sP, X.0sL, int, int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0087, code lost:
        if ((r10 & 3072) == 2048) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009d, code lost:
        if ((r10 & 384) == 256) goto L_0x009f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r16, androidx.compose.ui.Modifier r17, X.C48145EZn r18, X.ULT r19, X.0sP r20, int r21) {
        /*
            r0 = 1734943905(0x676924a1, float:1.1009871E24)
            r11 = r16
            boolean r0 = X.C51967G9n.A1T(r11, r0)
            if (r0 == 0) goto L_0x0013
            r1 = -2137475957(0xffffffff8098b48b, float:-1.4023762E-38)
            java.lang.String r0 = "com.instagram.invite.view.ErrorMessage (InviteContactContent.kt:265)"
            X.0fL.A01(r1, r0)
        L_0x0013:
            r12 = 0
            r7 = r17
            androidx.compose.ui.Modifier r4 = X.C51966G9m.A0V(r7)
            X.5RD r3 = X.G9w.A0M(r11)
            r1 = 0
            int r5 = X.C287425a7.A00(r11)
            r0 = r11
            X.5Wx r0 = (X.C286565Wx) r0
            X.5RM r2 = X.C286565Wx.A04(r0)
            androidx.compose.ui.Modifier r4 = X.C287435a8.A01(r11, r4)
            X.C51973G9u.A0y(r11, r0)
            X.C51971G9r.A12(r11, r3, r2)
            X.0sL r3 = X.C287485aD.A02
            boolean r2 = r0.A0K
            if (r2 != 0) goto L_0x0040
            boolean r2 = X.C51972G9s.A1Q(r11, r5)
            if (r2 != 0) goto L_0x0043
        L_0x0040:
            X.C51971G9r.A13(r11, r3, r5)
        L_0x0043:
            X.C51965G9l.A18(r11, r4)
            r8 = r19
            int r2 = r8.A02
            X.2DO r13 = X.C287975bA.A00(r11, r2, r1)
            r16 = 0
            r14 = 56
            r15 = 28
            X.C288165bT.A00(r11, r12, r13, r14, r15, r16)
            X.5Qk r3 = androidx.compose.ui.Modifier.A00
            r2 = 1094713344(0x41400000, float:12.0)
            androidx.compose.ui.Modifier r12 = X.C51967G9n.A0F(r3, r2)
            int r2 = r8.A03
            java.lang.String r13 = X.C304346Dc.A00(r11, r2)
            r14 = 48
            r15 = 32764(0x7ffc, float:4.5912E-41)
            X.AnonymousClass5ZZ.A0c(r11, r12, r13, r14, r15, r16)
            r2 = 1605155981(0x5facbc8d, float:2.4893957E19)
            r11.ExS(r2)
            r10 = r21
            r2 = r10 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 ^ 3072(0xc00, float:4.305E-42)
            r3 = 2048(0x800, float:2.87E-42)
            r6 = r20
            if (r2 <= r3) goto L_0x0084
            boolean r2 = r11.AGu(r6)
            if (r2 != 0) goto L_0x0089
        L_0x0084:
            r2 = r10 & 3072(0xc00, float:4.305E-42)
            r5 = 0
            if (r2 != r3) goto L_0x008a
        L_0x0089:
            r5 = 1
        L_0x008a:
            r2 = r10 & 896(0x380, float:1.256E-42)
            r2 = r2 ^ 384(0x180, float:5.38E-43)
            r4 = 256(0x100, float:3.59E-43)
            r9 = r18
            if (r2 <= r4) goto L_0x009a
            boolean r2 = r11.AGu(r9)
            if (r2 != 0) goto L_0x009f
        L_0x009a:
            r2 = r10 & 384(0x180, float:5.38E-43)
            r3 = 0
            if (r2 != r4) goto L_0x00a0
        L_0x009f:
            r3 = 1
        L_0x00a0:
            r3 = r3 | r5
            java.lang.Object r2 = r11.ECw()
            if (r3 != 0) goto L_0x00ab
            java.lang.Object r3 = X.AnonymousClass5XT.A00
            if (r2 != r3) goto L_0x00b5
        L_0x00ab:
            r3 = 30
            X.Phf r2 = new X.Phf
            r2.<init>(r3, r9, r6)
            r11.FLL(r2)
        L_0x00b5:
            X.0sa r3 = X.C51965G9l.A0y(r0, r2, r1)
            int r0 = r8.A01
            java.lang.String r2 = X.C304346Dc.A00(r11, r0)
            X.6CB r0 = X.AnonymousClass6CA.A00(r11)
            X.AnonymousClass6CE.A09(r11, r0, r2, r3, r1)
            boolean r0 = X.C51967G9n.A1R(r11)
            if (r0 == 0) goto L_0x00d2
            r0 = 207937810(0xc64e112, float:1.7632211E-31)
            X.0fL.A00(r0)
        L_0x00d2:
            X.5Xd r0 = r11.ASQ()
            if (r0 == 0) goto L_0x00e1
            r11 = 16
            X.JG7 r5 = new X.JG7
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.A06 = r5
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I6S.A01(X.5Wy, androidx.compose.ui.Modifier, X.EZn, X.ULT, X.0sP, int):void");
    }

    public static final void A03(C286575Wy r12, GS7 gs7, String str, int i) {
        int i2;
        r12.ExV(157989119);
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r12, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= G9t.A0P(r12, gs7);
        }
        if ((i2 & 91) != 18 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1207884813, "com.instagram.invite.view.ProfilePictureContent (InviteContactContent.kt:225)");
            }
            C285245Qk r2 = Modifier.A00;
            JSI jsi = gs7.A02;
            Modifier A0C = C287205Zk.A0C(r2, jsi.AeN());
            Alignment alignment = C287215Zl.A09;
            AnonymousClass5RD A00 = C287675aa.A00(alignment, false);
            int A002 = C287425a7.A00(r12);
            C286565Wx r9 = (C286565Wx) r12;
            AnonymousClass5RM A04 = C286565Wx.A04(r9);
            Modifier A01 = C287435a8.A01(r12, A0C);
            C62320sa r8 = C287485aD.A00;
            C51973G9u.A0z(r12, r9, r8);
            0sL r7 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r12, A00, A04, r7);
            0sL r5 = C287485aD.A02;
            if (r9.A0K || !C51972G9s.A1Q(r12, A002)) {
                C51971G9r.A13(r12, r5, A002);
            }
            0sL A1K = C51966G9m.A1K(r12, A01);
            Modifier A0X = C51966G9m.A0X(C51971G9r.A0Q(r2, jsi.AeO()), C51966G9m.A0B(r12));
            AnonymousClass5RD A003 = C287675aa.A00(alignment, false);
            int A004 = C287425a7.A00(r12);
            AnonymousClass5RM A042 = C286565Wx.A04(r9);
            Modifier A012 = C287435a8.A01(r12, A0X);
            C51973G9u.A0z(r12, r9, r8);
            C287595aO.A00(r12, A003, r7);
            if (C51965G9l.A1Y(r12, r9, A042, A0w) || !C51972G9s.A1Q(r12, A004)) {
                C51971G9r.A13(r12, r5, A004);
            }
            C287595aO.A00(r12, A012, A1K);
            AnonymousClass5ZZ.A0u(r12, C51965G9l.A0S(r12), AnonymousClass7TF.A0k(str), C51966G9m.A0M(r12));
            if (C51971G9r.A1R(r12)) {
                0fL.A00(1353050669);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            JGJ.A01(ASQ, gs7, str, i, 10);
        }
    }

    public static final void A04(C286575Wy r10, String str, 0sP r12, int i) {
        int i2;
        C286575Wy r6 = r10;
        r10.ExV(676517278);
        int i3 = i;
        String str2 = str;
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r10, str) | i;
        } else {
            i2 = i;
        }
        0sP r11 = r12;
        if ((i & 112) == 0) {
            i2 |= G9t.A0F(r10, r12);
        }
        if ((i2 & 91) != 18 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1778995258, "com.instagram.invite.view.SearchBar (InviteContactContent.kt:111)");
            }
            C52751Gc3.A00((C287605aT) null, r6, C287195Zj.A0A(Modifier.A00, 16.0f, 0.0f, 16.0f), (AnonymousClass2DO) null, str2, (String) null, r11, C51965G9l.A01(i2), 56);
            if (0fL.A02()) {
                0fL.A00(-62636618);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            JGJ.A01(ASQ, r11, str2, i3, 11);
        }
    }

    public static final void A05(C62320sa r3, String str, C286575Wy r5, int i) {
        int i2;
        r5.ExV(928909622);
        if ((i & 14) == 0) {
            i2 = C41848B3p.A01(r5, r3) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= G9t.A0P(r5, str);
        }
        if ((i2 & 91) != 18 || !r5.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(79190355, "com.instagram.invite.view.EndContent (InviteContactContent.kt:251)");
            }
            AnonymousClass6CE.A09(r5, C51965G9l.A0m(r5), str, r3, C51965G9l.A01(i2));
            if (0fL.A02()) {
                0fL.A00(-261069188);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            JGJ.A01(ASQ, r3, str, i, 9);
        }
    }
}
