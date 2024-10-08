package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.settings.summary.BioSummaryRepository;

public final class H62 extends C228042kh {
    public final UserSession A00;
    public final String A01;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        return new C52994Ggl(userSession, new BioSummaryRepository(userSession, this.A01));
    }

    public H62(UserSession userSession, String str) {
        AnonymousClass7TG.A1O(userSession, str);
        this.A00 = userSession;
        this.A01 = str;
    }
}
