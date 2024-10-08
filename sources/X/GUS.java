package X;

import com.instagram.common.session.UserSession;

public final class GUS implements C229742nx {
    public final /* synthetic */ GAP A00;

    public GUS(GAP gap) {
        this.A00 = gap;
    }

    public final /* bridge */ /* synthetic */ void DM1(Object obj, int i, int i2) {
        1Xj A0m = C51968G9o.A0m(obj);
        GAP gap = this.A00;
        UserSession userSession = gap.A05;
        C271794jb r2 = new C271794jb(userSession, A0m);
        AnonymousClass4DU r4 = gap.A09;
        C233822wX.A0N(userSession, r2, A0m, r4, AnonymousClass05K.A01, "delivery");
        if (!C271854jh.A00(userSession, A0m) && !C228342lQ.A08(userSession, 1Au.A00(userSession))) {
            C233822wX.A0O(userSession, r2, A0m, r4, Integer.valueOf(A0m.A0m()), "duplicate_ad_received", A0m.A2p(), AnonymousClass7TE.A1I("duplicate_ad_inserted"), AnonymousClass7TE.A1I("duplicate_ad_received"));
        }
    }
}
