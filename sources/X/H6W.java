package X;

import com.instagram.common.session.UserSession;

public final class H6W extends C228042kh {
    public final UserSession A00;
    public final C56496HzS A01;
    public final I6F A02;
    public final boolean A03;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        0qQ.A0B(userSession, 0);
        C389799qE r2 = new C389799qE(new C63622L0k(userSession));
        boolean z = this.A03;
        1Av A002 = 1Au.A00(userSession);
        return new C53032GhN(r2, this.A01, this.A02, A002, z);
    }

    public H6W(UserSession userSession, C56496HzS hzS, I6F i6f, boolean z) {
        C51972G9s.A1B(userSession, hzS);
        this.A00 = userSession;
        this.A03 = z;
        this.A02 = i6f;
        this.A01 = hzS;
    }
}
