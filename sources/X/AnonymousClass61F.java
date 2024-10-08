package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.61F  reason: invalid class name */
public final class AnonymousClass61F implements AnonymousClass0lh {
    public final 1a8 A00 = new 1a8((C269794fh) null);
    public final UserSession A01;

    public AnonymousClass61F(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final void onSessionWillEnd() {
        this.A00.A01();
    }
}
