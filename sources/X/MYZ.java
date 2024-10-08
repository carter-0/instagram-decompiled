package X;

import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.Execution;
import java.util.concurrent.Executor;

public final class MYZ implements Executor {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AccountSession A01;
    public final /* synthetic */ String A02;

    public MYZ(AccountSession accountSession, String str, int i) {
        this.A01 = accountSession;
        this.A00 = i;
        this.A02 = str;
    }

    public final void execute(Runnable runnable) {
        0qQ.A0B(runnable, 0);
        Execution.executePossiblySync(new C66604MYq(runnable, this.A02), this.A01, this.A00);
    }
}
