package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* renamed from: X.KDj  reason: case insensitive filesystem */
public final class C61582KDj extends C228042kh {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C313666go A02;

    public final /* bridge */ /* synthetic */ 2YL create() {
        C313786h0 r0 = C313776gz.A0K;
        UserSession userSession = this.A01;
        C313666go r4 = this.A02;
        C313776gz A002 = r0.A00(userSession, r4);
        C313646gm A003 = C313646gm.A0A.A00(this.A00, userSession, r4);
        IgLiveBroadcastInfoManager A012 = A002.A01();
        IgLiveHeartbeatManager igLiveHeartbeatManager = A002.A04;
        C313816h4 r8 = A002.A03;
        return new C60244Ji1((LR1) A002.A0F.getValue(), userSession, r4, (L7J) A003.A07.getValue(), (IgLiveLikesRepository) A002.A09.getValue(), A012, r8, igLiveHeartbeatManager);
    }

    public C61582KDj(AnonymousClass0iw r1, UserSession userSession, C313666go r3) {
        AnonymousClass7TG.A1Q(r1, r3);
        this.A01 = userSession;
        this.A00 = r1;
        this.A02 = r3;
    }
}
