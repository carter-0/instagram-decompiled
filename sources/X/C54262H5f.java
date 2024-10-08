package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.inspiration.repository.CreatorInspirationHubAccountsRepository;

/* renamed from: X.H5f  reason: case insensitive filesystem */
public final class C54262H5f extends C228042kh {
    public final UserSession A00;

    public C54262H5f(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        return new C53010Gh1(userSession, new CreatorInspirationHubAccountsRepository(userSession));
    }
}
