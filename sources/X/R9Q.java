package X;

public final class R9Q extends C7310Q3m {
    public final Throwable A00;
    public final C7305Q3h A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof R9Q) {
                R9Q r9q = (R9Q) obj;
                if (!0qQ.A0K(this.A02, r9q.A02) || !0qQ.A0K(this.A00, r9q.A00) || !0qQ.A0K(this.A01, r9q.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A02)));
    }

    public R9Q(C7305Q3h q3h, String str, Throwable th) {
        super(q3h, str);
        this.A02 = str;
        this.A00 = th;
        this.A01 = q3h;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Failure(key=");
        A1A.append(this.A02);
        A1A.append(C273654mx.A00(98));
        A1A.append(this.A00);
        A1A.append(", summary=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
