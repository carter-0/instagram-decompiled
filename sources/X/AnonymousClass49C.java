package X;

/* renamed from: X.49C  reason: invalid class name */
public final class AnonymousClass49C {
    public static final long A00 = System.nanoTime();
    public static final AnonymousClass49C A01 = new Object();

    public final String toString() {
        return "TimeSource(System.nanoTime())";
    }

    public final long A00(long j) {
        long j2;
        long nanoTime = System.nanoTime() - A00;
        AnonymousClass30J r7 = AnonymousClass30J.NANOSECONDS;
        if ((1 | (j - 1)) != Long.MAX_VALUE) {
            return AnonymousClass49E.A00(r7, nanoTime, j);
        }
        if (j < 0) {
            j2 = AnonymousClass30M.A02;
        } else {
            j2 = AnonymousClass30M.A01;
        }
        return ((-(j2 >> 1)) << 1) + ((long) (((int) j2) & 1));
    }
}
