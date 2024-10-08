package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.settings.audience.AudienceRepository;
import com.instagram.creator.agent.settings.repository.CreatorAiSettingsRepository;

/* renamed from: X.H5w  reason: case insensitive filesystem */
public final class C54279H5w extends C228042kh {
    public final UserSession A00;
    public final String A01;

    public final /* bridge */ /* synthetic */ 2YL create() {
        String str = this.A01;
        UserSession userSession = this.A00;
        return new C54182H2c(userSession, new AudienceRepository(userSession), new CreatorAiSettingsRepository(userSession, 1vm.A01(userSession)), str);
    }

    public C54279H5w(UserSession userSession, String str) {
        AnonymousClass7TG.A1O(str, userSession);
        this.A01 = str;
        this.A00 = userSession;
    }
}
