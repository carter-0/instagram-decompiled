package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ffr  reason: case insensitive filesystem */
public final class C50632Ffr implements G6A {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C47694EDd A01;

    public C50632Ffr(UserSession userSession, C47694EDd eDd) {
        this.A01 = eDd;
        this.A00 = userSession;
    }

    public final void onFinished() {
        UserSession userSession = this.A00;
        EEM eem = this.A01.A02;
        CallerContext callerContext = EEM.A0B;
        C46413Dea.A08(eem.A04, eem.A07, userSession);
    }
}
