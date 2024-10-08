package X;

/* renamed from: X.Har  reason: case insensitive filesystem */
public abstract class C55020Har {
    public static final int A00(double d) {
        int i = 0;
        if (d > 0.0d) {
            i = 16777215;
        }
        return (((int) (Math.abs(d) * 255.0d)) << 24) | i;
    }
}
