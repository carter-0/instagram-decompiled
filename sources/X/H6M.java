package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.settings.repository.CreatorAiSettingsRepository;

public final class H6M extends C228042kh {
    public final UserSession A00;
    public final String A01;
    public final String A02;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        return new C53030GhL(userSession, new C52369GPq(userSession, this.A02), new CreatorAiSettingsRepository(userSession, 1vm.A01(userSession)), this.A01);
    }

    public H6M(UserSession userSession, String str, String str2) {
        AnonymousClass7TG.A1U(userSession, str, str2);
        this.A00 = userSession;
        this.A01 = str;
        this.A02 = str2;
    }
}
