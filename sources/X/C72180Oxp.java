package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Oxp  reason: case insensitive filesystem */
public final class C72180Oxp implements AnonymousClass0lh {
    public final UserSession A00;

    public final void onSessionWillEnd() {
        this.A00.A03(C72180Oxp.class);
    }

    public C72180Oxp(UserSession userSession) {
        this.A00 = userSession;
    }
}
