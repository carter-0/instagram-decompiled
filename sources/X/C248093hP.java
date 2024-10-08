package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.3hP  reason: invalid class name and case insensitive filesystem */
public final class C248093hP extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248093hP(2Lk r7) {
        super("prefetchDeveloperOptions", 360, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r1.A04;
        if (2R8.A00(userSession)) {
            1RH A002 = 1RH.A00();
            PyC pyC = new PyC(1US.A0M);
            pyC.A03 = AnonymousClass05K.A01;
            A002.A03(userSession, new PyB(pyC));
        }
    }
}
