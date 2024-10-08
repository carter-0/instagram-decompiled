package X;

public final class Q4Q {
    public final C3034368u A00;
    public final C13670Tee A01;
    public final Q42 A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Q4Q) {
                Q4Q q4q = (Q4Q) obj;
                if (!0qQ.A0K(this.A01, q4q.A01) || !0qQ.A0K(this.A02, q4q.A02) || !0qQ.A0K(this.A00, q4q.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A01)));
    }

    public Q4Q(C3034368u r1, C13670Tee tee, Q42 q42) {
        AnonymousClass7TG.A1O(tee, q42);
        this.A01 = tee;
        this.A02 = q42;
        this.A00 = r1;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("BloksTreeManagerModification(target=");
        A1A.append(this.A01);
        A1A.append(", updateOperation=");
        A1A.append(this.A02);
        A1A.append(", parseResult=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
