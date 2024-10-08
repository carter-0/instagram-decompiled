package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.Constants;

/* renamed from: X.I5t  reason: case insensitive filesystem */
public abstract class C56638I5t {
    public static final void A00(C286575Wy r11, int i) {
        C286575Wy r5 = r11;
        r11.ExV(-134625235);
        if (i != 0 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1301546572, "com.instagram.creator.agent.settings.avoidedtopics.fragment.Spacer (AvoidedTopicDetailFragment.kt:321)");
            }
            Modifier A0B = C287195Zj.A0B(Modifier.A00, 0.0f, 12.0f, 0.0f, 12.0f);
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r11, 0);
            int A00 = C287425a7.A00(r11);
            C286565Wx r3 = (C286565Wx) r5;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r11, A0B);
            C51973G9u.A0y(r11, r3);
            C51971G9r.A12(r11, A0Z, A04);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r11, A00)) {
                C51971G9r.A13(r11, r1, A00);
            }
            C51965G9l.A18(r11, A01);
            C56618I4t.A02(r5, (Modifier) null, 6.0f, 384, 3, 0);
            if (C51967G9n.A1R(r5)) {
                0fL.A00(-2041709931);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            JG9.A01(ASQ, i, 35);
        }
    }

    public static final void A01(C286575Wy r15, C61042Jvg jvg, C62320sa r17, int i, boolean z) {
        int i2;
        C286575Wy r8 = r15;
        r15.ExV(-794697645);
        int i3 = i;
        boolean z2 = z;
        if ((i & 6) == 0) {
            i2 = G9t.A0Y(r8, z2) | i;
        } else {
            i2 = i3;
        }
        C62320sa r2 = r17;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r8, r2);
        }
        C61042Jvg jvg2 = jvg;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r8, jvg2);
        }
        if ((i2 & 147) != 146 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-408012641, "com.instagram.creator.agent.settings.avoidedtopics.fragment.BottomButton (AvoidedTopicDetailFragment.kt:330)");
            }
            C56663I6s.A07((C56151Htd) null, (C56152Hte) null, r8, (Modifier) null, (String) null, AnonymousClass5PI.A01(r8, new C59360JGm(5, r2, jvg2, z2), 1193922859), 196608, 30, jvg2.A01);
            if (0fL.A02()) {
                0fL.A00(1517823184);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG4(i3, 11, r17, jvg2, z);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: X.IxP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: X.IxP} */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0091, code lost:
        if (r6.A05 == r8) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (r0 == X.AnonymousClass5XT.A00) goto L_0x00f2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C286575Wy r20, X.C53399GnW r21, java.lang.String r22, X.C62320sa r23, X.0sP r24, X.0sP r25, int r26, int r27) {
        /*
            r0 = 2051788953(0x7a4bd099, float:2.6456678E35)
            r7 = r20
            r7.ExV(r0)
            r1 = r27
            r0 = r27 & 6
            r27 = r22
            if (r0 != 0) goto L_0x0134
            r0 = r27
            int r10 = X.G9t.A0O(r7, r0)
            r10 = r10 | r1
        L_0x0017:
            r0 = r1 & 48
            r4 = r24
            if (r0 != 0) goto L_0x0022
            int r0 = X.G9t.A0F(r7, r4)
            r10 = r10 | r0
        L_0x0022:
            r0 = r1 & 384(0x180, float:5.38E-43)
            r5 = r23
            if (r0 != 0) goto L_0x002d
            int r0 = X.G9t.A0G(r7, r5)
            r10 = r10 | r0
        L_0x002d:
            r0 = r1 & 3072(0xc00, float:4.305E-42)
            r3 = r25
            if (r0 != 0) goto L_0x0038
            int r0 = X.G9t.A0H(r7, r3)
            r10 = r10 | r0
        L_0x0038:
            r0 = r1 & 24576(0x6000, float:3.4438E-41)
            r2 = r26
            if (r0 != 0) goto L_0x0043
            int r0 = X.G9t.A09(r7, r2)
            r10 = r10 | r0
        L_0x0043:
            r0 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 & r1
            r6 = r21
            if (r0 != 0) goto L_0x004f
            int r0 = X.G9t.A0J(r7, r6)
            r10 = r10 | r0
        L_0x004f:
            r8 = 74899(0x12493, float:1.04956E-40)
            r8 = r8 & r10
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r8 != r0) goto L_0x0079
            boolean r0 = r7.Bwn()
            if (r0 == 0) goto L_0x0079
            r7.Evl()
        L_0x0061:
            X.5Xd r0 = r7.ASQ()
            if (r0 == 0) goto L_0x0078
            r15 = 8
            X.JA8 r7 = new X.JA8
            r14 = r2
            r12 = r27
            r13 = r1
            r10 = r4
            r11 = r5
            r8 = r3
            r9 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r0.A06 = r7
        L_0x0078:
            return
        L_0x0079:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0087
            r8 = -1941108778(0xffffffff8c4d07d6, float:-1.5794984E-31)
            java.lang.String r0 = "com.instagram.creator.agent.settings.avoidedtopics.fragment.AvoidedTopicDetails (AvoidedTopicDetailFragment.kt:200)"
            X.0fL.A01(r8, r0)
        L_0x0087:
            java.lang.Object r0 = r6.A03
            X.HLa r8 = X.C54617HLa.LOADING
            r9 = 0
            if (r0 == r8) goto L_0x0093
            java.lang.Object r0 = r6.A05
            r13 = 0
            if (r0 != r8) goto L_0x0094
        L_0x0093:
            r13 = 1
        L_0x0094:
            X.5Qk r11 = androidx.compose.ui.Modifier.A00
            X.5RD r9 = X.C51969G9p.A0Z(r7, r9)
            int r15 = X.C287425a7.A00(r7)
            r12 = r7
            X.5Wx r12 = (X.C286565Wx) r12
            X.5RM r0 = X.C286565Wx.A04(r12)
            androidx.compose.ui.Modifier r14 = X.C287435a8.A01(r7, r11)
            X.C51973G9u.A0y(r7, r12)
            X.C51971G9r.A12(r7, r9, r0)
            X.0sL r9 = X.C287485aD.A02
            boolean r0 = r12.A0K
            if (r0 != 0) goto L_0x00bb
            boolean r0 = X.C51972G9s.A1Q(r7, r15)
            if (r0 != 0) goto L_0x00be
        L_0x00bb:
            X.C51971G9r.A13(r7, r9, r15)
        L_0x00be:
            X.C51965G9l.A18(r7, r14)
            X.6Et r0 = X.C304676Et.A00
            r20 = 0
            r9 = 1
            androidx.compose.ui.Modifier r22 = r0.A00(r11, r9)
            r0 = 548766401(0x20b582c1, float:3.0749118E-19)
            boolean r11 = X.C51974G9v.A1X(r7, r0, r10)
            boolean r0 = X.C51974G9v.A1W(r10)
            r11 = r11 | r0
            boolean r0 = X.C51973G9u.A1H(r10)
            r11 = r11 | r0
            boolean r0 = r7.AGv(r13)
            boolean r11 = X.C51968G9o.A1T(r7, r6, r11, r0)
            boolean r0 = X.C51973G9u.A1J(r10)
            r11 = r11 | r0
            java.lang.Object r0 = r7.ECw()
            if (r11 != 0) goto L_0x00f2
            java.lang.Object r11 = X.AnonymousClass5XT.A00
            if (r0 != r11) goto L_0x0106
        L_0x00f2:
            X.IxP r0 = new X.IxP
            r14 = r6
            r15 = r27
            r16 = r3
            r17 = r4
            r18 = r2
            r19 = r13
            r13 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r7.FLL(r0)
        L_0x0106:
            X.0sP r23 = X.C51965G9l.A0z(r12, r0)
            r24 = 12582912(0xc00000, float:1.7632415E-38)
            r25 = 126(0x7e, float:1.77E-43)
            r21 = r7
            r26 = r9
            X.AnonymousClass6HY.A04(r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r0 = r6.A05
            boolean r9 = X.AnonymousClass7TF.A1W(r0, r8)
            java.lang.Object r8 = r6.A01
            X.Jvg r8 = (X.C61042Jvg) r8
            int r0 = r10 >> 3
            r0 = r0 & 112(0x70, float:1.57E-43)
            A01(r7, r8, r5, r0, r9)
            boolean r0 = X.C51967G9n.A1R(r7)
            if (r0 == 0) goto L_0x0061
            r0 = -1944633649(0xffffffff8c173ecf, float:-1.1651518E-31)
            X.0fL.A00(r0)
            goto L_0x0061
        L_0x0134:
            r10 = r1
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56638I5t.A02(X.5Wy, X.GnW, java.lang.String, X.0sa, X.0sP, X.0sP, int, int):void");
    }

    public static final void A03(C286575Wy r13, String str, String str2, 0sP r16, int i, int i2, int i3, boolean z) {
        int i4;
        C286575Wy r12 = r13;
        r13.ExV(611194794);
        int i5 = i3;
        String str3 = str;
        if ((i3 & 6) == 0) {
            i4 = G9t.A0O(r13, str) | i3;
        } else {
            i4 = i5;
        }
        String str4 = str2;
        if ((i3 & 48) == 0) {
            i4 |= G9t.A0P(r13, str2);
        }
        int i6 = i;
        if ((i5 & 384) == 0) {
            i4 |= G9t.A07(r13, i6);
        }
        int i7 = i2;
        if ((i5 & 3072) == 0) {
            i4 |= G9t.A08(r13, i7);
        }
        boolean z2 = z;
        if ((i5 & 24576) == 0) {
            i4 |= G9t.A0c(r13, z2);
        }
        0sP r5 = r16;
        if ((196608 & i3) == 0) {
            i4 |= G9t.A0J(r13, r5);
        }
        if ((74899 & i4) != 74898 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1095259033, "com.instagram.creator.agent.settings.avoidedtopics.fragment.ResponseStyleRow (AvoidedTopicDetailFragment.kt:309)");
            }
            String A00 = C304346Dc.A00(r13, i6);
            String A002 = C304346Dc.A00(r13, i7);
            boolean z3 = !z;
            boolean A0K = 0qQ.A0K(str, str2);
            r13.ExS(1859571130);
            boolean A1S = AnonymousClass7TF.A1S(458752 & i4, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) | C51968G9o.A1S(i4);
            Object ECw = r13.ECw();
            if (A1S || ECw == AnonymousClass5XT.A00) {
                ECw = C51970G9q.A0y(r13, r5, str2, 33);
            }
            C52636GaA.A08(r12, (Modifier) null, (AnonymousClass2DO) null, new C57123IPm(A0K, (C62320sa) ECw), A00, A002, C51968G9o.A1Y(r13) ? 1 : 0, 130794, z3);
            if (0fL.A02()) {
                0fL.A00(-2052925914);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59165J8v(str3, str4, r5, i6, i7, i5, z2);
        }
    }

    public static final void A04(C286575Wy r29, String str, 0sP r31, int i, int i2) {
        int i3;
        C286575Wy r5 = r29;
        r5.ExV(-24900764);
        int i4 = i2;
        String str2 = str;
        if ((i2 & 6) == 0) {
            i3 = G9t.A0O(r5, str2) | i2;
        } else {
            i3 = i4;
        }
        int i5 = i;
        if ((i2 & 48) == 0) {
            i3 |= G9t.A06(r5, i5);
        }
        0sP r4 = r31;
        if ((i4 & 384) == 0) {
            i3 |= G9t.A0G(r5, r4);
        }
        if ((i3 & 147) != 146 || !r5.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1142466846, "com.instagram.creator.agent.settings.avoidedtopics.fragment.AvoidedTopicInputSection (AvoidedTopicDetailFragment.kt:235)");
            }
            Object A0m = C51967G9n.A0m(r5, 653447792);
            Object obj = AnonymousClass5XT.A00;
            if (A0m == obj) {
                A0m = G9t.A0o(r5, str2);
            }
            C284945Oz r8 = (C284945Oz) A0m;
            C286565Wx r6 = (C286565Wx) r5;
            C286565Wx.A0L(r6, false);
            C287605aT r14 = (C287605aT) C51974G9v.A0W(r5, obj, 653449966);
            C286565Wx.A0L(r6, false);
            String A1A = C51966G9m.A1A(r8);
            String A00 = C304346Dc.A00(r5, 2131952407);
            boolean z = true;
            Modifier A0T = C51966G9m.A0T(Modifier.A00);
            boolean A1O = C51973G9u.A1O(r5, 653455621, i3);
            if ((i3 & 896) != 256) {
                z = false;
            }
            boolean z2 = A1O | z;
            Object ECw = r5.ECw();
            if (z2 || ECw == obj) {
                ECw = new J6V(r8, r4, i5, 5);
                r5.FLL(ECw);
            }
            I7P.A01(r14, (I4S) null, (I23) null, r5, A0T, (C59485JLj) null, (Boolean) null, (Integer) null, (Integer) null, A1A, A00, (String) null, (C62320sa) null, C51965G9l.A0z(r6, ECw), 0, Integer.MAX_VALUE, 1575936, 6, 64432, false);
            I2Y.A02(r5, (Modifier) null, C304346Dc.A00(r5, 2131952267), 0, 2);
            if (0fL.A02()) {
                0fL.A00(-584975259);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59139J7v(r4, str2, i5, i4, 9);
        }
    }
}
