package X;

/* renamed from: X.37Q  reason: invalid class name */
public abstract class AnonymousClass37Q {
    public static double A04(double d, double d2, double d3, double d4, double d5) {
        double d6 = d3 - d2;
        double d7 = d5 - d4;
        double d8 = 0.0d;
        if (d6 != 0.0d) {
            d8 = (d - d2) / d6;
        }
        return d4 + (d8 * d7);
    }

    public static double A00(double d) {
        return A04(d, 0.0d, 1.0d, 0.0d, 255.0d);
    }

    public static double A01(double d, double d2) {
        return A04(d, 0.0d, 1.0d, 0.0d, d2);
    }

    public static double A02(double d, double d2) {
        return A04(d, 0.0d, 1.0d, d2, 0.0d);
    }

    public static double A03(double d, double d2, double d3) {
        return A04(d, 0.0d, 1.0d, d2, d3);
    }
}
