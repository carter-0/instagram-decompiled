package X;

public abstract class RhR {
    public static final float A00(int i) {
        int i2;
        float f;
        int i3 = i % 30;
        float f2 = 4.0f;
        if (i3 < 3) {
            i2 = 3 - i3;
        } else if (i3 < 27) {
            double random = Math.random();
            if (random >= 0.25d) {
                return 0.0f;
            }
            f = 0.5f - ((float) random);
            return f / f2;
        } else {
            i2 = (i3 - 3) - 24;
        }
        f = ((float) i2) * 4.0f;
        f2 = 3.0f;
        return f / f2;
    }
}
