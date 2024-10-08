package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.Eow  reason: case insensitive filesystem */
public abstract class C49078Eow {
    public static final E5U A00(UserSession userSession, String str, String str2) {
        E5U e5u = new E5U();
        Bundle A0a = AnonymousClass7TE.A0a();
        C227642jf.A04(A0a, userSession);
        A0a.putString("ProfileNotificationsSettingsFragment.ARG_DISPLAYED_USER_ID", str);
        A0a.putBoolean("ProfileNotificationsSettingsFragment.ARG_IS_FOR_IGTV_PROFILE", false);
        A0a.putString("ProfileNotificationsSettingsFragment.CLICK_POINT", str2);
        e5u.setArguments(A0a);
        return e5u;
    }
}
