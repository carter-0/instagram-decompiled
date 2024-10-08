package X;

/* renamed from: X.Xcy  reason: case insensitive filesystem */
public final class C21498Xcy {
    public final SJ7 A00;
    public final SJ7 A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C21498Xcy xcy = (C21498Xcy) obj;
            if (!this.A00.equals(xcy.A00) || !this.A01.equals(xcy.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, this.A00.hashCode() * 31);
    }

    public C21498Xcy(SJ7 sj7, SJ7 sj72) {
        this.A00 = sj7;
        this.A01 = sj72;
    }

    public final String toString() {
        String A0m;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("[");
        SJ7 sj7 = this.A00;
        A1A.append(sj7);
        SJ7 sj72 = this.A01;
        if (sj7.equals(sj72)) {
            A0m = "";
        } else {
            A0m = AnonymousClass7TG.A0m(sj72, ", ", AnonymousClass7TE.A1A());
        }
        A1A.append(A0m);
        return AnonymousClass7TF.A0l("]", A1A);
    }
}
