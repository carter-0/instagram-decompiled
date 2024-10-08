package X;

import com.instagram.common.session.UserSession;
import com.instagram.creatortools.api.CreatorToolsMonetizationApi;

/* renamed from: X.EEe  reason: case insensitive filesystem */
public final class C47721EEe extends C228042kh {
    public final UserSession A00;

    public C47721EEe(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        0qQ.A0B(userSession, 0);
        return new C46791DlQ(userSession, (CreatorToolsMonetizationApi) userSession.A01(CreatorToolsMonetizationApi.class, new Dbl(userSession, 11)));
    }
}
