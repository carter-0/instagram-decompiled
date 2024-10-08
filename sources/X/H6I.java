package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

public final class H6I extends C228042kh {
    public final Application A00;
    public final UserSession A01;
    public final String A02;

    public final /* bridge */ /* synthetic */ 2YL create() {
        Application application = this.A00;
        UserSession userSession = this.A01;
        return new C52959GgC(application, userSession, new C351838Ap(userSession), this.A02);
    }

    public H6I(Application application, UserSession userSession, String str) {
        AnonymousClass7TG.A1O(application, userSession);
        this.A00 = application;
        this.A01 = userSession;
        this.A02 = str;
    }
}
