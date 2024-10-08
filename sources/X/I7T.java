package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.List;

public abstract class I7T {
    public static final void A09(C286575Wy r20, String str, String str2, C62320sa r23, C62320sa r24, int i, boolean z) {
        int i2;
        String str3;
        C62320sa r6 = r23;
        0qQ.A0B(r6, 0);
        String str4 = str;
        String str5 = str2;
        C62320sa r5 = r24;
        AnonymousClass7TG.A0w(1, r5, str4, str5);
        C286575Wy r15 = r20;
        r15.ExV(-13213900);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r15, r6) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r15, r5);
        }
        boolean z2 = z;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0a(r15, z2);
        }
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0R(r15, str4);
        }
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0S(r15, str5);
        }
        if ((i2 & 9363) != 9362 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1593071598, "com.instagram.schools.tab.ui.EmptyState (SchoolDirectoryComposeComponents.kt:375)");
            }
            r5.invoke();
            C285245Qk r14 = Modifier.A00;
            C62320sa r22 = null;
            Modifier A0U = C51966G9m.A0U(r14);
            AnonymousClass5RD A0M = G9w.A0M(r15);
            int A00 = C287425a7.A00(r15);
            C286565Wx r0 = (C286565Wx) r15;
            AnonymousClass5RM A04 = C286565Wx.A04(r0);
            Modifier A01 = C287435a8.A01(r15, A0U);
            C51973G9u.A0y(r15, r0);
            C51971G9r.A12(r15, A0M, A04);
            0sL r11 = C287485aD.A02;
            if (r0.A0K || !C51972G9s.A1Q(r15, A00)) {
                C51971G9r.A13(r15, r11, A00);
            }
            C51965G9l.A18(r15, A01);
            C53511Gph gph = new C53511Gph(96.0f, R.drawable.instagram_user_outline_96);
            HL5 hl5 = HL5.EMPHASIZED;
            Modifier A0T = C51966G9m.A0T(r14);
            r15.ExS(-1157919540);
            if (z) {
                str3 = C288035bG.A00(r15, 2131964484);
            } else {
                str3 = null;
            }
            C286565Wx.A0L(r0, false);
            if (z) {
                r22 = r6;
            }
            I7M.A02(r15, A0T, gph, hl5, str5, str4, str3, r22, ((i2 >> 9) & 14) | 432 | (i2 & 57344), 1504, 0);
            if (C51967G9n.A1R(r15)) {
                0fL.A00(150454676);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r15.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9R(r5, r6, str5, str4, i3, 1, z2);
        }
    }

    public static final void A0B(C286575Wy r8, C62320sa r9, int i, boolean z) {
        int i2;
        0qQ.A0B(r9, 0);
        r8.ExV(-604731816);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r8, r9) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0Z(r8, z);
        }
        if ((i2 & 19) != 18 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1186948032, "com.instagram.schools.tab.ui.SearchEmptyState (SchoolDirectoryComposeComponents.kt:409)");
            }
            if (z) {
                Modifier A08 = C287195Zj.A08(C51966G9m.A0T(C51965G9l.A0K(r8, 1939715690)), 8.0f);
                AnonymousClass5RD A00 = C287395a4.A00(C287275Zs.A04, r8, C287215Zl.A04);
                int A002 = C287425a7.A00(r8);
                C286565Wx r4 = (C286565Wx) r8;
                AnonymousClass5RM A04 = C286565Wx.A04(r4);
                Modifier A01 = C287435a8.A01(r8, A08);
                C51973G9u.A0y(r8, r4);
                C51971G9r.A12(r8, A00, A04);
                0sL r1 = C287485aD.A02;
                if (r4.A0K || !C51972G9s.A1Q(r8, A002)) {
                    C51971G9r.A13(r8, r1, A002);
                }
                C51965G9l.A18(r8, A01);
                AnonymousClass5ZZ.A0a(r8, (Modifier) null, C288035bG.A00(r8, 2131968420), 32766);
                AnonymousClass6CE.A09(r8, C51965G9l.A0m(r8), C288035bG.A00(r8, 2131964484), r9, i2 & 14);
                r8.ASN();
            } else {
                r8.ExS(1940188130);
                C52636GaA.A0S(r8, C288035bG.A00(r8, 2131968420));
            }
            if (C51970G9q.A1a(r8, false)) {
                0fL.A00(-1805128587);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            JGI.A01(ASQ, r9, i, 15, z);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v49, resolved type: X.Iy2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: X.Iy2} */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010b, code lost:
        if (r0 == r14) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010d, code lost:
        r18 = new X.C58817Iy2(r15, r20, r7, r8, r23, r24, r25, 4, r27);
        r10.FLL(r18);
        r18 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011f, code lost:
        X.AnonymousClass6HY.A05(r13, r10, X.C51965G9l.A0z(r12, r0));
        r10.ExS(266644769);
        r1 = X.C51975G9x.A1O(r17);
        r0 = r10.ECw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0134, code lost:
        if (r1 != false) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0136, code lost:
        if (r0 != r14) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0138, code lost:
        r0 = new X.C20608Wvp(r9, 2);
        r10.FLL(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0140, code lost:
        X.C52381GQg.A00(r13, r10, X.C51965G9l.A0y(r12, r0, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x014b, code lost:
        if (X.0fL.A02() == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x014d, code lost:
        X.0fL.A00(-321163233);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0E(X.C286575Wy r18, X.C62320sa r19, X.0sP r20, X.0sP r21, X.0sP r22, X.0sP r23, X.0sL r24, X.AnonymousClass62P r25, int r26, boolean r27) {
        /*
            r11 = 0
            r8 = r21
            r0 = r20
            X.AnonymousClass7TF.A1H(r0, r8)
            r2 = 2
            r7 = r22
            r6 = r23
            int r13 = X.DbW.A03(r2, r7, r6)
            r1 = 4
            r5 = r24
            X.0qQ.A0B(r5, r1)
            r9 = r19
            r4 = r25
            X.AnonymousClass7TG.A1S(r9, r4)
            r0 = -887226959(0xffffffffcb1dfdb1, float:-1.0354097E7)
            r10 = r18
            r10.ExV(r0)
            r3 = r26
            r0 = r26 & 6
            if (r0 != 0) goto L_0x0155
            r0 = r20
            int r17 = X.C41848B3p.A01(r10, r0)
            r17 = r17 | r26
        L_0x0034:
            r0 = r26 & 48
            if (r0 != 0) goto L_0x003e
            int r0 = X.G9t.A0F(r10, r8)
            r17 = r17 | r0
        L_0x003e:
            r0 = r3 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0048
            int r0 = X.G9t.A0G(r10, r7)
            r17 = r17 | r0
        L_0x0048:
            r0 = r3 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0052
            int r0 = X.G9t.A0H(r10, r6)
            r17 = r17 | r0
        L_0x0052:
            r0 = r3 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x005c
            int r0 = X.G9t.A0I(r10, r5)
            r17 = r17 | r0
        L_0x005c:
            r0 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 & r26
            if (r0 != 0) goto L_0x0068
            int r0 = X.G9t.A0J(r10, r9)
            r17 = r17 | r0
        L_0x0068:
            r0 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 & r26
            if (r0 != 0) goto L_0x0074
            int r0 = X.G9t.A0K(r10, r4)
            r17 = r17 | r0
        L_0x0074:
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 & r26
            if (r0 != 0) goto L_0x0082
            r0 = r27
            int r0 = X.G9t.A0f(r10, r0)
            r17 = r17 | r0
        L_0x0082:
            r0 = 4793491(0x492493, float:6.717112E-39)
            r12 = r17 & r0
            r0 = 4793490(0x492492, float:6.71711E-39)
            if (r12 != r0) goto L_0x00b2
            boolean r0 = r10.Bwn()
            if (r0 == 0) goto L_0x00b2
            r10.Evl()
        L_0x0095:
            X.5Xd r1 = r10.ASQ()
            if (r1 == 0) goto L_0x00b1
            X.JBF r0 = new X.JBF
            r18 = r27
            r14 = r6
            r15 = r20
            r16 = r3
            r17 = r2
            r10 = r4
            r11 = r8
            r12 = r7
            r13 = r9
            r8 = r0
            r9 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1.A06 = r0
        L_0x00b1:
            return
        L_0x00b2:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00c0
            r12 = 1011788427(0x3c4eaa8b, float:0.012613903)
            java.lang.String r0 = "com.instagram.schools.tab.ui.StudentList (SchoolDirectoryComposeComponents.kt:235)"
            X.0fL.A01(r12, r0)
        L_0x00c0:
            androidx.compose.foundation.lazy.LazyListState r13 = X.C305066Gi.A00(r10, r11, r11, r11, r13)
            r0 = 266616561(0xfe43ef1, float:2.250678E-29)
            java.lang.Object r15 = X.C51967G9n.A0m(r10, r0)
            java.lang.Object r14 = X.AnonymousClass5XT.A00
            if (r15 != r14) goto L_0x00d4
            r0 = 0
            androidx.compose.runtime.ParcelableSnapshotMutableState r15 = X.G9t.A0o(r10, r0)
        L_0x00d4:
            X.5Wx r12 = X.C51965G9l.A0H(r10, r11)
            r0 = 266620236(0xfe44d4c, float:2.251231E-29)
            boolean r16 = X.C51967G9n.A1Z(r10, r4, r0)
            r0 = r17 & 14
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r1)
            r16 = r16 | r0
            boolean r0 = X.C51973G9u.A1H(r17)
            r16 = r16 | r0
            boolean r0 = X.C51973G9u.A1I(r17)
            r16 = r16 | r0
            boolean r0 = X.C51973G9u.A1J(r17)
            r16 = r16 | r0
            boolean r0 = X.C51974G9v.A1W(r17)
            r16 = r16 | r0
            boolean r0 = X.C51974G9v.A1V(r17)
            r16 = r16 | r0
            java.lang.Object r0 = r10.ECw()
            if (r16 != 0) goto L_0x010d
            if (r0 != r14) goto L_0x011f
        L_0x010d:
            X.Iy2 r0 = new X.Iy2
            r18 = r0
            r19 = r15
            r21 = r7
            r22 = r8
            r26 = r1
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r10.FLL(r0)
        L_0x011f:
            X.0sP r0 = X.C51965G9l.A0z(r12, r0)
            X.AnonymousClass6HY.A05(r13, r10, r0)
            r0 = 266644769(0xfe4ad21, float:2.2549223E-29)
            r10.ExS(r0)
            boolean r1 = X.C51975G9x.A1O(r17)
            java.lang.Object r0 = r10.ECw()
            if (r1 != 0) goto L_0x0138
            if (r0 != r14) goto L_0x0140
        L_0x0138:
            X.Wvp r0 = new X.Wvp
            r0.<init>(r9, r2)
            r10.FLL(r0)
        L_0x0140:
            X.0sa r0 = X.C51965G9l.A0y(r12, r0, r11)
            X.C52381GQg.A00(r13, r10, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0095
            r0 = -321163233(0xffffffffecdb701f, float:-2.1222739E27)
            X.0fL.A00(r0)
            goto L_0x0095
        L_0x0155:
            r17 = r3
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I7T.A0E(X.5Wy, X.0sa, X.0sP, X.0sP, X.0sP, X.0sP, X.0sL, X.62P, int, boolean):void");
    }

    public static final void A0D(C286575Wy r23, C62320sa r24, C62320sa r25, int i) {
        int i2;
        C62320sa r2 = r24;
        C62320sa r1 = r25;
        AnonymousClass7TG.A1N(r2, r1);
        C286575Wy r10 = r23;
        r10.ExV(-1583465021);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r10, r2) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r10, r1);
        }
        if ((i2 & 19) != 18 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(2138118025, "com.instagram.schools.tab.ui.RetryView (SchoolDirectoryComposeComponents.kt:431)");
            }
            r1.invoke();
            C285245Qk r8 = Modifier.A00;
            Modifier A0U = C51966G9m.A0U(r8);
            AnonymousClass5RD A0M = G9w.A0M(r10);
            int A00 = C287425a7.A00(r10);
            C286565Wx r6 = (C286565Wx) r10;
            AnonymousClass5RM A04 = C286565Wx.A04(r6);
            Modifier A01 = C287435a8.A01(r10, A0U);
            C51973G9u.A0y(r10, r6);
            C51971G9r.A12(r10, A0M, A04);
            0sL r4 = C287485aD.A02;
            if (r6.A0K || !C51972G9s.A1Q(r10, A00)) {
                C51971G9r.A13(r10, r4, A00);
            }
            C51965G9l.A18(r10, A01);
            String A002 = C304346Dc.A00(r10, 2131974095);
            String A003 = C304346Dc.A00(r10, 2131972720);
            I7M.A01(r10, C51966G9m.A0T(r8), new C53512Gpi(R.drawable.instagram_error_outline_96, 96.0f), HL5.EMPHASIZED, (HL6) null, A003, (CharSequence) null, A002, C304346Dc.A00(r10, 2131971905), r2, (0sP) null, (0sP) null, 432, (i2 << 3) & 112, 1504, 0);
            if (C51967G9n.A1R(r10)) {
                0fL.A00(817685739);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            JGM.A01(ASQ, r2, r1, i3, 9);
        }
    }

    public static final void A00(C286575Wy r14, int i) {
        C286575Wy r9 = r14;
        r14.ExV(222678173);
        int i2 = i;
        if (i != 0 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1951706012, "com.instagram.schools.tab.ui.SchoolBannerIcon (SchoolDirectoryComposeComponents.kt:181)");
            }
            C285245Qk r7 = Modifier.A00;
            Modifier A0Q = C51968G9o.A0Q(C287205Zk.A0C(r7, 44.0f), 44.0f / 2.0f, 1.0f, C51966G9m.A0C(r14));
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A00 = C287425a7.A00(r14);
            C286565Wx r4 = (C286565Wx) r9;
            AnonymousClass5RM A04 = C286565Wx.A04(r4);
            Modifier A01 = C287435a8.A01(r14, A0Q);
            C51973G9u.A0y(r14, r4);
            C51971G9r.A12(r14, A0a, A04);
            0sL r1 = C287485aD.A02;
            if (r4.A0K || !C51972G9s.A1Q(r14, A00)) {
                C51971G9r.A13(r14, r1, A00);
            }
            C51965G9l.A18(r14, A01);
            C289515dj r12 = C289515dj.A00;
            C288165bT.A00(r9, C51965G9l.A0L(r12, C287205Zk.A04(r7)), C287975bA.A00(r14, R.drawable.instagram_cap_pano_outline_24, 0), 48, 24, 0);
            if (C51967G9n.A1R(r9)) {
                0fL.A00(-1806912406);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r9.ASQ();
        if (ASQ != null) {
            JGA.A01(ASQ, i2, 11);
        }
    }

    public static final void A01(C286575Wy r3, int i) {
        r3.ExV(289735170);
        if (i != 0 || !r3.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-332112103, "com.instagram.schools.tab.ui.ShimmerPill (SchoolDirectoryComposeComponents.kt:344)");
            }
            C56666I6v.A05(r3, C51968G9o.A0P(C287205Zk.A0G(Modifier.A00, 80.0f, 26.0f), 8.0f));
            if (0fL.A02()) {
                0fL.A00(246614169);
            }
        } else {
            r3.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            JGA.A01(ASQ, i, 12);
        }
    }

    public static final void A02(C286575Wy r7, int i) {
        r7.ExV(1458242404);
        if (i != 0 || !r7.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1458030948, "com.instagram.schools.tab.ui.ShimmerPillRow (SchoolDirectoryComposeComponents.kt:349)");
            }
            Modifier A03 = C287195Zj.A03(C51969G9p.A0U());
            AnonymousClass5RD A02 = C287395a4.A02(C287275Zs.A00(), r7, C287215Zl.A05, 6);
            int A00 = C287425a7.A00(r7);
            C286565Wx r3 = (C286565Wx) r7;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r7, A03);
            C51973G9u.A0y(r7, r3);
            C51971G9r.A12(r7, A02, A04);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r7, A00)) {
                C51971G9r.A13(r7, r1, A00);
            }
            C51965G9l.A18(r7, A01);
            r7.ExS(58786555);
            int i2 = 0;
            do {
                A01(r7, 0);
                i2++;
            } while (i2 < 6);
            if (C51971G9r.A1S(r7, r3, false)) {
                0fL.A00(2076692750);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            JGA.A01(ASQ, i, 13);
        }
    }

    public static final void A03(C286575Wy r6, int i) {
        r6.ExV(1439980668);
        if (i != 0 || !r6.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1119188840, "com.instagram.schools.tab.ui.ShimmerStudentList (SchoolDirectoryComposeComponents.kt:360)");
            }
            Modifier A04 = C287195Zj.A04(C51969G9p.A0U());
            AnonymousClass5RD A02 = C291495hO.A02(C287275Zs.A07, r6, C287215Zl.A02, 0);
            int A00 = C287425a7.A00(r6);
            C286565Wx r3 = (C286565Wx) r6;
            AnonymousClass5RM A042 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r6, A04);
            C51973G9u.A0y(r6, r3);
            C51971G9r.A12(r6, A02, A042);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r6, A00)) {
                C51971G9r.A13(r6, r1, A00);
            }
            C51965G9l.A18(r6, A01);
            r6.ExS(347632437);
            int i2 = 0;
            do {
                I3B.A00(r6, 0);
                i2++;
            } while (i2 < 13);
            if (C51971G9r.A1S(r6, r3, false)) {
                0fL.A00(-490066880);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            JGA.A01(ASQ, i, 14);
        }
    }

    public static final void A04(C286575Wy r4, Modifier modifier, C62320sa r6, int i, int i2) {
        int i3;
        r4.ExV(-1658900513);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r4, r6) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r4, modifier);
        }
        if ((i3 & 19) != 18 || !r4.Bwn()) {
            if (i4 != 0) {
                modifier = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(1806388388, "com.instagram.schools.tab.ui.StudentRowMoreButton (SchoolDirectoryComposeComponents.kt:334)");
            }
            AnonymousClass6G3.A02(r4, C287635aW.A06(modifier, r6), C51968G9o.A0R(C51966G9m.A0G(r4)), C51967G9n.A0J(r4, R.drawable.instagram_more_vertical_pano_outline_24), 48);
            if (0fL.A02()) {
                0fL.A00(-71633652);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            ASQ.A06 = GSJ.A01(modifier, r6, i2, i, 37);
        }
    }

    public static final void A06(C286575Wy r14, C61076JwE jwE, 0sP r16, int i) {
        int i2;
        C286575Wy r10 = r14;
        r14.ExV(1103794313);
        int i3 = i;
        0sP r2 = r16;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r14, r2) | i;
        } else {
            i2 = i3;
        }
        C61076JwE jwE2 = jwE;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r14, jwE);
        }
        if ((i2 & 19) != 18 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1345165480, "com.instagram.schools.tab.ui.HeaderPills (SchoolDirectoryComposeComponents.kt:212)");
            }
            if (jwE != null) {
                List<String> list = (List) jwE.A00;
                ArrayList A0r = AnonymousClass7TG.A0r(list);
                for (String str : list) {
                    A0r.add(new C53517Gpn(str, str, true));
                }
                AnonymousClass62P A00 = AnonymousClass62Q.A00(A0r);
                String str2 = jwE2.A01;
                C53517Gpn gpn = new C53517Gpn(str2, str2, true);
                Modifier A0F = C51967G9n.A0F(C51966G9m.A0T(Modifier.A00), 12.0f);
                r14.ExS(-367039296);
                boolean A1Q = C51968G9o.A1Q(i2);
                Object ECw = r14.ECw();
                if (A1Q || ECw == AnonymousClass5XT.A00) {
                    ECw = new C74180PqM(r2, 42);
                    r14.FLL(ECw);
                }
                C51965G9l.A1V(r14);
                C56633I5n.A01((LazyListState) null, r10, A0F, gpn, (0sP) ECw, (0sP) null, A00, 384, 48);
            }
            if (0fL.A02()) {
                0fL.A00(-1941975362);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            JGM.A01(ASQ, jwE2, r2, i3, 7);
        }
    }

    public static final void A07(C286575Wy r18, C53312Gly gly, C62320sa r20, C62320sa r21, C62320sa r22, int i) {
        int i2;
        C286575Wy r12 = r18;
        r12.ExV(-1445530435);
        int i3 = i;
        int i4 = i & 6;
        C62320sa r23 = r20;
        if (i4 == 0) {
            i2 = C41848B3p.A01(r12, r23) | i3;
        } else {
            i2 = i3;
        }
        C62320sa r15 = r21;
        if ((i3 & 48) == 0) {
            i2 |= G9t.A0F(r12, r15);
        }
        C62320sa r10 = r22;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r12, r10);
        }
        C53312Gly gly2 = gly;
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r12, gly2);
        }
        if ((i2 & 1171) != 1170 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-540099897, "com.instagram.schools.tab.ui.StudentRowExtraContent (SchoolDirectoryComposeComponents.kt:310)");
            }
            C285245Qk r7 = Modifier.A00;
            Modifier Ezh = r7.Ezh(C287205Zk.A00).Ezh(C287195Zj.A0B(r7, 9.0f, 0.0f, 0.0f, 0.0f));
            AnonymousClass5RD A0W = C51968G9o.A0W(r12);
            int A00 = C287425a7.A00(r12);
            C286565Wx r3 = (C286565Wx) r12;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r12, Ezh);
            C51973G9u.A0y(r12, r3);
            C51971G9r.A12(r12, A0W, A04);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r12, A00)) {
                C51971G9r.A13(r12, r1, A00);
            }
            C51965G9l.A18(r12, A01);
            C46519DgM dgM = gly2.A01;
            boolean A1Z = C51967G9n.A1Z(r12, gly2, 1045719883) | AnonymousClass7TF.A1S(i2 & 896, 256) | C51973G9u.A1H(i2);
            Object ECw = r12.ECw();
            if (A1Z || ECw == AnonymousClass5XT.A00) {
                ECw = new C20704Wxb(12, gly2, r10, r15);
                r12.FLL(ECw);
            }
            C286575Wy r16 = r12;
            GR2.A00(r16, (Modifier) null, dgM, (GSN) null, C51965G9l.A0y(r3, ECw, false), 0, 6);
            A04(r12, C287195Zj.A0B(r7, 9.0f, 0.0f, 0.0f, 0.0f), r23, (i2 & 14) | 48, 0);
            if (C51967G9n.A1R(r12)) {
                0fL.A00(-1103598850);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG7(gly2, r23, r15, r10, i3, 23);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: X.IxD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: X.IxD} */
    /* JADX WARNING: type inference failed for: r0v19 */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cd, code lost:
        if (r0 == X.AnonymousClass5XT.A00) goto L_0x00cf;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A08(X.C286575Wy r26, X.C53312Gly r27, X.C62320sa r28, X.C62320sa r29, X.C62320sa r30, X.C62320sa r31, X.0sL r32, int r33, boolean r34) {
        /*
            r0 = -627038789(0xffffffffdaa025bb, float:-2.25387407E16)
            r8 = r26
            r8.ExV(r0)
            r6 = r33
            r0 = r33 & 6
            r33 = r28
            if (r0 != 0) goto L_0x0139
            r0 = r33
            int r9 = X.C41848B3p.A01(r8, r0)
            r9 = r9 | r6
        L_0x0017:
            r0 = r6 & 48
            r15 = r29
            if (r0 != 0) goto L_0x0022
            int r0 = X.G9t.A0F(r8, r15)
            r9 = r9 | r0
        L_0x0022:
            r0 = r6 & 384(0x180, float:5.38E-43)
            r14 = r30
            if (r0 != 0) goto L_0x002d
            int r0 = X.G9t.A0G(r8, r14)
            r9 = r9 | r0
        L_0x002d:
            r0 = r6 & 3072(0xc00, float:4.305E-42)
            r13 = r31
            if (r0 != 0) goto L_0x0038
            int r0 = X.G9t.A0H(r8, r13)
            r9 = r9 | r0
        L_0x0038:
            r0 = r6 & 24576(0x6000, float:3.4438E-41)
            r11 = 16384(0x4000, float:2.2959E-41)
            r12 = r32
            if (r0 != 0) goto L_0x0045
            int r0 = X.G9t.A0I(r8, r12)
            r9 = r9 | r0
        L_0x0045:
            r0 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 & r6
            r7 = r27
            if (r0 != 0) goto L_0x0051
            int r0 = X.G9t.A0J(r8, r7)
            r9 = r9 | r0
        L_0x0051:
            r0 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 & r6
            r5 = r34
            if (r0 != 0) goto L_0x005d
            int r0 = X.G9t.A0e(r8, r5)
            r9 = r9 | r0
        L_0x005d:
            r1 = 599187(0x92493, float:8.3964E-40)
            r1 = r1 & r9
            r0 = 599186(0x92492, float:8.39638E-40)
            if (r1 != r0) goto L_0x0089
            boolean r0 = r8.Bwn()
            if (r0 == 0) goto L_0x0089
            r8.Evl()
        L_0x006f:
            X.5Xd r1 = r8.ASQ()
            if (r1 == 0) goto L_0x0088
            r16 = 2
            X.JAi r0 = new X.JAi
            r8 = r0
            r9 = r13
            r10 = r14
            r11 = r15
            r13 = r33
            r14 = r7
            r15 = r6
            r17 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1.A06 = r0
        L_0x0088:
            return
        L_0x0089:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0097
            r1 = -2069235933(0xffffffff84a9f723, float:-3.995867E-36)
            java.lang.String r0 = "com.instagram.schools.tab.ui.StudentUserRow (SchoolDirectoryComposeComponents.kt:276)"
            X.0fL.A01(r1, r0)
        L_0x0097:
            com.instagram.model.reels.Reel r0 = r7.A02
            boolean r4 = X.AnonymousClass7TF.A1V(r0)
            com.instagram.common.typedurl.ImageUrl r0 = r7.A00
            r19 = 0
            r3 = 0
            X.2DN r18 = X.1zC.A00(r8, r0)
            java.lang.String r2 = r7.A05
            java.lang.String r1 = r7.A03
            androidx.compose.ui.Modifier r17 = X.C51969G9p.A0U()
            r0 = -916291200(0xffffffffc9628180, float:-927768.0)
            boolean r10 = X.C51967G9n.A1W(r8, r0, r4)
            r0 = 57344(0xe000, float:8.0356E-41)
            boolean r0 = X.C51972G9s.A1P(r0, r9, r11)
            boolean r10 = X.C51968G9o.A1T(r8, r7, r10, r0)
            boolean r0 = X.C51973G9u.A1G(r9)
            r10 = r10 | r0
            java.lang.Object r0 = r8.ECw()
            if (r10 != 0) goto L_0x00cf
            java.lang.Object r10 = X.AnonymousClass5XT.A00
            if (r0 != r10) goto L_0x00e3
        L_0x00cf:
            r21 = 20
            X.IxD r0 = new X.IxD
            r20 = r0
            r22 = r7
            r23 = r12
            r24 = r33
            r25 = r4
            r20.<init>(r21, r22, r23, r24, r25)
            r8.FLL(r0)
        L_0x00e3:
            X.0sP r0 = (X.0sP) r0
            X.C51965G9l.A1X(r8, r3)
            r11 = -1402523430(0xffffffffac6730da, float:-3.2854192E-12)
            r21 = 14
            X.JJT r10 = new X.JJT
            r20 = r10
            r22 = r13
            r23 = r7
            r24 = r15
            r25 = r14
            r20.<init>(r21, r22, r23, r24, r25)
            X.5PJ r25 = X.AnonymousClass5PI.A01(r8, r10, r11)
            r10 = 29360128(0x1c00000, float:7.052966E-38)
            int r11 = r9 << 3
            r10 = r10 & r11
            r10 = r10 | 384(0x180, float:5.38E-43)
            int r9 = r9 << 9
            r9 = r9 & 7168(0x1c00, float:1.0045E-41)
            r11 = 196608(0x30000, float:2.75506E-40)
            r9 = r9 | r11
            r28 = 7976(0x1f28, float:1.1177E-41)
            r22 = r19
            r29 = r4
            r30 = r5
            r31 = r3
            r32 = r3
            r20 = r2
            r21 = r1
            r23 = r33
            r24 = r0
            r26 = r10
            r27 = r9
            r16 = r8
            X.GS8.A01(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x006f
            r0 = 531204755(0x1fa98a93, float:7.1803536E-20)
            X.0fL.A00(r0)
            goto L_0x006f
        L_0x0139:
            r9 = r6
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I7T.A08(X.5Wy, X.Gly, X.0sa, X.0sa, X.0sa, X.0sa, X.0sL, int, boolean):void");
    }

    public static final void A0A(C286575Wy r10, String str, 0sP r12, int i) {
        int i2;
        C286575Wy r4 = r10;
        r10.ExV(-1687352025);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r10, r12) | i;
        } else {
            i2 = i;
        }
        String str2 = str;
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r10, str);
        }
        if ((i2 & 19) != 18 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1053393014, "com.instagram.schools.tab.ui.SearchBox (SchoolDirectoryComposeComponents.kt:200)");
            }
            boolean A1N = C51973G9u.A1N(r10, -238197130, i2);
            Object ECw = r10.ECw();
            if (A1N || ECw == AnonymousClass5XT.A00) {
                ECw = new C74180PqM(r12, 43);
                r10.FLL(ECw);
            }
            C51965G9l.A1V(r10);
            C52751Gc3.A00((C287605aT) null, r4, C287195Zj.A08(C51966G9m.A0T(Modifier.A00), 8.0f), (AnonymousClass2DO) null, str2, (String) null, (0sP) ECw, ((i2 >> 3) & 14) | 384, 56);
            if (0fL.A02()) {
                0fL.A00(-656383373);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            JGJ.A01(ASQ, r12, str2, i, 14);
        }
    }

    public static final void A0C(C286575Wy r10, C62320sa r11, C62320sa r12, int i) {
        int i2;
        r10.ExV(977813283);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r10, r11) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r10, r12);
        }
        if ((i2 & 19) != 18 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1898733110, "com.instagram.schools.tab.ui.HeaderRow (SchoolDirectoryComposeComponents.kt:156)");
            }
            r11.invoke();
            C285245Qk r9 = Modifier.A00;
            Modifier A03 = C287195Zj.A03(r9);
            AnonymousClass5RD A02 = C287395a4.A02(C287275Zs.A01, r10, C287215Zl.A05, 0);
            int A00 = C287425a7.A00(r10);
            C286565Wx r6 = (C286565Wx) r10;
            AnonymousClass5RM A04 = C286565Wx.A04(r6);
            Modifier A01 = C287435a8.A01(r10, A03);
            C51973G9u.A0y(r10, r6);
            C51971G9r.A12(r10, A02, A04);
            0sL r1 = C287485aD.A02;
            if (r6.A0K || !C51972G9s.A1Q(r10, A00)) {
                C51971G9r.A13(r10, r1, A00);
            }
            C51965G9l.A18(r10, A01);
            AnonymousClass6FX r13 = AnonymousClass6FX.A00;
            A00(r10, 0);
            AnonymousClass5ZZ.A06(r10, C287195Zj.A05(r13.A00(r9)), C51966G9m.A0b(r10), C304346Dc.A00(r10, 2131960774));
            AnonymousClass2DO A002 = C287975bA.A00(r10, R.drawable.instagram_x_pano_filled_12, 0);
            Modifier A0B = C287195Zj.A0B(r9, 4.0f, 4.0f, 0.0f, 0.0f);
            boolean A1Y = C51974G9v.A1Y(r10, 1793439327, i2);
            Object ECw = r10.ECw();
            if (A1Y || ECw == AnonymousClass5XT.A00) {
                ECw = new C20608Wvp(r12, 1);
                r10.FLL(ECw);
            }
            C288165bT.A05(r10, C287635aW.A05(A0B, (C287625aV) null, (String) null, C51965G9l.A0y(r6, ECw, false), true), A002, C51966G9m.A0L(r10));
            if (C51967G9n.A1R(r10)) {
                0fL.A00(-888204130);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            JGM.A01(ASQ, r11, r12, i, 8);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x023a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.C286575Wy r38, X.C61076JwE r39, X.C15050ULg r40, X.C54636HLt r41, java.lang.String r42, X.C62320sa r43, X.C62320sa r44, X.C62320sa r45, X.C62320sa r46, X.C62320sa r47, X.C62320sa r48, X.C62320sa r49, X.0sP r50, X.0sP r51, X.0sP r52, X.0sP r53, X.0sP r54, X.0sP r55, X.0sL r56, X.AnonymousClass62P r57, int r58, int r59, int r60, boolean r61, boolean r62, boolean r63) {
        /*
            r14 = 0
            r27 = r50
            r28 = r51
            r1 = r27
            r0 = r28
            boolean r13 = X.AnonymousClass7TF.A1U(r14, r1, r0)
            r12 = 2
            r29 = r52
            r0 = r29
            X.0qQ.A0B(r0, r12)
            r4 = 3
            r8 = r56
            r9 = r55
            r10 = r54
            r15 = r53
            X.C51974G9v.A0d(r4, r15, r10, r9, r8)
            r30 = r46
            r31 = r45
            r32 = r44
            r33 = r43
            r3 = r33
            r2 = r32
            r1 = r31
            r0 = r30
            X.C51974G9v.A1Q(r3, r2, r1, r0)
            r2 = 11
            r25 = r48
            r24 = r47
            r1 = r24
            r0 = r25
            X.DbW.A1P(r1, r2, r0)
            r2 = 13
            r26 = r49
            r34 = r42
            r1 = r26
            r0 = r34
            X.C51969G9p.A1S(r1, r2, r0)
            r3 = 18
            r35 = r41
            r7 = r57
            r0 = r35
            X.C51970G9q.A1N(r7, r3, r0)
            r0 = -2143515291(0xffffffff803c8d65, float:-5.560853E-39)
            r11 = r38
            r11.ExV(r0)
            r6 = r58
            r0 = r58 & 6
            if (r0 != 0) goto L_0x026b
            r0 = r27
            int r0 = X.C41848B3p.A01(r11, r0)
            r2 = r58 | r0
        L_0x006f:
            r0 = r58 & 48
            r23 = 32
            if (r0 != 0) goto L_0x007c
            r0 = r28
            int r0 = X.G9t.A0F(r11, r0)
            r2 = r2 | r0
        L_0x007c:
            r0 = r6 & 384(0x180, float:5.38E-43)
            r22 = 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x0089
            r0 = r29
            int r0 = X.G9t.A0G(r11, r0)
            r2 = r2 | r0
        L_0x0089:
            r0 = r6 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0092
            int r0 = X.G9t.A0H(r11, r15)
            r2 = r2 | r0
        L_0x0092:
            r0 = r6 & 24576(0x6000, float:3.4438E-41)
            r21 = 16384(0x4000, float:2.2959E-41)
            if (r0 != 0) goto L_0x009d
            int r0 = X.G9t.A0I(r11, r10)
            r2 = r2 | r0
        L_0x009d:
            r20 = 196608(0x30000, float:2.75506E-40)
            r0 = r58 & r20
            r19 = 65536(0x10000, float:9.18355E-41)
            if (r0 != 0) goto L_0x00aa
            int r0 = X.G9t.A0J(r11, r9)
            r2 = r2 | r0
        L_0x00aa:
            r18 = 1572864(0x180000, float:2.204052E-39)
            r0 = r58 & r18
            if (r0 != 0) goto L_0x00b5
            int r0 = X.G9t.A0K(r11, r8)
            r2 = r2 | r0
        L_0x00b5:
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r58 & r16
            if (r0 != 0) goto L_0x00c2
            r0 = r33
            int r0 = X.G9t.A0L(r11, r0)
            r2 = r2 | r0
        L_0x00c2:
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r58 & r0
            if (r0 != 0) goto L_0x00cf
            r0 = r32
            int r0 = X.G9t.A0M(r11, r0)
            r2 = r2 | r0
        L_0x00cf:
            r1 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r58 & r1
            if (r0 != 0) goto L_0x00dc
            r0 = r31
            int r0 = X.G9t.A0N(r11, r0)
            r2 = r2 | r0
        L_0x00dc:
            r5 = r59
            r0 = r59 & 6
            if (r0 != 0) goto L_0x0267
            r0 = r30
            int r0 = X.C41848B3p.A01(r11, r0)
            r17 = r59 | r0
        L_0x00ea:
            r0 = r59 & 48
            if (r0 != 0) goto L_0x00f6
            r0 = r24
            int r0 = X.G9t.A0F(r11, r0)
            r17 = r17 | r0
        L_0x00f6:
            r0 = r5 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0106
            r0 = r25
            boolean r0 = r11.AGw(r0)
            if (r0 != 0) goto L_0x0104
            r22 = 128(0x80, float:1.794E-43)
        L_0x0104:
            r17 = r17 | r22
        L_0x0106:
            r0 = r5 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0112
            r0 = r26
            int r0 = X.C51971G9r.A09(r11, r0)
            r17 = r17 | r0
        L_0x0112:
            r0 = r5 & 24576(0x6000, float:3.4438E-41)
            r57 = r61
            if (r0 != 0) goto L_0x0124
            r0 = r57
            boolean r0 = r11.AGv(r0)
            if (r0 != 0) goto L_0x0122
            r21 = 8192(0x2000, float:1.14794E-41)
        L_0x0122:
            r17 = r17 | r21
        L_0x0124:
            r0 = r59 & r20
            if (r0 != 0) goto L_0x0134
            r0 = r62
            boolean r0 = r11.AGv(r0)
            if (r0 == 0) goto L_0x0132
            r19 = 131072(0x20000, float:1.83671E-40)
        L_0x0132:
            r17 = r17 | r19
        L_0x0134:
            r0 = r59 & r18
            r61 = r63
            if (r0 != 0) goto L_0x0142
            r0 = r61
            int r0 = X.G9t.A0e(r11, r0)
            r17 = r17 | r0
        L_0x0142:
            r0 = r59 & r16
            if (r0 != 0) goto L_0x014e
            r0 = r34
            int r0 = X.G9t.A0V(r11, r0)
            r17 = r17 | r0
        L_0x014e:
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r59 & r0
            if (r0 != 0) goto L_0x015a
            int r0 = X.G9t.A0M(r11, r7)
            r17 = r17 | r0
        L_0x015a:
            r0 = r59 & r1
            r19 = r39
            if (r0 != 0) goto L_0x0168
            r0 = r19
            int r0 = X.G9t.A0N(r11, r0)
            r17 = r17 | r0
        L_0x0168:
            r37 = r60
            r0 = r60 & 6
            r18 = r40
            if (r0 != 0) goto L_0x0263
            r0 = r18
            int r0 = X.C41848B3p.A01(r11, r0)
            r16 = r60 | r0
        L_0x0178:
            r0 = r60 & 48
            if (r0 != 0) goto L_0x0188
            r0 = r35
            boolean r0 = r11.AGu(r0)
            if (r0 != 0) goto L_0x0186
            r23 = 16
        L_0x0186:
            r16 = r16 | r23
        L_0x0188:
            r1 = 306783379(0x12492493, float:6.34695E-28)
            r2 = r2 & r1
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r0) goto L_0x01d5
            r1 = r1 & r17
            if (r1 != r0) goto L_0x01d5
            r0 = r16 & 19
            if (r0 != r3) goto L_0x01d5
            boolean r0 = r11.Bwn()
            if (r0 == 0) goto L_0x01d5
            r11.Evl()
        L_0x01a2:
            X.5Xd r1 = r11.ASQ()
            if (r1 == 0) goto L_0x01d4
            X.JDn r0 = new X.JDn
            r16 = r19
            r17 = r18
            r18 = r35
            r19 = r34
            r20 = r33
            r21 = r32
            r22 = r31
            r23 = r30
            r30 = r15
            r31 = r10
            r32 = r9
            r33 = r8
            r34 = r7
            r35 = r6
            r36 = r5
            r38 = r57
            r39 = r62
            r40 = r61
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r1.A06 = r0
        L_0x01d4:
            return
        L_0x01d5:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x01e3
            r1 = 2063298252(0x7afb6ecc, float:6.5275687E35)
            java.lang.String r0 = "com.instagram.schools.tab.ui.SchoolDirectoryComposeView (SchoolDirectoryComposeComponents.kt:84)"
            X.0fL.A01(r1, r0)
        L_0x01e3:
            int r0 = r35.ordinal()
            if (r0 == r14) goto L_0x025a
            if (r0 == r13) goto L_0x024c
            if (r0 == r4) goto L_0x0242
            if (r0 != r12) goto L_0x026e
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r14)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
        L_0x01f7:
            X.59G r2 = new X.59G
            r2.<init>(r1, r1, r0)
        L_0x01fc:
            java.lang.Object r0 = r2.A00
            boolean r58 = X.AnonymousClass7TE.A1a(r0)
            java.lang.Object r0 = r2.A01
            boolean r60 = X.AnonymousClass7TE.A1a(r0)
            java.lang.Object r0 = r2.A02
            boolean r59 = X.AnonymousClass7TE.A1a(r0)
            X.JDk r1 = new X.JDk
            r38 = r1
            r41 = r34
            r42 = r30
            r43 = r24
            r46 = r25
            r47 = r33
            r48 = r26
            r49 = r27
            r50 = r28
            r51 = r29
            r52 = r15
            r53 = r10
            r54 = r9
            r55 = r8
            r56 = r7
            r38.<init>(r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62)
            r0 = 1579258855(0x5e2193e7, float:2.91072586E18)
            boolean r0 = X.C51975G9x.A1T(r11, r1, r0)
            if (r0 == 0) goto L_0x01a2
            r0 = -1239369140(0xffffffffb620ba4c, float:-2.3950297E-6)
            X.0fL.A00(r0)
            goto L_0x01a2
        L_0x0242:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)
            X.59G r2 = new X.59G
            r2.<init>(r0, r0, r0)
            goto L_0x01fc
        L_0x024c:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r14)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
            X.59G r2 = new X.59G
            r2.<init>(r1, r0, r1)
            goto L_0x01fc
        L_0x025a:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r13)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)
            goto L_0x01f7
        L_0x0263:
            r16 = r37
            goto L_0x0178
        L_0x0267:
            r17 = r5
            goto L_0x00ea
        L_0x026b:
            r2 = r6
            goto L_0x006f
        L_0x026e:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I7T.A05(X.5Wy, X.JwE, X.ULg, X.HLt, java.lang.String, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sa, X.0sP, X.0sP, X.0sP, X.0sP, X.0sP, X.0sP, X.0sL, X.62P, int, int, int, boolean, boolean, boolean):void");
    }
}
