package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import java.util.Iterator;

public abstract class I5G {
    public static final void A01(C286575Wy r11, GSY gsy, JRL jrl, 0sP r14, 0sP r15, int i) {
        int i2;
        GSY gsy2 = gsy;
        0qQ.A0B(gsy, 0);
        JRL jrl2 = jrl;
        0sP r9 = r14;
        0sP r8 = r15;
        AnonymousClass7TG.A1U(r14, r15, jrl);
        r11.ExV(-215596436);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r11, gsy) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r11, r14);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r11, r15);
        }
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r11, jrl);
        }
        if ((i2 & 1171) != 1170 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-65291805, "instagram.features.clips.spins.creation.ui.components.SpinsSelectionRoot (SpinsSelectionComposables.kt:38)");
            }
            C285245Qk r2 = Modifier.A00;
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r11, 0);
            int A00 = C287425a7.A00(r11);
            C286565Wx r4 = (C286565Wx) r11;
            AnonymousClass5RM A04 = C286565Wx.A04(r4);
            Modifier A01 = C287435a8.A01(r11, r2);
            C51973G9u.A0y(r11, r4);
            C51971G9r.A12(r11, A0Z, A04);
            0sL r1 = C287485aD.A02;
            if (r4.A0K || !C51972G9s.A1Q(r11, A00)) {
                C51971G9r.A13(r11, r1, A00);
            }
            C51965G9l.A18(r11, A01);
            C304676Et r22 = C304676Et.A00;
            String str = gsy.A03;
            if (str == null) {
                str = gsy.A02;
            }
            C381879cj r13 = (C381879cj) gsy.A01;
            A00(r22, r11, r13, str, 6);
            A03(r11, jrl2, r13, r14, (AnonymousClass62O) gsy.A00, ((i2 << 3) & 896) | (i2 & 7168));
            int i4 = i2 >> 3;
            A02(r11, jrl2, r13, r8, (i4 & 896) | (i4 & 112));
            if (C51967G9n.A1R(r11)) {
                0fL.A00(1469289211);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG7(gsy2, jrl2, r8, r9, i3, 30);
        }
    }

    public static final void A00(C304686Eu r11, C286575Wy r12, C381879cj r13, String str, int i) {
        int i2;
        r12.ExV(13594889);
        int i3 = i;
        C304686Eu r7 = r11;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r12, r11) | i;
        } else {
            i2 = i;
        }
        String str2 = str;
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r12, str);
        }
        C381879cj r8 = r13;
        if ((i & 384) == 0) {
            i2 |= G9t.A0Q(r12, r13);
        }
        if ((i2 & 147) != 146 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1083609124, "instagram.features.clips.spins.creation.ui.components.Preview (SpinsSelectionComposables.kt:53)");
            }
            long A0M = C51966G9m.A0M(r12);
            Modifier AB0 = r11.AB0(C287215Zl.A00, C287205Zk.A08(C287205Zk.A0D(Modifier.A00, C287645aX.A01(r12, R.dimen.avatar_size_ridiculously_xxxlarge_plus)), C287645aX.A01(r12, R.dimen.before_and_after_media_card_width)));
            boolean A1T = C51966G9m.A1T(r12, A0M, C51973G9u.A1O(r12, 1031923044, i2));
            Object ECw = r12.ECw();
            if (A1T || ECw == AnonymousClass5XT.A00) {
                ECw = new C58737Iwk(A0M, str, 1);
                r12.FLL(ECw);
            }
            C286565Wx A0H = C51965G9l.A0H(r12, false);
            Modifier A01 = C289575dp.A01(AB0, (0sP) ECw);
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A00 = C287425a7.A00(r12);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A012 = C287435a8.A01(r12, A01);
            C51973G9u.A0y(r12, A0H);
            C51971G9r.A12(r12, A0a, A04);
            0sL r1 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r12, A00)) {
                C51971G9r.A13(r12, r1, A00);
            }
            C51965G9l.A18(r12, A012);
            r12.ExS(950954519);
            if (str != null) {
                C55249Hee.A00(r12, r13, str, C51965G9l.A02(i2 >> 3));
            }
            if (C51971G9r.A1S(r12, A0H, false)) {
                0fL.A00(1589905323);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59141J7x(r7, r8, str2, i3, 18);
        }
    }

    public static final void A02(C286575Wy r14, JRL jrl, C381879cj r16, 0sP r17, int i) {
        int i2;
        C286575Wy r7 = r14;
        r14.ExV(1905796729);
        int i3 = i;
        C381879cj r4 = r16;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r14, r4) | i;
        } else {
            i2 = i3;
        }
        0sP r3 = r17;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r14, r3);
        }
        JRL jrl2 = jrl;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r14, jrl);
        }
        if ((i2 & 147) != 146 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-858797590, "instagram.features.clips.spins.creation.ui.components.BottomButton (SpinsSelectionComposables.kt:120)");
            }
            String A00 = C304346Dc.A00(r14, 2131960992);
            boolean A1V = AnonymousClass7TF.A1V(r4);
            String A002 = C304346Dc.A00(r14, jrl.ByE());
            boolean A1N = C51973G9u.A1N(r14, 548338070, i2) | C51968G9o.A1S(i2);
            Object ECw = r14.ECw();
            if (A1N || ECw == AnonymousClass5XT.A00) {
                ECw = C58690Ivz.A00(r3, r4, 35);
                r14.FLL(ECw);
            }
            boolean A1Y = C51968G9o.A1Y(r14);
            I7L.A01(r7, (Modifier) null, A002, A00, (String) null, (C62320sa) ECw, (C62320sa) null, A1Y ? 1 : 0, 3072, 23540, A1V, A1Y);
            if (0fL.A02()) {
                0fL.A00(-83682094);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59135J7r(i3, 12, r4, jrl2, r3);
        }
    }

    public static final void A03(C286575Wy r15, JRL jrl, C381879cj r17, 0sP r18, AnonymousClass62O r19, int i) {
        int i2;
        C286575Wy r13 = r15;
        r15.ExV(722423050);
        int i3 = i;
        C381879cj r6 = r17;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r15, r6) | i;
        } else {
            i2 = i3;
        }
        AnonymousClass62O r3 = r19;
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r15, r3);
        }
        0sP r4 = r18;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r15, r4);
        }
        JRL jrl2 = jrl;
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r15, jrl2);
        }
        if ((i2 & 1171) != 1170 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1823256689, "instagram.features.clips.spins.creation.ui.components.TextList (SpinsSelectionComposables.kt:79)");
            }
            String A00 = C304346Dc.A00(r15, jrl2.ByF());
            Modifier A0U = C51969G9p.A0U();
            AnonymousClass5ZZ.A0X(r15, C287195Zj.A0B(A0U, C287645aX.A00(r15), 12.0f, C287645aX.A00(r15), 0.0f), AnonymousClass5aQ.A01(r15).A04, A00, C51966G9m.A0H(r15));
            Iterator A17 = C51968G9o.A17(r15, r3, -689500914);
            while (A17.hasNext()) {
                C381879cj r11 = (C381879cj) A17.next();
                String text = r11.getText();
                AnonymousClass2DO A002 = C287975bA.A00(r13, R.drawable.instagram_text_pano_outline_24, 0);
                boolean equals = r11.equals(r6);
                boolean A1Z = C51965G9l.A1Z(r13, r11, C51974G9v.A1Z(r13, 652685362, i2));
                Object ECw = r13.ECw();
                if (A1Z || ECw == AnonymousClass5XT.A00) {
                    ECw = C58690Ivz.A00(r11, r4, 36);
                    r13.FLL(ECw);
                }
                C51965G9l.A1X(r13, false);
                C52636GaA.A05(r13, A0U, A002, new C57123IPm(equals, (C62320sa) ECw), text, 48, 130780);
            }
            C51965G9l.A1X(r13, false);
            AnonymousClass5ZZ.A07(r13, C287195Zj.A09(A0U, C287645aX.A00(r13), 0.0f), AnonymousClass5Z4.A00((C291805hu) null, (C289645dx) null, C51966G9m.A0b(r13), (C268454dQ) null, (AnonymousClass5ZD) null, (C291825hw) null, 0, 0, 0, 6291454, C51966G9m.A0M(r13), 0, 0, 0), C304346Dc.A00(r13, 2131955794));
            if (0fL.A02()) {
                0fL.A00(-422576409);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG7(jrl2, r3, r4, r6, i3, 31);
        }
    }
}
