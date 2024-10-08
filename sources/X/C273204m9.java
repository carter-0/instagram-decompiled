package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.4m9  reason: invalid class name and case insensitive filesystem */
public final class C273204m9 extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C273204m9(2Lk r7) {
        super("initPandoParsingJNI", 2017988039, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r1.A04;
        0qQ.A0B(userSession, 0);
        ((C278804xY) userSession.A01(C278804xY.class, new C51791G2a(userSession, 9))).createApiFrameworkParser(false);
    }
}
