package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.JTl  reason: case insensitive filesystem */
public final class C59680JTl extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59680JTl(2Lk r7) {
        super("fetchMagicModConsentState", 282852313, 4, true, true);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r1.A04;
        0qQ.A0B(userSession, 0);
        C56510Hzh.A00((C56510Hzh) userSession.A01(C56510Hzh.class, new C58678Ivn(userSession, 30)), false);
    }
}
