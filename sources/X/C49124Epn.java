package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Epn  reason: case insensitive filesystem */
public abstract class C49124Epn {
    public static final 1OC A00(UserSession userSession, Integer num, String str, String str2) {
        0qQ.A0B(userSession, 0);
        AnonymousClass7TG.A1O(str, num);
        0qQ.A0B(str2, 3);
        if (00l.A0d(str, " ", false)) {
            return null;
        }
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        DbU.A1P(A0b, "third_party_sharing/%s/get_profile_to_share_url/", new Object[]{str});
        A0b.A0C = "create_profile_share_url";
        C49792F7a.A01(A0b, userSession, num, str2);
        1Av A00 = 1Au.A00(userSession);
        A0b.A0G("qe_universe_name", DbV.A13(A00, A00.A1A, 1Av.A8a, 379));
        return DbT.A0R((15p) null, A0b, DvK.class, F7W.class, false);
    }
}
