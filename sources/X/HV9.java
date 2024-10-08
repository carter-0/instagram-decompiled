package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

public abstract class HV9 {
    public static final void A00(C286575Wy r33, Modifier modifier, String str, String str2, C62320sa r37, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        String str3 = str2;
        AnonymousClass7TF.A1H(str, str3);
        C62320sa r15 = r37;
        0qQ.A0B(r15, 3);
        C286575Wy r0 = r33;
        r0.ExV(242348215);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r0, str) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r0, str3);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0Q(r0, modifier2);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i3 |= G9t.A0H(r0, r15);
        }
        if ((i3 & 1171) != 1170 || !r0.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-710890020, "com.instagram.barcelona.feed.post.ui.TimelyTopicLabel (TimelyTopicLabel.kt:32)");
            }
            boolean A1W = AnonymousClass7TF.A1W(C51966G9m.A15(r0), AnonymousClass5Q8.Rtl);
            AnonymousClass5Z4 A0c = C51966G9m.A0c(r0);
            AnonymousClass5Z4 r2 = AnonymousClass5Z4.A03;
            AnonymousClass5Z4 A0D = A0c.A0D(new AnonymousClass5Z4((AnonymousClass5Z2) null, (C268454dQ) null, (AnonymousClass5ZD) null, 0, 0, 16777213, 0, AnonymousClass5Z7.A01(13), 0, 0));
            C287245Zp r8 = C287215Zl.A04;
            Modifier A09 = C287205Zk.A09(C287195Zj.A0B(modifier2, 0.0f, 12.0f, 12.0f, 0.0f), 28.0f);
            boolean A1Q = C51973G9u.A1Q(r0, 1312476476, i3);
            Object ECw = r0.ECw();
            if (A1Q || ECw == AnonymousClass5XT.A00) {
                ECw = C58713IwM.A01(r0, r15, 49);
            }
            C286565Wx r9 = (C286565Wx) r0;
            Modifier A0D2 = G9w.A0D(r0, r9, A09, (C62320sa) ECw);
            AnonymousClass5RD A02 = C287395a4.A02(C287275Zs.A01, r0, r8, 48);
            int A00 = C287425a7.A00(r0);
            AnonymousClass5RM A04 = C286565Wx.A04(r9);
            Modifier A01 = C287435a8.A01(r0, A0D2);
            C51973G9u.A0y(r0, r9);
            C51971G9r.A12(r0, A02, A04);
            0sL r3 = C287485aD.A02;
            if (r9.A0K || !C51972G9s.A1Q(r0, A00)) {
                C51971G9r.A13(r0, r3, A00);
            }
            C51965G9l.A18(r0, A01);
            AnonymousClass6FX r11 = AnonymousClass6FX.A00;
            AnonymousClass2DO A002 = C287975bA.A00(r0, R.drawable.barcelona_search_filled_26, 0);
            long A0D3 = C51966G9m.A0D(r0);
            C285245Qk r6 = Modifier.A00;
            C288165bT.A05(r0, C287205Zk.A0C(C287195Zj.A0B(C287205Zk.A02(C287215Zl.A0A, C287205Zk.A0D(r6, 60.0f)), 3.0f, 0.0f, 9.0f, 0.0f), 12.0f), A002, A0D3);
            String str4 = str;
            C286575Wy r18 = r0;
            AnonymousClass5ZZ.A0M(r18, r11.A00(r6), A0D, str4, i3 & 14, C51966G9m.A0D(r0));
            C286575Wy r82 = r0;
            AnonymousClass5Z4 r92 = A0D;
            String str5 = str3;
            AnonymousClass5ZZ.A0n(r82, r92, str5, (i3 >> 3) & 14, C51966G9m.A0M(r0));
            int i7 = R.drawable.instagram_chevron_right_pano_outline_24;
            if (A1W) {
                i7 = R.drawable.instagram_chevron_left_pano_outline_24;
            }
            C288165bT.A03(r0, C287205Zk.A0C(r6, 12.0f), C287975bA.A00(r0, i7, 0), C51966G9m.A0L(r0));
            if (C51967G9n.A1R(r0)) {
                0fL.A00(1343934881);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9Q(r15, modifier2, str3, str, i5, i4, 3);
        }
    }
}
