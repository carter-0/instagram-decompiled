package X;

/* renamed from: X.5ai  reason: invalid class name and case insensitive filesystem */
public final class C287755ai extends C287725af {
    public float A00;
    public float A01;
    public float A02;
    public float A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C287755ai)) {
            return false;
        }
        C287755ai r4 = (C287755ai) obj;
        if (r4.A00 == this.A00 && r4.A01 == this.A01 && r4.A02 == this.A02 && r4.A03 == this.A03) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01)) * 31) + Float.floatToIntBits(this.A02)) * 31) + Float.floatToIntBits(this.A03);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AnimationVector4D: v1 = ");
        sb.append(this.A00);
        sb.append(", v2 = ");
        sb.append(this.A01);
        sb.append(", v3 = ");
        sb.append(this.A02);
        sb.append(", v4 = ");
        sb.append(this.A03);
        return sb.toString();
    }
}
