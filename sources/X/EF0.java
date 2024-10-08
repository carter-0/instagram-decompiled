package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.opal.impl.data.OpalAudienceSelectorRepository;

public final class EF0 extends C228042kh {
    public final Application A00;
    public final UserSession A01;

    public EF0(Application application, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = application;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        Application application = this.A00;
        OpalAudienceSelectorRepository opalAudienceSelectorRepository = new OpalAudienceSelectorRepository(application, userSession);
        new C46461DfP(userSession);
        return new C52964GgH(application, userSession, opalAudienceSelectorRepository);
    }
}
