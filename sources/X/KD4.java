package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;
import com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel;

public final class KD4 extends C228042kh {
    public final AnonymousClass0iw A00;
    public final UserSession A01;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        AnonymousClass6h3 A002 = C313766gy.A00(userSession);
        AnonymousClass0iw r3 = this.A00;
        C313696gr A003 = C313636gl.A00(r3, userSession);
        IgLiveBroadcastInfoManager A012 = A002.A01();
        IgLiveHeartbeatManager igLiveHeartbeatManager = A002.A04;
        C313816h4 r10 = A002.A03;
        C59720JVe A03 = A002.A03();
        return new IgLiveViewerLikesViewModel(AnonymousClass0kN.A01(r3, userSession), userSession, A003.A00, (L7J) A003.A07.getValue(), (IgLiveLikesRepository) A002.A09.getValue(), (C63921LDa) A002.A00.getValue(), A012, r10, igLiveHeartbeatManager, A002.A02(), A03);
    }

    public KD4(AnonymousClass0iw r1, UserSession userSession) {
        AnonymousClass7TG.A1O(userSession, r1);
        this.A01 = userSession;
        this.A00 = r1;
    }
}
