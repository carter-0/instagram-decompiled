package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.736  reason: invalid class name */
public final class AnonymousClass736 {
    public static final AnonymousClass736 A00 = new Object();

    public static final void A03(AnonymousClass0iw r2, UserSession userSession, Boolean bool, String str) {
        0qQ.A0B(userSession, 0);
        0wc A01 = AnonymousClass0kN.A01(r2, userSession);
        0Aj A002 = A01.A00(A01.A00, "edit_link_menu_remove_link_clicked");
        if (A002.isSampled()) {
            A002.A7p("is_primary", bool);
            A002.AAJ("link_type", str);
            A002.A9F("userid", 00y.A0n(10, userSession.A06));
            A002.Cgf();
        }
    }

    public static final void A04(AnonymousClass0iw r1, UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        0wc A01 = AnonymousClass0kN.A01(r1, userSession);
        0Aj A002 = A01.A00(A01.A00, "fb_show_profile_dialog_add_clicked");
        if (A002.isSampled()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("flow", str);
            A002.A9H("extra_data_map", linkedHashMap);
            A002.Cgf();
        }
    }

    public static final void A05(AnonymousClass0iw r1, UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        0wc A01 = AnonymousClass0kN.A01(r1, userSession);
        0Aj A002 = A01.A00(A01.A00, "fb_show_profile_dialog_cancel_clicked");
        if (A002.isSampled()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("flow", str);
            A002.A9H("extra_data_map", linkedHashMap);
            A002.Cgf();
        }
    }

    public final void A08(Context context, De0 de0, AnonymousClass0iw r6, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        0wc A01 = AnonymousClass0kN.A01(r6, userSession);
        0Aj A002 = A01.A00(A01.A00, "add_facebook_banner_to_featured");
        if (A002.isSampled()) {
            A002.A8M(de0, "link_type");
            A002.A9H("extra_data_map", A00(context, userSession, (Map) null));
            A002.Cgf();
        }
    }

    public final void A09(Context context, De0 de0, AnonymousClass0iw r6, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        0wc A01 = AnonymousClass0kN.A01(r6, userSession);
        0Aj A002 = A01.A00(A01.A00, "remove_facebook_banner_to_featured");
        if (A002.isSampled()) {
            A002.A8M(de0, "link_type");
            A002.A9H("extra_data_map", A00(context, userSession, (Map) null));
            A002.Cgf();
        }
    }

    public final void A0D(AnonymousClass0iw r12, UserSession userSession, Boolean bool, String str, Map map) {
        Long l;
        AnonymousClass0iw r5 = r12;
        UserSession userSession2 = userSession;
        0wc A01 = AnonymousClass0kN.A01(r12, userSession);
        0Aj A002 = A01.A00(A01.A00, "profile_link_menu_open");
        if (A002.isSampled()) {
            if (str != null) {
                l = 00y.A0n(10, str);
            } else {
                l = null;
            }
            A002.A9F("profile_owner_id", l);
            A002.A7p("is_enhanced", Boolean.valueOf(bool.equals(true)));
            A002.A9H("extra_data_map", map);
            A002.Cgf();
        }
        if (bool.equals(true)) {
            A07(r5, userSession2, "viewer", "click", "ig_profile", AnonymousClass000.A00(523));
        }
    }

    public final void A0E(AnonymousClass0iw r10, UserSession userSession, String str, int i, boolean z, boolean z2, boolean z3) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        AnonymousClass0iw r3 = r10;
        0wc A01 = AnonymousClass0kN.A01(r10, userSession);
        0Aj A002 = A01.A00(A01.A00, "edit_link_existing_link_clicked");
        if (A002.isSampled()) {
            A002.A7p("is_primary", Boolean.valueOf(z));
            A002.AAJ("link_type", str);
            A002.A9F("link_index", Long.valueOf((long) i));
            A002.A7p("is_enhanced", Boolean.valueOf(z2));
            A002.A7p("is_pinned", Boolean.valueOf(z3));
            A002.Cgf();
        }
        if (z2) {
            A07(r3, userSession2, "subscriber", "click", "ig_profile_edit_link_list_page", "edit_button");
        }
    }

    public final void A0F(AnonymousClass0iw r10, UserSession userSession, String str, boolean z) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        AnonymousClass0iw r3 = r10;
        0wc A01 = AnonymousClass0kN.A01(r10, userSession);
        0Aj A002 = A01.A00(A01.A00, "edit_link_add_link_clicked");
        if (A002.isSampled()) {
            A002.AAJ("link_type", str);
            A002.A7p("is_enhanced", Boolean.valueOf(z));
            A002.Cgf();
        }
        if (z) {
            A07(r3, userSession2, "subscriber", "click", "ig_profile_edit_link_list_page", "add_button");
        }
    }

    public static final Map A00(Context context, UserSession userSession, Map map) {
        if (context != null) {
            if (map != null) {
                map = new LinkedHashMap(map);
            } else {
                map = new LinkedHashMap();
            }
            boolean A0B = 0oI.A0B(context);
            String str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            String str2 = "0";
            if (A0B) {
                str2 = str;
            }
            map.put("is_fb_app_installed", str2);
            if (!AnonymousClass8PU.A08(userSession)) {
                str = "0";
            }
            map.put("is_fb_linked", str);
        }
        return map;
    }

    public static final void A01(AnonymousClass0iw r4, UserSession userSession) {
        0qQ.A0B(userSession, 0);
        0wc A01 = AnonymousClass0kN.A01(r4, userSession);
        0Aj A002 = A01.A00(A01.A00, "edit_link_cancel_clicked");
        if (A002.isSampled()) {
            A002.AAJ("link_type", "external");
            A002.Cgf();
        }
    }

    public static final void A02(AnonymousClass0iw r4, UserSession userSession) {
        0qQ.A0B(userSession, 0);
        0wc A01 = AnonymousClass0kN.A01(r4, userSession);
        0Aj A002 = A01.A00(A01.A00, "edit_link_done_clicked");
        if (A002.isSampled()) {
            A002.AAJ("link_type", "external");
            A002.Cgf();
        }
    }

    public static final void A07(AnonymousClass0iw r5, UserSession userSession, String str, String str2, String str3, String str4) {
        long j;
        Long A0n = 00y.A0n(10, userSession.A06);
        if (A0n != null) {
            j = A0n.longValue();
        } else {
            j = 0;
        }
        0wc A01 = AnonymousClass0kN.A01(r5, userSession);
        0Aj A002 = A01.A00(A01.A00, AnonymousClass000.A00(4863));
        if (A002.isSampled()) {
            A002.AAJ("event_type", str2);
            A002.AAJ(AnonymousClass000.A00(4527), "ENHANCED_LINK_SHEET");
            A002.AAJ(AnonymousClass000.A00(5299), str);
            A002.AAJ("object_type", str4);
            A002.A9F(AnonymousClass000.A00(5115), Long.valueOf(j));
            A002.AAJ("surface", str3);
            A002.Cgf();
        }
    }

    public final void A0A(Context context, De0 de0, UserSession userSession, String str, boolean z, boolean z2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str2 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        String str3 = "0";
        if (z) {
            str3 = str2;
        }
        linkedHashMap.put("target_has_hardlink_info", str3);
        if (!z2) {
            str2 = "0";
        }
        linkedHashMap.put("is_from_banners", str2);
        0wc A02 = AnonymousClass0kN.A02(userSession);
        0Aj A002 = A02.A00(A02.A00, "facebook_link_impression");
        if (A002.isSampled()) {
            A002.A9F("profile_owner_id", 00y.A0n(10, str));
            A002.A8M(de0, "link_type");
            A002.A9H("extra_data_map", A00(context, userSession, linkedHashMap));
            A002.Cgf();
        }
    }

    public static final void A06(AnonymousClass0iw r1, UserSession userSession, String str) {
        Long A0n;
        0wc A01 = AnonymousClass0kN.A01(r1, userSession);
        0Aj A002 = A01.A00(A01.A00, "profile_link_viewed");
        if (A002.isSampled() && (A0n = 00y.A0n(10, str)) != null) {
            A002.A9F("profile_owner_id", A0n);
            A002.Cgf();
        }
    }

    public final void A0B(Context context, AnonymousClass0iw r6, UserSession userSession, String str, String str2, Map map) {
        Long l;
        0wc A01 = AnonymousClass0kN.A01(r6, userSession);
        0Aj A002 = A01.A00(A01.A00, "profile_link_clicked");
        if (A002.isSampled()) {
            A002.AAJ("link_type", str);
            A002.A9F("userid", 00y.A0n(10, userSession.A06));
            if (str2 != null) {
                l = 00y.A0n(10, str2);
            } else {
                l = null;
            }
            A002.A9F("profile_owner_id", l);
            A002.A9H("extra_data_map", A00(context, userSession, map));
            A002.Cgf();
        }
    }

    public final void A0C(Context context, AnonymousClass0iw r6, UserSession userSession, String str, String str2, Map map) {
        Long l;
        0wc A01 = AnonymousClass0kN.A01(r6, userSession);
        0Aj A002 = A01.A00(A01.A00, "profile_link_menu_clicked");
        if (A002.isSampled()) {
            A002.AAJ("link_type", str);
            A002.A9F("userid", 00y.A0n(10, userSession.A06));
            if (str2 != null) {
                l = 00y.A0n(10, str2);
            } else {
                l = null;
            }
            A002.A9F("profile_owner_id", l);
            A002.A9H("extra_data_map", A00(context, userSession, map));
            A002.Cgf();
        }
    }
}
