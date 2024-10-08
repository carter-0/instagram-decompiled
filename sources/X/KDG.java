package X;

import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureArgs;
import com.instagram.brandedcontent.repository.BrandedContentApi;
import com.instagram.common.session.UserSession;

public final class KDG extends C228042kh {
    public final BrandedContentDisclosureArgs A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A02;
        AnonymousClass0iw r4 = this.A01;
        return new C60318JjM(this.A00, C63090KrJ.A00(userSession), new BrandedContentApi(userSession), r4, userSession);
    }

    public KDG(BrandedContentDisclosureArgs brandedContentDisclosureArgs, AnonymousClass0iw r2, UserSession userSession) {
        AnonymousClass7TG.A1P(userSession, brandedContentDisclosureArgs);
        this.A02 = userSession;
        this.A01 = r2;
        this.A00 = brandedContentDisclosureArgs;
    }
}
