package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.72D  reason: invalid class name */
public final class AnonymousClass72D implements 0lm {
    public long A00;
    public long A01;
    public final 1QP A02;
    public final UserSession A03;
    public final HashMap A04 = new HashMap();

    public AnonymousClass72D(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A02 = AnonymousClass1QO.A00(userSession);
    }

    public final void A00() {
        long j = this.A01;
        if (j != 0) {
            this.A02.flowEndCancel(j, CancelReason.USER_CANCELLED);
            this.A01 = 0;
        }
    }

    public final void onUserSessionWillEnd(boolean z) {
        A00();
        long j = this.A00;
        if (j != 0) {
            this.A02.flowEndSuccess(j);
            this.A00 = 0;
            this.A04.clear();
        }
        this.A04.clear();
    }
}
