package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;
import java.util.concurrent.TimeUnit;

/* renamed from: X.JiY  reason: case insensitive filesystem */
public final class C60277JiY extends 2YL {
    public static final long A0B = TimeUnit.SECONDS.toMillis(60);
    public C262204Co A00;
    public final UserSession A01;
    public final AnonymousClass0t1 A02;
    public final C63884LAn A03;
    public final IgLiveCobroadcastRepository A04;
    public final IgLiveViewerJoinFlowRepository A05;
    public final IgLiveBroadcastInfoManager A06;
    public final IgLiveHeartbeatManager A07;
    public final C249513ju A08;
    public final AnonymousClass0r6 A09;
    public final boolean A0A;

    public /* synthetic */ C60277JiY(UserSession userSession, C63884LAn lAn, IgLiveCobroadcastRepository igLiveCobroadcastRepository, IgLiveViewerJoinFlowRepository igLiveViewerJoinFlowRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, IgLiveHeartbeatManager igLiveHeartbeatManager, boolean z) {
        AnonymousClass0t1 A002 = 0eE.A00(userSession);
        C51974G9v.A1M(igLiveBroadcastInfoManager, igLiveHeartbeatManager, igLiveViewerJoinFlowRepository);
        AnonymousClass7TF.A1F(lAn, 6, A002);
        this.A01 = userSession;
        this.A06 = igLiveBroadcastInfoManager;
        this.A07 = igLiveHeartbeatManager;
        this.A05 = igLiveViewerJoinFlowRepository;
        this.A04 = igLiveCobroadcastRepository;
        this.A03 = lAn;
        this.A0A = z;
        this.A02 = A002;
        1HR A0o = JTQ.A0o();
        this.A08 = A0o;
        this.A09 = 0u9.A04(A0o);
        JTS.A13(this, MHB.A01(this, (AnonymousClass4D7) null, 30), igLiveBroadcastInfoManager.A06);
        JTS.A13(this, MHB.A01(this, (AnonymousClass4D7) null, 31), igLiveHeartbeatManager.A08);
        DbY.A19(this, new C66169MGg(this, (AnonymousClass4D7) null, 15), igLiveViewerJoinFlowRepository.A07);
    }
}
