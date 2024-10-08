package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8jg  reason: invalid class name and case insensitive filesystem */
public final class C363408jg implements AnonymousClass0lh {
    public final C363428ji A00;
    public final UserSession A01;

    public C363408jg(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = C363418jh.A00(userSession);
    }

    public final void onSessionWillEnd() {
        this.A01.A03(C363408jg.class);
    }

    public C363408jg() {
    }
}
