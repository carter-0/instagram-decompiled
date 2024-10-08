package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.90s  reason: invalid class name and case insensitive filesystem */
public abstract class C3724090s {
    public static 1NY A00(UserSession userSession, Integer num, String str) {
        1NY r2 = new 1NY(userSession);
        r2.A08(AnonymousClass05K.A0N);
        r2.A0A(StringFormatUtil.formatStrLocaleSafe(AnonymousClass000.A00(3552), str));
        r2.A07(num);
        r2.A0R(1XO.class, 1XW.class);
        return r2;
    }

    public static 1OC A01(UserSession userSession, Iterable iterable, boolean z, boolean z2) {
        1NY r2 = new 1NY(userSession);
        r2.A08(AnonymousClass05K.A0N);
        r2.A0A(AnonymousClass000.A00(5029));
        r2.A9m("media_ids", new C239023El(",").A02(iterable));
        r2.A0R(1XO.class, 1XW.class);
        if (z) {
            r2.A9m("disable_preview_comments", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
        if (z2) {
            r2.A9m(AnonymousClass000.A00(657), RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
        return r2.A0M();
    }

    public static 1OC A02(UserSession userSession, String str) {
        1NY r2 = new 1NY(userSession);
        r2.A08(AnonymousClass05K.A0N);
        r2.A0K("media/%s/comment_info/", new Object[]{str});
        r2.A0R(CFL.class, D1G.class);
        return r2.A0M();
    }

    public static 1OC A03(UserSession userSession, String str) {
        1NY r2 = new 1NY(userSession);
        r2.A05();
        r2.A0K("media/%s/deleted_info/", new Object[]{str});
        r2.A0R(1XO.class, 1XW.class);
        return r2.A0M();
    }

    public static 1OC A04(UserSession userSession, String str) {
        return A00(userSession, AnonymousClass05K.A00, str).A0M();
    }

    public static 1OC A05(UserSession userSession, String str, String str2, String str3) {
        1NY r3 = new 1NY(userSession);
        r3.A08(AnonymousClass05K.A0N);
        r3.A0A("discover/media_metadata/");
        r3.A9m("media_id", str);
        r3.A0R(NH2.class, C66910Met.class);
        if (str2 != null && ((str2.equals("profile") && 182.A06(0Tu.A05, userSession, 36324737448489284L)) || str2.equals("explore") || str2.equals("explore_1x2"))) {
            r3.A9m("surface", str2);
        }
        if (str3 != null) {
            r3.A9m("target_user_id", str3);
        }
        return r3.A0M();
    }

    public static void A06(1NY r1, String str) {
        if (str != null) {
            r1.A9m("max_id", str);
        }
    }
}
