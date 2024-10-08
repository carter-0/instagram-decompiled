package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

public final class KCM extends C228042kh {
    public final UserSession A00;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        C62242Kcc A01 = LKG.A01(userSession);
        C59720JVe A03 = A01.A03();
        IgLiveBroadcastInfoManager A012 = A01.A01();
        LES A02 = A01.A02();
        return new C62414KfP(1Au.A00(userSession), (IgLiveJoinRequestsRepository) A01.A02.getValue(), (IgLiveQuestionSubmissionsRepository) A01.A0C.getValue(), A012, A02, A03, 182.A06(AnonymousClass7TF.A0H(userSession), userSession, 2342166277780548649L));
    }

    public KCM(UserSession userSession) {
        this.A00 = userSession;
    }
}
