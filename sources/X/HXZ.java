package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;

public abstract class HXZ {
    public static final void A00(int i, Modifier modifier, C286575Wy r11, int i2, int i3) {
        int i4;
        String A00;
        Modifier modifier2 = modifier;
        r11.ExV(-2003772229);
        int i5 = i3;
        int i6 = i3 & 1;
        int i7 = i2;
        if (i6 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = G9t.A0O(r11, modifier2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= G9t.A06(r11, i);
        }
        if ((i4 & 19) != 18 || !r11.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-1355600635, "com.instagram.compose.ui.notificationbadge.ListBadgeWithCount (ListBadgeWithCount.kt:19)");
            }
            AnonymousClass2DO A002 = C287975bA.A00(r11, R.drawable.list_badge_small, 0);
            Alignment alignment = C287215Zl.A09;
            C285245Qk r3 = Modifier.A00;
            AnonymousClass5RD A003 = C287675aa.A00(alignment, false);
            int A004 = C287425a7.A00(r11);
            C286565Wx r2 = (C286565Wx) r11;
            AnonymousClass5RM A04 = C286565Wx.A04(r2);
            Modifier A01 = C287435a8.A01(r11, r3);
            C51973G9u.A0y(r11, r2);
            C51971G9r.A12(r11, A003, A04);
            0sL r1 = C287485aD.A02;
            if (r2.A0K || !C51972G9s.A1Q(r11, A004)) {
                C51971G9r.A13(r11, r1, A004);
            }
            C51965G9l.A18(r11, A01);
            AnonymousClass6G3.A03(r11, C287205Zk.A0C(modifier2, 20.0f), A002);
            r11.ExS(1948916122);
            if (i < 10) {
                A00 = String.valueOf(i);
            } else {
                A00 = C288035bG.A00(r11, 2131973981);
            }
            C286565Wx.A0L(r2, false);
            AnonymousClass5ZZ.A0r(r11, C51966G9m.A0c(r11), A00, C51966G9m.A0I(r11));
            if (C51967G9n.A1R(r11)) {
                0fL.A00(1750736861);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59130J7m(modifier2, i5, i, i7, 3);
        }
    }
}
