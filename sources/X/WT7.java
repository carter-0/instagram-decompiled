package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.common.session.UserSession;

public final class WT7 implements 0lm {
    public long A00;
    public final 1QP A01;
    public final UserSession A02;

    public WT7(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = AnonymousClass1QO.A00(userSession);
    }

    public final void A00() {
        long j = this.A00;
        if (j != 0) {
            this.A01.flowEndCancel(j, CancelReason.USER_CANCELLED);
            this.A00 = 0;
        }
    }

    public final void onUserSessionWillEnd(boolean z) {
        A00();
    }
}
