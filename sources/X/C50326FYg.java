package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FYg  reason: case insensitive filesystem */
public final class C50326FYg implements AnonymousClass0lh {
    public boolean A00;
    public final UserSession A01;

    public C50326FYg(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final boolean A00() {
        UserSession userSession = this.A01;
        0Tu r2 = 0Tu.A06;
        if (182.A06(r2, userSession, 36314519718333084L) || !this.A00 || !182.A06(r2, userSession, 36314519718398621L)) {
            return false;
        }
        return true;
    }

    public final void onSessionWillEnd() {
        this.A01.A03(C50326FYg.class);
    }
}
