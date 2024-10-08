package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

public final class KC9 extends C228042kh {
    public final UserSession A00;

    public KC9(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        C62242Kcc A01 = LKG.A01(userSession);
        C59720JVe A03 = A01.A03();
        IgLiveBroadcastInfoManager A012 = A01.A01();
        IgLiveHeartbeatManager igLiveHeartbeatManager = A01.A04;
        L9O l9o = A01.A00;
        LES A02 = A01.A02();
        0qQ.A0B(userSession, 1);
        C51974G9v.A1S(A03, A012, igLiveHeartbeatManager, l9o, A02);
        return new C60257JiE(userSession, C313666go.BROADCASTER, A012, l9o, igLiveHeartbeatManager, A02, A03);
    }
}
