package X;

import com.instagram.common.session.UserSession;

public final class KEF extends C228042kh {
    public final UserSession A00;
    public final C62439Kfp A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        C63849L9e l9e = new C63849L9e(userSession, this.A02);
        C63613L0b l0b = new C63613L0b(userSession, this.A03);
        C63614L0c l0c = new C63614L0c(userSession);
        return new C60283Jie(AnonymousClass12T.A00, userSession, l0b, this.A01, l9e, l0c, this.A04);
    }

    public KEF(UserSession userSession, C62439Kfp kfp, String str, String str2, String str3) {
        C51974G9v.A1P(userSession, str, str2, str3);
        this.A00 = userSession;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = kfp;
    }
}
