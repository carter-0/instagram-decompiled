package X;

import com.instagram.common.session.UserSession;
import java.util.List;

public final class F25 {
    public final 0wc A00;
    public final UserSession A01;

    public F25(AnonymousClass0iw r2, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A01 = userSession;
        this.A00 = AnonymousClass0kN.A01(r2, userSession);
    }

    public final void A00(EVG evg, Integer num, String str, List list) {
        String str2;
        String str3;
        boolean A1U = AnonymousClass7TF.A1U(0, evg, num);
        0qQ.A0B(list, 2);
        if (182.A06(0Tu.A06, this.A01, 36321241342158014L)) {
            0Aj A0e = AnonymousClass7TE.A0e(this.A00, "instagram_activity_center_bulk_action");
            switch (num.intValue()) {
                case 0:
                    str2 = "load_screen";
                    break;
                case 1:
                    str2 = "feature_click";
                    break;
                case 2:
                    str2 = "media_click";
                    break;
                case 3:
                    str2 = AnonymousClass000.A00(3880);
                    break;
                case 4:
                    str2 = "remove_all_tags";
                    break;
                case 5:
                    str2 = AnonymousClass000.A00(1758);
                    break;
                case 6:
                    str2 = "remove_all_tags_failed";
                    break;
                case 7:
                    str2 = C273654mx.A00(726);
                    break;
                case 8:
                    str2 = "hide_tag_failed";
                    break;
                case 9:
                    str2 = "restore_tag";
                    break;
                case 10:
                    str2 = "restore_tag_failed";
                    break;
                default:
                    str2 = "nux_shown";
                    break;
            }
            DbS.A1J(A0e, str2);
            int ordinal = evg.ordinal();
            if (ordinal == A1U) {
                str3 = "pending_tags";
            } else if (ordinal == 2) {
                str3 = "spam_tags";
            } else if (ordinal != 0) {
                str3 = "";
            } else {
                str3 = "tagged_posts";
            }
            A0e.AAJ("screen", str3);
            A0e.AAJ("interface", "");
            A0e.AAJ("useragent", "");
            A0e.AAe("content_fbids", 0sn.A00);
            A0e.AAe("content_igids", list);
            A0e.AAJ("action_target", str);
            A0e.Cgf();
        }
    }
}
