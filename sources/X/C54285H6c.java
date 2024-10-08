package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.H6c  reason: case insensitive filesystem */
public final class C54285H6c extends C228042kh {
    public final UserSession A00;
    public final HMX A01;
    public final C55747Hmi A02;
    public final C61770pa A03;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        HMX hmx = this.A01;
        C61770pa r5 = this.A03;
        0qQ.A0B(userSession, 0);
        return new HHE(userSession, hmx, new C55855Hoc(userSession), this.A02, r5);
    }

    public C54285H6c(UserSession userSession, HMX hmx, C55747Hmi hmi, C61770pa r4) {
        C51974G9v.A1P(userSession, hmx, r4, hmi);
        this.A00 = userSession;
        this.A01 = hmx;
        this.A03 = r4;
        this.A02 = hmi;
    }
}
