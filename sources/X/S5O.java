package X;

public final class S5O {
    public final SJ4 A00;
    public final SJ4 A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            S5O s5o = (S5O) obj;
            if (!this.A00.equals(s5o.A00) || !this.A01.equals(s5o.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public S5O(SJ4 sj4, SJ4 sj42) {
        this.A00 = sj4;
        this.A01 = sj42;
    }

    public final String toString() {
        String A0m;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        Pxh.A1P(A1A);
        SJ4 sj4 = this.A00;
        A1A.append(sj4);
        SJ4 sj42 = this.A01;
        if (sj4.equals(sj42)) {
            A0m = "";
        } else {
            A0m = AnonymousClass7TG.A0m(sj42, ", ", AnonymousClass7TE.A1A());
        }
        A1A.append(A0m);
        return AnonymousClass7TF.A0l("]", A1A);
    }
}
