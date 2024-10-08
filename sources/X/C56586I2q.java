package X;

/* renamed from: X.I2q  reason: case insensitive filesystem */
public abstract class C56586I2q {
    public static final 2Wd A00(int i) {
        double d;
        if (i == 1) {
            d = 32.0d;
        } else if (i == 2) {
            d = 16.0d;
        } else if (i != 3) {
            return null;
        } else {
            d = 86.0d;
        }
        return C51965G9l.A0e(Double.doubleToRawLongBits(d));
    }

    public static final 2Wd A01(int i) {
        double d;
        if (i == 0) {
            d = 8.0d;
        } else if (i == 1) {
            d = 32.0d;
        } else if (i != 2) {
            return null;
        } else {
            d = 196.0d;
        }
        return C51965G9l.A0e(Double.doubleToRawLongBits(d));
    }

    public static final 2Wd A02(int i) {
        double d;
        if (i == 0) {
            d = 24.0d;
        } else if (i == 1 || i == 2 || i == 3) {
            return null;
        } else {
            d = 32.0d;
        }
        return C51965G9l.A0e(Double.doubleToRawLongBits(d));
    }
}
