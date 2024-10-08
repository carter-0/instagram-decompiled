package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NSi  reason: case insensitive filesystem */
public final class C68676NSi extends 0vM {
    public final /* synthetic */ 2DU A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68676NSi(2DU r3) {
        super("maybeInitializeMsysPresence", 398171298);
        this.A00 = r3;
    }

    public final void loggedRun() {
        2DU r1 = this.A00;
        UserSession userSession = r1.A09;
        OKQ A002 = C70111NxR.A00(userSession);
        A002.A00();
        if (A002.A00 != null) {
            if (C265504Uf.A00(userSession)) {
                2DU.A05(r1, AnonymousClass05K.A0C);
            }
            if (C265504Uf.A01(userSession)) {
                0nY.A00().ATE(new C68644NRa((C2597743a) userSession.A01(C2597743a.class, new C262034Bw(userSession, r1.A07))));
            }
        }
    }
}
