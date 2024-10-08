package X;

import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.concurrent.TimeUnit;

/* renamed from: X.UWl  reason: case insensitive filesystem */
public final class C15226UWl extends AnonymousClass4MQ {
    public final long A00() {
        return TimeUnit.MILLISECONDS.toNanos(RealtimeSinceBootClock.A00.now());
    }
}
