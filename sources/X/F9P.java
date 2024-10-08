package X;

import android.accounts.AccountManager;
import android.content.Context;
import android.util.Patterns;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.ScheduledExecutorService;

public abstract class F9P {
    public static final C258483z9 A00;

    public static final Object A00(C307896Rx r9, AnonymousClass6Tm r10) {
        C307786Rm r0 = r9.A03;
        if (r0 != null) {
            Context context = r0.A00;
            String A0h = DbY.A0h(r10, 0);
            C277014uI A0N = DbW.A0N(r10);
            0lg A0V = DbU.A0V(r9);
            if (A0h == null || A0h.length() == 0 || !DbV.A1b(A0h, Patterns.EMAIL_ADDRESS) || !00p.A0i(A0h, "gmail.com", false) || 1DL.A07(context, "android.permission.GET_ACCOUNTS")) {
                DbX.A1P(r9, DbS.A0P(), A0N, "", 0);
                return null;
            }
            AccountManager accountManager = AccountManager.get(context);
            C258483z9 r2 = A00;
            ListenableFuture Eyk = r2.Eyk(new C13145TNd(accountManager, A0V, A0h, 1));
            0qQ.A07(Eyk);
            C255183ti.A04(new FTO(0, r9, A0N), Eyk, r2);
        }
        return null;
    }

    static {
        C258473z8 listeningDecorator = MoreExecutors.listeningDecorator((ScheduledExecutorService) C61560nl.A00().A00);
        0qQ.A07(listeningDecorator);
        A00 = listeningDecorator;
    }
}
