package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2m6  reason: invalid class name and case insensitive filesystem */
public final class C228682m6 extends AnonymousClass2m1 {
    public boolean A00;
    public final UserSession A01;

    public final void Des(AnonymousClass1GU r5, 1XM r6) {
        0qQ.A0B(r6, 1);
        if (!this.A00) {
            this.A00 = true;
            if (1pN.A04 != null) {
                C241193Og r0 = r6.A07;
                if (r0 == null) {
                    r0 = C241193Og.A02;
                }
                C241213Oi r02 = r0.A01;
                if (r02 != null) {
                    C243443Yu.A00().A00 = r02.A00;
                }
                UserSession userSession = this.A01;
                0Tu r2 = 0Tu.A05;
                if (182.A06(r2, userSession, 36327606483696172L)) {
                    return;
                }
                if (182.A06(r2, userSession, 36327606483827246L)) {
                    C61480nO A002 = 0nY.A00();
                    0qQ.A07(A002);
                    A002.ATE(new C282565Dt(this));
                    return;
                }
                C243443Yu.A00().A01(userSession);
            }
        }
    }

    public C228682m6(UserSession userSession) {
        this.A01 = userSession;
    }
}
