package X;

/* renamed from: X.S5o  reason: case insensitive filesystem */
public final class C11017S5o {
    public final C7305Q3h A00;
    public final C7322Q3y A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C11017S5o) {
                C11017S5o s5o = (C11017S5o) obj;
                if (!0qQ.A0K(this.A01, s5o.A01) || !0qQ.A0K(this.A00, s5o.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TG.A0C(this.A01) * 31);
    }

    public C11017S5o(C7305Q3h q3h, C7322Q3y q3y) {
        this.A01 = q3y;
        this.A00 = q3h;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ComponentQueryDiskCacheResponse(cacheRecord=");
        A1A.append(this.A01);
        A1A.append(", summary=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
