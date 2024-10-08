package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.VIw  reason: case insensitive filesystem */
public abstract class C17126VIw {
    public static final void A00(C58840Ae r6, UserSession userSession, User user) {
        AnonymousClass7TG.A1O(userSession, user);
        String str = userSession.A06;
        String id = user.getId();
        boolean A0Q = AnonymousClass2f1.A00(userSession).A0Q(user);
        HashMap A0q = DbZ.A0q();
        0Aj A0d = C51969G9p.A0d(r6, "ig_wellbeing_tag_controls_action");
        A0d.A9F(C273654mx.A00(230), DbV.A0q(str));
        DbS.A1J(A0d, "click");
        DbS.A1H(A0d, "non_taggable_user_in_search");
        A0d.A9F("ig_userid", AnonymousClass7TE.A10(id));
        A0d.A7p(AnonymousClass000.A00(311), Boolean.valueOf(A0Q));
        A0d.A9H(AnonymousClass000.A00(1333), A0q);
        A0d.Cgf();
    }
}
