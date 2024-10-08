package X;

/* renamed from: X.56Y  reason: invalid class name */
public final class AnonymousClass56Y {
    public final float A00;
    public final AnonymousClass56X A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass56Y r5 = (AnonymousClass56Y) obj;
            if (Float.compare(r5.A00, this.A00) != 0 || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.A01.hashCode() * 31;
        float f = this.A00;
        if (f != 0.0f) {
            i = Float.floatToIntBits(f);
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PropertyAnimation{ PropertyHandle=");
        sb.append(this.A01);
        sb.append(", TargetValue=");
        sb.append(this.A00);
        sb.append("}");
        return sb.toString();
    }

    public AnonymousClass56Y(AnonymousClass56X r1, float f) {
        this.A01 = r1;
        this.A00 = f;
    }
}
