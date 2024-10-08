package X;

/* renamed from: X.4Pn  reason: invalid class name and case insensitive filesystem */
public final class C264344Pn {
    public static final C264344Pn A04 = new C264344Pn(1.0f, 0, 0, 0);
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C264344Pn)) {
                return false;
            }
            C264344Pn r4 = (C264344Pn) obj;
            if (!(this.A03 == r4.A03 && this.A01 == r4.A01 && this.A02 == r4.A02 && this.A00 == r4.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((((((217 + this.A03) * 31) + this.A01) * 31) + this.A02) * 31) + Float.floatToRawIntBits(this.A00);
    }

    public C264344Pn(float f, int i, int i2, int i3) {
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A00 = f;
    }
}
