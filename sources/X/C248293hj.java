package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.3hj  reason: invalid class name and case insensitive filesystem */
public final class C248293hj extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248293hj(2Lk r3) {
        super("tryEnableRTI", 375);
        this.A00 = r3;
    }

    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r1.A04;
        0qQ.A0B(userSession, 0);
        userSession.A01(AnonymousClass939.class, AnonymousClass938.A00);
    }
}
