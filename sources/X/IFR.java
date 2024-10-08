package X;

public final class IFR implements JNT {
    public final float A00;

    public final int AF1(C268024cd r2, int i, int i2) {
        return r2.EJS(this.A00);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IFR)) {
            return false;
        }
        return C289095d0.A01(this.A00, ((IFR) obj).A00);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public IFR(float f) {
        this.A00 = f;
    }
}
