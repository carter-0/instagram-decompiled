package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.prompts.dailyprompts.repository.DirectDailyPromptsResponseListRepository;
import com.instagram.model.direct.DirectThreadKey;

public final class NN6 extends C228042kh {
    public final UserSession A00;
    public final DirectThreadKey A01;
    public final String A02;

    public NN6(UserSession userSession, DirectThreadKey directThreadKey, String str) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = directThreadKey;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        String str = this.A02;
        DirectThreadKey directThreadKey = this.A01;
        0qQ.A0B(userSession, 0);
        return new C67731Mtk(userSession, (DirectDailyPromptsResponseListRepository) userSession.A01(DirectDailyPromptsResponseListRepository.class, C73921Pm1.A00(userSession, 26)), directThreadKey, str);
    }
}
