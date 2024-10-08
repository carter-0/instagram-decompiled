package X;

/* renamed from: X.9IX  reason: invalid class name */
public final class AnonymousClass9IX extends AnonymousClass0T0 implements C334127ai {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public AnonymousClass9IX(C62320sa r1, 0sP r2, int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
        this.A02 = r1;
        this.A03 = r2;
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
        if (!(obj instanceof AnonymousClass9IX)) {
            return false;
        }
        AnonymousClass9IX r3 = (AnonymousClass9IX) obj;
        if (r3.A00 != i || this.A01 != r3.A01 || !0qQ.A0K(this.A02, r3.A02) || !0qQ.A0K(this.A03, r3.A03)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A01 * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode();
    }
}
