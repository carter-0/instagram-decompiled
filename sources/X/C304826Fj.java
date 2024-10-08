package X;

/* renamed from: X.6Fj  reason: invalid class name and case insensitive filesystem */
public final class C304826Fj implements C304836Fk {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C304826Fj)) {
            return false;
        }
        C304826Fj r4 = (C304826Fj) obj;
        if (!C289095d0.A01(this.A02, r4.A02) || !C289095d0.A01(this.A03, r4.A03) || !C289095d0.A01(this.A01, r4.A01) || !C289095d0.A01(this.A00, r4.A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.A02) * 31) + Float.floatToIntBits(this.A03)) * 31) + Float.floatToIntBits(this.A01)) * 31) + Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PaddingValues(start=");
        sb.append(C289095d0.A00(this.A02));
        sb.append(", top=");
        sb.append(C289095d0.A00(this.A03));
        sb.append(", end=");
        sb.append(C289095d0.A00(this.A01));
        sb.append(", bottom=");
        sb.append(C289095d0.A00(this.A00));
        sb.append(')');
        return sb.toString();
    }

    public C304826Fj(float f, float f2, float f3, float f4) {
        this.A02 = f;
        this.A03 = f2;
        this.A01 = f3;
        this.A00 = f4;
        if (f < 0.0f) {
            throw new IllegalArgumentException("Start padding must be non-negative");
        } else if (f2 < 0.0f) {
            throw new IllegalArgumentException("Top padding must be non-negative");
        } else if (f3 < 0.0f) {
            throw new IllegalArgumentException("End padding must be non-negative");
        } else if (f4 < 0.0f) {
            throw new IllegalArgumentException("Bottom padding must be non-negative");
        }
    }
}
