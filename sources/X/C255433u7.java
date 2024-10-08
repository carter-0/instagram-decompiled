package X;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* renamed from: X.3u7  reason: invalid class name and case insensitive filesystem */
public final class C255433u7 extends 2SW {
    public final int A06(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    public final long A08(long j) {
        return ThreadLocalRandom.current().nextLong(j);
    }

    public final long A09(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }

    public final Random A0C() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        0qQ.A07(current);
        return current;
    }
}
