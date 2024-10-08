package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* renamed from: X.JhX  reason: case insensitive filesystem */
public final class C60214JhX extends 2YL {
    public boolean A00;
    public boolean A01;
    public final LF6 A02;
    public final C249513ju A03;
    public final AnonymousClass0r6 A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final IgLiveModerationRepository A07;
    public final IgLiveBroadcastInfoManager A08;
    public final IgLiveHeartbeatManager A09;

    public C60214JhX(AnonymousClass0iw r6, UserSession userSession, LF6 lf6, IgLiveModerationRepository igLiveModerationRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, IgLiveHeartbeatManager igLiveHeartbeatManager) {
        0qQ.A0B(userSession, 1);
        C51974G9v.A1S(r6, igLiveBroadcastInfoManager, igLiveHeartbeatManager, igLiveModerationRepository, lf6);
        this.A06 = userSession;
        this.A05 = r6;
        this.A08 = igLiveBroadcastInfoManager;
        this.A09 = igLiveHeartbeatManager;
        this.A07 = igLiveModerationRepository;
        this.A02 = lf6;
        1HR A0w = G9w.A0w();
        this.A03 = A0w;
        this.A04 = 0u9.A04(A0w);
        JTR.A1G(this, new C66194MHk((Object) this, (AnonymousClass4D7) null, 43), igLiveHeartbeatManager.A08, igLiveBroadcastInfoManager.A06);
    }
}
