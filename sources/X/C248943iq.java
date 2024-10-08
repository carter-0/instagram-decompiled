package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.3iq  reason: invalid class name and case insensitive filesystem */
public final class C248943iq extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248943iq(2Lk r7, int i) {
        super("FxIGSSOInfoStatus", 1719297467, i, true, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r2 = this.A00;
        0eE r1 = AnonymousClass0t1.A01;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r2.A04;
        if (r1.A01(userSession).A1x()) {
            0qQ.A0B(userSession, 0);
            ((C19291WSz) userSession.A01(C19291WSz.class, new C20699WxV(userSession, 13))).A00((VYN) null);
        }
    }
}
