package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5BQ  reason: invalid class name */
public final class AnonymousClass5BQ extends 0vM {
    public final /* synthetic */ 2DU A00;
    public final /* synthetic */ String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5BQ(2DU r7, String str, int i) {
        super("ensureInitCriticalPathForDirectAndMsys", 1217680429, i, false, false);
        this.A00 = r7;
        this.A01 = str;
    }

    public final void loggedRun() {
        2DU r3 = this.A00;
        UserSession userSession = r3.A09;
        if (userSession.hasEnded()) {
            0wb.A03("DirectUserScopedInitializer", "Trying to initialize msys for an ended user session in critical path.");
            2Hz.A00(userSession).A04("stop_for_ended_user_session_in_critical_path");
            return;
        }
        2DU.A01(r3);
        2DU.A07(r3, this.A01, 2DU.A08(userSession));
    }
}
