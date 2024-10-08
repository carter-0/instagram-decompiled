package X;

import com.instagram.aistudio.home.repository.AiSearchRepository;
import com.instagram.common.session.UserSession;

public final class KBM extends C228042kh {
    public final UserSession A00;

    public KBM(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        return new C60234Jhr(new AiSearchRepository(userSession), userSession);
    }
}
