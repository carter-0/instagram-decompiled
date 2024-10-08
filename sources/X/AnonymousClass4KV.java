package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4KV  reason: invalid class name */
public final class AnonymousClass4KV implements C250603lj, AnonymousClass30I {
    public final long A00;
    public final AnonymousClass30O A01;
    public final UserSession A02;
    public final AnonymousClass2pP A03;

    public final void ATF(AnonymousClass30Y r8, C252093oY r9) {
        0qQ.A0B(r8, 0);
        0qQ.A0B(r9, 1);
        int intValue = r9.CEk(r8).intValue();
        if (intValue == 0) {
            AnonymousClass2pP r1 = this.A03;
            String id = ((1Xj) r8.A03).getId();
            if (id != null) {
                r1.A00(id);
                if (this.A00 > 0) {
                    return;
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else if (intValue != 1) {
            this.A01.A00 = -1;
            AnonymousClass2pP r12 = this.A03;
            String id2 = ((1Xj) r8.A03).getId();
            if (id2 != null) {
                r12.A00(id2).A04(r9);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        } else {
            AnonymousClass30O r6 = this.A01;
            AnonymousClass2pP r5 = this.A03;
            r6.A01(r8, r9, r5);
            long j = this.A00;
            if (j <= 0 || r6.A00(r8, r9, r5) < j) {
                return;
            }
        }
        AnonymousClass3W1 r13 = (AnonymousClass3W1) r8.A04;
        if (!r13.A2q && r13.getPosition() >= 0) {
            1Xj r3 = (1Xj) r8.A03;
            AnonymousClass2v2 A002 = Py1.A00(this.A02);
            if (A002.EsQ(r3)) {
                A002.CNK(r3, AnonymousClass05K.A0C, r13.getPosition());
            }
        }
    }

    public final boolean CRp(AnonymousClass30Y r5, C252093oY r6) {
        UserSession userSession = this.A02;
        boolean A06 = 182.A06(0Tu.A05, userSession, 36323521969794287L);
        0qQ.A0A(Boolean.valueOf(A06));
        if (!A06 || !Py1.A00(userSession).EsQ((1Xj) r5.A03)) {
            return false;
        }
        return true;
    }

    public AnonymousClass4KV(UserSession userSession, AnonymousClass2pP r5) {
        this.A03 = r5;
        this.A02 = userSession;
        this.A00 = AnonymousClass30M.A03(AnonymousClass30K.A02(AnonymousClass30J.SECONDS, 182.A00(0Tu.A06, userSession, 37167946900242889L)));
        this.A01 = new AnonymousClass30O(AnonymousClass30N.A00(AnonymousClass05K.A00, 182.A04(0Tu.A05, userSession, 36889186342994754L)));
    }
}
