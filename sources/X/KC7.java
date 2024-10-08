package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

public final class KC7 extends C228042kh {
    public final UserSession A00;

    public KC7(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        C62242Kcc A01 = LKG.A01(userSession);
        IgLiveBroadcastInfoManager A012 = A01.A01();
        IgLiveHeartbeatManager igLiveHeartbeatManager = A01.A04;
        return new C62309Kdh(userSession, (C17992VjU) A01.A07.getValue(), A012, A01.A03, igLiveHeartbeatManager, A01.A02(), A01.A03());
    }
}
