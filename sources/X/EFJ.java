package X;

import com.instagram.common.session.UserSession;

public final class EFJ extends C228042kh {
    public final UserSession A00;
    public final String A01 = "highlights_grid";
    public final String A02;

    public EFJ(UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        return new C60190Jh9(userSession, new C328767Gd(userSession), this.A02, this.A01);
    }
}
