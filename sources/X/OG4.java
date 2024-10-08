package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.brandedcontent.repository.BrandedContentSettingsRepository;
import com.instagram.common.session.UserSession;

public final class OG4 {
    public final FragmentActivity A00;
    public final C309516Yo A01;
    public final BrandedContentSettingsRepository A02;
    public final UserSession A03;
    public final AnonymousClass0eM A04;

    public OG4(FragmentActivity fragmentActivity, UserSession userSession) {
        C309516Yo A0M;
        this.A00 = fragmentActivity;
        this.A03 = userSession;
        this.A02 = C63091KrK.A00(userSession);
        if (182.A06(0Tu.A05, userSession, 36324677316718821L)) {
            A0M = null;
        } else {
            A0M = DbS.A0M(fragmentActivity, userSession);
        }
        this.A01 = A0M;
        this.A04 = C73909Plk.A00(this, 34);
    }
}
