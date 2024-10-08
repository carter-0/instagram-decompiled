package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* renamed from: X.JhW  reason: case insensitive filesystem */
public final class C60213JhW extends 2YL {
    public final LF6 A00;
    public final IgLiveModerationRepository A01;
    public final IgLiveBroadcastInfoManager A02;
    public final C249513ju A03;
    public final AnonymousClass0r6 A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final IgLiveHeartbeatManager A07;
    public final LES A08;
    public final C59720JVe A09;

    public C60213JhW(AnonymousClass0iw r6, UserSession userSession, LF6 lf6, IgLiveModerationRepository igLiveModerationRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, IgLiveHeartbeatManager igLiveHeartbeatManager, LES les, C59720JVe jVe) {
        0qQ.A0B(userSession, 1);
        C51974G9v.A1S(r6, jVe, igLiveBroadcastInfoManager, igLiveHeartbeatManager, les);
        AnonymousClass7TF.A1F(igLiveModerationRepository, 7, lf6);
        this.A06 = userSession;
        this.A05 = r6;
        this.A09 = jVe;
        this.A02 = igLiveBroadcastInfoManager;
        this.A07 = igLiveHeartbeatManager;
        this.A08 = les;
        this.A01 = igLiveModerationRepository;
        this.A00 = lf6;
        1HR A0w = G9w.A0w();
        this.A03 = A0w;
        this.A04 = 0u9.A04(A0w);
        JTR.A1G(this, new C66192MHi((Object) this, (AnonymousClass4D7) null, 15), igLiveBroadcastInfoManager.A06, les.A0s);
        JTS.A13(this, new C66169MGg(this, (AnonymousClass4D7) null, 24), igLiveModerationRepository.A04);
        JTS.A13(this, new C66169MGg(this, (AnonymousClass4D7) null, 25), jVe.A00);
    }
}
