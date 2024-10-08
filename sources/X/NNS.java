package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.prompts.dailyprompts.repository.DirectDailyPromptsResponseListRepository;
import com.instagram.model.direct.DirectThreadKey;

public final class NNS extends C228042kh {
    public final int A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final DirectThreadKey A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public NNS(AnonymousClass0iw r2, UserSession userSession, DirectThreadKey directThreadKey, String str, String str2, String str3, int i) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = r2;
        this.A03 = directThreadKey;
        this.A06 = str;
        this.A05 = str2;
        this.A00 = i;
        this.A04 = str3;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A02;
        AnonymousClass0iw r2 = this.A01;
        0qQ.A0B(userSession, 0);
        Class<DirectDailyPromptsResponseListRepository> cls = DirectDailyPromptsResponseListRepository.class;
        DirectThreadKey directThreadKey = this.A03;
        String str = this.A06;
        String str2 = this.A05;
        int i = this.A00;
        String str3 = this.A04;
        return new C67743Mtw(r2, userSession, C69909NuB.A00(userSession), (DirectDailyPromptsResponseListRepository) userSession.A01(cls, C73921Pm1.A00(userSession, 26)), directThreadKey, str, str2, str3, i);
    }
}
