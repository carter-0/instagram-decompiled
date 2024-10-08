package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.3zJ  reason: invalid class name and case insensitive filesystem */
public final class C258583zJ implements Runnable {
    public C258573zI A00;

    public final void run() {
        String str;
        C258573zI r7 = this.A00;
        if (r7 != null) {
            boolean z = 1K2.A02;
            ListenableFuture listenableFuture = r7.A00;
            if (listenableFuture != null) {
                this.A00 = null;
                if (listenableFuture.isDone()) {
                    r7.A0A(listenableFuture);
                    return;
                }
                try {
                    ScheduledFuture scheduledFuture = r7.A01;
                    r7.A01 = null;
                    str = "Timed out";
                    if (scheduledFuture != null) {
                        long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                        if (abs > 10) {
                            str = 002.A0s(str, " (timeout delayed by ", " ms after scheduled time)", abs);
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(": ");
                    sb.append(listenableFuture);
                    r7.setException(new TimeoutException(sb.toString()));
                    listenableFuture.cancel(true);
                } catch (Throwable th) {
                    listenableFuture.cancel(true);
                    throw th;
                }
            }
        }
    }
}
