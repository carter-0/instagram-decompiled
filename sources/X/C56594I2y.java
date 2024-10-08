package X;

import android.content.Context;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* renamed from: X.I2y  reason: case insensitive filesystem */
public abstract class C56594I2y {
    public static final void A00(C286575Wy r11, EGP egp, C319156q8 r13, C62320sa r14, C62320sa r15, int i, int i2) {
        int i3;
        C62320sa r5 = r15;
        C62320sa r6 = r14;
        EGP egp2 = egp;
        C319156q8 r7 = r13;
        boolean A1U = AnonymousClass7TF.A1U(0, egp, r13);
        r11.ExV(2093764239);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r11, egp) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0F(r11, r13);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0G(r11, r14);
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i3 |= G9t.A0H(r11, r5);
        }
        if ((i3 & 1171) != 1170 || !r11.Bwn()) {
            if (i6 != 0) {
                r6 = null;
            }
            if (i7 != 0) {
                r5 = null;
            }
            if (0fL.A02()) {
                0fL.A01(1013380667, "com.instagram.profile.slideoutmenu.fragment.ProfileMenuItem (ProfileMenuItem.kt:47)");
            }
            Modifier A0O = C51968G9o.A0O();
            Object AJO = r11.AJO(AndroidCompositionLocals_androidKt.A03);
            0qQ.A0C(AJO, AnonymousClass000.A00(5));
            if (r6 != null) {
                C287625aV A0R = C51965G9l.A0R(0);
                if (r5 != null) {
                    A0O = C287435a8.A02(A0O, C287655aY.A00, new GQZ(A0R, r5, r6));
                } else {
                    A0O = C287635aW.A05(A0O, A0R, (String) null, r6, A1U);
                }
            }
            boolean A1U2 = C51966G9m.A1U(r11, r13, C51973G9u.A1S(r11, egp2, AJO, -1633440220));
            Object ECw = r11.ECw();
            if (A1U2 || ECw == AnonymousClass5XT.A00) {
                ECw = C59104J6m.A00(r11, egp2, AJO, r7, 20);
            }
            C51965G9l.A1X(r11, false);
            I63.A02(r11, A0O, (0sP) ECw, (0sP) null, 0, 4);
            if (0fL.A02()) {
                0fL.A00(-244138576);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG8(r5, r6, r7, egp2, i5, i4, 21);
        }
    }

    public static final void A01(C286575Wy r14, C319156q8 r15, C62320sa r16, C62320sa r17, int i) {
        int i2;
        C319156q8 r13 = r15;
        C62320sa r11 = r16;
        C62320sa r12 = r17;
        boolean A1b = C51973G9u.A1b(r15, r11, r12);
        r14.ExV(-331160056);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r14, r15) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r14, r11);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r14, r12);
        }
        if ((i2 & 147) != 146 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-2124122775, "com.instagram.profile.slideoutmenu.fragment.ProfileMenuItemComposable (ProfileMenuItem.kt:83)");
            }
            C287245Zp r7 = C287215Zl.A04;
            C285245Qk r8 = Modifier.A00;
            Modifier A0B = C287195Zj.A0B(C287435a8.A02(r8, C287655aY.A00, new GQZ(C51965G9l.A0R(0), r12, r11)), 16.0f, 12.0f, 12.0f, 12.0f);
            AnonymousClass5RD A0Q = C51965G9l.A0Q(r14, r7);
            int A00 = C287425a7.A00(r14);
            C286565Wx r1 = (C286565Wx) r14;
            AnonymousClass5RM A04 = C286565Wx.A04(r1);
            Modifier A01 = C287435a8.A01(r14, A0B);
            C51973G9u.A0y(r14, r1);
            C51971G9r.A12(r14, A0Q, A04);
            0sL r3 = C287485aD.A02;
            if (r1.A0K || !C51972G9s.A1Q(r14, A00)) {
                C51971G9r.A13(r14, r3, A00);
            }
            C51965G9l.A18(r14, A01);
            AnonymousClass6FX r72 = AnonymousClass6FX.A00;
            Context A0I = C51968G9o.A0I(r14);
            int i4 = r15.A00;
            String A012 = r15.A02.A01(A0I);
            if (A012 == null) {
                A012 = "";
            }
            A02(r14, A012, i4, 0);
            C289585dr.A00(r14, r72.A00(r8));
            G5B A013 = r15.A01();
            if (A013 instanceof C50692Fgr) {
                r14.ExS(-1198715112);
                int i5 = ((C50692Fgr) A013).A00;
                if (i5 > 0) {
                    r14.ExS(-1198636372);
                    HXZ.A00(i5, (Modifier) null, r14, 0, A1b);
                } else {
                    r14.ExS(-1198558841);
                    HXY.A00((Modifier) null, r14, 0, A1b);
                }
                C286565Wx.A0L(r1, false);
            } else if (0qQ.A0K(A013, C50690Fgp.A00)) {
                r14.ExS(-592849349);
                C54892HXa.A00((Modifier) null, r14, 0, A1b ? 1 : 0);
            } else if (0qQ.A0K(A013, C50691Fgq.A00)) {
                r14.ExS(-592847535);
            } else {
                throw C51972G9s.A0v(r14, r1, -592860266);
            }
            C286565Wx.A0L(r1, false);
            r14.ExS(-592846669);
            if (C51971G9r.A1S(r14, r1, false)) {
                0fL.A00(-1510394531);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59135J7r(i3, 7, r11, r12, r13);
        }
    }

    public static final void A02(C286575Wy r15, String str, int i, int i2) {
        int i3;
        C286575Wy r6 = r15;
        r15.ExV(-1470493767);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 6) == 0) {
            i3 = G9t.A05(r15, i5) | i2;
        } else {
            i3 = i4;
        }
        String str2 = str;
        if ((i2 & 48) == 0) {
            i3 |= G9t.A0P(r15, str2);
        }
        if ((i3 & 19) != 18 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(71121782, "com.instagram.profile.slideoutmenu.fragment.MenuItem (ProfileMenuItem.kt:119)");
            }
            AnonymousClass2DO A0Y = C51966G9m.A0Y(r15, i3, i5);
            C285245Qk r3 = Modifier.A00;
            C288165bT.A06(r15, C287195Zj.A0B(r3, 0.0f, 0.0f, 12.0f, 0.0f), A0Y, (C288095bM) null, str2, (i3 & 112) | 384, 24, 0);
            AnonymousClass5ZZ.A0B(r6, C287195Zj.A0B(r3, 0.0f, 0.0f, 4.0f, 0.0f), C51966G9m.A0g(r6), str2, 5, 1, 2, C51965G9l.A03(i3), 390, 11128, C51966G9m.A0H(r6));
            if (0fL.A02()) {
                0fL.A00(40059858);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J7O(i5, str2, i4, 1);
        }
    }
}
