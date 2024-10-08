package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.settings.avoidedtopics.repository.AvoidedTopicsRepository;

/* renamed from: X.H5y  reason: case insensitive filesystem */
public final class C54281H5y extends C228042kh {
    public final UserSession A00;
    public final String A01;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        String str = this.A01;
        AnonymousClass7TG.A1N(userSession, str);
        return new C52983Gga(new AvoidedTopicsRepository(1vm.A01(userSession), str, AnonymousClass43D.A00(245403032)));
    }

    public C54281H5y(UserSession userSession, String str) {
        AnonymousClass7TG.A1O(userSession, str);
        this.A00 = userSession;
        this.A01 = str;
    }
}
