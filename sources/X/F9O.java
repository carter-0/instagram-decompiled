package X;

import android.accounts.AccountManager;
import android.content.Context;
import android.util.Patterns;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.ScheduledExecutorService;

public abstract class F9O {
    public static final C258483z9 A00;

    public static final Object A00(C307896Rx r8, AnonymousClass6Tm r9) {
        C277014uI A0P = DbW.A0P(r9, 0);
        String str = (String) DbW.A0d(r9);
        C307786Rm r0 = r8.A03;
        if (r0 != null) {
            Context context = r0.A00;
            0lg A0V = DbU.A0V(r8);
            if (str == null || str.length() == 0 || !DbV.A1b(str, Patterns.EMAIL_ADDRESS) || !00p.A0i(str, "@gmail.com", false) || 1DL.A07(context, "android.permission.GET_ACCOUNTS")) {
                DbX.A1P(r8, DbS.A0P(), A0P, (Object) null, 0);
                return null;
            }
            AccountManager accountManager = AccountManager.get(context);
            C258483z9 r3 = A00;
            ListenableFuture Eyk = r3.Eyk(new C13145TNd(accountManager, A0V, str, 0));
            0qQ.A07(Eyk);
            C255183ti.A04(new T0R(r8, A0P, str, 2), Eyk, r3);
        }
        return null;
    }

    static {
        C258473z8 listeningDecorator = MoreExecutors.listeningDecorator((ScheduledExecutorService) C61560nl.A00().A00);
        0qQ.A07(listeningDecorator);
        A00 = listeningDecorator;
    }
}
