package X;

import com.instagram.common.session.UserSession;
import com.instagram.monetization.onboarding.repository.OnboardingRepository;
import com.instagram.monetization.repository.MonetizationRepository;

public final class KDC extends C228042kh {
    public final LTO A00;
    public final UserSession A01;
    public final String A02;

    /* JADX WARNING: type inference failed for: r2v1, types: [X.KqU, java.lang.Object] */
    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        String str = this.A02;
        AnonymousClass7TG.A1N(userSession, str);
        LAZ laz = new LAZ(new LCv(userSession, 1vm.A01(userSession), str));
        MonetizationRepository A002 = AnonymousClass2o3.A00(userSession);
        OnboardingRepository A003 = F6S.A00(userSession, AnonymousClass7TE.A1E());
        return new C60307Jj6(this.A00, new Object(), laz, AnonymousClass2BF.A00().A03(), userSession, A003, A002);
    }

    public KDC(LTO lto, UserSession userSession, String str) {
        AnonymousClass7TG.A1U(userSession, lto, str);
        this.A01 = userSession;
        this.A00 = lto;
        this.A02 = str;
    }
}
