package X;

import java.lang.Thread;

/* renamed from: X.7nH  reason: invalid class name and case insensitive filesystem */
public final class C341637nH implements Thread.UncaughtExceptionHandler {
    public C341667nK A00;
    public Thread.UncaughtExceptionHandler A01;

    public final void uncaughtException(Thread thread, Throwable th) {
        C341667nK r0 = this.A00;
        if (r0 != null) {
            r0.A02();
            this.A00 = null;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.A01;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
