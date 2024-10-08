package X;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.Kks  reason: case insensitive filesystem */
public final class C62692Kks extends Number implements Serializable {
    public transient AtomicLong A00 = new AtomicLong(Double.doubleToRawLongBits(0.0d));

    public static double A00(C62692Kks kks) {
        return Double.longBitsToDouble(kks.A00.get());
    }

    public final double doubleValue() {
        return A00(this);
    }

    public final float floatValue() {
        return (float) A00(this);
    }

    public final int intValue() {
        return (int) A00(this);
    }

    public final long longValue() {
        return (long) A00(this);
    }

    public final String toString() {
        return Double.toString(A00(this));
    }
}
