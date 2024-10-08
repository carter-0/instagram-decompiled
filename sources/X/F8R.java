package X;

import com.instagram.common.session.UserSession;

public abstract class F8R {
    public static final void A01(AnonymousClass0iw r1, UserSession userSession, Integer num) {
        String str;
        0Aj A0e = AnonymousClass7TE.A0e(DbT.A0Q(r1, userSession, 1), "instagram_activity_center_bulk_action");
        if (A0e.isSampled()) {
            DbS.A1J(A0e, "feature_click");
            A0e.AAJ("screen", "not_an_ac_screen");
            A0e.AAJ("interface", "");
            A0e.AAJ("useragent", "");
            0sn r12 = 0sn.A00;
            A0e.AAe("content_fbids", r12);
            A0e.AAe("content_igids", r12);
            A0e.AAJ("action_target", "shared_activity");
            if (num.intValue() != 0) {
                str = "profile_see_more_menu";
            } else {
                str = "user_following_list";
            }
            DbV.A1I(A0e, str);
        }
    }

    public static final void A00(AnonymousClass0iw r1, UserSession userSession, C270394gf r3, Integer num, String str) {
        String str2;
        AnonymousClass7TG.A1O(userSession, r1);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r1, userSession), "instagram_activity_center_bulk_action");
        if (A0e.isSampled()) {
            switch (num.intValue()) {
                case 0:
                    str2 = "unlike";
                    break;
                case 1:
                    str2 = "delete";
                    break;
                default:
                    str2 = C273654mx.A00(544);
                    break;
            }
            DbS.A1J(A0e, str2);
            A0e.AAJ("screen", r3.A00);
            A0e.AAJ("interface", "");
            A0e.AAJ("useragent", "");
            A0e.AAe("content_fbids", 0sn.A00);
            A0e.AAe("content_igids", AnonymousClass7TE.A1I(str));
            DbV.A1I(A0e, (String) null);
        }
    }
}
