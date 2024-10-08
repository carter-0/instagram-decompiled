package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

public final class H6N extends C228042kh {
    public final Application A00;
    public final UserSession A01;
    public final String A02;

    public H6N(Application application, UserSession userSession, String str) {
        0qQ.A0B(userSession, 2);
        this.A00 = application;
        this.A01 = userSession;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        C62037KWw A002 = C55122HcV.A00(userSession);
        return new C52960GgD(this.A00, userSession, new C55521Hj3(AnonymousClass0kN.A02(userSession)), A002, this.A02);
    }
}
