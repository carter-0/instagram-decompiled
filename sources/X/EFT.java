package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.profilecard.data.ProfileCardRepository;
import com.instagram.profilecard.domain.ProfileCardViewModel;

public final class EFT extends C228042kh {
    public final Application A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final String A03;
    public final boolean A04;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A02;
        Application application = this.A00;
        AnonymousClass4DH r1 = this.A01;
        String str = this.A03;
        AnonymousClass7TG.A1T(userSession, application, r1);
        ProfileCardRepository profileCardRepository = new ProfileCardRepository(application, r1, userSession, str);
        Class<FYZ> cls = FYZ.class;
        return new ProfileCardViewModel(application, userSession, profileCardRepository, (T7M) userSession.A01(T7M.class, G2D.A00), (FYZ) userSession.A01(cls, G2J.A00), this.A04);
    }

    public EFT(Application application, AnonymousClass4DH r2, UserSession userSession, String str, boolean z) {
        AnonymousClass7TG.A1O(userSession, application);
        this.A02 = userSession;
        this.A00 = application;
        this.A01 = r2;
        this.A03 = str;
        this.A04 = z;
    }
}
