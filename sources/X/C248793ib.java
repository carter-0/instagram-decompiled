package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.3ib  reason: invalid class name and case insensitive filesystem */
public final class C248793ib extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248793ib(2Lk r7) {
        super("cpdp_mvp_prefetcher", 2041201927, 5, true, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r1.A04;
        0qQ.A0B(userSession, 1);
        if (182.A06(0Tu.A05, userSession, 36312187551155142L)) {
            C16917VAu.A00(userSession, (Long) null);
        }
    }
}
