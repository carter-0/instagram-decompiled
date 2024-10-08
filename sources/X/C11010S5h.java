package X;

/* renamed from: X.S5h  reason: case insensitive filesystem */
public final class C11010S5h {
    public final C2818759x A00;
    public final 0sP A01;

    public C11010S5h(C2818759x r2, 0sP r3) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C11010S5h) {
                C11010S5h s5h = (C11010S5h) obj;
                if (!0qQ.A0K(this.A00, s5h.A00) || !0qQ.A0K(this.A01, s5h.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MediatorEntry(observable=");
        A1A.append(this.A00);
        A1A.append(", callback=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
