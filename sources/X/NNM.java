package X;

import com.instagram.common.session.UserSession;

public final class NNM extends C228042kh {
    public final UserSession A00;
    public final C71126OdL A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public NNM(UserSession userSession, C71126OdL odL, String str, String str2, String str3) {
        DbW.A1N(userSession, 1, str3);
        this.A00 = userSession;
        this.A04 = str;
        this.A03 = str2;
        this.A01 = odL;
        this.A02 = str3;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        C2615249x A002 = C2615149w.A00(userSession);
        return new C67756MuB(userSession, AnonymousClass43C.A00(userSession), A002, this.A01, this.A04, this.A02, this.A03);
    }
}
