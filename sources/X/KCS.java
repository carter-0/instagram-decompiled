package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

public final class KCS extends C228042kh {
    public final Application A00;
    public final UserSession A01;

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new C60103Jfj(this.A00, this.A01);
    }

    public KCS(Application application, UserSession userSession) {
        AnonymousClass7TG.A1O(userSession, application);
        this.A01 = userSession;
        this.A00 = application;
    }
}
