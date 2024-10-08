package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

public abstract class HXY {
    public static final void A00(Modifier modifier, C286575Wy r4, int i, int i2) {
        int i3;
        r4.ExV(1363996702);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r4, modifier) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !r4.Bwn()) {
            if (i4 != 0) {
                modifier = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(142013120, "com.instagram.compose.ui.notificationbadge.ListBadgeDonut (ListBadgeDonut.kt:14)");
            }
            AnonymousClass6G3.A03(r4, C287205Zk.A0C(modifier, 20.0f), C51967G9n.A0J(r4, R.drawable.list_badge_donut));
            if (0fL.A02()) {
                0fL.A00(74110501);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            JGH.A01(ASQ, modifier, i2, i, 10);
        }
    }
}
