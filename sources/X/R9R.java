package X;

public final class R9R extends C7315Q3r {
    public final T9F A00;
    public final long A01;
    public final Q3K A02;

    public R9R(Q3K q3k, T9F t9f, long j) {
        super(q3k, (Runnable) null, j);
        this.A00 = t9f;
        this.A01 = j;
        this.A02 = q3k;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof R9R) {
                R9R r9r = (R9R) obj;
                if (!(0qQ.A0K(this.A00, r9r.A00) && this.A01 == r9r.A01 && this.A02 == r9r.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A02, C51972G9s.A07(this.A01, AnonymousClass7TG.A0C(this.A00) * 31));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CachedComponentQueryResource(resources=");
        A1A.append(this.A00);
        A1A.append(", responseTimestampMs=");
        A1A.append(this.A01);
        A1A.append(", queryPurpose=");
        A1A.append(this.A02);
        A1A.append(", cleanup=");
        return AnonymousClass7TG.A0n((Object) null, A1A);
    }
}
