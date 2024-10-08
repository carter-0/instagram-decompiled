package X;

import com.instagram.common.session.UserSession;

public final class KDK extends C228042kh {
    public final UserSession A00;
    public final String A01;
    public final String A02;

    public KDK(UserSession userSession, String str, String str2) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = str2;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        0qQ.A0B(userSession, 0);
        return new C60199JhI((KWY) userSession.A01(KWY.class, MKH.A00), C63397KwI.A00(userSession), this.A02, this.A01);
    }
}
