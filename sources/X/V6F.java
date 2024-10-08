package X;

public abstract class V6F {
    public static final float A00(float f, float f2) {
        float abs = Math.abs(f2);
        float f3 = 1.0f;
        if (f < abs) {
            f3 = 1.0f + ((float) Math.pow((double) ((f / abs) - 1.0f), 3.0d));
        }
        float f4 = f + (f2 * f3);
        if (f4 < 0.0f) {
            return 0.0f;
        }
        return f4;
    }
}
