package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.Map;

public abstract class LHX {
    public static final void A00(Context context, View view, Fragment fragment, UserSession userSession, Map map) {
        0qQ.A0B(userSession, 1);
        if (view.isEnabled()) {
            view.setEnabled(false);
            C360678ey A05 = C359988do.A05(userSession, "com.instagram.branded_content.screens.post_level_age_geo_gating_load_screen", map);
            A05.A00(new C15411UcN(1, context, view, fragment, userSession));
            ((AnonymousClass4D6) fragment).schedule(A05);
        }
    }

    public static final void A01(Context context, View view, Fragment fragment, UserSession userSession, Map map) {
        boolean A1X = DbW.A1X(userSession);
        if (view.isEnabled()) {
            view.setEnabled(A1X);
            C360678ey A05 = C359988do.A05(userSession, "com.instagram.branded_content.screens.post_level_country_gating_load_screen", map);
            A05.A00(new C15411UcN(2, context, view, fragment, userSession));
            ((AnonymousClass4D6) fragment).schedule(A05);
        }
    }
}
