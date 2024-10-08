package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5BR  reason: invalid class name */
public final class AnonymousClass5BR extends 0vM {
    public final /* synthetic */ 2DU A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5BR(2DU r7) {
        super("CleanExpiredArmadilloExpressMessages", 953162525, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        UserSession userSession = this.A00.A09;
        0qQ.A0B(userSession, 0);
        C66833MdR.A00(userSession).A00(new Long((System.currentTimeMillis() - (((long) ((int) 182.A01(0Tu.A05, userSession, 36600366972931949L))) * 86400000)) / 1000).intValue());
    }
}
