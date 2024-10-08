package X;

import java.lang.Thread;
import java.lang.ref.WeakReference;

/* renamed from: X.7sF  reason: invalid class name and case insensitive filesystem */
public final class C344677sF implements Thread.UncaughtExceptionHandler {
    public WeakReference A00;

    public final void uncaughtException(Thread thread, Throwable th) {
        C344647sC r2 = (C344647sC) this.A00.get();
        if (r2 != null) {
            r2.A05.DQJ(r2, new RuntimeException(th));
        }
    }
}
