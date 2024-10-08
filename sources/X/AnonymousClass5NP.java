package X;

/* renamed from: X.5NP  reason: invalid class name */
public final class AnonymousClass5NP {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass5NP)) {
            return false;
        }
        AnonymousClass5NP r4 = (AnonymousClass5NP) obj;
        return this.A01 == r4.A01 && this.A00 == r4.A00;
    }

    public final int hashCode() {
        return ((16337 + this.A01) * 31) + this.A00;
    }

    public AnonymousClass5NP(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
