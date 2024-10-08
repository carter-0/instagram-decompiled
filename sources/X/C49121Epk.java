package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Epk  reason: case insensitive filesystem */
public abstract class C49121Epk {
    public static final 1OC A00(UserSession userSession, Integer num, String str, String str2) {
        AnonymousClass7TG.A1T(userSession, str, num);
        0qQ.A0B(str2, 3);
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        DbU.A1P(A0b, "third_party_sharing/%s/get_location_to_share_url/", new Object[]{str});
        A0b.A0C = "create_location_share_url";
        C49792F7a.A01(A0b, userSession, num, str2);
        1Av A00 = 1Au.A00(userSession);
        A0b.A0G("qe_universe_name", DbV.A13(A00, A00.A1A, 1Av.A8a, 379));
        return DbU.A0S(A0b, DvI.class, F7T.class);
    }
}
