package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.I6e  reason: case insensitive filesystem */
public abstract class C56649I6e {
    public static void A01(C286575Wy r3, AnonymousClass2DO r4, int i) {
        A02(r3, r4, new C53508Gpe(C304346Dc.A00(r3, i), 0));
    }

    public static final void A02(C286575Wy r5, AnonymousClass2DO r6, C59550JNw jNw) {
        A03(r5, r6, jNw, 0, 4, false);
    }

    public static void A05(C286575Wy r1, C59550JNw jNw, int i) {
        A02(r1, C287975bA.A00(r1, i, 0), jNw);
    }

    public static final void A03(C286575Wy r21, AnonymousClass2DO r22, C59550JNw jNw, int i, int i2, boolean z) {
        int i3;
        long j;
        boolean z2 = z;
        C59550JNw jNw2 = jNw;
        boolean A1U = AnonymousClass7TF.A1U(0, jNw2, r22);
        C286575Wy r0 = r21;
        r0.ExV(129470589);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C51970G9q.A05(G9t.A1T(r0, jNw2, i5) ? 1 : 0) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0F(r0, r22);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0a(r0, z2);
        }
        if ((i3 & 147) != 146 || !r0.Bwn()) {
            z2 = C51966G9m.A1Q(i6, z2);
            if (0fL.A02()) {
                0fL.A01(-466690461, "com.instagram.compose.igds.components.bulletcell.IgdsBulletCell (IgdsBulletCell.kt:75)");
            }
            C285245Qk r5 = Modifier.A00;
            Modifier A00 = AnonymousClass5R5.A00(C287195Zj.A09(r5, 24.0f, 0.0f), C58964J1b.A00, A1U);
            AnonymousClass5RD A0V = C51968G9o.A0V(r0);
            int A002 = C287425a7.A00(r0);
            C286565Wx r1 = (C286565Wx) r0;
            AnonymousClass5RM A04 = C286565Wx.A04(r1);
            Modifier A01 = C287435a8.A01(r0, A00);
            C62320sa r11 = C287485aD.A00;
            C51973G9u.A0z(r0, r1, r11);
            0sL r10 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r0, A0V, A04, r10);
            0sL r9 = C287485aD.A02;
            if (r1.A0K || !C51972G9s.A1Q(r0, A002)) {
                C51971G9r.A13(r0, r9, A002);
            }
            0sL A1K = C51966G9m.A1K(r0, A01);
            Modifier A0C = C287205Zk.A0C(C287195Zj.A06(r5), 24.0f);
            AnonymousClass5RD A0Z = C51966G9m.A0Z(false);
            int A003 = C287425a7.A00(r0);
            AnonymousClass5RM A042 = C286565Wx.A04(r1);
            Modifier A012 = C287435a8.A01(r0, A0C);
            C51973G9u.A0z(r0, r1, r11);
            C287595aO.A00(r0, A0Z, r10);
            if (C51965G9l.A1Y(r0, r1, A042, A0w) || !C51972G9s.A1Q(r0, A003)) {
                C51971G9r.A13(r0, r9, A003);
            }
            C287595aO.A00(r0, A012, A1K);
            if (C51967G9n.A1U(r0, -135984304)) {
                0fL.A01(-360397627, "com.instagram.compose.igds.components.bulletcell.getIconColor (IgdsBulletCell.kt:139)");
            }
            if (z2) {
                j = C51967G9n.A0a(r0, 1404826904).A0V;
            } else {
                j = C51967G9n.A0a(r0, 1404872536).A0n;
            }
            if (C51967G9n.A1b(r1, false)) {
                0fL.A00(1060267867);
            }
            C286565Wx.A0L(r1, false);
            int i7 = i3 >> 3;
            C288165bT.A00(r0, (Modifier) null, r22, (i7 & 14) | 48, 20, j);
            r0.ASN();
            Modifier A0B = C287195Zj.A0B(r5, 12.0f, 12.0f, 0.0f, 12.0f);
            AnonymousClass5RD A0Z2 = C51969G9p.A0Z(r0, 0);
            int A004 = C287425a7.A00(r0);
            AnonymousClass5RM A043 = C286565Wx.A04(r1);
            Modifier A013 = C287435a8.A01(r0, A0B);
            C51973G9u.A0z(r0, r1, r11);
            C287595aO.A00(r0, A0Z2, r10);
            if (C51965G9l.A1Y(r0, r1, A043, A0w) || !C51972G9s.A1Q(r0, A004)) {
                C51971G9r.A13(r0, r9, A004);
            }
            C287595aO.A00(r0, A013, A1K);
            A06(r0, jNw2, (i3 & 14) | (i7 & 112), z2);
            r0.ExS(1436647769);
            if (jNw2 instanceof C53509Gpf) {
                String str = ((C53509Gpf) jNw2).A01;
                String str2 = str;
                C286575Wy r92 = r0;
                AnonymousClass5ZZ.A0W(r92, C287195Zj.A0B(r5, 0.0f, 4.0f, 0.0f, 0.0f), C51966G9m.A0c(r0), str2, A00(r0, z2));
            }
            C286565Wx.A0L(r1, false);
            r0.ExS(1436657232);
            if (jNw2 instanceof C53507Gpd) {
                C53507Gpd gpd = (C53507Gpd) jNw2;
                C286025Tq r7 = gpd.A00;
                AnonymousClass62O A044 = AnonymousClass62Q.A04("web_url_span");
                long A005 = A00(r0, z2);
                C286575Wy r72 = r0;
                AnonymousClass6E2.A01(r72, C287195Zj.A0B(r5, 0.0f, 4.0f, 0.0f, 0.0f), r7, C51966G9m.A0c(r0), gpd.A02, A044, 432, 3040, A005);
            }
            if (C51973G9u.A1R(r0, r1)) {
                0fL.A00(1339681169);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8R(i5, i4, 5, r22, jNw2, z2);
        }
    }

    public static final long A00(C286575Wy r4, boolean z) {
        boolean z2;
        long A0H;
        if (C51967G9n.A1U(r4, -926970852)) {
            0fL.A01(-965447358, "com.instagram.compose.igds.components.bulletcell.getTextColor (IgdsBulletCell.kt:148)");
        }
        if (z) {
            r4.ExS(-497369083);
            z2 = false;
            A0H = G9w.A05(r4);
        } else {
            r4.ExS(-497316724);
            z2 = false;
            A0H = C51966G9m.A0H(r4);
        }
        C286565Wx r42 = (C286565Wx) r4;
        if (C51967G9n.A1b(r42, z2)) {
            0fL.A00(1423586182);
        }
        C286565Wx.A0L(r42, z2);
        return A0H;
    }

    public static void A04(C286575Wy r2, AnonymousClass2DO r3, String str, int i) {
        A02(r2, r3, new C53509Gpf(str, C288035bG.A00(r2, i)));
    }

    public static final void A06(C286575Wy r16, C59550JNw jNw, int i, boolean z) {
        int i2;
        AnonymousClass5Z4 r6;
        C286565Wx r9;
        C286575Wy r10 = r16;
        r10.ExV(-1301944578);
        int i3 = i;
        C59550JNw jNw2 = jNw;
        if ((i & 6) == 0) {
            i2 = C51970G9q.A05(G9t.A1T(r10, jNw2, i3) ? 1 : 0) | i;
        } else {
            i2 = i3;
        }
        boolean z2 = z;
        if ((i & 48) == 0) {
            i2 |= G9t.A0Z(r10, z2);
        }
        if ((i2 & 19) != 18 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(437878331, "com.instagram.compose.igds.components.bulletcell.PrimaryText (IgdsBulletCell.kt:110)");
            }
            if (jNw2 instanceof C53506Gpc) {
                r10.ExS(2018607115);
                C53506Gpc gpc = (C53506Gpc) jNw2;
                0sP r14 = gpc.A01;
                if (r14 != null) {
                    r10.ExS(2018638115);
                    AnonymousClass6E2.A01(r10, (Modifier) null, gpc.A00, C51966G9m.A0c(r10), r14, AnonymousClass62Q.A04("web_url_span"), 48, 3044, A00(r10, z2));
                } else {
                    r10.ExS(2018924121);
                    AnonymousClass5ZZ.A01(r10, (Modifier) null, gpc.A00, C51966G9m.A0c(r10), 24570, A00(r10, z2));
                }
                r9 = (C286565Wx) r10;
                C286565Wx.A0I(r9);
            } else {
                r10.ExS(2019100542);
                String obj = jNw2.Bfa().toString();
                long A00 = A00(r10, z2);
                if (0fL.A02()) {
                    0fL.A01(-1636931730, "com.instagram.compose.igds.components.bulletcell.getPrimaryTextStyle (IgdsBulletCell.kt:157)");
                }
                if (!(jNw2 instanceof C53508Gpe) || ((C53508Gpe) jNw2).A00 != 0) {
                    r6 = C51967G9n.A0b(r10, 1613415816).A01;
                } else {
                    r6 = C51967G9n.A0b(r10, 1613469074).A00;
                }
                r9 = (C286565Wx) r10;
                if (C51967G9n.A1b(r9, false)) {
                    0fL.A00(1792584781);
                }
                AnonymousClass5ZZ.A0r(r10, r6, obj, A00);
            }
            if (C51967G9n.A1a(r9)) {
                0fL.A00(1573151855);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            JGI.A01(ASQ, jNw2, i3, 4, z2);
        }
    }
}
