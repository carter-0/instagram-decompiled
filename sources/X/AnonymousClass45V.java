package X;

import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.Execution;
import java.util.concurrent.Executor;

/* renamed from: X.45V  reason: invalid class name */
public final class AnonymousClass45V implements Executor {
    public static final AnonymousClass45V A00 = new AnonymousClass45V();

    public final void execute(Runnable runnable) {
        Execution.executePossiblySync(new AnonymousClass45X(runnable), (AccountSession) null, 3);
    }
}
