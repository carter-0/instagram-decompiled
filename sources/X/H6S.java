package X;

import com.instagram.common.session.UserSession;

public final class H6S extends C228042kh {
    public final int A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final String A03;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A02;
        AnonymousClass0iw r2 = this.A01;
        String str = this.A03;
        0qQ.A0B(userSession, 0);
        return new C53040GhW(new C54428HDa(userSession), r2, userSession, str, this.A00);
    }

    public H6S(AnonymousClass0iw r1, UserSession userSession, String str, int i) {
        AnonymousClass7TG.A1O(userSession, str);
        this.A02 = userSession;
        this.A03 = str;
        this.A00 = i;
        this.A01 = r1;
    }
}
