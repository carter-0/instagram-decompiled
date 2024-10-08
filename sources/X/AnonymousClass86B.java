package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.86B  reason: invalid class name */
public final class AnonymousClass86B {
    public final long A00;
    public final 29E A01;
    public final AtomicBoolean A02 = new AtomicBoolean(false);
    public final AtomicLong A03;
    public final UserSession A04;

    public AnonymousClass86B(UserSession userSession) {
        this.A04 = userSession;
        this.A01 = new 29E(userSession);
        this.A03 = new AtomicLong(17638221);
        this.A00 = 182.A01(0Tu.A06, userSession, 36599048417185150L);
    }
}
