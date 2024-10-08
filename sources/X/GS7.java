package X;

public final class GS7 extends AnonymousClass0T0 {
    public static final GS7 A03 = new GS7(new C304826Fj(16.0f, 0.0f, 16.0f, 0.0f), GS5.A00, 72.0f);
    public static final GS7 A04 = new GS7(new C304826Fj(16.0f, 0.0f, 16.0f, 0.0f), C52377GQc.A00, 60.0f);
    public final float A00;
    public final C304836Fk A01;
    public final JSI A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GS7) {
                GS7 gs7 = (GS7) obj;
                if (!0qQ.A0K(this.A01, gs7.A01) || !C289095d0.A01(this.A00, gs7.A00) || !0qQ.A0K(this.A02, gs7.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A00(AnonymousClass7TE.A0K(this.A01), this.A00));
    }

    public GS7(C304836Fk r1, JSI jsi, float f) {
        this.A01 = r1;
        this.A00 = f;
        this.A02 = jsi;
    }
}
