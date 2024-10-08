package X;

public final class S60 {
    public final S6I A00;
    public final C11006S5a A01;
    public final S6J A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof S60) {
                S60 s60 = (S60) obj;
                if (!0qQ.A0K(this.A01, s60.A01) || !0qQ.A0K(this.A00, s60.A00) || !0qQ.A0K(this.A02, s60.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0K(this.A01)));
    }

    public S60(S6I s6i, C11006S5a s5a, S6J s6j) {
        this.A01 = s5a;
        this.A00 = s6i;
        this.A02 = s6j;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FBPayContactInfoComponent(fullNameComponent=");
        A1A.append(this.A01);
        A1A.append(", emailListComponent=");
        A1A.append(this.A00);
        A1A.append(", phoneNumberListComponent=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }
}
