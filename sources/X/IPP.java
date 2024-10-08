package X;

import com.instagram.api.schemas.AFI_TYPE;
import com.instagram.common.session.UserSession;

public final class IPP implements C250603lj, AnonymousClass30I {
    public final long A00;
    public final C233102ux A01;
    public final UserSession A02;
    public final AnonymousClass2pP A03;

    public final void ATF(AnonymousClass30Y r8, C252093oY r9) {
        boolean A1U = AnonymousClass7TF.A1U(0, r8, r9);
        int A0A = C51968G9o.A0A(r8, r9);
        if (A0A == 0) {
            AnonymousClass2pP r1 = this.A03;
            String A1E = C51966G9m.A1E(r8.A03);
            if (A1E != null) {
                r1.A00(A1E);
                this.A01.EUa(AFI_TYPE.DWELL_FEED_REPETITION, System.currentTimeMillis());
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else if (A0A != A1U) {
            AnonymousClass2pP r12 = this.A03;
            String A1E2 = C51966G9m.A1E(r8.A03);
            if (A1E2 != null) {
                r12.A00(A1E2).A04(r9);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else if (r9.B0M(r8) >= this.A00) {
            1Xj r3 = (1Xj) r8.A03;
            AnonymousClass3W1 r4 = (AnonymousClass3W1) r8.A04;
            C233102ux r13 = this.A01;
            Integer num = AnonymousClass05K.A0C;
            AFI_TYPE afi_type = AFI_TYPE.DWELL_FEED_REPETITION;
            if (r13.EsX(afi_type, r3, num)) {
                0qQ.A0A(r4);
                r13.Cui(afi_type, r3, r4, num, r4.getPosition());
            }
        }
    }

    public final boolean CRp(AnonymousClass30Y r5, C252093oY r6) {
        Integer num = AnonymousClass05K.A0C;
        return this.A01.EsX(AFI_TYPE.DWELL_FEED_REPETITION, (1Xj) r5.A03, num);
    }

    public IPP(UserSession userSession, C233102ux r6, AnonymousClass2pP r7) {
        this.A03 = r7;
        this.A02 = userSession;
        this.A01 = r6;
        this.A00 = (long) (182.A00(0Tu.A06, userSession, 37173160990212689L) * 1000.0d);
    }
}
