package X;

/* renamed from: X.6D0  reason: invalid class name */
public final class AnonymousClass6D0 extends AnonymousClass0T0 {
    public final float A00;
    public final int A01;
    public final C304836Fk A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6D0) {
                AnonymousClass6D0 r5 = (AnonymousClass6D0) obj;
                if (!(this.A01 == r5.A01 && Float.compare(this.A00, r5.A00) == 0 && 0qQ.A0K(this.A02, r5.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A01 * 31) + Float.floatToIntBits(this.A00)) * 31) + this.A02.hashCode();
    }

    public AnonymousClass6D0(C304836Fk r1, float f, int i) {
        this.A01 = i;
        this.A00 = f;
        this.A02 = r1;
    }
}
