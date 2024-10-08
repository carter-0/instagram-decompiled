package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.compose.core.ui.IgClickableTextKt;

/* renamed from: X.Ha9  reason: case insensitive filesystem */
public abstract class C54976Ha9 {
    public static final void A00(C286575Wy r34, ImageUrl imageUrl, String str, String str2, C62320sa r38, int i, boolean z) {
        int i2;
        ImageUrl imageUrl2 = imageUrl;
        String str3 = str;
        String str4 = str2;
        boolean A1b = C51973G9u.A1b(str3, str4, imageUrl2);
        C62320sa r32 = r38;
        0qQ.A0B(r32, 4);
        C286575Wy r3 = r34;
        r3.ExV(-1888862545);
        int i3 = i;
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r3, str3) | i;
        } else {
            i2 = i3;
        }
        if ((i & 112) == 0) {
            i2 |= G9t.A0P(r3, str4);
        }
        if ((i3 & 896) == 0) {
            i2 |= G9t.A0Q(r3, imageUrl2);
        }
        boolean z2 = z;
        if ((i3 & 7168) == 0) {
            i2 |= G9t.A0b(r3, z2);
        }
        if ((57344 & i) == 0) {
            i2 |= G9t.A0I(r3, r32);
        }
        if ((46811 & i2) != 9362 || !r3.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1250114040, "com.instagram.fanclub.view.GuidanceRecommendationRow (GuidanceRecommendationRow.kt:38)");
            }
            C303876Bd A0L = C51972G9s.A0L(str3);
            if (00l.A0d(str3, str4, false)) {
                int A0G = C51971G9r.A0G(str3, str4);
                int A05 = C51966G9m.A05(str4, A0G);
                A0L.A06(new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, AnonymousClass5ZD.A01, (C291795ht) null, 65531, 0, 0, 0), A0G, A05);
                A0L.A0A(str4, "Bold username", A0G, A05);
            }
            C286025Tq A02 = A0L.A02();
            C285245Qk r7 = Modifier.A00;
            Modifier A0V = C51966G9m.A0V(C51967G9n.A0H(C287635aW.A05(r7, (C287625aV) null, (String) null, r32, A1b), 16.0f));
            AnonymousClass5RD A0W = C51968G9o.A0W(r3);
            int A00 = C287425a7.A00(r3);
            C286565Wx r6 = (C286565Wx) r3;
            AnonymousClass5RM A04 = C286565Wx.A04(r6);
            Modifier A01 = C287435a8.A01(r3, A0V);
            C62320sa r8 = C287485aD.A00;
            C51973G9u.A0z(r3, r6, r8);
            0sL r5 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r3, A0W, A04, r5);
            0sL r4 = C287485aD.A02;
            if (r6.A0K || !C51972G9s.A1Q(r3, A00)) {
                C51971G9r.A13(r3, r4, A00);
            }
            0sL A1K = C51966G9m.A1K(r3, A01);
            AnonymousClass6FX r15 = AnonymousClass6FX.A00;
            AnonymousClass6G3.A09(r3, C51968G9o.A0P(C287205Zk.A08(C287205Zk.A0D(r7, 62.0f), 72.0f), 4.0f), C51966G9m.A0o(r3, imageUrl2, i2 >> 6), C288075bK.A00);
            C286575Wy r19 = r3;
            IgClickableTextKt.A02(r19, r15.A00(C287195Zj.A0B(r7, 12.0f, 0.0f, 0.0f, 0.0f)), A02, C51966G9m.A0c(r3), J3A.A00, 0, 0, 24576, 112632, C51966G9m.A0H(r3));
            r3.ExS(1624595742);
            if (z) {
                Modifier A0E = C51967G9n.A0E(r7, 12.0f);
                AnonymousClass5RD A0a = C51966G9m.A0a(false);
                int A002 = C287425a7.A00(r3);
                AnonymousClass5RM A042 = C286565Wx.A04(r6);
                Modifier A012 = C287435a8.A01(r3, A0E);
                C51973G9u.A0z(r3, r6, r8);
                C287595aO.A00(r3, A0a, r5);
                if (C51965G9l.A1Y(r3, r6, A042, A0w) || !C51972G9s.A1Q(r3, A002)) {
                    C51971G9r.A13(r3, r4, A002);
                }
                C287595aO.A00(r3, A012, A1K);
                C288165bT.A04(r3, C287205Zk.A0C(r7, 16.0f), C287975bA.A00(r3, R.drawable.instagram_circle_check_pano_filled_16, 0), AnonymousClass5aQ.A00(r3).A10);
                r3.ASN();
            }
            if (C51971G9r.A1S(r3, r6, false)) {
                0fL.A00(-32735367);
            }
        } else {
            r3.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9R(imageUrl2, r32, str3, str4, i3, 0, z2);
        }
    }
}
