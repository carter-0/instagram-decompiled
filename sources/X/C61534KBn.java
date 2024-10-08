package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.suggestedreplies.repository.CreatorAgentSuggestedRepliesRepository;
import com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository;
import com.instagram.creator.agent.suggestedreplies.viewmodel.CreatorAgentSuggestedRepliesViewModel;

/* renamed from: X.KBn  reason: case insensitive filesystem */
public final class C61534KBn extends C228042kh {
    public final UserSession A00;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        LDR ldr = new LDR(userSession);
        CreatorAgentSuggestedRepliesRepository creatorAgentSuggestedRepliesRepository = new CreatorAgentSuggestedRepliesRepository(userSession);
        0qQ.A0B(userSession, 0);
        return new CreatorAgentSuggestedRepliesViewModel(userSession, ldr, creatorAgentSuggestedRepliesRepository, (CreatorAgentSuggestedRepliesSettingsRepository) userSession.A01(CreatorAgentSuggestedRepliesSettingsRepository.class, new GW6(userSession, 3)));
    }

    public C61534KBn(UserSession userSession) {
        this.A00 = userSession;
    }
}
