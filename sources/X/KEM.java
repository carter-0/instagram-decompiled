package X;

import com.instagram.common.session.UserSession;

public final class KEM extends C228042kh {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public KEM(AnonymousClass0iw r2, UserSession userSession, String str, String str2, String str3) {
        0qQ.A0B(str, 3);
        this.A01 = userSession;
        this.A00 = r2;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        AnonymousClass0t1 A002 = 0eE.A00(userSession);
        AnonymousClass0iw r2 = this.A00;
        String str = this.A04;
        if (str == null) {
            str = "";
        }
        String str2 = this.A02;
        String str3 = str2;
        if (str2 == null) {
            str3 = "";
        }
        C64104LMy lMy = new C64104LMy(r2, userSession, str, str3, (String) null);
        String str4 = this.A03;
        C310306am r8 = new C310306am(r2, userSession, str4);
        if (str2 == null) {
            str2 = "";
        }
        return new C60197JhG(A002, r8, lMy, str4, str2);
    }
}
