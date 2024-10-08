package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LJp  reason: case insensitive filesystem */
public abstract class C64028LJp {
    public static final 1OC A00(UserSession userSession) {
        1NY A0M = DbZ.A0M(userSession);
        A0M.A0A("video_call/retrieve_user_call_settings/");
        return DbU.A0S(A0M, C47321Duo.class, F4Q.class);
    }

    public static final void A01(UserSession userSession, List list) {
        AnonymousClass7TG.A1N(userSession, list);
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DbY.A1W(A0r, it);
        }
        C61080JwI jwI = new C61080JwI((List) A0r, 17);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("video_call/remove_users_from_allowlist/");
        DbX.A1M(A0a, "users_to_remove", jwI.toString());
        1ES.A03(A0a.A0M());
    }
}
