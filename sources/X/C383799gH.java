package X;

/* renamed from: X.9gH  reason: invalid class name and case insensitive filesystem */
public final class C383799gH extends C282615Dy {
    public final float A00;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C383799gH)) {
            return false;
        }
        return Float.compare(this.A00, ((C383799gH) obj).A00) == 0;
    }

    public final String A06() {
        float f = this.A00;
        String[] strArr = 17g.A04;
        return Float.toString(f);
    }

    public final 16L A0B() {
        return 16L.A0H;
    }

    public final int A0C() {
        return (int) this.A00;
    }

    public final void EN9(17Z r2, C269504fE r3) {
        r2.A0f(this.A00);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public C383799gH(float f) {
        this.A00 = f;
    }
}
