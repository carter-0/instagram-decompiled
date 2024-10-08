package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

public final class H6Q extends C228042kh {
    public final Application A00;
    public final UserSession A01;
    public final HM8 A02;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        0qQ.A0B(userSession, 0);
        Class<C54429HDb> cls = C54429HDb.class;
        C62037KWw A002 = C55122HcV.A00(userSession);
        return new HJG(this.A00, (C54429HDb) userSession.A01(cls, new C58710IwJ(userSession, 16)), userSession, new C55474HiI(), A002, this.A02);
    }

    public H6Q(Application application, UserSession userSession, HM8 hm8) {
        this.A00 = application;
        this.A01 = userSession;
        this.A02 = hm8;
    }
}
