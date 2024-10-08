package X;

import com.instagram.common.session.UserSession;

public final class IPC implements C250603lj {
    public final C234022wr A00;
    public final AnonymousClass57Q A01;

    public final void ATF(AnonymousClass30Y r13, C252093oY r14) {
        int i;
        1Xj A1c;
        boolean A1U = AnonymousClass7TF.A1U(0, r13, r14);
        1Xj r4 = (1Xj) r13.A03;
        AnonymousClass3W1 r3 = (AnonymousClass3W1) r13.A04;
        float CFe = r14.CFe(r13);
        Integer CEk = r14.CEk(r13);
        Integer num = AnonymousClass05K.A00;
        boolean A1W = AnonymousClass7TF.A1W(CEk, num);
        AnonymousClass57Q r2 = this.A01;
        if (r2.A08(r4, A1W) == A1U && r3.A3A && !r3.A2b) {
            0qQ.A0A(r4);
            0qQ.A0B(r4, 0);
            String id = r4.getId();
            if (id != null) {
                r2.A05 = r4;
                r2.A07 = id;
                r2.A0N.put(id, AnonymousClass7TE.A1L(r4, r3));
                1Xj r1 = r4;
                if (r4.CeS() || (r4.A5D() && (A1c = r4.A1c(0)) != null && A1c.CeS() == A1U && (r1 = r4.A1c(0)) != null)) {
                    UserSession userSession = r2.A0I;
                    i = Math.min((int) ((float) Math.ceil((double) (((float) r1.A1B()) / 1000.0f))), DbS.A04(C51965G9l.A0Z(userSession, 0), userSession, 36606315502310780L));
                } else {
                    UserSession userSession2 = r2.A0I;
                    i = DbS.A04(C51965G9l.A0Z(userSession2, 0), userSession2, 36606315502245243L);
                }
                r2.A02 = i;
            }
            if (CFe >= 0.25f) {
                String id2 = r4.getId();
                if (id2 != null) {
                    C54622HLf hLf = (C54622HLf) r2.A0O.get(id2);
                    if (hLf == null) {
                        hLf = C54622HLf.HIDDEN;
                    }
                    int ordinal = hLf.ordinal();
                    if (ordinal == 0) {
                        if (r2.A01 == r2.A02) {
                            r2.A0L.A02();
                            HQQ.A00 = false;
                            AnonymousClass57Q.A00(r2, num, "unknown");
                        }
                        r2.A08 = false;
                        r2.A0C = false;
                        r2.A0D = false;
                        AnonymousClass57Q.A01(r2, id2, false);
                        r3.A2r = A1U;
                        r2.A0M.A00.get(id2);
                    } else if (ordinal == 2) {
                        AnonymousClass57Q.A01(r2, id2, false);
                    }
                }
            } else {
                r2.A07(A1U);
            }
            C234022wr r12 = this.A00;
            if (r12.A00()) {
                if (CFe >= C51965G9l.A00(0Tu.A06, r12.A00, 37169265459003882L)) {
                    r2.A04();
                }
            }
        } else if (r4 != null && r4.CcK() == A1U) {
            r3.A2b = A1U;
        }
    }

    public IPC(C234022wr r1, AnonymousClass57Q r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
