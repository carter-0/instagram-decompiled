package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.wonderwall.model.WallImage;
import com.instagram.wonderwall.model.WallMenuConfig;

/* renamed from: X.Hx5  reason: case insensitive filesystem */
public abstract class C56354Hx5 {
    public static final void A00(C286575Wy r7, WallMenuConfig wallMenuConfig, 0sP r9, int i) {
        int i2;
        AnonymousClass7TF.A1H(wallMenuConfig, r9);
        r7.ExV(2059085830);
        if ((i & 6) == 0) {
            i2 = C51970G9q.A05(G9t.A1T(r7, wallMenuConfig, i) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r7, r9);
        }
        if ((i2 & 19) != 18 || !r7.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1128739976, "com.instagram.wonderwall.ui.bottomsheet.WallMenuScreen (WallMenuScreen.kt:29)");
            }
            C285245Qk r2 = Modifier.A00;
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r7, 0);
            int A00 = C287425a7.A00(r7);
            C286565Wx r3 = (C286565Wx) r7;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r7, r2);
            C51973G9u.A0y(r7, r3);
            C51971G9r.A12(r7, A0Z, A04);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r7, A00)) {
                C51971G9r.A13(r7, r1, A00);
            }
            C51965G9l.A18(r7, A01);
            r7.ExS(-1066659959);
            for (C55818Hny A012 : wallMenuConfig.A01) {
                A01(r7, A012, r9, i2 & 112);
            }
            if (C51971G9r.A1S(r7, r3, false)) {
                0fL.A00(830462662);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            JGM.A01(ASQ, wallMenuConfig, r9, i, 15);
        }
    }

    public static final void A01(C286575Wy r28, C55818Hny hny, 0sP r30, int i) {
        int i2;
        long A0L;
        C55818Hny hny2 = hny;
        0sP r5 = r30;
        boolean A1U = AnonymousClass7TF.A1U(0, hny2, r5);
        C286575Wy r7 = r28;
        r7.ExV(2012363258);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C51970G9q.A05(G9t.A1T(r7, hny2, i3) ? 1 : 0) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r7, r5);
        }
        if ((i2 & 19) != 18 || !r7.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1451482770, "com.instagram.wonderwall.ui.bottomsheet.MenuItem (WallMenuScreen.kt:34)");
            }
            C304756Fc A01 = C287275Zs.A01(0.0f);
            C285245Qk r8 = Modifier.A00;
            AnonymousClass5RD A0L2 = G9w.A0L(A01, r7);
            int A00 = C287425a7.A00(r7);
            C286565Wx r2 = (C286565Wx) r7;
            AnonymousClass5RM A04 = C286565Wx.A04(r2);
            Modifier A012 = C287435a8.A01(r7, r8);
            C62320sa r12 = C287485aD.A00;
            C51973G9u.A0z(r7, r2, r12);
            0sL r11 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r7, A0L2, A04, r11);
            0sL r10 = C287485aD.A02;
            if (r2.A0K || !C51972G9s.A1Q(r7, A00)) {
                C51971G9r.A13(r7, r10, A00);
            }
            0sL A1K = C51966G9m.A1K(r7, A012);
            if (hny2.A03) {
                A0L = C51967G9n.A0a(r7, 1721384631).A0E;
            } else {
                A0L = C51970G9q.A0L(r7, 1721386128);
            }
            C286565Wx.A0L(r2, false);
            String A02 = I6X.A02(r7, hny2.A01);
            boolean z = true;
            Modifier A0T = C51966G9m.A0T(r8);
            boolean A1O = C51973G9u.A1O(r7, 1721389733, i2);
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !r7.AGw(hny2))) {
                z = false;
            }
            boolean z2 = A1O | z;
            Object ECw = r7.ECw();
            if (z2 || ECw == AnonymousClass5XT.A00) {
                ECw = C51970G9q.A0v(r7, r5, hny2, 37);
            }
            Modifier A05 = C287635aW.A05(A0T, (C287625aV) null, (String) null, C51965G9l.A0y(r2, ECw, false), A1U);
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A002 = C287425a7.A00(r7);
            AnonymousClass5RM A042 = C286565Wx.A04(r2);
            Modifier A013 = C287435a8.A01(r7, A05);
            C51973G9u.A0z(r7, r2, r12);
            C287595aO.A00(r7, A0a, r11);
            if (C51965G9l.A1Y(r7, r2, A042, A0w) || !C51972G9s.A1Q(r7, A002)) {
                C51971G9r.A13(r7, r10, A002);
            }
            C287595aO.A00(r7, A013, A1K);
            Modifier A07 = C287195Zj.A07(r8, 12.0f);
            AnonymousClass5RD A003 = C287395a4.A00(C287275Zs.A04, r7, C287215Zl.A04);
            int A004 = C287425a7.A00(r7);
            AnonymousClass5RM A043 = C286565Wx.A04(r2);
            Modifier A014 = C287435a8.A01(r7, A07);
            C51973G9u.A0z(r7, r2, r12);
            C287595aO.A00(r7, A003, r11);
            if (C51965G9l.A1Y(r7, r2, A043, A0w) || !C51972G9s.A1Q(r7, A004)) {
                C51971G9r.A13(r7, r10, A004);
            }
            C287595aO.A00(r7, A014, A1K);
            AnonymousClass6FX r0 = AnonymousClass6FX.A00;
            WallImage wallImage = hny2.A00;
            r7.ExS(1806495851);
            if (wallImage != null) {
                I6X.A05(r7, wallImage, A02, 0.0f, 0, 8, A0L);
            }
            C286565Wx.A0L(r2, false);
            C51967G9n.A13(r7, r8, 12.0f);
            AnonymousClass5ZZ.A06(r7, r0.A00(r8), AnonymousClass5Z4.A01((AnonymousClass5Z2) null, C51965G9l.A0S(r7), (C268454dQ) null, (C291715hl) null, (AnonymousClass5ZD) null, 0, 0, 15728638, A0L, 0, 0), A02);
            r7.ExS(1806509355);
            if (hny2.A04) {
                I6X.A05(r7, new WallImage.Drawable(R.drawable.instagram_check_pano_outline_24), (String) null, 0.0f, 0, 14, 0);
            }
            C286565Wx.A0L(r2, false);
            r7.ASN();
            if (C51971G9r.A1R(r7)) {
                0fL.A00(-1275468616);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            JGM.A01(ASQ, hny2, r5, i3, 14);
        }
    }
}
