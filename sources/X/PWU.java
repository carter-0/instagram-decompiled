package X;

import com.instagram.common.session.UserSession;
import java.util.Set;

public final class PWU implements Runnable {
    public final /* synthetic */ NJW A00;

    public PWU(NJW njw) {
        this.A00 = njw;
    }

    public final void run() {
        boolean z;
        C71153OeR A06 = this.A00.A06();
        if (A06.A01 != 0) {
            UserSession userSession = A06.A0h;
            0Tu r7 = 0Tu.A05;
            long A01 = 182.A01(r7, userSession, 36609631217063816L);
            if (A01 != 0 && System.currentTimeMillis() - A06.A01 < A01) {
                if (182.A06(r7, userSession, 36328156240624666L)) {
                    A06.A0Z.postDelayed(new PWT(A06), 500);
                    return;
                } else {
                    A06.A0r.A00();
                    return;
                }
            }
        }
        if (A06.A0R || (!A06.A0O && A06.A02 == C69375NkF.A06 && 2El.A03(A06.A0h))) {
            z = true;
        } else {
            z = false;
        }
        A06.A0R = z;
        C67565Mpz mpz = A06.A0n;
        mpz.A06(A06.A0W(), AnonymousClass05K.A0N);
        mpz.A04("ptr_attempt", (String) null);
        C68497NKq nKq = A06.A06;
        if (nKq != null) {
            A06.A03.A03(A06.A0i.Brn(), "MANUAL_REFRESH", (Set) nKq.A04.getValue());
        }
        A06.A0m(true, false);
    }
}
