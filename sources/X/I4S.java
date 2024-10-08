package X;

public final class I4S {
    public static final I4S A03 = new I4S((0sP) null, (0sP) null, (0sP) null);
    public final 0sP A00;
    public final 0sP A01;
    public final 0sP A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I4S)) {
            return false;
        }
        I4S i4s = (I4S) obj;
        return this.A00 == i4s.A00 && this.A01 == i4s.A01 && this.A02 == i4s.A02;
    }

    public final int hashCode() {
        int i = 0;
        int A022 = G9w.A02(C51971G9r.A0E(this.A00) * 31 * 31, C51971G9r.A0E(this.A01));
        0sP r0 = this.A02;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return A022 + i;
    }

    public I4S(0sP r1, 0sP r2, 0sP r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public I4S() {
        this((0sP) null, (0sP) null, (0sP) null);
    }
}
