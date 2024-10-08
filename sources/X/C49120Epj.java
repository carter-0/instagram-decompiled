package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Epj  reason: case insensitive filesystem */
public abstract class C49120Epj {
    public static final 1OC A00(C48145EZn eZn, UserSession userSession, Integer num) {
        0qQ.A0B(userSession, 0);
        String str = null;
        String str2 = null;
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        DbU.A1P(A0b, "invites/get_user_invite_message/", new Object[0]);
        if (num != null) {
            str2 = C49119Epi.A00(num);
        }
        A0b.A0G("medium", str2);
        if (eZn != null) {
            str = eZn.A00;
        }
        A0b.A0G("invite_location", str);
        return DbU.A0S(A0b, C47354Dvo.class, F7R.class);
    }
}
