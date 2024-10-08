package X;

import com.instagram.common.session.UserSession;

public final class LMW {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final String A02;

    public LMW(UserSession userSession, AnonymousClass4DU r3, String str) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = r3;
        this.A02 = str;
    }

    public static final void A00(LMW lmw, String str, String str2) {
        AnonymousClass4DU r3 = lmw.A01;
        C254523sc r2 = new C254523sc(r3, "igtv_composer_end");
        r2.A5g = lmw.A02;
        r2.A22 = AnonymousClass7TE.A0v();
        r2.A4J = str;
        r2.A5u = str2;
        C233822wX.A0I(lmw.A00, r2, r3, AnonymousClass05K.A00);
    }
}
