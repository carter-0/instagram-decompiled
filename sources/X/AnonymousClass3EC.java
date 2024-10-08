package X;

import android.os.Binder;
import android.os.Process;
import java.util.concurrent.Callable;

/* renamed from: X.3EC  reason: invalid class name */
public final class AnonymousClass3EC implements Callable {
    public final /* synthetic */ AnonymousClass3EB A00;

    public AnonymousClass3EC(AnonymousClass3EB r1) {
        this.A00 = r1;
    }

    public final Object call() {
        AnonymousClass3EB r4 = this.A00;
        r4.A02.set(true);
        Object obj = null;
        try {
            Process.setThreadPriority(10);
            obj = r4.A04.A06();
        } catch (AnonymousClass3ED e) {
            if (!r4.A01.get()) {
                throw e;
            }
        } catch (Throwable th) {
            try {
                r4.A01.set(true);
                throw th;
            } catch (Throwable th2) {
                r4.A00(obj);
                throw th2;
            }
        }
        Binder.flushPendingCommands();
        r4.A00(obj);
        return obj;
    }
}
