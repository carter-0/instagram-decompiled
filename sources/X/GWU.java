package X;

import com.instagram.common.session.UserSession;

public final class GWU implements C250603lj {
    public final UserSession A00;
    public final C52557GXi A01;

    public final void ATF(AnonymousClass30Y r6, C252093oY r7) {
        0qQ.A0B(r6, 0);
        0qQ.A0B(r7, 1);
        C296935qt r4 = (C296935qt) r6.A03;
        if (r4 != null && (r4 instanceof C296965qw) && r7.CEk(r6) == AnonymousClass05K.A00) {
            AnonymousClass589 r1 = AnonymousClass589.EXPLORE;
            C296965qw r42 = (C296965qw) r4;
            String id = r42.BPf().getId();
            if (id != null) {
                AnonymousClass58G r2 = new AnonymousClass58G(r1, id);
                UserSession userSession = this.A00;
                AnonymousClass584.A00(userSession).A01(r2);
                if (182.A06(0Tu.A05, C52531GWi.A00(userSession).A02, 36313068019386060L)) {
                    C52557GXi gXi = this.A01;
                    1Xj BPf = r42.BPf();
                    0qQ.A0B(BPf, 0);
                    gXi.A04.EE4(BPf, AnonymousClass93C.A05);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public GWU(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = C52531GWi.A00(userSession);
    }
}
