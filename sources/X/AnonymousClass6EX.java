package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6EX  reason: invalid class name */
public final class AnonymousClass6EX implements AnonymousClass0lh {
    public boolean A00;
    public final 1a8 A01 = new 1a8((C269794fh) null);
    public final UserSession A02;

    public AnonymousClass6EX(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
    }

    public final void onSessionWillEnd() {
        this.A01.A01();
    }
}
