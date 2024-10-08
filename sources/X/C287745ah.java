package X;

/* renamed from: X.5ah  reason: invalid class name and case insensitive filesystem */
public final class C287745ah extends C287725af {
    public float A00;
    public float A01;
    public float A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C287745ah)) {
            return false;
        }
        C287745ah r4 = (C287745ah) obj;
        if (r4.A00 == this.A00 && r4.A01 == this.A01 && r4.A02 == this.A02) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01)) * 31) + Float.floatToIntBits(this.A02);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AnimationVector3D: v1 = ");
        sb.append(this.A00);
        sb.append(", v2 = ");
        sb.append(this.A01);
        sb.append(", v3 = ");
        sb.append(this.A02);
        return sb.toString();
    }
}
