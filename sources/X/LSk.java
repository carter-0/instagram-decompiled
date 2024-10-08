package X;

import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class LSk {
    public final UserSession A00;
    public final 0wc A01;
    public final String A02;

    public static final void A03(LSk lSk, String str, String str2, String str3) {
        A02((C60763Jqu) null, lSk, str, str2, str3, (String) null);
    }

    public static final C60763Jqu A00(C46327Dbv dbv, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, List list) {
        Long l;
        Long l2;
        Long l3;
        0bb r2 = new 0bb();
        r2.A06("trial_status", str);
        r2.A06(AnonymousClass000.A00(1624), str2);
        r2.A01(dbv, C273654mx.A00(3067));
        r2.A03("is_auto_open", bool);
        r2.A07("override_conflicting_settings", list);
        r2.A03("is_opened_with_toggle", bool2);
        Long l4 = null;
        if (num != null) {
            l = C51969G9p.A0r(num);
        } else {
            l = null;
        }
        r2.A05("views_count", l);
        if (num2 != null) {
            l2 = C51969G9p.A0r(num2);
        } else {
            l2 = null;
        }
        r2.A05("likes_count", l2);
        if (num3 != null) {
            l3 = C51969G9p.A0r(num3);
        } else {
            l3 = null;
        }
        r2.A05("comments_count", l3);
        if (num4 != null) {
            l4 = C51969G9p.A0r(num4);
        }
        r2.A05("shares_count", l4);
        return r2;
    }

    public static final C60763Jqu A01(C46327Dbv dbv, String str) {
        return A00(dbv, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, AppStateModule.APP_STATE_ACTIVE, str, (List) null);
    }

    public static final void A02(C60763Jqu jqu, LSk lSk, String str, String str2, String str3, String str4) {
        long j;
        Long A10;
        0Aj A0e = AnonymousClass7TE.A0e(lSk.A01, "trial_clips");
        if (A0e.isSampled()) {
            String fbidV2 = DbX.A0m(lSk.A00).getFbidV2();
            if (fbidV2 == null || (A10 = AnonymousClass7TE.A10(fbidV2)) == null) {
                j = 0;
            } else {
                j = A10.longValue();
            }
            A0e.A9F(AnonymousClass000.A00(1247), Long.valueOf(j));
            A0e.AAJ("event_source", str);
            A0e.AAJ("screen", str2);
            A0e.AAJ("event_action", str3);
            A0e.AAJ(Dbe.A00(), lSk.A02);
            A0e.A9F("media_id", DbZ.A0d(str4));
            A0e.AAK(jqu, "event_payload");
            A0e.Cgf();
        }
    }

    public LSk(AnonymousClass0iw r2, UserSession userSession, String str) {
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = AnonymousClass0kN.A01(r2, userSession);
    }
}
