package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

public abstract class HV3 {
    public static final void A00(C286575Wy r18, Modifier modifier, C299735vl r20, C62320sa r21, int i, int i2) {
        int i3;
        float f;
        Modifier modifier2 = modifier;
        C62320sa r3 = r21;
        0qQ.A0B(r3, 1);
        C286575Wy r10 = r18;
        r10.ExV(-1436521541);
        int i4 = i2;
        int i5 = i;
        C299735vl r4 = r20;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r10, r4) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0F(r10, r3);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0Q(r10, modifier2);
        }
        if ((i3 & 147) != 146 || !r10.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-1760219065, "com.instagram.barcelona.feed.post.ui.PostTranslateButton (PostTranslateButton.kt:26)");
            }
            Modifier A0C = C287205Zk.A0C(modifier2, 20.0f);
            AnonymousClass5RD A00 = C287675aa.A00(C287215Zl.A09, false);
            int A002 = C287425a7.A00(r10);
            C286565Wx r5 = (C286565Wx) r10;
            AnonymousClass5RM A04 = C286565Wx.A04(r5);
            Modifier A01 = C287435a8.A01(r10, A0C);
            C51973G9u.A0y(r10, r5);
            C51971G9r.A12(r10, A00, A04);
            0sL r7 = C287485aD.A02;
            if (r5.A0K || !C51972G9s.A1Q(r10, A002)) {
                C51971G9r.A13(r10, r7, A002);
            }
            C51965G9l.A18(r10, A01);
            boolean z = r4 instanceof C53487GpJ;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.5f;
                if (r4 instanceof C57009ILb) {
                    f = 0.0f;
                }
            }
            AnonymousClass2DO A003 = C287975bA.A00(r10, R.drawable.barcelona_translate_outline_14, 0);
            int i7 = 2131953723;
            if (z) {
                i7 = 2131953718;
            }
            String A004 = C288035bG.A00(r10, i7);
            C285245Qk r0 = Modifier.A00;
            C288165bT.A06(r10, C287635aW.A05(HRF.A00(r0, f), C51965G9l.A0R(0), (String) null, r3, true), A003, (C288095bM) null, A004, 0, 24, 0);
            r10.ExS(-924905695);
            if (r4 instanceof C57009ILb) {
                HUY.A00(r10, C287205Zk.A0C(r0, 18.0f), C52423GSb.A01(r10), 70, 0);
            }
            if (C51971G9r.A1S(r10, r5, false)) {
                0fL.A00(-1042504762);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG6(i5, i4, 14, modifier2, r4, r3);
        }
    }
}
