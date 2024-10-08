package X;

import com.instagram.common.session.UserSession;

public final class EFK extends C228042kh {
    public final UserSession A00;
    public final E53 A01;
    public final String A02;

    public EFK(UserSession userSession, E53 e53, String str) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = e53;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        return new C46792DlR(userSession, new C49650F0h(userSession, FEE.A00), this.A01, this.A02);
    }
}
