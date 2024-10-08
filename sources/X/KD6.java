package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

public final class KD6 extends C228042kh {
    public final AnonymousClass0iw A00;
    public final UserSession A01;

    public KD6(AnonymousClass0iw r2, UserSession userSession) {
        0qQ.A0B(r2, 2);
        this.A01 = userSession;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        AnonymousClass6h3 A002 = C313766gy.A00(userSession);
        AnonymousClass0iw r2 = this.A00;
        C313696gr A003 = C313636gl.A00(r2, userSession);
        IgLiveBroadcastInfoManager A012 = A002.A01();
        IgLiveHeartbeatManager igLiveHeartbeatManager = A002.A04;
        return new C60214JhX(r2, userSession, (LF6) A003.A05.getValue(), JTP.A0f(A002), A012, igLiveHeartbeatManager);
    }
}
