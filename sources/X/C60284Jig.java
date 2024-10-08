package X;

import com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;
import java.util.concurrent.CancellationException;

/* renamed from: X.Jig  reason: case insensitive filesystem */
public final class C60284Jig extends 2YL {
    public C262204Co A00;
    public C262204Co A01;
    public final C313666go A02;
    public final M0X A03;
    public final LEQ A04;
    public final C70599OCw A05;
    public final IgLiveJoinRequestsRepository A06;
    public final IgLiveBroadcastInfoManager A07;
    public final L9O A08;
    public final IgLiveHeartbeatManager A09;
    public final LES A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final IgLiveCobroadcastRepository A0D;
    public final C17992VjU A0E;
    public final IgLiveLikesRepository A0F;
    public final C313816h4 A0G;

    public C60284Jig(C313666go r9, M0X m0x, IgLiveCobroadcastRepository igLiveCobroadcastRepository, LEQ leq, C17992VjU vjU, C70599OCw oCw, IgLiveJoinRequestsRepository igLiveJoinRequestsRepository, IgLiveLikesRepository igLiveLikesRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, C313816h4 r18, L9O l9o, IgLiveHeartbeatManager igLiveHeartbeatManager, LES les, boolean z, boolean z2) {
        C313816h4 r4 = r18;
        0qQ.A0B(r4, 1);
        IgLiveBroadcastInfoManager igLiveBroadcastInfoManager2 = igLiveBroadcastInfoManager;
        IgLiveHeartbeatManager igLiveHeartbeatManager2 = igLiveHeartbeatManager;
        IgLiveLikesRepository igLiveLikesRepository2 = igLiveLikesRepository;
        AnonymousClass7TG.A0w(2, igLiveBroadcastInfoManager2, igLiveHeartbeatManager2, igLiveLikesRepository2);
        L9O l9o2 = l9o;
        LES les2 = les;
        C51973G9u.A0s(6, l9o2, les2, vjU);
        this.A0G = r4;
        this.A07 = igLiveBroadcastInfoManager2;
        this.A09 = igLiveHeartbeatManager2;
        this.A0F = igLiveLikesRepository2;
        this.A0D = igLiveCobroadcastRepository;
        this.A08 = l9o2;
        this.A0A = les2;
        this.A0E = vjU;
        this.A04 = leq;
        this.A06 = igLiveJoinRequestsRepository;
        this.A05 = oCw;
        this.A03 = m0x;
        this.A02 = r9;
        this.A0B = z;
        this.A0C = z2;
        AnonymousClass11O.A03(C318116oQ.A00(this), AnonymousClass10H.A01(new MI2(this, (AnonymousClass4D7) null, 2), igLiveCobroadcastRepository.A01, l9o2.A02, l9o2.A01, igLiveBroadcastInfoManager2.A06));
        DbY.A19(this, MHB.A01(this, (AnonymousClass4D7) null, 35), igLiveHeartbeatManager2.A08);
    }

    public static final void A00(C60284Jig jig) {
        if (jig.A00 == null) {
            jig.A00 = C51966G9m.A1L(new MG2(jig, (AnonymousClass4D7) null, 4), C318116oQ.A00(jig));
        }
    }

    public final void A01(String str, Long l) {
        AnonymousClass7TE.A1Z(new MFV(this, str, (AnonymousClass4D7) null, 38), C318116oQ.A00(this));
        if (l != null) {
            this.A0G.A01.A01 = l.longValue() * 1000;
        }
        LRD lrd = this.A08.A00;
        C63896LAz lAz = lrd.A00;
        if (lAz == null) {
            lrd.A06.Epw((Object) null);
            05G r0 = lrd.A04;
            0sl r1 = 0sl.A00;
            r0.Epw(r1);
            lrd.A03.Epw(r1);
            lrd.A05.Epw(r1);
            lrd.A00 = new C63896LAz(lrd.A01, lrd, str);
        } else if (!0qQ.A0K(lAz.A08, str)) {
            throw AnonymousClass7TE.A0z("Cannot reuse for another broadcast.");
        }
        C63896LAz lAz2 = lrd.A00;
        if (lAz2 != null && !lAz2.A01) {
            1Ng A002 = AnonymousClass1Nd.A00(lAz2.A02);
            A002.A01(lAz2.A04, C62167KbP.class);
            A002.A01(lAz2.A07, C62171KbT.class);
            A002.A01(lAz2.A06, C62170KbS.class);
            A002.A01(lAz2.A05, C62169KbR.class);
            lAz2.A01 = true;
        }
        C262204Co r02 = this.A00;
        if (r02 != null) {
            r02.AG7((CancellationException) null);
        }
        this.A00 = null;
        A00(this);
        C313666go r03 = this.A02;
        C313666go r5 = C313666go.BROADCASTER;
        if (r03 == r5) {
            this.A0F.A02(str, C318116oQ.A00(this));
        }
        LES les = this.A0A;
        if (les.A03 == r5) {
            les.A0U.Epw(C62515Kh5.STARTED);
        }
        les.A0G.Epw(true);
        les.A0K.Epw(true);
        IgLiveJoinRequestsRepository igLiveJoinRequestsRepository = this.A06;
        if (igLiveJoinRequestsRepository != null) {
            DbY.A19(this, new JV9(this, str, (AnonymousClass4D7) null, 3), igLiveJoinRequestsRepository.A09);
        }
    }
}
