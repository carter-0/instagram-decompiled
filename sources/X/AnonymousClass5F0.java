package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.5F0  reason: invalid class name */
public final class AnonymousClass5F0 {
    public static final AnonymousClass5F0 A00 = new Object();

    public static final boolean A00(UserSession userSession, 1Xj r6, String str) {
        if (!str.equals("feed_timeline") && ((!str.equals("feed_contextual_chain") && !str.equals("feed_contextual_profile")) || !182.A06(0Tu.A05, userSession, 36326588576773991L))) {
            return false;
        }
        boolean CcK = r6.CcK();
        0Tu r2 = 0Tu.A05;
        if (CcK) {
            boolean A06 = 182.A06(r2, userSession, 36326588576642917L);
            0qQ.A0A(Boolean.valueOf(A06));
            return A06;
        } else if (!182.A06(r2, userSession, 2342169597790533480L) || !182.A06(r2, userSession, 36326588576642917L)) {
            return false;
        } else {
            return true;
        }
    }

    public final int A01(Context context, UserSession userSession, 1Xj r6, String str) {
        Resources resources;
        int i;
        0qQ.A0B(r6, 1);
        0qQ.A0B(str, 3);
        if (C282835Ex.A00.A06(userSession, r6, str)) {
            resources = context.getResources();
            i = R.dimen.audience_selector_pill_layout_height;
        } else if (A00(userSession, r6, str)) {
            return (int) 0nA.A04(context, (int) 182.A00(0Tu.A05, userSession, 37171013506564638L));
        } else {
            resources = context.getResources();
            i = R.dimen.account_group_management_title_text_horizontal_padding;
        }
        return resources.getDimensionPixelSize(i);
    }
}
