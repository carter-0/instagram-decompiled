package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Eqg  reason: case insensitive filesystem */
public abstract class C49175Eqg {
    public static final void A00(AnonymousClass0iw r3, UserSession userSession, User user) {
        0qQ.A0B(userSession, 0);
        String A0k = DbS.A0k();
        0Aj A0G = DbZ.A0G(AnonymousClass0kN.A01(r3, userSession), user, "unfollow_button_tapped");
        DbW.A15(A0G, r3);
        A0G.AAJ("nav_chain", A0k);
        A0G.Cgf();
    }
}
