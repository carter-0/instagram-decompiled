package X;

import android.os.SystemClock;

/* renamed from: X.8mb  reason: invalid class name and case insensitive filesystem */
public final class C365138mb implements C365388n1 {
    public static final C365138mb A01 = new Object();
    public long A00;

    public final synchronized long ANS() {
        long elapsedRealtimeNanos;
        elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        this.A00 = elapsedRealtimeNanos;
        return elapsedRealtimeNanos;
    }
}
