package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.EjK  reason: case insensitive filesystem */
public abstract class C48735EjK {
    public static final 1OC A00(UserSession userSession, List list) {
        0qQ.A0B(userSession, 1);
        String A02 = C239023El.A00(',').A02(list);
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0A("media/infos/");
        A0b.A9m("media_ids", A02);
        A0b.A9m("ranked_content", "true");
        A0b.A9m("include_inactive_reel", "true");
        return DbU.A0S(A0b, 1XO.class, 1XW.class);
    }
}
