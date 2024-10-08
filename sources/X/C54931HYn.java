package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.HYn  reason: case insensitive filesystem */
public abstract class C54931HYn {
    public static final void A00(C286575Wy r27, Modifier modifier, String str, String str2, int i, int i2, int i3) {
        int i4;
        int i5;
        Integer valueOf;
        String str3 = str;
        String str4 = str2;
        Modifier modifier2 = modifier;
        AnonymousClass7TG.A1Q(str3, str4);
        C286575Wy r4 = r27;
        r4.ExV(-150415146);
        int i6 = i3;
        int i7 = i3 & 1;
        int i8 = i2;
        if (i7 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = G9t.A0O(r4, modifier2) | i2;
        } else {
            i4 = i8;
        }
        int i9 = i;
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= G9t.A06(r4, i9);
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i8 & 896) == 0) {
            i4 |= G9t.A0Q(r4, str3);
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i8 & 7168) == 0) {
            i4 |= G9t.A0R(r4, str4);
        }
        if ((i4 & 5851) != 1170 || !r4.Bwn()) {
            if (i7 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-951101843, "com.instagram.creator.achievements.modules.views.AboutAchievement (AboutAchievement.kt:25)");
            }
            C285245Qk r11 = Modifier.A00;
            Modifier A09 = C287195Zj.A09(r11, 0.0f, 16.0f);
            AnonymousClass5RD A02 = C287395a4.A02(C287275Zs.A01, r4, C287215Zl.A05, 0);
            int A00 = C287425a7.A00(r4);
            C286565Wx r6 = (C286565Wx) r4;
            AnonymousClass5RM A04 = C286565Wx.A04(r6);
            Modifier A01 = C287435a8.A01(r4, A09);
            C62320sa r10 = C287485aD.A00;
            C51973G9u.A0z(r4, r6, r10);
            0sL r9 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r4, A02, A04, r9);
            0sL r0 = C287485aD.A02;
            if (r6.A0K || !C51972G9s.A1Q(r4, A00)) {
                C51971G9r.A13(r4, r0, A00);
            }
            0sL A1K = C51966G9m.A1K(r4, A01);
            if (i != 0) {
                if (i9 == 1) {
                    i5 = R.drawable.instagram_bulb_pano_outline_24;
                } else if (i9 != 2) {
                    valueOf = null;
                } else {
                    i5 = R.drawable.instagram_party_popper_pano_outline_24;
                }
                valueOf = Integer.valueOf(i5);
            } else {
                i5 = R.drawable.instagram_trophy_pano_outline_24;
                valueOf = Integer.valueOf(i5);
            }
            r4.ExS(-1616583796);
            if (valueOf != null) {
                C286575Wy r18 = r4;
                C288165bT.A00(r18, C287205Zk.A04(C287195Zj.A0B(modifier2, 0.0f, 0.0f, 16.0f, 0.0f)), C287975bA.A00(r4, valueOf.intValue(), 0), 56, 24, 0);
            }
            C286565Wx.A0L(r6, false);
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r4, 0);
            int A002 = C287425a7.A00(r4);
            AnonymousClass5RM A042 = C286565Wx.A04(r6);
            Modifier A012 = C287435a8.A01(r4, r11);
            C51973G9u.A0z(r4, r6, r10);
            C287595aO.A00(r4, A0Z, r9);
            if (C51965G9l.A1Y(r4, r6, A042, A0w) || !C51972G9s.A1Q(r4, A002)) {
                C51971G9r.A13(r4, r0, A002);
            }
            C287595aO.A00(r4, A012, A1K);
            AnonymousClass5ZZ.A09(r4, C287195Zj.A0B(modifier2, 0.0f, 0.0f, 0.0f, 4.0f), C51966G9m.A0h(r4), str3, (i4 >> 6) & 14);
            int i10 = (i4 >> 9) & 14;
            AnonymousClass5ZZ.A0n(r4, C51966G9m.A0b(r4), str4, i10, C51966G9m.A0M(r4));
            if (C51971G9r.A1R(r4)) {
                0fL.A00(-1587581787);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8B(modifier2, str3, str4, i9, i8, i6);
        }
    }
}
