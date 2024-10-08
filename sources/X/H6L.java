package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.settings.keyword.KeywordRepository;

public final class H6L extends C228042kh {
    public final UserSession A00;
    public final String A01;
    public final String A02;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        return new C54186H2g(new KeywordRepository(1vm.A01(userSession), this.A02, this.A01));
    }

    public H6L(UserSession userSession, String str, String str2) {
        AnonymousClass7TG.A1U(userSession, str, str2);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = str2;
    }
}
