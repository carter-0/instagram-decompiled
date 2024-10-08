package X;

import com.instagram.common.session.UserSession;
import java.util.AbstractMap;

public abstract class VI2 {
    public static void A00(0Aj r4, UserSession userSession, String str, AbstractMap abstractMap) {
        String str2 = (String) abstractMap.get("ad_id");
        Long l = null;
        if (str2 != null) {
            try {
                l = Long.valueOf(Long.parseLong(str2));
            } catch (NumberFormatException unused) {
            }
        }
        r4.A9F("ad_id", l);
        String str3 = userSession.A06;
        Long l2 = null;
        if (str3 != null) {
            try {
                l2 = Long.valueOf(Long.parseLong(str3));
            } catch (NumberFormatException unused2) {
            }
        }
        r4.A9F("ig_userid", l2);
        r4.AAJ("ad_tracking_token", (String) abstractMap.get("ad_tracking_token"));
        r4.AAJ("page_id", str);
        String str4 = (String) abstractMap.get(AnonymousClass000.A00(3266));
        Long l3 = null;
        if (str4 != null) {
            try {
                l3 = Long.valueOf(Long.parseLong(str4));
            } catch (NumberFormatException unused3) {
            }
        }
        r4.A9F("iab_dwell_time_in_ms", l3);
    }
}
