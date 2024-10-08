package X;

/* renamed from: X.S5l  reason: case insensitive filesystem */
public final class C11014S5l {
    public final C7310Q3m A00;
    public final Q37 A01;

    public C11014S5l(C7310Q3m q3m, Q37 q37) {
        0qQ.A0B(q3m, 2);
        this.A01 = q37;
        this.A00 = q3m;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C11014S5l) {
                C11014S5l s5l = (C11014S5l) obj;
                if (!0qQ.A0K(this.A01, s5l.A01) || !0qQ.A0K(this.A00, s5l.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0K(this.A01));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PendingResponse(queryDefinition=");
        A1A.append(this.A01);
        A1A.append(", response=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
