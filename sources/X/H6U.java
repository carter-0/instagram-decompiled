package X;

import android.app.Application;
import android.graphics.Rect;
import com.instagram.common.session.UserSession;

public final class H6U extends C228042kh {
    public final Application A00;
    public final Rect A01;
    public final UserSession A02;
    public final C56605I4e A03;

    public final /* bridge */ /* synthetic */ 2YL create() {
        Application application = this.A00;
        UserSession userSession = this.A02;
        return new C52966GgJ(application, this.A01, userSession, this.A03, new C55615Hka(userSession));
    }

    public H6U(Application application, Rect rect, UserSession userSession, C56605I4e i4e) {
        AnonymousClass7TG.A1O(application, userSession);
        this.A00 = application;
        this.A02 = userSession;
        this.A03 = i4e;
        this.A01 = rect;
    }
}
