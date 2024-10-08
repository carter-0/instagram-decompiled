package X;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4MQ  reason: invalid class name */
public abstract class AnonymousClass4MQ {
    public static final AnonymousClass4MQ A00 = new AnonymousClass4MR();

    public long A00() {
        if (this instanceof AnonymousClass4MP) {
            return TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
        }
        return System.nanoTime();
    }
}
