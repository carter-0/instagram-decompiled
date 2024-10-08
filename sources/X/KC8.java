package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

public final class KC8 extends C228042kh {
    public final UserSession A00;

    public KC8(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        C313666go r2 = C313666go.GUEST;
        C62243Kcd A002 = C63486Kxq.A00(userSession, r2);
        C59720JVe A03 = A002.A03();
        IgLiveBroadcastInfoManager A01 = A002.A01();
        IgLiveHeartbeatManager igLiveHeartbeatManager = A002.A04;
        L9O l9o = A002.A00;
        LES A02 = A002.A02();
        0qQ.A0B(userSession, 1);
        C51974G9v.A1S(A03, A01, igLiveHeartbeatManager, l9o, A02);
        return new C60257JiE(userSession, r2, A01, l9o, igLiveHeartbeatManager, A02, A03);
    }
}
