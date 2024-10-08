package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

public final class KD5 extends C228042kh {
    public final AnonymousClass0iw A00;
    public final UserSession A01;

    public KD5(AnonymousClass0iw r2, UserSession userSession) {
        0qQ.A0B(r2, 2);
        this.A01 = userSession;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        C62242Kcc A012 = LKG.A01(userSession);
        AnonymousClass0iw r2 = this.A00;
        C62176KbY A013 = C64139LPo.A01(r2, userSession);
        C59720JVe A03 = A012.A03();
        IgLiveBroadcastInfoManager A014 = A012.A01();
        IgLiveHeartbeatManager igLiveHeartbeatManager = A012.A04;
        LES A02 = A012.A02();
        return new C60213JhW(r2, userSession, (LF6) A013.A05.getValue(), JTP.A0f(A012), A014, igLiveHeartbeatManager, A02, A03);
    }
}
