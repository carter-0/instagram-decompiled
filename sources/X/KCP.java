package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.securityalert.data.SecurityAlertRepository;

public final class KCP extends C228042kh {
    public final UserSession A00;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        0qQ.A0B(userSession, 0);
        SecurityAlertRepository.A04.A00(userSession);
        return new C60161Jgg(userSession, new L31(C59837JaC.A00(userSession)));
    }

    public KCP(UserSession userSession) {
        this.A00 = userSession;
    }
}
