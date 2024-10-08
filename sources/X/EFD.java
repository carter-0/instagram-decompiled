package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.opal.impl.data.OpalRepository;

public final class EFD extends C228042kh {
    public final Application A00;
    public final UserSession A01;
    public final String A02;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        return new C46789DlJ(userSession, new OpalRepository(this.A00, userSession, 1vm.A01(userSession), this.A02));
    }

    public EFD(Application application, UserSession userSession, String str) {
        AnonymousClass7TG.A1O(str, userSession);
        this.A02 = str;
        this.A01 = userSession;
        this.A00 = application;
    }
}
