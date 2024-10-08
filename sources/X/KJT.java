package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

public final class KJT extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KJT(2Lk r7) {
        super("scheduleMagicModNotification", 1230839144, 3, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r1.A04;
        0qQ.A0B(userSession, 0);
        11Z.A03(new M3M(userSession));
    }
}
