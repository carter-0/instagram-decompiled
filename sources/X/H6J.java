package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

public final class H6J extends C228042kh {
    public final Application A00;
    public final UserSession A01;
    public final String A02 = "";

    public H6J(Application application, UserSession userSession) {
        AnonymousClass7TG.A1O(application, userSession);
        this.A00 = application;
        this.A01 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new C52961GgE(this.A00, this.A01, this.A02);
    }
}
