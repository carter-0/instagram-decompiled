package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.HSw  reason: case insensitive filesystem */
public abstract class C54789HSw {
    public static final void A00(C286575Wy r26, ImageUrl imageUrl, String str, String str2, C62320sa r30, int i, int i2) {
        int i3;
        ImageUrl imageUrl2 = imageUrl;
        String str3 = str2;
        String str4 = str;
        C62320sa r23 = r30;
        String str5 = str4;
        AnonymousClass7TF.A1C(str5, 0, r23);
        C286575Wy r5 = r26;
        r5.ExV(-1354549364);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r5, str5) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r5, str3);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0Q(r5, imageUrl2);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i3 |= G9t.A0H(r5, r23);
        }
        if ((i3 & 1171) != 1170 || !r5.Bwn()) {
            if (i6 != 0) {
                str3 = null;
            }
            if (i7 != 0) {
                imageUrl2 = null;
            }
            if (0fL.A02()) {
                0fL.A01(-438729457, "com.instagram.aistudio.editor.ChatThemeRow (ChatThemeRow.kt:36)");
            }
            Modifier modifier = Modifier.A00;
            Modifier A09 = C287195Zj.A09(modifier, C287645aX.A00(r5), 0.0f);
            boolean A1Q = C51973G9u.A1Q(r5, -154772268, i3);
            Object ECw = r5.ECw();
            if (A1Q || ECw == AnonymousClass5XT.A00) {
                ECw = G9w.A0r(r5, r23, 47);
            }
            C286565Wx A0H = C51965G9l.A0H(r5, false);
            Modifier A05 = C287635aW.A05(A09, (C287625aV) null, (String) null, (C62320sa) ECw, true);
            AnonymousClass5RD A02 = C287395a4.A02(C287275Zs.A01, r5, C287215Zl.A04, 48);
            int A00 = C287425a7.A00(r5);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r5, A05);
            C62320sa r12 = C287485aD.A00;
            C51973G9u.A0z(r5, A0H, r12);
            0sL r11 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r5, A02, A04, r11);
            0sL r10 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r5, A00)) {
                C51971G9r.A13(r5, r10, A00);
            }
            0sL A1K = C51966G9m.A1K(r5, A01);
            AnonymousClass6FX r18 = AnonymousClass6FX.A00;
            Modifier A0P = C51968G9o.A0P(C287205Zk.A08(C287205Zk.A0D(modifier, 24.0f), 48.0f), 4.0f);
            AnonymousClass5RD A0Z = C51966G9m.A0Z(false);
            int A002 = C287425a7.A00(r5);
            AnonymousClass5RM A042 = C286565Wx.A04(A0H);
            Modifier A012 = C287435a8.A01(r5, A0P);
            C51973G9u.A0z(r5, A0H, r12);
            C287595aO.A00(r5, A0Z, r11);
            if (C51965G9l.A1Y(r5, A0H, A042, A0w) || !C51972G9s.A1Q(r5, A002)) {
                C51971G9r.A13(r5, r10, A002);
            }
            C287595aO.A00(r5, A012, A1K);
            AnonymousClass6G3.A07(r5, (Modifier) null, C51966G9m.A0o(r5, imageUrl2, i3 >> 6), 48, 124);
            r5.ASN();
            Modifier FNR = r18.FNR(C287195Zj.A0B(modifier, C287645aX.A01(r5, R.dimen.account_discovery_bottom_gap), C287645aX.A01(r5, R.dimen.account_discovery_bottom_gap), 0.0f, C287645aX.A01(r5, R.dimen.account_discovery_bottom_gap)), 1.0f, true);
            AnonymousClass5RD A0Z2 = C51969G9p.A0Z(r5, 0);
            int A003 = C287425a7.A00(r5);
            AnonymousClass5RM A043 = C286565Wx.A04(A0H);
            Modifier A013 = C287435a8.A01(r5, FNR);
            C51973G9u.A0z(r5, A0H, r12);
            C287595aO.A00(r5, A0Z2, r11);
            if (C51965G9l.A1Y(r5, A0H, A043, A0w) || !C51972G9s.A1Q(r5, A003)) {
                C51971G9r.A13(r5, r10, A003);
            }
            C287595aO.A00(r5, A013, A1K);
            C286575Wy r9 = r5;
            AnonymousClass5ZZ.A0n(r9, C51966G9m.A0g(r5), str4, i3 & 14, C51966G9m.A0H(r5));
            r5.ExS(-1372093769);
            if (str3 != null) {
                AnonymousClass5ZZ.A0n(r9, C51966G9m.A0c(r5), str3, (i3 >> 3) & 14, C51966G9m.A0M(r5));
            }
            C286565Wx.A0L(A0H, false);
            r5.ASN();
            AnonymousClass2DO A004 = C287975bA.A00(r5, R.drawable.instagram_chevron_right_pano_outline_16, 0);
            long A0L = C51966G9m.A0L(r5);
            if (0mk.A02(C51968G9o.A0I(r5))) {
                modifier = HRI.A00(modifier, -1.0f, 1.0f);
            }
            C288165bT.A05(r5, modifier, A004, A0L);
            if (C51967G9n.A1R(r5)) {
                0fL.A00(643025731);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9Q(imageUrl2, r23, str3, str4, i5, i4, 0);
        }
    }
}
