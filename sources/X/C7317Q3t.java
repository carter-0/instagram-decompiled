package X;

/* renamed from: X.Q3t  reason: case insensitive filesystem */
public final class C7317Q3t extends C7315Q3r {
    public final C7318Q3u A00;
    public final T9F A01;
    public final long A02;
    public final Q3K A03;
    public final Runnable A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7317Q3t) {
                C7317Q3t q3t = (C7317Q3t) obj;
                if (!0qQ.A0K(this.A00, q3t.A00) || !0qQ.A0K(this.A01, q3t.A01) || this.A02 != q3t.A02 || this.A03 != q3t.A03 || !0qQ.A0K(this.A04, q3t.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A03, C51972G9s.A07(this.A02, (AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0C(this.A01)) * 31)) + AnonymousClass7TE.A0L(this.A04);
    }

    public C7317Q3t(C7318Q3u q3u, Q3K q3k, T9F t9f, Runnable runnable, long j) {
        super(q3k, runnable, j);
        this.A00 = q3u;
        this.A01 = t9f;
        this.A02 = j;
        this.A03 = q3k;
        this.A04 = runnable;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CachedComponentQueryResponse(response=");
        A1A.append(this.A00);
        A1A.append(", resources=");
        A1A.append(this.A01);
        A1A.append(", responseTimestampMs=");
        A1A.append(this.A02);
        A1A.append(", queryPurpose=");
        A1A.append(this.A03);
        A1A.append(", cleanup=");
        return AnonymousClass7TG.A0n(this.A04, A1A);
    }
}
