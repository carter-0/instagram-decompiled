package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.0C3  reason: invalid class name */
public final class AnonymousClass0C3 {
    public final AtomicInteger A00 = new AtomicInteger();
    public final AtomicLong A01 = new AtomicLong();

    public final void A00(long j, long j2) {
        AtomicLong atomicLong;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long seconds = timeUnit.toSeconds(j);
        long seconds2 = timeUnit.toSeconds(j2);
        do {
            atomicLong = this.A01;
            j3 = atomicLong.get();
            j4 = j3 >> 32;
            long j8 = j4 - 14;
            if (seconds2 > j8) {
                j5 = 1;
            } else {
                j5 = 0;
            }
            long max = Math.max(seconds, j8);
            long max2 = Math.max(seconds2, j8);
            long j9 = (long) ((int) ((j3 & 4294901760L) >> 16));
            long j10 = (long) ((int) (j3 & 65535));
            long max3 = Math.max(max2 - max, j5);
            if (max >= j4) {
                j6 = 14;
            } else if (max2 < j4) {
                j6 = (14 - max3) - (j4 - max2);
            } else {
                j6 = 14 - (j4 - max);
            }
            j7 = ((max2 + 14) << 32) | ((j9 + max3) << 16) | (j10 + j6);
            if (j4 >= (j7 >> 32)) {
                return;
            }
        } while (!atomicLong.compareAndSet(j3, j7));
        if (j4 <= seconds) {
            this.A00.getAndIncrement();
        }
    }
}
