package X;

/* renamed from: X.W0y  reason: case insensitive filesystem */
public final class C18775W0y {
    public static final C18775W0y A00 = new Object();

    public static final C17558VaC A01(C276544tV r6) {
        C276544tV A07 = r6.A07(42);
        if (A07 != null) {
            C276544tV A072 = r6.A07(41);
            if (A072 != null) {
                return new C17558VaC(A00(A07.A02(35, 0.0f)), A00(A07.A02(36, 0.0f)), A00(A072.A02(35, 0.0f)), A00(A072.A02(36, 0.0f)));
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final float A00(float f) {
        float abs = Math.abs(f);
        if (abs >= 0.0f && abs <= 1.0f) {
            return f;
        }
        1Kn.A02("ShowreelAnimatedGradientDrawable", "Gradient line coordinate values must range from 0 to 1");
        if (abs < 0.0f) {
            return 0.0f;
        }
        return 1.0f;
    }
}
