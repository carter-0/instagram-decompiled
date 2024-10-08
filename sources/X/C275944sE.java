package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.4sE  reason: invalid class name and case insensitive filesystem */
public final class C275944sE extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C275944sE(2Lk r7) {
        super("igds_ui_tracking_logging", 1635172738, 3, false, true);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r3 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r3.A04;
        0qQ.A0B(userSession, 0);
        ((C19250WRj) userSession.A01(C19250WRj.class, new MMJ(userSession, 21))).onAppForegrounded();
        14i r0 = 14i.A08;
        14i.A03(15Y.A03, new C64718Lgr(r3));
    }
}
