package X;

/* renamed from: X.8qI  reason: invalid class name and case insensitive filesystem */
public abstract class C367168qI {
    public static final int[] A00(float f, int i, int i2) {
        int i3 = (int) (((float) i) / f);
        return i3 <= i2 ? new int[]{i, i3} : new int[]{(int) (((float) i2) * f), i2};
    }

    public static final int[] A01(int i, int i2, int i3) {
        float f = 720.0f / 1280.0f;
        if (((float) i) / ((float) i2) != f) {
            throw new IllegalArgumentException(002.A02(i, i2, "The final output and scale output aspect ratios do not match. Final output is ", " x "));
        } else if (i3 == -1 || i3 > 2014 || i < 720) {
            return new int[]{i, i2};
        } else {
            return A00(f, 720, 1280);
        }
    }
}
