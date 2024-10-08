package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

public final class EF5 extends C228042kh {
    public final Application A00;
    public final UserSession A01;

    public EF5(Application application, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = application;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new C46733DkM(this.A00, this.A01);
    }
}
