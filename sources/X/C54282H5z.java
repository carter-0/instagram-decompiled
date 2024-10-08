package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.settings.content.sources.fetch.IGCreatorAIContentCategoriesRepository;

/* renamed from: X.H5z  reason: case insensitive filesystem */
public final class C54282H5z extends C228042kh {
    public final UserSession A00;
    public final String A01;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        String str = this.A01;
        AnonymousClass7TG.A1N(userSession, str);
        return new C54185H2f(new IGCreatorAIContentCategoriesRepository(1vm.A01(userSession), str));
    }

    public C54282H5z(UserSession userSession, String str) {
        AnonymousClass7TG.A1O(userSession, str);
        this.A00 = userSession;
        this.A01 = str;
    }
}
