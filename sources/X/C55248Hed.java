package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Hed  reason: case insensitive filesystem */
public abstract class C55248Hed {
    public static final void A00(C286575Wy r19, Modifier modifier, ImageUrl imageUrl, String str, String str2, String str3, C62320sa r25, int i, boolean z) {
        int i2;
        Modifier modifier2 = modifier;
        0qQ.A0B(modifier2, 0);
        C62320sa r17 = r25;
        boolean A1Z = DbW.A1Z(r17);
        C286575Wy r4 = r19;
        r4.ExV(-592306452);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r4, modifier2) | i;
        } else {
            i2 = i3;
        }
        String str4 = str;
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r4, str4);
        }
        String str5 = str2;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0Q(r4, str5);
        }
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r4, r17);
        }
        boolean z2 = z;
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0c(r4, z2);
        }
        if ((196608 & i) == 0) {
            i2 |= G9t.A0T(r4, imageUrl);
        }
        String str6 = str3;
        if ((1572864 & i) == 0) {
            i2 |= G9t.A0U(r4, str6);
        }
        if ((599187 & i2) != 599186 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1491203026, "instagram.features.clips.remix.pivot.composables.RemixPivotPageHeader (RemixHeaderComposables.kt:27)");
            }
            AnonymousClass5RD A0s = G9t.A0s(C287275Zs.A01, r4, C287215Zl.A04, (i2 & 14) | 384);
            int A00 = C287425a7.A00(r4);
            C286565Wx r13 = (C286565Wx) r4;
            AnonymousClass5RM A04 = C286565Wx.A04(r13);
            Modifier A01 = C287435a8.A01(r4, modifier2);
            C62320sa r12 = C287485aD.A00;
            C51973G9u.A0z(r4, r13, r12);
            0sL r11 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r4, A0s, A04, r11);
            0sL r9 = C287485aD.A02;
            if (r13.A0K || !C51972G9s.A1Q(r4, A00)) {
                C51971G9r.A13(r4, r9, A00);
            }
            0sL A1K = C51966G9m.A1K(r4, A01);
            C285245Qk r14 = Modifier.A00;
            I62.A00(r4, C287205Zk.A0G(r14, 82.0f, 146.0f), imageUrl, ((i2 >> 15) & 14) | 48);
            Modifier A0E = C51967G9n.A0E(r14, 16.0f);
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r4, 0);
            int A002 = C287425a7.A00(r4);
            AnonymousClass5RM A042 = C286565Wx.A04(r13);
            Modifier A012 = C287435a8.A01(r4, A0E);
            C51973G9u.A0z(r4, r13, r12);
            C287595aO.A00(r4, A0Z, r11);
            if (C51965G9l.A1Y(r4, r13, A042, A0w) || !C51972G9s.A1Q(r4, A002)) {
                C51971G9r.A13(r4, r9, A002);
            }
            C287595aO.A00(r4, A012, A1K);
            int i4 = i2 >> 3;
            I62.A02(r4, str4, (i4 & 14) | 48, A1Z);
            I62.A03(r4, str5, r17, ((i2 >> 6) & 14) | ((i2 >> 9) & 112) | (i4 & 896), z2);
            I62.A04(str6, r4, (i2 >> 18) & 14);
            if (C51971G9r.A1R(r4)) {
                0fL.A00(-1874880671);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            boolean z3 = z2;
            ASQ.A06 = new C59189J9t(modifier2, imageUrl, str4, str5, str6, r17, i3, z3);
        }
    }
}
