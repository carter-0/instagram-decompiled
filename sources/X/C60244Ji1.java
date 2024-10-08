package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* renamed from: X.Ji1  reason: case insensitive filesystem */
public class C60244Ji1 extends 2YL {
    public C262204Co A00;
    public final LR1 A01;
    public final UserSession A02;
    public final L7J A03;
    public final IgLiveLikesRepository A04;
    public final IgLiveBroadcastInfoManager A05;
    public final C313816h4 A06;
    public final IgLiveHeartbeatManager A07;
    public final C249513ju A08;
    public final AnonymousClass0r6 A09;

    public final void A05() {
        IgLiveLikesRepository igLiveLikesRepository = this.A04;
        igLiveLikesRepository.A02((String) null, C318116oQ.A00(this));
        if (this.A00 == null) {
            this.A00 = AnonymousClass11O.A03(C318116oQ.A00(this), 10q.A01(new C66169MGg(this, (AnonymousClass4D7) null, 17), igLiveLikesRepository.A05));
        }
    }

    public C60244Ji1(LR1 lr1, UserSession userSession, C313666go r7, L7J l7j, IgLiveLikesRepository igLiveLikesRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, C313816h4 r11, IgLiveHeartbeatManager igLiveHeartbeatManager) {
        C51974G9v.A1P(igLiveLikesRepository, igLiveBroadcastInfoManager, igLiveHeartbeatManager, r11);
        C51973G9u.A0s(6, userSession, r7, l7j);
        this.A04 = igLiveLikesRepository;
        this.A05 = igLiveBroadcastInfoManager;
        this.A07 = igLiveHeartbeatManager;
        this.A06 = r11;
        this.A01 = lr1;
        this.A02 = userSession;
        this.A03 = l7j;
        1HR A0w = G9w.A0w();
        this.A08 = A0w;
        this.A09 = 0u9.A04(A0w);
        JTS.A13(this, new C66169MGg(this, (AnonymousClass4D7) null, 16), igLiveLikesRepository.A07);
    }
}
