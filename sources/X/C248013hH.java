package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.3hH  reason: invalid class name and case insensitive filesystem */
public final class C248013hH extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248013hH(2Lk r7) {
        super("prefetchSelfProfile", 1791138859, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r1.A04;
        C3727392e.A00(userSession).A08(r1.A01, userSession.A06, false, true);
    }
}
