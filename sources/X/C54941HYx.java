package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.HYx  reason: case insensitive filesystem */
public abstract class C54941HYx {
    public static final void A00(C286575Wy r23, Modifier modifier, String str, String str2, C62320sa r27, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C62320sa r24 = r27;
        0qQ.A0B(r24, 2);
        C286575Wy r4 = r23;
        r4.ExV(248027749);
        int i4 = i2;
        String str3 = str;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = G9t.A0O(r4, str3) | i;
        } else {
            i3 = i5;
        }
        String str4 = str2;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= G9t.A0P(r4, str4);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= G9t.A0G(r4, r24);
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i3 |= G9t.A0R(r4, modifier2);
        }
        if ((i3 & 5851) != 1170 || !r4.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-1691603085, "com.instagram.creator.achievements.modules.views.EarnedOnMediaRowV2 (EarnedOnMediaRowV2.kt:43)");
            }
            if (str != null) {
                C287245Zp r18 = C287215Zl.A04;
                C287625aV A0R = C51965G9l.A0R(0);
                r4.ExS(-806945275);
                int i7 = i3 & 896;
                boolean A1S = AnonymousClass7TF.A1S(i7, 256);
                Object ECw = r4.ECw();
                if (A1S || ECw == AnonymousClass5XT.A00) {
                    ECw = new C58683Ivs(r24, 37);
                    r4.FLL(ECw);
                }
                C286565Wx A0H = C51965G9l.A0H(r4, false);
                Modifier A03 = C287195Zj.A03(C51969G9p.A0X(C287635aW.A05(modifier2, A0R, (String) null, (C62320sa) ECw, true), 8.0f, C51966G9m.A0C(r4)));
                AnonymousClass5RD A0Q = C51965G9l.A0Q(r4, r18);
                int A00 = C287425a7.A00(r4);
                AnonymousClass5RM A04 = C286565Wx.A04(A0H);
                Modifier A01 = C287435a8.A01(r4, A03);
                C51973G9u.A0y(r4, A0H);
                C51971G9r.A12(r4, A0Q, A04);
                0sL r1 = C287485aD.A02;
                if (A0H.A0K || !C51972G9s.A1Q(r4, A00)) {
                    C51971G9r.A13(r4, r1, A00);
                }
                C51965G9l.A18(r4, A01);
                AnonymousClass6FX r5 = AnonymousClass6FX.A00;
                AnonymousClass2DN A0W = C51975G9x.A0W(r4, str3);
                C285245Qk r2 = Modifier.A00;
                Modifier A0P = C51968G9o.A0P(C304816Fi.A01(AnonymousClass6C9.A00(1.0f, C51966G9m.A0F(r4)), C287205Zk.A0C(r2, 32.0f), AnonymousClass5ZN.A01(4.0f)), 4.0f);
                boolean A1X = C51970G9q.A1X(r4, 847999044, i7, 256);
                Object ECw2 = r4.ECw();
                if (A1X || ECw2 == AnonymousClass5XT.A00) {
                    ECw2 = new C58683Ivs(r24, 38);
                    r4.FLL(ECw2);
                }
                AnonymousClass6G3.A04(r4, C287635aW.A05(A0P, (C287625aV) null, (String) null, C51965G9l.A0y(A0H, ECw2, false), true), A0W);
                r4.ExS(848002137);
                if (str2 != null) {
                    AnonymousClass5ZZ.A0Q(r4, C287195Zj.A0B(r5.FNR(r2, 1.0f, true), 16.0f, 0.0f, 0.0f, 0.0f), C51966G9m.A0b(r4), str4, C51966G9m.A0H(r4));
                }
                C286565Wx.A0L(A0H, false);
                C288165bT.A07(r4, C287195Zj.A0B(r5.AB1(r18, r2), 16.0f, 0.0f, 0.0f, 0.0f), C287975bA.A00(r4, R.drawable.instagram_chevron_right_pano_filled_12, 0), "", 56, C51966G9m.A0L(r4));
                r4.ASN();
            }
            if (0fL.A02()) {
                0fL.A00(172545682);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9Q(r24, modifier2, str4, str3, i5, i4, 6);
        }
    }
}
