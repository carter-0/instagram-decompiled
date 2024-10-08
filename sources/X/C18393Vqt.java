package X;

import java.util.Map;

/* renamed from: X.Vqt  reason: case insensitive filesystem */
public abstract class C18393Vqt {
    public static final Map A00 = new C20581Wuz(7);

    public static final double A00(double d, double d2, double d3) {
        int abs = (int) ((Math.abs(d3 - d) / d2) * 10.0d);
        if (abs < 0) {
            abs = 0;
        } else if (abs > 20) {
            abs = 20;
        }
        Number number = (Number) C51968G9o.A10(A00, abs);
        if (number != null) {
            return number.doubleValue();
        }
        return 0.5d;
    }
}
