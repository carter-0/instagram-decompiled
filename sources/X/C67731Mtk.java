package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.prompts.dailyprompts.repository.DirectDailyPromptsResponseListRepository;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Mtk  reason: case insensitive filesystem */
public final class C67731Mtk extends 2YL {
    public final UserSession A00;
    public final DirectThreadKey A01;
    public final String A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(C73921Pm1.A00(this, 29));
    public final AnonymousClass0Ud A04;
    public final DirectDailyPromptsResponseListRepository A05;

    public C67731Mtk(UserSession userSession, DirectDailyPromptsResponseListRepository directDailyPromptsResponseListRepository, DirectThreadKey directThreadKey, String str) {
        C51974G9v.A1M(str, directThreadKey, directDailyPromptsResponseListRepository);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = directThreadKey;
        this.A05 = directDailyPromptsResponseListRepository;
        C73522Pe8 pe8 = new C73522Pe8(6, this, new AnonymousClass0r6[]{directDailyPromptsResponseListRepository.A0A, directDailyPromptsResponseListRepository.A05});
        this.A04 = 10b.A02(new C61078JwG((Object) null, 13), C318116oQ.A00(this), pe8, AnonymousClass10A.A01);
    }
}
