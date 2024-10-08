package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.compose.core.ui.IgClickableTextKt;

public abstract class I51 {
    public static final void A01(C286575Wy r53, C71144Ody ody, C55508Hiq hiq, C53546GqH gqH, int i) {
        int i2;
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        boolean z4;
        boolean z5;
        C55508Hiq hiq2 = hiq;
        C53546GqH gqH2 = gqH;
        C51973G9u.A1E(gqH2, hiq2, ody);
        C286575Wy r0 = r53;
        r0.ExV(-725171295);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C51970G9q.A05(G9t.A1T(r0, gqH2, i3) ? 1 : 0) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= C51970G9q.A06(G9t.A1U(r0, hiq2, i3) ? 1 : 0);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r0, ody);
        }
        if ((i2 & 147) != 146 || !r0.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-712412216, "com.instagram.friendmap.view.compose.FriendMapSettingsScreen (FriendMapSettingsScreen.kt:70)");
            }
            Object A0m = C51967G9n.A0m(r0, -1023267581);
            Object obj = AnonymousClass5XT.A00;
            C284945Oz r5 = (C284945Oz) C51974G9v.A0Z(r0, A0m, obj, false);
            C286565Wx A0H = C51965G9l.A0H(r0, false);
            C285245Qk r19 = Modifier.A00;
            Modifier A0T = C51966G9m.A0T(r19);
            AnonymousClass5RD A0X = C51968G9o.A0X(r0);
            int A00 = C287425a7.A00(r0);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r0, A0T);
            C62320sa r12 = C287485aD.A00;
            C51973G9u.A0z(r0, A0H, r12);
            0sL r11 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r0, A0X, A04, r11);
            0sL r10 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r0, A00)) {
                C51971G9r.A13(r0, r10, A00);
            }
            0sL A1K = C51966G9m.A1K(r0, A01);
            C304676Et r46 = C304676Et.A00;
            Modifier A0B = C287195Zj.A0B(A0T, C287645aX.A00(r0), 0.0f, C287645aX.A00(r0), 0.0f);
            AnonymousClass5RD A0K = G9w.A0K(C287275Zs.A02, r0);
            int A002 = C287425a7.A00(r0);
            AnonymousClass5RM A042 = C286565Wx.A04(A0H);
            Modifier A012 = C287435a8.A01(r0, A0B);
            C51973G9u.A0z(r0, A0H, r12);
            C287595aO.A00(r0, A0K, r11);
            if (C51965G9l.A1Y(r0, A0H, A042, A0w) || !C51972G9s.A1Q(r0, A002)) {
                C51971G9r.A13(r0, r10, A002);
            }
            C287595aO.A00(r0, A012, A1K);
            AnonymousClass6FX r122 = AnonymousClass6FX.A00;
            AnonymousClass2DO A003 = C287975bA.A00(r0, R.drawable.instagram_chevron_left_pano_outline_24, 0);
            r0.ExS(1634146047);
            int i4 = i2 & 112;
            if (i4 == 32 || ((i2 & 64) != 0 && r0.AGw(hiq2))) {
                z = true;
            } else {
                z = false;
            }
            Object ECw = r0.ECw();
            if (z || ECw == obj) {
                ECw = new C58179Inj(hiq2, 32);
                r0.FLL(ECw);
            }
            C286575Wy r23 = r0;
            I50.A00((C287605aT) null, r23, (Modifier) null, A003, (String) null, C51965G9l.A0y(A0H, ECw, false), 0.0f, 0, 125, 0, false);
            AnonymousClass5ZZ.A0X(r23, r122.A00(G9t.A0q(r0, r19, C287645aX.A01(r0, R.dimen.abc_action_bar_elevation_material), C287645aX.A01(r0, R.dimen.abc_button_padding_horizontal_material))), C51966G9m.A0d(r0), C304346Dc.A00(r0, 2131962782), C51966G9m.A0H(r0));
            r0.ExS(1634170527);
            if (gqH2.A07) {
                AnonymousClass2DO A004 = C287975bA.A00(r0, R.drawable.instagram_more_horizontal_pano_outline_24, 0);
                boolean A1Z = C51967G9n.A1Z(r0, ody, 1634175609);
                Object ECw2 = r0.ECw();
                if (A1Z || ECw2 == obj) {
                    ECw2 = new C58185Inp(12, r5, ody);
                    r0.FLL(ECw2);
                }
                I50.A00((C287605aT) null, r0, (Modifier) null, A004, (String) null, C51965G9l.A0y(A0H, ECw2, false), 0.0f, 0, 125, 0, false);
                boolean A1W = C51971G9r.A1W(r5);
                long A005 = C54759HRr.A00(10.0f, 10.0f);
                r0.ExS(1634183528);
                if (i4 == 32 || ((i2 & 64) != 0 && r0.AGw(hiq2))) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                Object ECw3 = r0.ECw();
                if (z5 || ECw3 == obj) {
                    ECw3 = J6S.A00(r5, hiq2, 49);
                    r0.FLL(ECw3);
                }
                0sP A0z = C51965G9l.A0z(A0H, ECw3);
                Object A0m2 = C51967G9n.A0m(r0, 1634190974);
                if (A0m2 == obj) {
                    A0m2 = new C58179Inj(r5, 33);
                    r0.FLL(A0m2);
                }
                C56261HvV.A01(r23, C51965G9l.A0y(A0H, A0m2, false), A0z, JFW.A00, 196992, A005, A1W);
            }
            C286565Wx.A0L(A0H, false);
            r0.ASN();
            if (C51967G9n.A1U(r0, -1778463105)) {
                0fL.A01(-1482436352, "com.instagram.friendmap.view.compose.settingsSubtitle (FriendMapSettingsScreen.kt:401)");
            }
            String A006 = C304346Dc.A00(r0, 2131962778);
            String A0h = G9w.A0h(r0, A006, 2131962781);
            int A08 = 00l.A08(A0h, A006, 0, false);
            int A05 = C51966G9m.A05(A006, A08);
            AnonymousClass5ZB r33 = new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, (AnonymousClass5ZD) null, (C291795ht) null, 65534, C51966G9m.A0D(r0), 0, 0);
            C303876Bd A0L = C51972G9s.A0L(A0h);
            A0L.A06(r33, A08, A05);
            C286025Tq A0K2 = C51967G9n.A0K(A0L, "link", AnonymousClass000.A00(776), A08, A05);
            if (0fL.A02()) {
                0fL.A00(497939214);
            }
            C286565Wx.A0L(A0H, false);
            Modifier A0q = G9t.A0q(r0, r19, C287645aX.A01(r0, R.dimen.abc_button_padding_horizontal_material), 20.0f);
            long A0M = C51966G9m.A0M(r0);
            AnonymousClass5Z4 A0c = C51966G9m.A0c(r0);
            boolean A1Y = C51967G9n.A1Y(r0, A0K2, 553630711);
            if (i4 == 32 || ((i2 & 64) != 0 && r0.AGw(hiq2))) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z6 = A1Y | z2;
            Object ECw4 = r0.ECw();
            if (z6 || ECw4 == obj) {
                ECw4 = new MPB(0, (Object) hiq2, (Object) A0K2);
                r0.FLL(ECw4);
            }
            IgClickableTextKt.A06(r23, A0q, A0K2, A0c, C51965G9l.A0z(A0H, ECw4), A0M);
            boolean z7 = gqH2.A09;
            C286575Wy r47 = r0;
            C56663I6s.A05((C56151Htd) null, (C56152Hte) null, r46, r47, (Modifier) null, (String) null, JJS.A00(r0, gqH2, hiq2, 9, 317334127), 1572870, 30, !z7);
            C56663I6s.A05((C56151Htd) null, (C56152Hte) null, r46, r47, (Modifier) null, (String) null, JJS.A00(r0, gqH2, hiq2, 10, 1435309542), 1572870, 30, gqH2.A04);
            int i5 = 2131962784;
            if (z7) {
                i5 = 2131962780;
            }
            String A007 = C304346Dc.A00(r0, i5);
            r0.ExS(553690979);
            if (z7) {
                str = C304346Dc.A00(r0, 2131962770);
            } else {
                str = null;
            }
            C286565Wx.A0L(A0H, false);
            boolean z8 = gqH2.A0A;
            boolean z9 = gqH2.A0B;
            r0.ExS(553700038);
            if (i4 == 32 || ((i2 & 64) != 0 && r0.AGw(hiq2))) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object ECw5 = r0.ECw();
            if (z3 || ECw5 == obj) {
                ECw5 = new C58179Inj(hiq2, 38);
                r0.FLL(ECw5);
            }
            C62320sa A0y = C51965G9l.A0y(A0H, ECw5, false);
            r0.ExS(553702368);
            if (i4 == 32 || ((i2 & 64) != 0 && r0.AGw(hiq2))) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object ECw6 = r0.ECw();
            if (z4 || ECw6 == obj) {
                ECw6 = new C58179Inj(hiq2, 39);
                r0.FLL(ECw6);
            }
            I7L.A01(r0, (Modifier) null, (CharSequence) null, A007, str, A0y, C51965G9l.A0y(A0H, ECw6, false), 0, 0, 32644, z9, z8);
            String A008 = C304346Dc.A00(r0, 2131962772);
            AnonymousClass5ZZ.A0X(r0, G9t.A0q(r0, r19, C287645aX.A01(r0, R.dimen.abc_button_padding_horizontal_material), C287645aX.A01(r0, R.dimen.abc_button_padding_horizontal_material)), C51966G9m.A0c(r0), A008, C51966G9m.A0M(r0));
            if (C51967G9n.A1R(r0)) {
                0fL.A00(1433499293);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59135J7r(i3, 0, ody, gqH2, hiq2);
        }
    }

    public static final void A02(C286575Wy r11, AnonymousClass4A5 r12, C53546GqH gqH, C62320sa r14, 0sP r15, int i, int i2) {
        int i3;
        AnonymousClass4A5 r5 = r12;
        C53546GqH gqH2 = gqH;
        0sP r8 = r15;
        C62320sa r7 = r14;
        C51974G9v.A1K(r12, gqH, r15);
        r11.ExV(-1295797300);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r11, r12) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= C51970G9q.A06(G9t.A1U(r11, gqH, i5) ? 1 : 0);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0G(r11, r7);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i3 |= G9t.A0H(r11, r8);
        }
        if ((i3 & 1171) != 1170 || !r11.Bwn()) {
            if (i6 != 0) {
                r7 = null;
            }
            if (0fL.A02()) {
                0fL.A01(-701072986, "com.instagram.friendmap.view.compose.FriendMapAudienceCell (FriendMapSettingsScreen.kt:230)");
            }
            C287605aT r4 = (C287605aT) C51974G9v.A0V(r11, -406437729);
            C51965G9l.A1V(r11);
            float f = 0.3f;
            if (gqH.A08) {
                f = 1.0f;
            }
            C51971G9r.A11(r11, AnonymousClass6CK.A00.A02(Float.valueOf(f)), new J90(r4, r5, gqH2, r7, r8, f, AnonymousClass7TF.A1W(r12, gqH.A03)), -1352677620);
            if (0fL.A02()) {
                0fL.A00(-904819595);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG8(gqH, r7, r8, r5, i5, i4, 19);
        }
    }

    public static final void A03(C286575Wy r16, C53546GqH gqH, C62320sa r18, int i) {
        int i2;
        C53546GqH gqH2 = gqH;
        C62320sa r3 = r18;
        AnonymousClass7TF.A1H(gqH2, r3);
        C286575Wy r11 = r16;
        r11.ExV(-1542344534);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C51970G9q.A05(G9t.A1T(r11, gqH2, i3) ? 1 : 0) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r11, r3);
        }
        if ((i2 & 19) != 18 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-249434902, "com.instagram.friendmap.view.compose.FriendMapPrivateModeCell (FriendMapSettingsScreen.kt:209)");
            }
            String A00 = C304346Dc.A00(r11, 2131962777);
            boolean z = gqH2.A08;
            Modifier A0Q = C51968G9o.A0Q(C51967G9n.A0G(Modifier.A00, C287645aX.A00(r11)), 8.0f, 1.0f, C51966G9m.A0K(r11));
            AnonymousClass2DO A002 = C287975bA.A00(r11, R.drawable.instagram_eye_off_pano_outline_24, 0);
            String A003 = C304346Dc.A00(r11, 2131962776);
            boolean A1W = AnonymousClass7TF.A1W(gqH2.A03, AnonymousClass4A5.PRIVATE);
            boolean A1S = C51975G9x.A1S(r11, 165116557, i2);
            Object ECw = r11.ECw();
            if (A1S || ECw == AnonymousClass5XT.A00) {
                ECw = new C59100J6i(r3, 14);
                r11.FLL(ECw);
            }
            C51965G9l.A1X(r11, false);
            C52636GaA.A08(r11, A0Q, A002, new C57125IPo((0sP) ECw, A1W, false), A00, A003, 0, 130760, z);
            if (0fL.A02()) {
                0fL.A00(1687975169);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            JGO.A01(ASQ, r3, gqH2, i3, 24);
        }
    }

    public static final String A00(C286575Wy r3, AnonymousClass4A5 r4) {
        int i;
        if (0fL.A02()) {
            0fL.A01(-1649759999, "com.instagram.friendmap.view.compose.title (FriendMapSettingsScreen.kt:346)");
        }
        int ordinal = r4.ordinal();
        if (ordinal == 2) {
            i = 2131962779;
        } else if (ordinal == 3) {
            i = 2131962765;
        } else if (ordinal == 6) {
            i = 2131962775;
        } else if (ordinal != 4) {
            i = 2131962771;
            if (ordinal != 5) {
                i = 2131962777;
            }
        } else {
            i = 2131962774;
        }
        String A00 = C304346Dc.A00(r3, i);
        if (0fL.A02()) {
            0fL.A00(229533080);
        }
        return A00;
    }
}
