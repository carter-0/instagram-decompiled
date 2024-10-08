package X;

import android.location.Location;
import com.instagram.common.session.UserSession;

public abstract class A1D {
    public static final 1OC A00(UserSession userSession, String str, String str2) {
        Location location;
        UserSession userSession2 = userSession;
        boolean A1Z = AnonymousClass7TG.A1Z(userSession, str);
        String str3 = null;
        1NY r2 = new 1NY(userSession, -2);
        1Wr r5 = 1Wr.A00;
        String str4 = null;
        if (r5 != null) {
            location = r5.getLastLocation(userSession2, 10800000, 50000.0f, A1Z, "HashtagSearchApi");
        } else {
            location = null;
        }
        r2.A05();
        r2.A0A("tags/search/");
        r2.A9m("q", str);
        r2.A9m("count", String.valueOf(50));
        if (location != null) {
            str3 = Double.valueOf(location.getLatitude()).toString();
        }
        r2.A9m("lat", str3);
        if (location != null) {
            str4 = Double.valueOf(location.getLongitude()).toString();
        }
        r2.A9m("lng", str4);
        r2.A9m(C66579MXk.A00(41), str2);
        r2.A0G("timezone_offset", String.valueOf(1G0.A00()));
        r2.A0Q(CGW.class, D2V.class);
        return r2.A0M();
    }
}
