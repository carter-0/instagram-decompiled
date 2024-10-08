package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.android.maps.StaticMapView;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.maps.ui.IgStaticMapView;

public abstract class DdU {
    public static final String A00(Context context, double d, double d2) {
        0qQ.A0B(context, 0);
        StaticMapView.StaticMapOptions staticMapOptions = new StaticMapView.StaticMapOptions("review_suspicious_login_map");
        staticMapOptions.A01(d, d2);
        staticMapOptions.A03(11);
        return DbT.A10(IgStaticMapView.A00(context.getResources(), staticMapOptions, 2R6.A03, C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION, C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION));
    }

    public static final void A01(UserSession userSession, FragmentActivity fragmentActivity) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        UserSession userSession2 = userSession;
        AnonymousClass7TF.A1H(userSession, fragmentActivity2);
        if (DbY.A1a(userSession)) {
            C49955FGk.A05((IgFragmentActivity) fragmentActivity2, DbS.A0O("login_notification"), userSession2, "login_activities", "login_activities", false);
        } else {
            DbY.A14(new NKT(), fragmentActivity2, userSession);
        }
    }
}
