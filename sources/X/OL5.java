package X;

import com.instagram.common.session.UserSession;

public final class OL5 {
    public N2V A00;
    public final C70784OLe A01;
    public final C61410nE A02;
    public final AnonymousClass4kA A03;

    public OL5(UserSession userSession) {
        AnonymousClass4kA A002 = AnonymousClass4k9.A00(userSession);
        0Tu r2 = 0Tu.A05;
        int A04 = DbS.A04(r2, userSession, 36603571018404795L);
        int A042 = DbS.A04(r2, userSession, 36603571018470332L);
        int A043 = DbS.A04(r2, userSession, 36603571018535869L);
        C61410nE r0 = C61410nE.A00;
        DbW.A1N(A002, 1, r0);
        this.A03 = A002;
        this.A02 = r0;
        0xa r5 = A002.A00;
        N2V n2v = new N2V(r5.getInt("stickers_suggestions_impressions_count", 0), r5.getInt("stickers_suggestions_trigger_count", 0), DbW.A06(r5, "stickers_suggestions_cool_down_end"));
        this.A00 = n2v;
        this.A01 = new C70784OLe(new MMO(this, 41), A04, A042, A043, n2v.A00, n2v.A01, n2v.A02);
    }

    public final void A00() {
        C70784OLe oLe = this.A01;
        N2V n2v = new N2V(oLe.A00, oLe.A01, oLe.A02);
        if (!0qQ.A0K(this.A00, n2v)) {
            this.A00 = n2v;
            AnonymousClass4kA r0 = this.A03;
            int i = n2v.A00;
            long j = n2v.A02;
            int i2 = n2v.A01;
            0xY AR4 = r0.A00.AR4();
            AR4.E5Z("stickers_suggestions_impressions_count", i);
            AR4.E5Z("stickers_suggestions_trigger_count", i2);
            AR4.E5c("stickers_suggestions_cool_down_end", j);
            AR4.commit();
        }
    }
}
