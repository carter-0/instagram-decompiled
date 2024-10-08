package X;

import com.instagram.common.session.UserSession;

public final class MZQ implements AnonymousClass0lh {
    public boolean A00;
    public final int A01;
    public final 02m A02;
    public final UserSession A03;

    public MZQ(02m r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A02 = r2;
        this.A01 = userSession.A06.hashCode();
    }

    public final void onSessionWillEnd() {
        this.A02.markerEnd(20127518, this.A01, 3);
    }
}
