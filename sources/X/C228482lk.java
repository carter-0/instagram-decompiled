package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.2lk  reason: invalid class name and case insensitive filesystem */
public final class C228482lk {
    public static final C228492ll A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return (C228492ll) userSession.A01(C228492ll.class, new AnonymousClass9L7(userSession, 33));
    }

    public static final synchronized void A01(C228482lk r2, long j) {
        synchronized (r2) {
            HashMap hashMap = C228492ll.A0A;
            Long valueOf = Long.valueOf(j);
            hashMap.remove(valueOf);
            C228492ll.A0B.remove(valueOf);
            C228492ll.A0C.remove(valueOf);
        }
    }
}
