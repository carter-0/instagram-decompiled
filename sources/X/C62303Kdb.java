package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* renamed from: X.Kdb  reason: case insensitive filesystem */
public final class C62303Kdb extends C46787DlH {
    public final 2Fk A00;
    public final LB1 A01;
    public final IgLiveBroadcastInfoManager A02;
    public final C59720JVe A03;
    public final AnonymousClass0r6 A04;
    public final 05G A05;
    public final boolean A06;

    public final void A07(String str) {
        String str2 = str;
        AnonymousClass7TF.A1O(this.A05, AnonymousClass7TF.A1R(str.length()));
        Object value = this.A02.A06.getValue();
        if (value != null) {
            AnonymousClass7TE.A1Z(new C66173MGk(value, this, str2, (AnonymousClass4D7) null, 19), C318116oQ.A00(this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C62303Kdb(UserSession userSession, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, LES les, C59720JVe jVe, boolean z) {
        super(userSession, 6);
        LB1 lb1 = new LB1(userSession);
        0qQ.A0B(igLiveBroadcastInfoManager, 2);
        C59720JVe jVe2 = jVe;
        AnonymousClass7TF.A1D(les, 3, jVe2);
        this.A02 = igLiveBroadcastInfoManager;
        this.A03 = jVe2;
        this.A01 = lb1;
        this.A06 = z;
        02z A10 = C51970G9q.A10(false);
        this.A05 = A10;
        AnonymousClass0Ud r11 = lb1.A07;
        AnonymousClass0Ud r10 = lb1.A08;
        this.A04 = AnonymousClass10H.A00(new MHu(3, (AnonymousClass4D7) null), A10, r11, r10);
        this.A00 = DbT.A0G(new MC1(0, this, JTS.A1b(new AnonymousClass0Ud[]{A10, les.A0V, les.A0Z, les.A0h, les.A0a, r10, r11})));
        A05();
    }

    public final AnonymousClass0r6 A04() {
        return this.A04;
    }

    public final Integer A02() {
        return 2131963931;
    }

    public final void A06() {
        C66184MGv.A02(this, C318116oQ.A00(this), 49);
    }
}
