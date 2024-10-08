package X;

/* renamed from: X.5Zq  reason: invalid class name and case insensitive filesystem */
public final class C287255Zq implements C287265Zr {
    public final float A00;

    public final int AB2(AnonymousClass5Q8 r4, int i, int i2) {
        float f;
        float f2 = ((float) (i2 - i)) / 2.0f;
        if (r4 == AnonymousClass5Q8.Ltr) {
            f = this.A00;
        } else {
            f = -1.0f * this.A00;
        }
        return Math.round(f2 * (1.0f + f));
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C287255Zq) && Float.compare(this.A00, ((C287255Zq) obj).A00) == 0);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return 002.A0F("Horizontal(bias=", ')', this.A00);
    }

    public C287255Zq(float f) {
        this.A00 = f;
    }
}
