package X;

/* renamed from: X.S5p  reason: case insensitive filesystem */
public final class C11018S5p {
    public final int A00;
    public final C8912RFf A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C11018S5p) {
                C11018S5p s5p = (C11018S5p) obj;
                if (!(this.A01 == s5p.A01 && this.A00 == s5p.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A01) + this.A00;
    }

    public C11018S5p(C8912RFf rFf, int i) {
        this.A01 = rFf;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("QPLEventPayload(type=");
        A1A.append(this.A01);
        A1A.append(", key=");
        return C51975G9x.A0j(A1A, this.A00);
    }
}
