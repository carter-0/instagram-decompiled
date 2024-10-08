package X;

import com.instagram.common.session.UserSession;

public final class KDE extends C228042kh {
    public final UserSession A00;
    public final String A01;
    public final String A02;

    public KDE(UserSession userSession, String str, String str2) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = str;
        this.A02 = str2;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        C63759L5r l5r = new C63759L5r(userSession, str, str2);
        return new C60271JiS(new C63796L7c(new L3K(userSession), l5r, userSession, str2), l5r, AnonymousClass12T.A00);
    }
}
