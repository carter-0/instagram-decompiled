package X;

/* renamed from: X.9ub  reason: invalid class name and case insensitive filesystem */
public abstract class C392309ub {
    public static final String A00(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (!Float.isInfinite(f)) {
            int max = Math.max(1, 0);
            float pow = (float) Math.pow(10.0d, (double) max);
            float f2 = f * pow;
            int i = (int) f2;
            if (f2 - ((float) i) >= 0.5f) {
                i++;
            }
            float f3 = ((float) i) / pow;
            if (max > 0) {
                return String.valueOf(f3);
            }
            return String.valueOf((int) f3);
        } else if (f < 0.0f) {
            return "-Infinity";
        } else {
            return "Infinity";
        }
    }
}
