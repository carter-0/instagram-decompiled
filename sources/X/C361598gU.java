package X;

import android.os.SystemClock;

/* renamed from: X.8gU  reason: invalid class name and case insensitive filesystem */
public final class C361598gU {
    public long A00;

    public final void A00(C62320sa r8, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.A00 > j) {
            this.A00 = elapsedRealtime;
            r8.invoke();
        }
    }
}
