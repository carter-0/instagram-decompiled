package X;

/* renamed from: X.5Zo  reason: invalid class name and case insensitive filesystem */
public final class C287235Zo implements C287245Zp {
    public final float A00;

    public final int AAy(int i, int i2) {
        return Math.round((((float) (i2 - i)) / 2.0f) * (1.0f + this.A00));
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C287235Zo) && Float.compare(this.A00, ((C287235Zo) obj).A00) == 0);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return 002.A0F("Vertical(bias=", ')', this.A00);
    }

    public C287235Zo(float f) {
        this.A00 = f;
    }
}
