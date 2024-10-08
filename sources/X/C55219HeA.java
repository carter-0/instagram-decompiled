package X;

/* renamed from: X.HeA  reason: case insensitive filesystem */
public abstract class C55219HeA {
    public static final float A00(float f, float f2, float f3, long j) {
        float f4 = f - f2;
        if (Math.abs(f4) < 0.001f) {
            return f;
        }
        float f5 = (f3 * ((float) j)) / 1.6666667E7f;
        return f2 + Math.max(Math.min(f4, f5), -f5);
    }
}
