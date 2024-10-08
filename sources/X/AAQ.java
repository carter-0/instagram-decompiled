package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public abstract class AAQ {
    public static final void A00(UserSession userSession, C247733gp r5, String str) {
        0qQ.A0B(userSession, 0);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "igwb_manually_hidden_comments_action_falco_event");
        A0e.AAJ("action", "ig_wellbeing_hidden_comments_adoption");
        A0e.AAJ("step", str);
        A0e.A9F("thread_fbid", (Long) null);
        if (r5 != null) {
            String str2 = r5.A0E;
            if (str2 != null) {
                A0e.AAJ("media_id", str2);
            }
            String str3 = r5.A0G;
            if (str3 != null) {
                A0e.A9F("comment_id", AnonymousClass7TE.A10(str3));
            }
            String str4 = r5.A0F;
            if (str4 != null) {
                A0e.A9F(AnonymousClass000.A00(734), AnonymousClass7TE.A10(str4));
            }
            User user = r5.A08;
            if (user != null) {
                A0e.A9F("target_user_id", Long.valueOf(Long.parseLong(user.getId())));
            }
        }
        A0e.Cgf();
    }

    public static final void A01(UserSession userSession, C247733gp r5, String str) {
        0qQ.A0B(userSession, 0);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "igwb_manually_hidden_comments_action_falco_event");
        A0e.AAJ("action", "ig_wellbeing_hidden_comments_impression");
        A0e.AAJ("step", str);
        A0e.A9F("thread_fbid", (Long) null);
        if (r5 != null) {
            String str2 = r5.A0E;
            if (str2 != null) {
                A0e.AAJ("media_id", str2);
            }
            String str3 = r5.A0G;
            if (str3 != null) {
                A0e.A9F("comment_id", AnonymousClass7TE.A10(str3));
            }
            String str4 = r5.A0F;
            if (str4 != null) {
                A0e.A9F(AnonymousClass000.A00(734), AnonymousClass7TE.A10(str4));
            }
            User user = r5.A08;
            if (user != null) {
                A0e.A9F("target_user_id", Long.valueOf(Long.parseLong(user.getId())));
            }
        }
        A0e.Cgf();
    }
}
