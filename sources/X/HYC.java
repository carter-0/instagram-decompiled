package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;

public abstract class HYC {
    public static final void A00(C286575Wy r36, Modifier modifier, HLB hlb, C62320sa r39, 0sP r40, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C62320sa r35 = r39;
        0sP r34 = r40;
        AnonymousClass7TF.A1B(r34, 0, r35);
        C286575Wy r0 = r36;
        r0.ExV(1166477740);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C41848B3p.A01(r0, r34) | i;
        } else {
            i3 = i5;
        }
        HLB hlb2 = hlb;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= G9t.A0P(r0, hlb2);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= G9t.A0G(r0, r35);
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i3 |= G9t.A0R(r0, modifier2);
        }
        if ((i3 & 5851) != 1170 || !r0.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(1198213503, "com.instagram.creation.genai.magicmod.common.ui.MagicModGeneratedImageMoreMenuButton (MagicModGeneratedImageMoreMenuButton.kt:35)");
            }
            Object A0m = C51967G9n.A0m(r0, -1963708611);
            Object obj = AnonymousClass5XT.A00;
            C284945Oz r4 = (C284945Oz) C51974G9v.A0Z(r0, A0m, obj, false);
            C286565Wx A0H = C51965G9l.A0H(r0, false);
            boolean A1O = C51973G9u.A1O(r0, -1963706413, i3);
            Object ECw = r0.ECw();
            if (A1O || ECw == obj) {
                ECw = C51969G9p.A0R(r0, new C58678Ivn(hlb2, 16));
            }
            C270284gU r6 = (C270284gU) ECw;
            C286565Wx.A0L(A0H, false);
            Alignment alignment = C287215Zl.A09;
            C285245Qk r17 = Modifier.A00;
            Modifier A0F = G9w.A0F(modifier2);
            boolean A1P = C51973G9u.A1P(r0, -1963699281, i3);
            Object ECw2 = r0.ECw();
            if (A1P || ECw2 == obj) {
                ECw2 = C58717IwQ.A01(r0, r35, r4, 5);
            }
            Modifier A0C = G9w.A0C(r0, A0H, A0F, ECw2);
            AnonymousClass5RD A00 = C287675aa.A00(alignment, false);
            int A002 = C287425a7.A00(r0);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r0, A0C);
            C62320sa r13 = C287485aD.A00;
            C51973G9u.A0z(r0, A0H, r13);
            0sL r12 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r0, A00, A04, r12);
            0sL r11 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r0, A002)) {
                C51971G9r.A13(r0, r11, A002);
            }
            0sL A1K = C51966G9m.A1K(r0, A01);
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A003 = C287425a7.A00(r0);
            AnonymousClass5RM A042 = C286565Wx.A04(A0H);
            Modifier A012 = C287435a8.A01(r0, r17);
            C51973G9u.A0z(r0, A0H, r13);
            C287595aO.A00(r0, A0a, r12);
            if (C51965G9l.A1Y(r0, A0H, A042, A0w) || !C51972G9s.A1Q(r0, A003)) {
                C51971G9r.A13(r0, r11, A003);
            }
            C287595aO.A00(r0, A012, A1K);
            C288165bT.A06(r0, (Modifier) null, C287975bA.A00(r0, R.drawable.instagram_more_horizontal_pano_outline_24, 0), (C288095bM) null, C304346Dc.A00(r0, 2131965783), 8, 20, C51965G9l.A09(r0));
            C286575Wy r8 = r0;
            C56617I4s.A03(r8, HMB.UP_RIGHT, (HLY) null, C304346Dc.A00(r0, 2131965774), r35, ((i3 << 3) & 7168) | 384, 2032, 0, C51971G9r.A1X(r6));
            r0.ASN();
            boolean A1W = C51971G9r.A1W(r4);
            HL4 hl4 = HL4.OnMedia;
            long A004 = C54759HRr.A00(10.0f, 10.0f);
            boolean A1X = C51974G9v.A1X(r0, -273473861, i3);
            Object ECw3 = r0.ECw();
            if (A1X || ECw3 == obj) {
                ECw3 = new C59102J6k(9, (Object) r4, (Object) r34);
                r0.FLL(ECw3);
            }
            0sP A0z = C51965G9l.A0z(A0H, ECw3);
            Object A0m2 = C51967G9n.A0m(r0, -273466918);
            if (A0m2 == obj) {
                A0m2 = new C58678Ivn(r4, 15);
                r0.FLL(A0m2);
            }
            C56261HvV.A00((C56838IEj) null, r0, (Modifier) null, hl4, C51965G9l.A0y(A0H, A0m2, false), A0z, JFD.A00, 221568, 193, A004, A1W, false);
            if (C51967G9n.A1R(r0)) {
                0fL.A00(-902053705);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG8(hlb2, r35, r34, modifier2, i5, i4, 14);
        }
    }
}
