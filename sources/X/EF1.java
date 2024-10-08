package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.opal.impl.data.OpalEditRepository;

public final class EF1 extends C228042kh {
    public final Application A00;
    public final UserSession A01;

    public EF1(Application application, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = application;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        return new C46756Dkj(userSession, new OpalEditRepository(this.A00, userSession));
    }
}
