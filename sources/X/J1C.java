package X;

public final class J1C extends 0Yg implements 0sP {
    public static final J1C A00 = new J1C();

    public J1C() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float f;
        C299515vK r5 = (C299515vK) obj;
        0qQ.A0B(r5, 0);
        float width = (float) r5.getWidth();
        float height = (float) r5.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            f = 1.0f;
        } else {
            f = C229632nm.A02(width / height, 0.75f, 1.3333334f);
        }
        return Float.valueOf(f);
    }
}
