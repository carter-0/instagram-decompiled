package X;

import com.instagram.aistudio.yourais.YourAisRepository;
import com.instagram.common.session.UserSession;

public final class KBN extends C228042kh {
    public final UserSession A00;

    public KBN(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        return new C60129JgA(new YourAisRepository(userSession, 1vm.A01(userSession)));
    }
}
