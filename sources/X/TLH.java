package X;

import java.lang.Thread;

public final class TLH implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ C11381SQt A00;

    public TLH(C11381SQt sQt) {
        this.A00 = sQt;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        C8485QvX qvX = this.A00.A0C;
        if (qvX != null) {
            qvX.A0H("Job execution failed", th);
        }
    }
}
