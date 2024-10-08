package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

public final class Oy4 implements AnonymousClass0lh {
    public final 0wc A00;
    public final String A01;
    public final HashMap A02 = AnonymousClass7TE.A1E();
    public final UserSession A03;

    public Oy4(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A01 = userSession.A06;
        this.A00 = AnonymousClass0kN.A02(userSession);
    }

    public final void onSessionWillEnd() {
        this.A02.clear();
    }
}
