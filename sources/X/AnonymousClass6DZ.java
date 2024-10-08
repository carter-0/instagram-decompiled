package X;

/* renamed from: X.6DZ  reason: invalid class name */
public final class AnonymousClass6DZ extends AnonymousClass0T0 {
    public static final AnonymousClass6DZ A04 = new AnonymousClass6DZ(new C304826Fj(0.0f, 8.0f, 12.0f, 0.0f), 0.0f, false, true);
    public final float A00;
    public final C304836Fk A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6DZ) {
                AnonymousClass6DZ r5 = (AnonymousClass6DZ) obj;
                if (this.A03 != r5.A03 || this.A02 != r5.A02 || !0qQ.A0K(this.A01, r5.A01) || !C289095d0.A01(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A02) {
            i3 = 1231;
        }
        return ((((i2 + i3) * 31) + this.A01.hashCode()) * 31) + Float.floatToIntBits(this.A00);
    }

    public AnonymousClass6DZ(C304836Fk r1, float f, boolean z, boolean z2) {
        this.A03 = z;
        this.A02 = z2;
        this.A01 = r1;
        this.A00 = f;
    }
}
