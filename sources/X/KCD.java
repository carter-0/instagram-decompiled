package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository;

public final class KCD extends C228042kh {
    public final UserSession A00;

    public KCD(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        C62242Kcc A01 = LKG.A01(userSession);
        return new C62305Kdd(userSession, (IgLiveJoinRequestsRepository) A01.A02.getValue(), A01.A01(), A01.A02(), A01.A03(), 182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36323268566723623L));
    }
}
