package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository;

/* renamed from: X.Jhi  reason: case insensitive filesystem */
public final class C60225Jhi extends 2YL {
    public final CreatorAgentSuggestedRepliesSettingsRepository A00;
    public final AnonymousClass0Ud A01;

    public C60225Jhi(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        CreatorAgentSuggestedRepliesSettingsRepository creatorAgentSuggestedRepliesSettingsRepository = (CreatorAgentSuggestedRepliesSettingsRepository) userSession.A01(CreatorAgentSuggestedRepliesSettingsRepository.class, new GW6(userSession, 3));
        this.A00 = creatorAgentSuggestedRepliesSettingsRepository;
        this.A01 = creatorAgentSuggestedRepliesSettingsRepository.A01;
    }

    public final void A00() {
        CreatorAgentSuggestedRepliesSettingsRepository creatorAgentSuggestedRepliesSettingsRepository = this.A00;
        if (!JTR.A1a(creatorAgentSuggestedRepliesSettingsRepository.A01)) {
            AnonymousClass4D7 A0t = C51975G9x.A0t(creatorAgentSuggestedRepliesSettingsRepository.A00);
            AnonymousClass7TE.A1Z(new MFR(creatorAgentSuggestedRepliesSettingsRepository, A0t, 0), creatorAgentSuggestedRepliesSettingsRepository.A01);
        }
    }
}
