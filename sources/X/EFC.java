package X;

import com.instagram.common.session.UserSession;
import com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository;

public final class EFC extends C228042kh {
    public final UserSession A00;
    public final SubscribedAndRecommendedCreatorListRepository A01;
    public final boolean A02;

    public EFC(UserSession userSession, SubscribedAndRecommendedCreatorListRepository subscribedAndRecommendedCreatorListRepository, boolean z) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = subscribedAndRecommendedCreatorListRepository;
        this.A02 = z;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new C46797DlY(this.A00, this.A01, this.A02);
    }
}
