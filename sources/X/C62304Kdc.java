package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* renamed from: X.Kdc  reason: case insensitive filesystem */
public final class C62304Kdc extends C46787DlH {
    public final LB0 A00;
    public final IgLiveModerationRepository A01;
    public final IgLiveBroadcastInfoManager A02;
    public final C59720JVe A03;
    public final AnonymousClass0r6 A04;
    public final 05G A05 = 106.A01(C64101LMv.A05);
    public final 05G A06;

    public final void A06() {
        Object A0A = 00k.A0A(A03());
        if (A0A != null) {
            AnonymousClass7TE.A1Z(new C66173MGk(A0A, this, "add_moderator_sheet", (AnonymousClass4D7) null, 21), C318116oQ.A00(this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C62304Kdc(UserSession userSession, IgLiveModerationRepository igLiveModerationRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, C59720JVe jVe) {
        super(userSession, 6);
        LB0 lb0 = new LB0(userSession);
        AnonymousClass7TG.A1U(userSession, igLiveBroadcastInfoManager, jVe);
        0qQ.A0B(igLiveModerationRepository, 4);
        this.A02 = igLiveBroadcastInfoManager;
        this.A03 = jVe;
        this.A01 = igLiveModerationRepository;
        this.A00 = lb0;
        02z A10 = C51970G9q.A10(false);
        this.A06 = A10;
        this.A04 = AnonymousClass10H.A00(new MHu(4, (AnonymousClass4D7) null), A10, lb0.A07, lb0.A08);
        A05();
    }

    public final int A01() {
        return 1 - AnonymousClass7TE.A0M(this.A01.A09.getValue());
    }

    public final AnonymousClass0r6 A04() {
        return this.A04;
    }

    public final void A07() {
        JTR.A1V(this.A06);
        MGU.A02(this, C318116oQ.A00(this), 15);
    }

    public final Integer A02() {
        return 2131963929;
    }
}
