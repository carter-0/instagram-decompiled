package X;

import android.os.SystemClock;

/* renamed from: X.9uR  reason: invalid class name and case insensitive filesystem */
public abstract class C392239uR {
    public long A00(long j) {
        C380689Zd r5 = (C380689Zd) this;
        if (r5.A00 < 0 && j > 0) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            r5.A00 = elapsedRealtimeNanos;
            r5.A01 = elapsedRealtimeNanos - j;
        }
        return j + r5.A01;
    }
}
