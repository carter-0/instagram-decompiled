package X;

import com.instagram.common.session.UserSession;

public final class H6H extends C228042kh {
    public final UserSession A00;
    public final String A01;
    public final String A02;

    public final /* bridge */ /* synthetic */ 2YL create() {
        String str = this.A01;
        String str2 = this.A02;
        UserSession userSession = this.A00;
        AnonymousClass4JK A002 = AnonymousClass4JJ.A00(userSession);
        0qQ.A0B(userSession, 0);
        return new C53020GhB(A002, (AnonymousClass4JM) userSession.A01(AnonymousClass4JM.class, AnonymousClass4JL.A00), str, str2);
    }

    public H6H(UserSession userSession, String str, String str2) {
        AnonymousClass7TG.A1U(str, str2, userSession);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = userSession;
    }
}
