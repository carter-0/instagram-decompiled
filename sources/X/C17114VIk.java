package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.VIk  reason: case insensitive filesystem */
public abstract class C17114VIk {
    public static C15374UbS A00(UserSession userSession, XCE xce, UpcomingEvent upcomingEvent, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(userSession, 0);
        C15374UbS ubS = new C15374UbS();
        Bundle bundle = new Bundle();
        C227642jf.A04(bundle, userSession);
        bundle.putParcelable("upcoming_event", upcomingEvent);
        bundle.putBoolean("coming_from_sticker", z);
        bundle.putString("prior_module", str2);
        bundle.putString("media_pk", str);
        bundle.putString("source_of_action", str3);
        bundle.putBoolean("disable_offsite_link", z2);
        bundle.putBoolean("disable_snackbar", z3);
        ubS.setArguments(bundle);
        if (xce != null) {
            ubS.A02 = xce;
        }
        return ubS;
    }
}
