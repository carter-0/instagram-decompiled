package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

public abstract class GSG {
    public static final void A00(C286575Wy r16, Modifier modifier, String str, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        String str2 = str;
        0qQ.A0B(str2, 0);
        C286575Wy r7 = r16;
        r7.ExV(645118188);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r7, str2) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r7, modifier2);
        }
        if ((i3 & 19) != 18 || !r7.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(1467361992, "com.instagram.newsfeed.compose.ui.NFTruncationControlRow (NFTruncationControlRow.kt:23)");
            }
            Modifier A05 = C287205Zk.A05(modifier2, 32.0f);
            AnonymousClass5RD A0W = C51968G9o.A0W(r7);
            int A00 = C287425a7.A00(r7);
            C286565Wx r5 = (C286565Wx) r7;
            AnonymousClass5RM A04 = C286565Wx.A04(r5);
            Modifier A01 = C287435a8.A01(r7, A05);
            C51973G9u.A0y(r7, r5);
            C51971G9r.A12(r7, A0W, A04);
            0sL r3 = C287485aD.A02;
            if (r5.A0K || !C51972G9s.A1Q(r7, A00)) {
                C51971G9r.A13(r7, r3, A00);
            }
            C51965G9l.A18(r7, A01);
            String str3 = str2;
            AnonymousClass5ZZ.A0n(r7, C51966G9m.A0h(r7), str3, i3 & 14, C51966G9m.A0M(r7));
            C288165bT.A07(r7, C51967G9n.A0E(Modifier.A00, 8.0f), C287975bA.A00(r7, R.drawable.instagram_chevron_down_pano_outline_12, 0), C288035bG.A00(r7, 2131960862), 384, C51966G9m.A0L(r7));
            if (C51967G9n.A1R(r7)) {
                0fL.A00(509259606);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59139J7v(modifier2, str2, i4, i5, 10);
        }
    }
}
