package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.common.session.UserSession;

public abstract class OQP {
    public static final void A00(ListenableFuture listenableFuture, AnonymousClass7UH r4, String str) {
        boolean A1U = AnonymousClass7TF.A1U(0, r4, listenableFuture);
        if (str != null) {
            r4.A03(str, false);
            r4.A05(str, A1U);
            C71810OrC.A00(listenableFuture, new C73943PmN(str, r4, 41), 1Lf.A01, 7);
        }
    }

    public static final boolean A01(UserSession userSession, boolean z) {
        long j;
        0qQ.A0B(userSession, 0);
        0Tu r2 = 0Tu.A05;
        if (z) {
            j = 36602119318934058L;
        } else {
            j = 36602119318737448L;
        }
        long A01 = 182.A01(r2, userSession, j);
        0qQ.A0A(Long.valueOf(A01));
        if (A01 > 0 && 2SP.A01.A08(A01) == 0) {
            return true;
        }
        return false;
    }
}
