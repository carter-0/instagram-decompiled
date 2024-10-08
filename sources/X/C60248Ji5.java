package X;

import com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* renamed from: X.Ji5  reason: case insensitive filesystem */
public final class C60248Ji5 extends 2YL {
    public float A00;
    public C262204Co A01;
    public final W0T A02;
    public final C313666go A03;
    public final C70599OCw A04;
    public final IgLiveModerationRepository A05;
    public final L5Q A06;
    public final IgLiveBroadcastInfoManager A07;
    public final C313816h4 A08;
    public final IgLiveHeartbeatManager A09;
    public final LES A0A;
    public final C59720JVe A0B;
    public final C249513ju A0C;
    public final AnonymousClass0r6 A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public final void A00(float f) {
        AnonymousClass7TF.A1O(this.A0A.A0C, true);
        float f2 = this.A00;
        float f3 = f;
        if (f < f2) {
            f3 = f2;
        }
        this.A00 = f3;
        AnonymousClass7TE.A1Z(new C59714JUx(this, (AnonymousClass4D7) null, f, 12), C318116oQ.A00(this));
    }

    public C60248Ji5(W0T w0t, C313666go r5, C70599OCw oCw, IgLiveModerationRepository igLiveModerationRepository, L5Q l5q, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, C313816h4 r10, IgLiveHeartbeatManager igLiveHeartbeatManager, LES les, C59720JVe jVe, boolean z, boolean z2, boolean z3) {
        C51974G9v.A1P(igLiveBroadcastInfoManager, igLiveHeartbeatManager, les, igLiveModerationRepository);
        C51973G9u.A0u(5, r10, jVe, r5);
        this.A07 = igLiveBroadcastInfoManager;
        this.A09 = igLiveHeartbeatManager;
        this.A0A = les;
        this.A05 = igLiveModerationRepository;
        this.A08 = r10;
        this.A04 = oCw;
        this.A02 = w0t;
        this.A06 = l5q;
        this.A0B = jVe;
        this.A03 = r5;
        this.A0G = z;
        this.A0E = z2;
        this.A0F = z3;
        1HR A0w = G9w.A0w();
        this.A0C = A0w;
        this.A0D = 0u9.A04(A0w);
        DbY.A19(this, MHB.A01(this, (AnonymousClass4D7) null, 21), jVe.A00);
    }
}
