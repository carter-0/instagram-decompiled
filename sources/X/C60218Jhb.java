package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* renamed from: X.Jhb  reason: case insensitive filesystem */
public final class C60218Jhb extends 2YL {
    public boolean A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C313666go A03;
    public final IgLiveBroadcastInfoManager A04;
    public final C59720JVe A05;
    public final C249513ju A06;
    public final AnonymousClass0r6 A07;
    public final 05G A08;
    public final 05G A09;
    public final AnonymousClass0Ud A0A;
    public final IgLiveHeartbeatManager A0B;

    public C60218Jhb(AnonymousClass0iw r7, UserSession userSession, C313666go r9, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, IgLiveHeartbeatManager igLiveHeartbeatManager, C59720JVe jVe) {
        C51974G9v.A1P(userSession, r7, igLiveBroadcastInfoManager, igLiveHeartbeatManager);
        0qQ.A0B(jVe, 5);
        0qQ.A0B(r9, 6);
        this.A02 = userSession;
        this.A01 = r7;
        this.A04 = igLiveBroadcastInfoManager;
        this.A0B = igLiveHeartbeatManager;
        this.A05 = jVe;
        this.A03 = r9;
        1HR A0w = G9w.A0w();
        this.A06 = A0w;
        this.A07 = 0u9.A04(A0w);
        02z A012 = 106.A01((Object) null);
        this.A08 = A012;
        this.A0A = 10b.A03(A012);
        02z A10 = C51970G9q.A10(false);
        this.A09 = A10;
        JTR.A1H(this, new MHr(this, (AnonymousClass4D7) null, 6), igLiveBroadcastInfoManager.A06, igLiveHeartbeatManager.A08, A10);
    }
}
