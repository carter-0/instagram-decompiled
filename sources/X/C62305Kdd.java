package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import java.util.Set;

/* renamed from: X.Kdd  reason: case insensitive filesystem */
public final class C62305Kdd extends C46787DlH {
    public C262204Co A00;
    public final 2Fk A01;
    public final IgLiveJoinRequestsRepository A02;
    public final IgLiveBroadcastInfoManager A03;
    public final C59720JVe A04;
    public final boolean A05;
    public final int A06;
    public final LES A07;
    public final AnonymousClass0r6 A08;

    public final int A01() {
        return this.A06;
    }

    public final AnonymousClass0r6 A04() {
        return this.A08;
    }

    public final void A07() {
        if (!this.A05 && this.A00 == null) {
            this.A00 = C51966G9m.A1L(new MGU(this, (AnonymousClass4D7) null, 0), C318116oQ.A00(this));
        }
    }

    public final void A08() {
        if (!this.A05) {
            this.A00 = JTQ.A0n(this.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62305Kdd(UserSession userSession, IgLiveJoinRequestsRepository igLiveJoinRequestsRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, LES les, C59720JVe jVe, boolean z) {
        super(userSession, 6);
        C51974G9v.A1M(igLiveJoinRequestsRepository, igLiveBroadcastInfoManager, jVe);
        0qQ.A0B(les, 5);
        this.A02 = igLiveJoinRequestsRepository;
        this.A03 = igLiveBroadcastInfoManager;
        this.A04 = jVe;
        this.A07 = les;
        this.A05 = z;
        AnonymousClass0Ud r4 = igLiveJoinRequestsRepository.A08;
        AnonymousClass0Ud r5 = igLiveJoinRequestsRepository.A0A;
        this.A08 = AnonymousClass10H.A03(new C66192MHi((Object) this, (AnonymousClass4D7) null, 14), r4, r5);
        this.A06 = (les.A00 - 1) - ((Set) les.A0V.getValue()).size();
        this.A01 = DbT.A0G(AnonymousClass10H.A00(new MHr(this, (AnonymousClass4D7) null, 7), les.A0h, r4, r5));
        A05();
    }

    public final Integer A02() {
        return 2131963928;
    }

    public final void A06() {
        MGU.A02(this, C318116oQ.A00(this), 1);
    }
}
