package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.HXm  reason: case insensitive filesystem */
public abstract class C54904HXm {
    public static final void A00(C286575Wy r14, C62320sa r15, int i, int i2) {
        int i3;
        C62320sa r4 = r15;
        0qQ.A0B(r15, 1);
        C286575Wy r11 = r14;
        r14.ExV(1491243496);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 6) == 0) {
            i3 = G9t.A05(r14, i5) | i2;
        } else {
            i3 = i4;
        }
        if ((i2 & 48) == 0) {
            i3 |= G9t.A0F(r14, r15);
        }
        if ((i3 & 19) != 18 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1968219171, "com.instagram.creation.capture.quickcapture.potato.capture.view.compose.PotatoAudienceSelector (PotatoAudienceSelector.kt:34)");
            }
            C285245Qk r8 = Modifier.A00;
            Modifier A0T = C51966G9m.A0T(r8);
            C286565Wx r9 = (C286565Wx) r11;
            C286565Wx.A0L(r9, false);
            Modifier A0B = G9w.A0B((C287605aT) C51974G9v.A0V(r14, 105304014), A0T, r15);
            AnonymousClass5RD A00 = C287395a4.A00(C287275Zs.A02, r14, C287215Zl.A04);
            int A002 = C287425a7.A00(r14);
            AnonymousClass5RM A04 = C286565Wx.A04(r9);
            Modifier A01 = C287435a8.A01(r14, A0B);
            C51973G9u.A0y(r14, r9);
            C51971G9r.A12(r14, A00, A04);
            0sL r1 = C287485aD.A02;
            if (r9.A0K || !C51972G9s.A1Q(r14, A002)) {
                C51971G9r.A13(r14, r1, A002);
            }
            C51965G9l.A18(r14, A01);
            C288165bT.A02(r14, C287205Zk.A0C(C287195Zj.A07(r8, 4.0f), 12.0f), C287975bA.A00(r14, R.drawable.instagram_users_pano_filled_24, 0), C51966G9m.A0E(r14));
            AnonymousClass5ZZ.A0m(r11, (AnonymousClass5Z4) null, C51968G9o.A14(r14, C288035bG.A00(r14, i5), 2131969697), 3, 32634, G9w.A05(r14));
            C288165bT.A02(r11, C287205Zk.A0C(C287195Zj.A07(r8, 4.0f), 12.0f), C287975bA.A00(r11, R.drawable.instagram_chevron_down_pano_outline_24, 0), C51966G9m.A0E(r11));
            if (C51967G9n.A1R(r11)) {
                0fL.A00(-2076646817);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            JGH.A01(ASQ, r4, i5, i4, 12);
        }
    }
}
