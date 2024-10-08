package X;

import android.accounts.AccountManager;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;

public abstract class F9Q {
    public static final C258483z9 A00;

    public static final Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        0lg A0B = C308206Td.A0B(r7);
        C277014uI A0P = DbW.A0P(r8, 0);
        ArrayList A03 = FH1.A03(DbT.A04(), A0B, "LOG_IN");
        if (A03.isEmpty()) {
            DbX.A1P(r7, DbS.A0P(), A0P, 0Yt.A0E(), 0);
            return null;
        }
        AccountManager accountManager = AccountManager.get(DbT.A04());
        C258483z9 r3 = A00;
        ListenableFuture Eyk = r3.Eyk(new C41357Ase(1, accountManager, A0B, A03));
        0qQ.A07(Eyk);
        C255183ti.A04(new FTO(1, r7, A0P), Eyk, r3);
        return null;
    }

    static {
        C258473z8 listeningDecorator = MoreExecutors.listeningDecorator((ScheduledExecutorService) C61560nl.A00().A00);
        0qQ.A07(listeningDecorator);
        A00 = listeningDecorator;
    }
}
