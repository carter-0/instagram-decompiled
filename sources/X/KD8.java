package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

public final class KD8 extends C228042kh {
    public final AnonymousClass0iw A00;
    public final UserSession A01;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        AnonymousClass6h3 A002 = C313766gy.A00(userSession);
        C313696gr A003 = C313636gl.A00(this.A00, userSession);
        IgLiveHeartbeatManager igLiveHeartbeatManager = A002.A04;
        C59720JVe A03 = A002.A03();
        LES A02 = A002.A02();
        IgLiveBroadcastInfoManager A012 = A002.A01();
        return new C62415KfQ(userSession, 1Au.A00(userSession), (C313716gt) A003.A04.getValue(), (IgLiveQuestionSubmissionsRepository) A002.A0C.getValue(), (L8Y) A002.A0G.getValue(), A012, igLiveHeartbeatManager, A02, A03, C278264wZ.A04(userSession), 182.A06(AnonymousClass7TF.A0H(userSession), userSession, 2342166277780614186L));
    }

    public KD8(AnonymousClass0iw r1, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = r1;
    }
}
