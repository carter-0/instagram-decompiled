package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

public abstract class HUK {
    public static final void A00(C286575Wy r16, Modifier modifier, int i) {
        int i2;
        Modifier modifier2 = modifier;
        0qQ.A0B(modifier2, 0);
        C286575Wy r8 = r16;
        r8.ExV(1238903169);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r8, modifier2) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 3) != 2 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-2033080416, "com.instagram.archive.updateshub.UpdatesHubEmptyState (UpdatesHubEmptyState.kt:24)");
            }
            AnonymousClass5RD A0M = C51975G9x.A0M(r8, C287215Zl.A00, i2);
            int A00 = C287425a7.A00(r8);
            C286565Wx r5 = (C286565Wx) r8;
            AnonymousClass5RM A04 = C286565Wx.A04(r5);
            Modifier A01 = C287435a8.A01(r8, modifier2);
            C51973G9u.A0y(r8, r5);
            C51971G9r.A12(r8, A0M, A04);
            0sL r3 = C287485aD.A02;
            if (r5.A0K || !C51972G9s.A1Q(r8, A00)) {
                C51971G9r.A13(r8, r3, A00);
            }
            C51965G9l.A18(r8, A01);
            C285245Qk r2 = Modifier.A00;
            C288165bT.A00(r8, C287195Zj.A0B(r2, 0.0f, 0.0f, 0.0f, 16.0f), C287975bA.A00(r8, R.drawable.instagram_users_outline_96, 0), 432, 24, 0);
            C286575Wy r13 = r8;
            AnonymousClass5ZZ.A0R(r13, C287195Zj.A0B(r2, 0.0f, 0.0f, 0.0f, 12.0f), AnonymousClass5aQ.A01(r8).A04, "No Lately stories to show", C51966G9m.A0H(r8));
            AnonymousClass5ZZ.A0O(r8, C51966G9m.A0T(r2), C51966G9m.A0c(r8), "When followers you follow back share stories from the last 7 days to their Lately, you’ll see them here.", 54, C51966G9m.A0H(r8));
            if (C51967G9n.A1R(r8)) {
                0fL.A00(2124035330);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            JGC.A01(ASQ, modifier2, i3, 18);
        }
    }
}
