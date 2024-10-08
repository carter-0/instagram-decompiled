package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.FYc  reason: case insensitive filesystem */
public final class C50322FYc implements AnonymousClass0lh {
    public final AtomicBoolean A00 = new AtomicBoolean(false);
    public final UserSession A01;

    public C50322FYc(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final void onSessionWillEnd() {
        this.A00.set(false);
    }
}
