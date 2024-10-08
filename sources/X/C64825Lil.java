package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lil  reason: case insensitive filesystem */
public final class C64825Lil implements AnonymousClass0lh {
    public final 0xa A00;
    public final UserSession A01;

    public C64825Lil(0xa r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r2;
    }

    public final void onSessionWillEnd() {
        0xY AR4 = this.A00.AR4();
        AR4.AHM();
        AR4.apply();
    }
}
