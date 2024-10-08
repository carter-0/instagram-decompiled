package X;

/* renamed from: X.IdH  reason: case insensitive filesystem */
public final class C57590IdH implements JMW {
    public final C56097Hsk A00;
    public final int A01;

    public C57590IdH(C56097Hsk hsk, int i) {
        0qQ.A0B(hsk, 2);
        this.A01 = i;
        this.A00 = hsk;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C57590IdH) {
                C57590IdH idH = (C57590IdH) obj;
                if (this.A01 != idH.A01 || !0qQ.A0K(this.A00, idH.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, this.A01 * 31);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Populated(index=");
        A1A.append(this.A01);
        A1A.append(", suggestion=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
