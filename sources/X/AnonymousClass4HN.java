package X;

import com.instagram.common.session.UserSession;
import java.util.TimeZone;

/* renamed from: X.4HN  reason: invalid class name */
public final class AnonymousClass4HN {
    public final UserSession A00;

    public AnonymousClass4HN(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final Object A00(String str, String str2, String str3, String str4, AnonymousClass4D7 r14, boolean z, boolean z2) {
        String str5;
        String str6;
        UserSession userSession = this.A00;
        String str7 = null;
        1NY r4 = new 1NY(userSession, -2);
        r4.A08(AnonymousClass05K.A0N);
        r4.A0A("news/inbox/");
        r4.A0O = z2;
        r4.A02 = new 1NS(new 0bH(userSession), AnonymousClass5OR.class);
        if (str2 == null) {
            str5 = "";
        } else {
            str5 = str2;
        }
        r4.A0A = 002.A0i("news/inbox/", str5, str, '/');
        r4.A07(AnonymousClass05K.A0Y);
        r4.A9m("mark_as_seen", "false");
        r4.A9m("timezone_offset", String.valueOf(1G0.A00()));
        r4.A9m("timezone_name", TimeZone.getDefault().getID());
        r4.A0G("max_id", str);
        r4.A0G("pagination_first_record_timestamp", str4);
        r4.A0E("should_skip_su", Boolean.valueOf(182.A06(0Tu.A05, userSession, 36330552831263412L)));
        r4.A0G("selected_filters", str2);
        if (0qQ.A0K(str2, "professional")) {
            str7 = "pro";
        }
        r4.A0G("feed_type", str7);
        r4.A0G("last_checked", str3);
        r4.A9m("could_truncate_feed", "true");
        if (!AnonymousClass5OS.A00(userSession) || !C283115Ge.A00(userSession).A02()) {
            str6 = null;
        } else {
            str6 = "suspicious_login";
        }
        r4.A0G("excluded_notification_types", str6);
        C62880wX r6 = userSession.A03;
        r4.A9m("threads_app_version", 0oI.A05(r6.A06(), "com.instagram.barcelona"));
        r4.A00 = 4500;
        if (!AnonymousClass0oH.A01(r6.A06())) {
            r4.A9m("push_disabled", "true");
        }
        if (z) {
            r4.A09 = AnonymousClass05K.A01;
        }
        return r4.A0M().A02(r14, 1780311179, 3, false);
    }
}
