package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.B4c  reason: case insensitive filesystem */
public final class C41859B4c implements 2Kw {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C41857B4a A01;

    public C41859B4c(UserSession userSession, C41857B4a b4a) {
        this.A01 = b4a;
        this.A00 = userSession;
    }

    public final void invoke(Throwable th) {
        C41857B4a b4a = this.A01;
        UserSession userSession = this.A00;
        0qQ.A0A(th);
        b4a.A01(userSession, th);
    }
}
