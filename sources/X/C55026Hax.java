package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.Hax  reason: case insensitive filesystem */
public abstract class C55026Hax {
    public static 1OC A00(UserSession userSession, 1Xj r3, Hashtag hashtag) {
        1NY A0N = DbU.A0N(userSession);
        A0N.A0A("tags/hashtag_media_report/");
        A0N.A9m("m_pk", r3.getId());
        A0N.A9m("h_id", hashtag.getId());
        A0N.A9m("tag", hashtag.getName());
        A0N.A0R(1XP.class, 1XY.class);
        return DbW.A0K(A0N);
    }
}
