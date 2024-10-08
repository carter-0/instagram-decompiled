package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.HUg  reason: case insensitive filesystem */
public abstract class C54825HUg {
    public static final void A00(C286575Wy r19, Modifier modifier, C62320sa r21, int i, int i2, boolean z) {
        int i3;
        Modifier modifier2 = modifier;
        C62320sa r7 = r21;
        0qQ.A0B(r7, 1);
        C286575Wy r10 = r19;
        r10.ExV(-579012651);
        int i4 = i2;
        int i5 = i;
        boolean z2 = z;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0Y(r10, z2) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0F(r10, r7);
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
                0fL.A01(1083905708, "com.instagram.barcelona.feed.mediaviewer.ui.InstagramCta (InstagramCTA.kt:27)");
            }
            boolean A1O = C51973G9u.A1O(r10, 2099754025, i3);
            Object ECw = r10.ECw();
            if (A1O || ECw == AnonymousClass5XT.A00) {
                ECw = C58713IwM.A01(r10, r7, 4);
            }
            C286565Wx r5 = (C286565Wx) r10;
            Modifier A0B = C287195Zj.A0B(AnonymousClass5R5.A00(G9w.A0D(r10, r5, modifier2, (C62320sa) ECw), C58947J0k.A00, true), 0.0f, 4.0f, 0.0f, 3.5f);
            AnonymousClass5RD A0V = C51968G9o.A0V(r10);
            int A00 = C287425a7.A00(r10);
            AnonymousClass5RM A04 = C286565Wx.A04(r5);
            Modifier A01 = C287435a8.A01(r10, A0B);
            C51973G9u.A0y(r10, r5);
            C51971G9r.A12(r10, A0V, A04);
            0sL r1 = C287485aD.A02;
            if (r5.A0K || !C51972G9s.A1Q(r10, A00)) {
                C51971G9r.A13(r10, r1, A00);
            }
            C51965G9l.A18(r10, A01);
            r10.ExS(1531060145);
            if (!z) {
                AnonymousClass5ZZ.A0K(r10, (Modifier) null, (AnonymousClass5Z4) null, C288035bG.A00(r10, 2131953657), 0, 32754, C51966G9m.A0I(r10), I6L.A00(r10, AnonymousClass5Z7.A01(15)));
            }
            C286565Wx.A0L(r5, false);
            int i7 = R.drawable.barcelona_external_outline_16;
            if (z) {
                i7 = R.drawable.instagram_app_instagram_pano_outline_16;
            }
            AnonymousClass2DO A002 = C287975bA.A00(r10, i7, 0);
            String A003 = C288035bG.A00(r10, 2131953658);
            C285245Qk r52 = Modifier.A00;
            float f = 8.0f;
            if (z) {
                f = 0.0f;
            }
            C288165bT.A08(r10, C287195Zj.A0B(r52, f, 0.0f, 8.0f, 0.0f), A002, A003, AnonymousClass5aQ.A00(r10).A0U);
            if (C51967G9n.A1R(r10)) {
                0fL.A00(52617212);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8R(i5, i4, 2, modifier2, r7, z);
        }
    }
}
