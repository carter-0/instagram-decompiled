package X;

import com.instagram.common.session.UserSession;

public final class Oy0 implements AnonymousClass0lh {
    public long A00;
    public final UserSession A01;

    public final void onSessionWillEnd() {
        this.A00 = 0;
    }

    public Oy0(UserSession userSession) {
        this.A01 = userSession;
    }
}
