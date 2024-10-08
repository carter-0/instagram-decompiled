package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

public final class KSB extends C63905LBm {
    public C63905LBm A00;

    public final C8779R9f createGooglePlayLocationSettingsController(Activity activity, UserSession userSession, C13673Tei tei, String str, String str2) {
        Activity activity2 = activity;
        0qQ.A0B(activity, 0);
        UserSession userSession2 = userSession;
        C13673Tei tei2 = tei;
        String str3 = str;
        String str4 = str2;
        C51974G9v.A1P(userSession, tei, str, str2);
        C63905LBm lBm = this.A00;
        if (lBm != null) {
            return lBm.createGooglePlayLocationSettingsController(activity2, userSession2, tei2, str3, str4);
        }
        return null;
    }
}
