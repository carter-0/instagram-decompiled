package X;

public abstract class A0A {
    public static final float A00(1Xj r2) {
        C246623eu A1S;
        0qQ.A0B(r2, 0);
        if (r2.A5Y()) {
            A1S = r2.A1S();
            if (A1S == null || !A1S.A02) {
                return 1.0f;
            }
        } else if (!r2.A5G() || r2.A1S() == null) {
            return r2.A0l();
        } else {
            A1S = r2.A1S();
            if (A1S == null) {
                return 1.0f;
            }
        }
        return ((float) A1S.A01) / ((float) A1S.A00);
    }
}
