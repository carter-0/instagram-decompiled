package X;

import java.lang.Thread;

public final class TLF implements Thread.UncaughtExceptionHandler {
    public final void uncaughtException(Thread thread, Throwable th) {
        String A0R = 002.A0R("UncaughtException in ", thread.getName());
        new IllegalStateException(th);
        0qQ.A0B(A0R, 2);
    }
}
