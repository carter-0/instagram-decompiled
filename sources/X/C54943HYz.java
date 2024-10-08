package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.HYz  reason: case insensitive filesystem */
public abstract class C54943HYz {
    public static final void A00(Modifier modifier, C286575Wy r6, int i, int i2) {
        int i3;
        r6.ExV(167942937);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = G9t.A0O(r6, modifier) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) != 2 || !r6.Bwn()) {
            if (i4 != 0) {
                modifier = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(299774876, "com.instagram.creator.achievements.modules.views.LoadingSpinner (LoadingSpinner.kt:11)");
            }
            AnonymousClass5RD A0Y = C51970G9q.A0Y();
            int A00 = C287425a7.A00(r6);
            C286565Wx r3 = (C286565Wx) r6;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r6, modifier);
            C51973G9u.A0y(r6, r3);
            C51971G9r.A12(r6, A0Y, A04);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r6, A00)) {
                C51971G9r.A13(r6, r1, A00);
            }
            C51965G9l.A18(r6, A01);
            GQD.A00(r6, C51965G9l.A0L(C289515dj.A00, Modifier.A00));
            if (C51967G9n.A1R(r6)) {
                0fL.A00(707234046);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            JGH.A01(ASQ, modifier, i2, i, 15);
        }
    }
}
