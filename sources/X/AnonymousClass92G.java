package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.92G  reason: invalid class name */
public final class AnonymousClass92G {
    public final User A00;

    public AnonymousClass92G(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = 0eE.A00(userSession).A00();
    }

    public final boolean A00(C295705ol r4) {
        int ordinal = r4.ordinal();
        if (ordinal == 1) {
            return this.A00.A2H();
        }
        if (ordinal != 2) {
            return false;
        }
        return 0qQ.A0K(this.A00.A03.CXy(), true);
    }
}
