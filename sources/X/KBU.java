package X;

import com.instagram.brandedcontent.ads.repository.BrandedContentAdsApi;
import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureMenuViewModel;
import com.instagram.common.session.UserSession;

public final class KBU extends C228042kh {
    public final UserSession A00;

    public KBU(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        return new BrandedContentDisclosureMenuViewModel(new BrandedContentAdsApi(userSession), userSession);
    }
}
