package X;

/* renamed from: X.9I0  reason: invalid class name */
public final class AnonymousClass9I0 extends AnonymousClass0T0 implements C59482JLg {
    public final int A00;
    public final int A01;

    public AnonymousClass9I0(int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!(obj instanceof AnonymousClass9I0)) {
            return false;
        }
        AnonymousClass9I0 r3 = (AnonymousClass9I0) obj;
        if (r3.A00 == i && this.A01 == r3.A01) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A01;
    }
}
