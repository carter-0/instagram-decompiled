package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.I5i  reason: case insensitive filesystem */
public abstract class C56629I5i {
    public static final void A03(C286575Wy r15, C61014JvE jvE, C62320sa r17, int i) {
        int i2;
        C61014JvE jvE2 = jvE;
        C62320sa r11 = r17;
        boolean A1U = AnonymousClass7TF.A1U(0, jvE2, r11);
        C286575Wy r8 = r15;
        r15.ExV(114392806);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r15, jvE2) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r15, r11);
        }
        if ((i2 & 19) != 18 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1884370368, "com.instagram.aistudio.editor.ProfilePicture (AiSettingsScreen.kt:344)");
            }
            Modifier A0V = C51966G9m.A0V(C287195Zj.A0B(Modifier.A00, 0.0f, 20.0f, 0.0f, 20.0f));
            AnonymousClass5RD A0X = C51968G9o.A0X(r15);
            int A00 = C287425a7.A00(r15);
            C286565Wx r4 = (C286565Wx) r8;
            AnonymousClass5RM A04 = C286565Wx.A04(r4);
            Modifier A01 = C287435a8.A01(r15, A0V);
            C51973G9u.A0y(r15, r4);
            C51971G9r.A12(r15, A0X, A04);
            0sL r1 = C287485aD.A02;
            if (r4.A0K || !C51972G9s.A1Q(r15, A00)) {
                C51971G9r.A13(r15, r1, A00);
            }
            C51965G9l.A18(r15, A01);
            ImageUrl imageUrl = jvE2.A03;
            r15.ExS(-1855304189);
            if (imageUrl != null) {
                C54783HSq.A00(r8, new C61090Jx1(imageUrl), jvE2.A09, r11, (C62320sa) null, 0, ((i2 << 3) & 896) | 199728, 192, A1U, A1U, false);
            }
            if (C51971G9r.A1S(r8, r4, false)) {
                0fL.A00(1482733429);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            JGL.A01(ASQ, jvE2, r11, i3, 13);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008d, code lost:
        if (r6 != X.C62626Kix.ONLY_ME) goto L_0x008f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r23, X.C61014JvE r24, X.C62626Kix r25, X.C62320sa r26, int r27) {
        /*
            r0 = 369355702(0x1603ebb6, float:1.0656473E-25)
            r7 = r23
            r7.ExV(r0)
            r4 = r27
            r0 = r27 & 6
            r27 = r24
            if (r0 != 0) goto L_0x0163
            r0 = r27
            int r15 = X.C41848B3p.A01(r7, r0)
            r15 = r15 | r4
        L_0x0017:
            r0 = r4 & 48
            r6 = r25
            if (r0 != 0) goto L_0x0022
            int r0 = X.G9t.A0P(r7, r6)
            r15 = r15 | r0
        L_0x0022:
            r0 = r4 & 384(0x180, float:5.38E-43)
            r5 = r26
            if (r0 != 0) goto L_0x002d
            int r0 = X.G9t.A0G(r7, r5)
            r15 = r15 | r0
        L_0x002d:
            r1 = r15 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            if (r1 != r0) goto L_0x004d
            boolean r0 = r7.Bwn()
            if (r0 == 0) goto L_0x004d
            r7.Evl()
        L_0x003c:
            X.5Xd r2 = r7.ASQ()
            if (r2 == 0) goto L_0x004c
            r1 = 8
            r0 = r27
            X.JGN r0 = X.JGN.A01(r0, r5, r6, r4, r1)
            r2.A06 = r0
        L_0x004c:
            return
        L_0x004d:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x005b
            r1 = -243281951(0xfffffffff17fcfe1, float:-1.2667198E30)
            java.lang.String r0 = "com.instagram.aistudio.editor.AudienceRow (AiSettingsScreen.kt:291)"
            X.0fL.A01(r1, r0)
        L_0x005b:
            com.instagram.common.session.UserSession r11 = X.C51968G9o.A0h(r7)
            X.1Av r10 = X.1Au.A00(r11)
            r0 = 1263382891(0x4b4db16b, float:1.3480299E7)
            java.lang.Object r12 = X.C51967G9n.A0m(r7, r0)
            java.lang.Object r9 = X.AnonymousClass5XT.A00
            r3 = 0
            if (r12 != r9) goto L_0x0098
            r0 = 3964(0xf7c, float:5.555E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            X.0xa r0 = r10.A01
            int r8 = r0.getInt(r1, r3)
            X.0Tu r2 = X.DbS.A0J(r11, r3)
            r0 = 36605550998328581(0x820c8e00101505, double:3.2128360778412645E-306)
            int r0 = X.DbS.A04(r2, r11, r0)
            if (r8 >= r0) goto L_0x008f
            X.Kix r1 = X.C62626Kix.ONLY_ME
            r0 = 1
            if (r6 == r1) goto L_0x0090
        L_0x008f:
            r0 = 0
        L_0x0090:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            androidx.compose.runtime.ParcelableSnapshotMutableState r12 = X.G9t.A0o(r7, r0)
        L_0x0098:
            X.5Oz r12 = (X.C284945Oz) r12
            X.5Wx r8 = X.C51965G9l.A0H(r7, r3)
            X.5Qk r11 = androidx.compose.ui.Modifier.A00
            X.5RD r14 = X.C51966G9m.A0a(r3)
            int r13 = X.C287425a7.A00(r7)
            X.5RM r1 = X.C286565Wx.A04(r8)
            androidx.compose.ui.Modifier r2 = X.C287435a8.A01(r7, r11)
            X.0sa r0 = X.C287485aD.A00
            X.C51973G9u.A0z(r7, r8, r0)
            X.C51971G9r.A12(r7, r14, r1)
            X.0sL r1 = X.C287485aD.A02
            boolean r0 = r8.A0K
            if (r0 != 0) goto L_0x00c4
            boolean r0 = X.C51972G9s.A1Q(r7, r13)
            if (r0 != 0) goto L_0x00c7
        L_0x00c4:
            X.C51971G9r.A13(r7, r1, r13)
        L_0x00c7:
            X.C51965G9l.A18(r7, r2)
            r0 = 2131238274(0x7f081d82, float:1.8092822E38)
            X.2DO r14 = X.C287975bA.A00(r7, r0, r3)
            r0 = 2131952693(0x7f130435, float:1.9541836E38)
            java.lang.String r13 = X.C288035bG.A00(r7, r0)
            r2 = 0
            r0 = -1942885549(0xffffffff8c31eb53, float:-1.3706399E-31)
            boolean r1 = X.C51974G9v.A1Z(r7, r0, r15)
            java.lang.Object r0 = r7.ECw()
            if (r1 != 0) goto L_0x00e8
            if (r0 != r9) goto L_0x00ee
        L_0x00e8:
            r0 = 38
            X.MMA r0 = X.G9w.A0r(r7, r5, r0)
        L_0x00ee:
            X.0sa r0 = X.C51965G9l.A0y(r8, r0, r3)
            r1 = 1
            androidx.compose.ui.Modifier r11 = X.C287635aW.A05(r11, r2, r2, r0, r1)
            r0 = r27
            java.lang.String r15 = r0.A08
            X.Gc0 r0 = new X.Gc0
            r0.<init>(r15, r1)
            r21 = 0
            X.C52636GaA.A03(r7, r11, r14, r0, r13)
            r0 = -1942881009(0xffffffff8c31fd0f, float:-1.3711736E-31)
            r7.ExS(r0)
            boolean r0 = X.C51971G9r.A1W(r12)
            if (r0 == 0) goto L_0x0155
            r0 = 2131952694(0x7f130436, float:1.9541838E38)
            java.lang.String r15 = X.C304346Dc.A00(r7, r0)
            X.HMB r13 = X.HMB.DOWN_RIGHT
            float r0 = X.IH8.A03
            X.4cd r11 = X.C51968G9o.A0Y(r7)
            X.H8n r0 = new X.H8n
            r0.<init>(r11, r13)
            r11 = -1942872432(0xffffffff8c321e90, float:-1.3721818E-31)
            boolean r14 = X.C51967G9n.A1Z(r7, r10, r11)
            java.lang.Object r11 = r7.ECw()
            if (r14 != 0) goto L_0x0134
            if (r11 != r9) goto L_0x013a
        L_0x0134:
            r9 = 45
            X.MMV r11 = X.G9w.A0u(r7, r12, r10, r9)
        L_0x013a:
            X.0sa r16 = X.C51965G9l.A0y(r8, r11, r3)
            r18 = 1573296(0x1801b0, float:2.204657E-39)
            r20 = 1712(0x6b0, float:2.399E-42)
            r14 = r2
            r17 = r2
            r19 = r3
            r23 = r21
            r25 = r1
            r26 = r1
            r10 = r7
            r11 = r2
            r12 = r13
            r13 = r0
            X.C56617I4s.A02(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r25, r26)
        L_0x0155:
            boolean r0 = X.C51971G9r.A1S(r7, r8, r3)
            if (r0 == 0) goto L_0x003c
            r0 = 406504802(0x183ac562, float:2.413959E-24)
            X.0fL.A00(r0)
            goto L_0x003c
        L_0x0163:
            r15 = r4
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56629I5i.A01(X.5Wy, X.JvE, X.Kix, X.0sa, int):void");
    }

    public static final void A02(C286575Wy r11, C61014JvE jvE, C62320sa r13, int i) {
        int i2;
        r11.ExV(287071082);
        if ((i & 48) == 0) {
            i2 = G9t.A0F(r11, r13) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 17) != 16 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1532296758, "com.instagram.aistudio.editor.AdvancedSettingsRow (AiSettingsScreen.kt:329)");
            }
            C285245Qk r7 = Modifier.A00;
            boolean z = false;
            AnonymousClass5RD A00 = C287675aa.A00(C287215Zl.A0E, false);
            int A002 = C287425a7.A00(r11);
            C286565Wx r8 = (C286565Wx) r11;
            AnonymousClass5RM A04 = C286565Wx.A04(r8);
            Modifier A01 = C287435a8.A01(r11, r7);
            C51973G9u.A0y(r11, r8);
            C51971G9r.A12(r11, A00, A04);
            0sL r2 = C287485aD.A02;
            if (r8.A0K || !C51972G9s.A1Q(r11, A002)) {
                C51971G9r.A13(r11, r2, A002);
            }
            C51965G9l.A18(r11, A01);
            AnonymousClass2DO A003 = C287975bA.A00(r11, R.drawable.instagram_settings_pano_outline_24, 0);
            String A004 = C288035bG.A00(r11, 2131952683);
            r11.ExS(-1645898407);
            if ((i2 & 112) == 32) {
                z = true;
            }
            Object ECw = r11.ECw();
            if (z || ECw == AnonymousClass5XT.A00) {
                ECw = new MMA(r13, 30);
                r11.FLL(ECw);
            }
            C52636GaA.A03(r11, C287635aW.A05(r7, (C287625aV) null, (String) null, C51965G9l.A0y(r8, ECw, false), true), A003, new C52748Gc0("", true), A004);
            if (C51967G9n.A1R(r11)) {
                0fL.A00(651651964);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            JGL.A01(ASQ, jvE, r13, i, 12);
        }
    }

    public static final void A04(C286575Wy r14, C62320sa r15, C62320sa r16, C62320sa r17, int i) {
        int i2;
        C286575Wy r13 = r14;
        r14.ExV(-1088000067);
        int i3 = i;
        C62320sa r5 = r15;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r14, r15) | i;
        } else {
            i2 = i3;
        }
        C62320sa r4 = r16;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r14, r4);
        }
        C62320sa r3 = r17;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r14, r3);
        }
        if ((i2 & 147) != 146 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-824913782, "com.instagram.aistudio.editor.ConfirmDeletionDialog (AiSettingsScreen.kt:365)");
            }
            r3.invoke();
            r14.ExS(607248658);
            int i4 = i2 & 14;
            boolean A1S = AnonymousClass7TF.A1S(i4, 4);
            Object ECw = r14.ECw();
            if (A1S || ECw == AnonymousClass5XT.A00) {
                ECw = G9w.A0r(r14, r15, 39);
            }
            C62320sa r8 = (C62320sa) ECw;
            C286565Wx A0H = C51965G9l.A0H(r14, false);
            String A00 = C288035bG.A00(r14, 2131952801);
            String A002 = C288035bG.A00(r14, 2131952802);
            Integer num = AnonymousClass05K.A0C;
            boolean A1O = C51973G9u.A1O(r14, 607260017, i2);
            Object ECw2 = r14.ECw();
            if (A1O || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = G9w.A0r(r14, r4, 40);
            }
            C53398GnV A003 = HXM.A00(r14, num, C51965G9l.A0y(A0H, ECw2, false), 2131957531, 12);
            Integer num2 = AnonymousClass05K.A00;
            boolean A1X = C51970G9q.A1X(r13, 607264786, i4, 4);
            Object ECw3 = r13.ECw();
            if (A1X || ECw3 == AnonymousClass5XT.A00) {
                ECw3 = new MMA(r15, 41);
                r13.FLL(ECw3);
            }
            C56632I5m.A02(r13, A003, new C53398GnV(num2, "Cancel", C51965G9l.A0y(A0H, ECw3, false), 12), A00, A002, r8);
            if (0fL.A02()) {
                0fL.A00(-1626576434);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JGN(r5, r4, r3, i3, 9);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v83, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v84, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v156, resolved type: X.IyN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v2, resolved type: X.IyN} */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0338, code lost:
        if (r0 == r2) goto L_0x033a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r66, X.C61081JwJ r67, X.C61014JvE r68, X.C62626Kix r69, X.C62320sa r70, X.C62320sa r71, X.C62320sa r72, X.C62320sa r73, X.C62320sa r74, X.C62320sa r75, X.C62320sa r76, X.C62320sa r77, X.C62320sa r78, X.C62320sa r79, X.C62320sa r80, X.C62320sa r81, X.C62320sa r82, X.C62320sa r83, X.0sP r84, X.0sP r85, X.0sP r86, X.0sP r87, X.0sP r88, X.0sP r89, int r90, int r91, int r92, boolean r93, boolean r94) {
        /*
            r5 = 0
            r24 = r84
            r0 = r24
            X.0qQ.A0B(r0, r5)
            r4 = 1
            r43 = r70
            r26 = r86
            r25 = r85
            r2 = r25
            r1 = r26
            r0 = r43
            X.DbZ.A0t(r4, r2, r1, r0)
            r13 = 4
            r41 = r71
            r0 = r41
            X.0qQ.A0B(r0, r13)
            r64 = r72
            r27 = r87
            r1 = r27
            r0 = r64
            X.AnonymousClass7TG.A1S(r1, r0)
            r61 = r76
            r62 = r75
            r63 = r74
            r44 = r73
            r3 = r44
            r2 = r63
            r1 = r62
            r0 = r61
            X.C51974G9v.A1Q(r3, r2, r1, r0)
            r59 = r78
            r60 = r77
            r58 = r79
            r39 = r80
            r3 = r60
            r2 = r59
            r1 = r58
            r0 = r39
            X.C51974G9v.A1R(r3, r2, r1, r0)
            r1 = 15
            r40 = r81
            r0 = r40
            X.0qQ.A0B(r0, r1)
            r1 = 16
            r8 = r68
            r31 = r82
            r0 = r31
            X.C51969G9p.A1S(r0, r1, r8)
            r1 = 19
            r28 = r88
            r0 = r28
            X.0qQ.A0B(r0, r1)
            r2 = 22
            r29 = r89
            r30 = r83
            r1 = r29
            r0 = r30
            X.C51970G9q.A1O(r1, r2, r0)
            r1 = 24
            r65 = r67
            r0 = r65
            X.0qQ.A0B(r0, r1)
            r0 = -1049212766(0xffffffffc17648a2, float:-15.392733)
            r9 = r66
            r9.ExV(r0)
            r7 = r90
            r0 = r90 & 6
            if (r0 != 0) goto L_0x03f6
            r0 = r24
            int r0 = X.C41848B3p.A01(r9, r0)
            r23 = r90 | r0
        L_0x009a:
            r0 = r90 & 48
            r2 = 16
            if (r0 != 0) goto L_0x00a8
            r0 = r25
            int r0 = X.G9t.A0F(r9, r0)
            r23 = r23 | r0
        L_0x00a8:
            r0 = r7 & 384(0x180, float:5.38E-43)
            r1 = 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00b6
            r0 = r26
            int r0 = X.G9t.A0G(r9, r0)
            r23 = r23 | r0
        L_0x00b6:
            r0 = r7 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x00c2
            r0 = r43
            int r0 = X.G9t.A0H(r9, r0)
            r23 = r23 | r0
        L_0x00c2:
            r0 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x00ce
            r0 = r41
            int r0 = X.G9t.A0I(r9, r0)
            r23 = r23 | r0
        L_0x00ce:
            r0 = 1572864(0x180000, float:2.204052E-39)
            r0 = r90 & r0
            if (r0 != 0) goto L_0x00dc
            r0 = r64
            int r0 = X.G9t.A0K(r9, r0)
            r23 = r23 | r0
        L_0x00dc:
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r90 & r0
            if (r0 != 0) goto L_0x00ea
            r0 = r44
            int r0 = X.G9t.A0L(r9, r0)
            r23 = r23 | r0
        L_0x00ea:
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r90 & r0
            if (r0 != 0) goto L_0x00f8
            r0 = r63
            int r0 = X.G9t.A0M(r9, r0)
            r23 = r23 | r0
        L_0x00f8:
            r0 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r90 & r0
            if (r0 != 0) goto L_0x0106
            r0 = r62
            int r0 = X.G9t.A0N(r9, r0)
            r23 = r23 | r0
        L_0x0106:
            r6 = r91
            r0 = r91 & 6
            if (r0 != 0) goto L_0x03f2
            r0 = r61
            int r0 = X.C41848B3p.A01(r9, r0)
            r22 = r91 | r0
        L_0x0114:
            r0 = r91 & 48
            if (r0 != 0) goto L_0x011e
            int r0 = X.G9t.A0F(r9, r3)
            r22 = r22 | r0
        L_0x011e:
            r0 = r6 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x012e
            r0 = r59
            boolean r0 = r9.AGw(r0)
            if (r0 == 0) goto L_0x012c
            r1 = 256(0x100, float:3.59E-43)
        L_0x012c:
            r22 = r22 | r1
        L_0x012e:
            r0 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x013a
            r0 = r39
            int r0 = X.G9t.A0I(r9, r0)
            r22 = r22 | r0
        L_0x013a:
            r0 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 & r91
            if (r0 != 0) goto L_0x0148
            r0 = r40
            int r0 = X.G9t.A0J(r9, r0)
            r22 = r22 | r0
        L_0x0148:
            r0 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 & r91
            if (r0 != 0) goto L_0x0156
            r0 = r31
            int r0 = X.G9t.A0K(r9, r0)
            r22 = r22 | r0
        L_0x0156:
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r91 & r0
            if (r0 != 0) goto L_0x0162
            int r0 = X.G9t.A0L(r9, r8)
            r22 = r22 | r0
        L_0x0162:
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r91 & r0
            r37 = r69
            if (r0 != 0) goto L_0x0172
            r0 = r37
            int r0 = X.G9t.A0W(r9, r0)
            r22 = r22 | r0
        L_0x0172:
            r0 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r91 & r0
            if (r0 != 0) goto L_0x0180
            r0 = r28
            int r0 = X.G9t.A0N(r9, r0)
            r22 = r22 | r0
        L_0x0180:
            r32 = r92
            r0 = r92 & 6
            r57 = r93
            if (r0 != 0) goto L_0x03ee
            r0 = r57
            int r0 = X.G9t.A0Y(r9, r0)
            r21 = r92 | r0
        L_0x0190:
            r0 = r92 & 48
            r56 = r94
            if (r0 != 0) goto L_0x01a2
            r0 = r56
            boolean r0 = r9.AGv(r0)
            if (r0 == 0) goto L_0x01a0
            r2 = 32
        L_0x01a0:
            r21 = r21 | r2
        L_0x01a2:
            r0 = 306717843(0x12482493, float:6.3153954E-28)
            r1 = r23 & r0
            r0 = 306717842(0x12482492, float:6.315395E-28)
            if (r1 != r0) goto L_0x01fc
            r1 = 306782355(0x12492093, float:6.346457E-28)
            r1 = r1 & r22
            r0 = 306782354(0x12492092, float:6.3464563E-28)
            if (r1 != r0) goto L_0x01fc
            r1 = r21 & 19
            r0 = 18
            if (r1 != r0) goto L_0x01fc
            boolean r0 = r9.Bwn()
            if (r0 == 0) goto L_0x01fc
            r9.Evl()
        L_0x01c5:
            X.5Xd r1 = r9.ASQ()
            if (r1 == 0) goto L_0x01fb
            X.JDr r0 = new X.JDr
            r9 = r37
            r10 = r43
            r11 = r41
            r12 = r64
            r13 = r44
            r14 = r63
            r15 = r62
            r16 = r61
            r17 = r60
            r18 = r59
            r19 = r58
            r20 = r39
            r21 = r40
            r22 = r31
            r23 = r30
            r30 = r7
            r31 = r6
            r33 = r57
            r34 = r56
            r6 = r0
            r7 = r65
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r1.A06 = r0
        L_0x01fb:
            return
        L_0x01fc:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x020a
            r1 = 315948727(0x12d4feb7, float:1.3441873E-27)
            java.lang.String r0 = "com.instagram.aistudio.editor.AiSettingsScreen (AiSettingsScreen.kt:86)"
            X.0fL.A01(r1, r0)
        L_0x020a:
            r0 = -2118194163(0xffffffff81beec0d, float:-7.0133693E-38)
            r9.ExS(r0)
            boolean r0 = r8.A0J
            r20 = 0
            if (r0 == 0) goto L_0x022a
            androidx.compose.ui.Modifier r0 = X.C51969G9p.A0U()
            X.GQD.A01(r9, r0)
            boolean r0 = X.C51970G9q.A1a(r9, r5)
            if (r0 == 0) goto L_0x01c5
            r0 = -1369227443(0xffffffffae633f4d, float:-5.1670047E-11)
        L_0x0226:
            X.0fL.A00(r0)
            goto L_0x01c5
        L_0x022a:
            X.5Wx r3 = X.C51965G9l.A0H(r9, r5)
            com.instagram.common.session.UserSession r19 = X.C51970G9q.A0f(r9)
            r0 = -2118188813(0xffffffff81bf00f3, float:-7.016368E-38)
            java.lang.Object r0 = X.C51967G9n.A0m(r9, r0)
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            java.lang.Object r0 = X.C51974G9v.A0Z(r9, r0, r2, r5)
            X.5Oz r18 = X.C51965G9l.A0J(r3, r0, r5)
            r0 = -2118186445(0xffffffff81bf0a33, float:-7.0176954E-38)
            java.lang.Object r0 = X.C51974G9v.A0X(r9, r2, r0, r5)
            X.5Oz r17 = X.C51965G9l.A0J(r3, r0, r5)
            r0 = -2118184271(0xffffffff81bf12b1, float:-7.018914E-38)
            java.lang.Object r0 = X.C51967G9n.A0m(r9, r0)
            if (r0 != r2) goto L_0x025f
            boolean r0 = X.LST.A03(r19)
            java.lang.Boolean r0 = X.C51967G9n.A0e(r9, r0)
        L_0x025f:
            boolean r52 = X.AnonymousClass7TE.A1a(r0)
            X.C286565Wx.A0L(r3, r5)
            r0 = 2131961788(0x7f1327bc, float:1.9560283E38)
            java.lang.String r16 = X.C288035bG.A00(r9, r0)
            X.4bM r0 = X.AnonymousClass5YA.A0A
            java.lang.Object r12 = r9.AJO(r0)
            X.5Qk r15 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r0 = X.C51966G9m.A0U(r15)
            X.5RD r14 = X.C51969G9p.A0Z(r9, r5)
            int r11 = X.C287425a7.A00(r9)
            X.5RM r10 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r1 = X.C287435a8.A01(r9, r0)
            X.0sa r0 = X.C287485aD.A00
            X.C51973G9u.A0z(r9, r3, r0)
            X.C51971G9r.A12(r9, r14, r10)
            X.0sL r10 = X.C287485aD.A02
            boolean r0 = r3.A0K
            if (r0 != 0) goto L_0x029d
            boolean r0 = X.C51972G9s.A1Q(r9, r11)
            if (r0 != 0) goto L_0x02a0
        L_0x029d:
            X.C51971G9r.A13(r9, r10, r11)
        L_0x02a0:
            X.C51965G9l.A18(r9, r1)
            X.6Et r10 = X.C304676Et.A00
            androidx.compose.ui.Modifier r1 = r10.A00(r15, r4)
            X.0sP r0 = X.C287655aY.A00
            androidx.compose.ui.Modifier r11 = X.JJP.A00(r1, r0, r5)
            r0 = 1762562222(0x690e90ae, float:1.0771919E25)
            boolean r1 = X.C51967G9n.A1Y(r9, r12, r0)
            java.lang.Object r0 = r9.ECw()
            if (r1 != 0) goto L_0x02be
            if (r0 != r2) goto L_0x02c4
        L_0x02be:
            r0 = 31
            X.MMA r0 = X.G9w.A0r(r9, r12, r0)
        L_0x02c4:
            X.0sa r12 = X.C51965G9l.A0y(r3, r0, r5)
            r1 = r20
            androidx.compose.ui.Modifier r11 = X.C287635aW.A05(r11, r1, r1, r12, r4)
            r0 = 1762569755(0x690eae1b, float:1.0780604E25)
            boolean r12 = X.C51967G9n.A1Z(r9, r8, r0)
            boolean r0 = X.C51974G9v.A1W(r22)
            r12 = r12 | r0
            boolean r0 = X.C51974G9v.A1T(r22)
            r12 = r12 | r0
            r0 = r21 & 14
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r13)
            r12 = r12 | r0
            r1 = r19
            r0 = r16
            boolean r12 = X.C51972G9s.A1W(r9, r1, r0, r12)
            r0 = r23 & 14
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r13)
            r12 = r12 | r0
            boolean r0 = X.C51974G9v.A1U(r22)
            r12 = r12 | r0
            r1 = r21 & 112(0x70, float:1.57E-43)
            r0 = 32
            boolean r0 = X.AnonymousClass7TF.A1S(r1, r0)
            r12 = r12 | r0
            boolean r0 = X.C51972G9s.A1L(r23)
            r12 = r12 | r0
            boolean r0 = X.C51973G9u.A1I(r23)
            r12 = r12 | r0
            boolean r0 = X.C51973G9u.A1L(r22)
            r12 = r12 | r0
            boolean r0 = X.C51974G9v.A1W(r23)
            r12 = r12 | r0
            boolean r0 = X.C51973G9u.A1K(r22)
            r12 = r12 | r0
            boolean r0 = X.C51973G9u.A1J(r23)
            r12 = r12 | r0
            boolean r0 = X.C51974G9v.A1V(r23)
            r12 = r12 | r0
            boolean r0 = X.C51973G9u.A1L(r23)
            r12 = r12 | r0
            boolean r0 = X.C51973G9u.A1K(r23)
            r12 = r12 | r0
            java.lang.Object r0 = r9.ECw()
            if (r12 != 0) goto L_0x033a
            r54 = 1
            if (r0 != r2) goto L_0x0360
        L_0x033a:
            r54 = 1
            X.IyN r0 = new X.IyN
            r33 = r0
            r34 = r18
            r35 = r8
            r36 = r19
            r38 = r16
            r42 = r31
            r45 = r63
            r46 = r64
            r47 = r24
            r48 = r28
            r49 = r25
            r50 = r26
            r51 = r57
            r53 = r56
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            r9.FLL(r0)
        L_0x0360:
            X.0sP r0 = X.C51965G9l.A0z(r3, r0)
            X.AnonymousClass6HY.A07(r9, r11, r0, r5)
            r0 = 1762766184(0x6911ad68, float:1.1007071E25)
            r9.ExS(r0)
            boolean r0 = X.I2A.A02(r9)
            if (r0 != 0) goto L_0x039e
            androidx.compose.ui.Modifier r46 = X.C51966G9m.A0S(r10, r15)
            X.JwJ r0 = r8.A01
            java.lang.String r1 = r0.A01
            if (r1 != 0) goto L_0x037f
            java.lang.String r1 = ""
        L_0x037f:
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            java.lang.Object r0 = r0.A00
            if (r10 == r0) goto L_0x0387
            r54 = 0
        L_0x0387:
            int r0 = r22 << 3
            r52 = r0 & 112(0x70, float:1.57E-43)
            r53 = 24560(0x5ff0, float:3.4416E-41)
            r45 = r9
            r47 = r20
            r48 = r1
            r49 = r20
            r50 = r61
            r51 = r20
            r55 = r4
            X.I7L.A02(r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
        L_0x039e:
            X.C286565Wx.A0L(r3, r5)
            r9.ASN()
            boolean r0 = X.C51971G9r.A1W(r18)
            if (r0 == 0) goto L_0x03d5
            r0 = -2117950954(0xffffffff81c2a216, float:-7.1496927E-38)
            java.lang.Object r4 = X.C51967G9n.A0m(r9, r0)
            if (r4 != r2) goto L_0x03bf
            r1 = 37
            X.MMA r4 = new X.MMA
            r0 = r18
            r4.<init>(r0, r1)
            r9.FLL(r4)
        L_0x03bf:
            X.0sa r3 = X.C51965G9l.A0y(r3, r4, r5)
            int r0 = r22 >> 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            r2 = r0 | 6
            int r0 = r22 << 3
            r0 = r0 & 896(0x380, float:1.256E-42)
            r2 = r2 | r0
            r1 = r59
            r0 = r60
            A04(r9, r3, r1, r0, r2)
        L_0x03d5:
            boolean r0 = X.C51971G9r.A1W(r17)
            if (r0 == 0) goto L_0x03e3
            r62.invoke()
            r0 = r17
            X.C51967G9n.A16(r0, r5)
        L_0x03e3:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x01c5
            r0 = 593912446(0x2366627e, float:1.24891815E-17)
            goto L_0x0226
        L_0x03ee:
            r21 = r32
            goto L_0x0190
        L_0x03f2:
            r22 = r6
            goto L_0x0114
        L_0x03f6:
            r23 = r7
            goto L_0x009a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56629I5i.A00(X.5Wy, X.JwJ, X.JvE, X.Kix, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sP, X.0sP, X.0sP, X.0sP, X.0sP, X.0sP, int, int, int, boolean, boolean):void");
    }
}
