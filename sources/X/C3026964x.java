package X;

/* renamed from: X.64x  reason: invalid class name and case insensitive filesystem */
public abstract class C3026964x {
    public static final long A00(int i, int i2) {
        boolean z = false;
        if (i >= 0) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(002.A0X("start cannot be negative. [start: ", ", end: ", ']', i, i2));
        } else if (i2 >= 0) {
            return (((long) i2) & 4294967295L) | (((long) i) << 32);
        } else {
            throw new IllegalArgumentException(002.A0X("end cannot be negative. [start: ", ", end: ", ']', i, i2));
        }
    }
}
