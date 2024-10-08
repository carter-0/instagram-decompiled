package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.30L  reason: invalid class name */
public abstract class AnonymousClass30L {
    public static final double A00(AnonymousClass30J r7, AnonymousClass30J r8, double d) {
        0qQ.A0B(r7, 1);
        TimeUnit timeUnit = r8.A00;
        TimeUnit timeUnit2 = r7.A00;
        long convert = timeUnit.convert(1, timeUnit2);
        if (convert > 0) {
            return d * ((double) convert);
        }
        return d / ((double) timeUnit2.convert(1, timeUnit));
    }
}
