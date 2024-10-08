package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

public final class KD3 extends C228042kh {
    public final AnonymousClass0iw A00;
    public final UserSession A01;

    public KD3(AnonymousClass0iw r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        AnonymousClass6h3 A002 = C313766gy.A00(userSession);
        AnonymousClass0iw r0 = this.A00;
        C313696gr A003 = C313636gl.A00(r0, userSession);
        0wc A012 = AnonymousClass0kN.A01(r0, userSession);
        C59720JVe A03 = A002.A03();
        IgLiveBroadcastInfoManager A013 = A002.A01();
        IgLiveHeartbeatManager igLiveHeartbeatManager = A002.A04;
        LES A02 = A002.A02();
        C313816h4 r10 = A002.A03;
        C313716gt r6 = (C313716gt) A003.A05.getValue();
        return new C62312Kdk(A012, userSession, A003.A00, r6, (IgLiveCommentsRepository) A002.A06.getValue(), (C63921LDa) A002.A00.getValue(), A013, r10, igLiveHeartbeatManager, A02, A03);
    }
}
