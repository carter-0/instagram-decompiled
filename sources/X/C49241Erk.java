package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.Erk  reason: case insensitive filesystem */
public abstract class C49241Erk {
    public static final void A00(C58840Ae r5, UserSession userSession, User user, String str, String str2, String str3) {
        0qQ.A0B(userSession, 1);
        HashMap A0q = DbZ.A0q();
        0Aj A0e = AnonymousClass7TE.A0e((0wc) r5, "ig_wellbeing_mention_controls_action");
        A0e.A9F("actor_ig_userid", Long.valueOf(userSession.A06));
        A0e.AAJ("entrypoint", str);
        DbS.A1J(A0e, str2);
        DbS.A1H(A0e, str3);
        A0e.A7p("is_user_mentionable_value_consistent", true);
        A0e.A9H("extra_values", A0q);
        if (user != null) {
            A0e.A9F("ig_userid", Long.valueOf(user.getId()));
            A0e.A7p("is_user_mentionable", Boolean.valueOf(user.A2G()));
            A0e.A7p(AnonymousClass000.A00(311), Boolean.valueOf(AnonymousClass2f1.A00(userSession).A0Q(user)));
        }
        A0e.Cgf();
    }
}
