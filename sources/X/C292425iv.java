package X;

import android.app.Activity;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5iv  reason: invalid class name and case insensitive filesystem */
public abstract class C292425iv {
    public static final void A00(Activity activity, View view, C227762js r12, UserSession userSession) {
        0xa r5 = 1Au.A00(userSession).A01;
        boolean z = false;
        if (r5.getInt("preference_feed_picker_nux_count", 0) < 3) {
            z = true;
        }
        boolean z2 = false;
        if (System.currentTimeMillis() - r5.getLong("preference_feed_picker_nux_last_seen_time", 0) > TimeUnit.DAYS.toMillis(1)) {
            z2 = true;
        }
        if (z && z2 && r12.A01 < 2.0f && 182.A06(0Tu.A05, userSession, 2342156897573931291L)) {
            String string = activity.getString(2131962352);
            0qQ.A07(string);
            AnonymousClass5Gt r2 = new AnonymousClass5Gt(activity, new C315476jx((CharSequence) string));
            r2.A04(view, 0, activity.getResources().getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap), true);
            r2.A04 = new C65374LsF(userSession);
            r2.A07(C283255Gu.A07);
            r2.A00().A07(userSession);
        }
    }
}
