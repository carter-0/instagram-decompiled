package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Al3  reason: case insensitive filesystem */
public final class C40895Al3 implements Runnable {
    public final /* synthetic */ C39728A6t A00;

    public C40895Al3(C39728A6t a6t) {
        this.A00 = a6t;
    }

    public final void run() {
        C39728A6t a6t = this.A00;
        1OC r1 = a6t.A00;
        if (r1 != null) {
            r1.A02 = true;
            C385469iz r12 = a6t.A02;
            if (r12 != null) {
                r12.onFail(AnonymousClass7BQ.A00());
            }
            UserSession userSession = a6t.A01;
            if (userSession != null) {
                C70934OSh.A00(userSession).markerEnd(246558735, 113);
                return;
            }
            return;
        }
        0qQ.A0F("task");
        throw AnonymousClass00P.createAndThrow();
    }
}
