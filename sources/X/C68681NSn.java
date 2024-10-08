package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.NSn  reason: case insensitive filesystem */
public final class C68681NSn extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68681NSn(2Lk r7, int i) {
        super("maybeFetchFBLoginStatus", 193346370, i, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r1.A04;
        0qQ.A0B(userSession, 0);
        ((C50324FYe) userSession.A01(C50324FYe.class, new C73662Phb(userSession, 16))).A00(CallerContext.A01(AnonymousClass000.A00(1031)), userSession);
    }
}
