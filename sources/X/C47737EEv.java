package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.EEv  reason: case insensitive filesystem */
public final class C47737EEv extends C228042kh {
    public final AnonymousClass0iw A00;
    public final UserSession A01;

    public C47737EEv(AnonymousClass0iw r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        AnonymousClass0iw r3 = this.A00;
        C49448Evp evp = new C49448Evp(r3, userSession);
        0qQ.A0B(userSession, 0);
        return new C46760Dkn(evp, (EtD) userSession.A01(EtD.class, C51801G2k.A00(userSession, 14)), r3);
    }
}
