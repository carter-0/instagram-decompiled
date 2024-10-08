package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.invite.repository.InviteContactRepository;
import com.instagram.request.InviteContactApi;

/* renamed from: X.EEz  reason: case insensitive filesystem */
public final class C47741EEz extends C228042kh {
    public final Application A00;
    public final UserSession A01;

    public final /* bridge */ /* synthetic */ 2YL create() {
        Application application = this.A00;
        UserSession userSession = this.A01;
        0qQ.A0B(userSession, 0);
        return new C46730DkJ(application, userSession, new InviteContactRepository(userSession, new InviteContactApi(userSession)));
    }

    public C47741EEz(Application application, UserSession userSession) {
        AnonymousClass7TG.A1O(application, userSession);
        this.A00 = application;
        this.A01 = userSession;
    }
}
