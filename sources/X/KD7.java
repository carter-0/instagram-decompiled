package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

public final class KD7 extends C228042kh {
    public final AnonymousClass0iw A00;
    public final UserSession A01;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        AnonymousClass6h3 A002 = C313766gy.A00(userSession);
        C313696gr A003 = C313636gl.A00(this.A00, userSession);
        C313816h4 r12 = A002.A03;
        IgLiveCommentsRepository igLiveCommentsRepository = (IgLiveCommentsRepository) A002.A06.getValue();
        LES A02 = A002.A02();
        L5Q l5q = (L5Q) A002.A03.getValue();
        L8Y l8y = (L8Y) A002.A0G.getValue();
        IgLiveViewerJoinFlowRepository igLiveViewerJoinFlowRepository = (IgLiveViewerJoinFlowRepository) A002.A02.getValue();
        C59720JVe A03 = A002.A03();
        L5P l5p = (L5P) A002.A01.getValue();
        C63921LDa lDa = (C63921LDa) A002.A00.getValue();
        return new C60310JjB(userSession, (C313716gt) A003.A05.getValue(), igLiveCommentsRepository, lDa, l8y, l5p, igLiveViewerJoinFlowRepository, l5q, (IgLiveBroadcastInfoManager) A002.A05.getValue(), r12, (IgLiveHeartbeatManager) A002.A08.getValue(), A02, A03);
    }

    public KD7(AnonymousClass0iw r1, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = r1;
    }
}
