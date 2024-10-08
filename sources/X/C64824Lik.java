package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lik  reason: case insensitive filesystem */
public final class C64824Lik implements AnonymousClass0lh {
    public final UserSession A00;
    public final String A01;

    public C64824Lik(UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = str;
    }

    public final void onSessionWillEnd() {
        this.A00.A03(C64824Lik.class);
    }
}
