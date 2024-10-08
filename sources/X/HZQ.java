package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

public abstract class HZQ {
    public static final void A00(C286575Wy r7, int i) {
        r7.ExV(2012984415);
        if (i != 0 || !r7.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1411851300, "com.instagram.creator.education.KeyTakeawaysScreen (CreatorEducationKeyTakeawaysFragment.kt:47)");
            }
            C285245Qk r6 = Modifier.A00;
            Modifier A02 = I28.A02(r7, C51966G9m.A0T(r6));
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r7, 0);
            int A00 = C287425a7.A00(r7);
            C286565Wx r3 = (C286565Wx) r7;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r7, A02);
            C51973G9u.A0y(r7, r3);
            C51971G9r.A12(r7, A0Z, A04);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r7, A00)) {
                C51971G9r.A13(r7, r1, A00);
            }
            C51965G9l.A18(r7, A01);
            AnonymousClass5ZZ.A0Z(r7, C287195Zj.A01(r6), "You have something to say. Testing one two three to verify text-wrapping behavior");
            C56649I6e.A05(r7, new C53508Gpe("Dummy text for bullet cell that should wrap across multiple lines", 0), R.drawable.instagram_circle_check_pano_outline_24);
            C56649I6e.A05(r7, new C53508Gpe("Dummy text for bullet cell that should wrap across multiple lines", 0), R.drawable.instagram_circle_check_pano_outline_24);
            if (C51967G9n.A1R(r7)) {
                0fL.A00(860355089);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            JG9.A01(ASQ, i, 38);
        }
    }
}
