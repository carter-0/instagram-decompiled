package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.common.session.UserSession;

/* renamed from: X.Vgs  reason: case insensitive filesystem */
public final class C17839Vgs {
    public long A00;
    public final 1QP A01;
    public final UserSession A02;

    public C17839Vgs(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = AnonymousClass1QO.A00(userSession);
    }

    public final void A00() {
        this.A01.flowEndCancel(this.A00, CancelReason.USER_CANCELLED);
        this.A00 = 0;
    }
}
