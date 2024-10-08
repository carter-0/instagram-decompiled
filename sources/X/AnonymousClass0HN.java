package X;

import java.util.Random;

/* renamed from: X.0HN  reason: invalid class name */
public abstract class AnonymousClass0HN {
    public static final Random A00 = new Random();

    public static long A00() {
        return ((System.currentTimeMillis() << 22) | ((long) (A00.nextInt() & 4194303))) & Long.MAX_VALUE;
    }
}
