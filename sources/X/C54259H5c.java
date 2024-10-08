package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.onboarding.repository.CreatorAIAgentCreationRepository;

/* renamed from: X.H5c  reason: case insensitive filesystem */
public final class C54259H5c extends C228042kh {
    public final UserSession A00;

    public C54259H5c(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        0qQ.A0B(userSession, 0);
        return new C54180H2a(userSession, new CreatorAIAgentCreationRepository(userSession));
    }
}
