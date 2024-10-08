package X;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.FutureTask;

/* renamed from: X.TSj  reason: case insensitive filesystem */
public final class C13268TSj extends FutureTask {
    public final /* synthetic */ C13275TSq A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13268TSj(C13275TSq tSq, Object obj, Runnable runnable) {
        super(runnable, obj);
        this.A00 = tSq;
    }

    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.A00.A00.A00;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        } else if (Log.isLoggable("GAv4", 6)) {
            String valueOf = String.valueOf(th);
            Log.e("GAv4", Pxg.A0s("MeasurementExecutor: job failed with ", valueOf, Pxe.A14(Pxf.A09(valueOf) + 37)));
        }
        super.setException(th);
    }
}
