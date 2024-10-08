package X;

import com.instagram.common.session.UserSession;

public final class KDS extends C228042kh {
    public final long A00;
    public final UserSession A01;
    public final String A02;

    public final /* bridge */ /* synthetic */ 2YL create() {
        long j = this.A00;
        String str = this.A02;
        UserSession userSession = this.A01;
        return new C60324JjT(userSession, new L1U(userSession), str, j);
    }

    public KDS(UserSession userSession, String str, long j) {
        AnonymousClass7TG.A1P(userSession, str);
        this.A01 = userSession;
        this.A00 = j;
        this.A02 = str;
    }
}
