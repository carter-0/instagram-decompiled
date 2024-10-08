package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.3ip  reason: invalid class name and case insensitive filesystem */
public final class C248933ip extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248933ip(2Lk r7) {
        super("FetchBuildInfo", 2053690886, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r1.A04;
        AnonymousClass9FG.A00(userSession).A01();
        AnonymousClass9FM A002 = AnonymousClass9FL.A00(userSession);
        0xa r3 = A002.A01;
        String A003 = AnonymousClass000.A00(2428);
        if (A002.A00 == r3.getInt(A003, -1)) {
            A002.A03.A00("install_confirmed");
            0xY AR4 = r3.AR4();
            AR4.ED3(A003);
            AR4.apply();
        }
    }
}
