package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ihk  reason: case insensitive filesystem */
public final class C57867Ihk implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass5Gv A01;

    public C57867Ihk(UserSession userSession, AnonymousClass5Gv r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }

    public final void run() {
        AnonymousClass5Gv r2 = this.A01;
        if (r2 != null) {
            UserSession userSession = this.A00;
            if (I40.A00(userSession) && !r2.A09()) {
                r2.A07(userSession);
            }
        }
    }
}
